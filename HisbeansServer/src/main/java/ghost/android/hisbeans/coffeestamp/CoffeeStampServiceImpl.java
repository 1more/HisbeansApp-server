package ghost.android.hisbeans.coffeestamp;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author HyeonWook Kim
 * @email khw0867@gmail.com
 * @classname CoffeeStampServiceImpl.java
 * @package ghost.android.hisbeans.coffeestamp
 * @date 2012. 7. 16.
 * @purpose :  implements CoffeeStampService using CoffeeStampDao
 *
 */

@Transactional(rollbackFor={NoUseableStampcardException.class, IllegalStampAccessException.class})
public class CoffeeStampServiceImpl implements CoffeeStampService{
	private CoffeeStampDao coffeeStampDao;
	
	public void setCoffeeStampDao(CoffeeStampDao coffeeStampDao){
		this.coffeeStampDao = coffeeStampDao;
	}

	
	
	/*************** Override Methods ***************/
	
	/**
	 * 
	 * @param barcodeNumber for identify specific user
	 * @return List of CoffStampModel which has every stampCards in database
	 * 
	 */
	public List<CoffeeStampModel> getStampCards(String barcodeNum) {
		return this.coffeeStampDao.getStampCards(barcodeNum);
	}

	
	
	/**
	 * 
	 * @param barcodeNumber for identify specific user
	 * @param count of stamp to add
	 * @return true if success to add a stamp
	 * 
	 * @throws IlligalStampAccessException when 'count' has negative value or has unreliable number
	 * 
	 */
	public boolean addCoffeeStamps(String barcodeNum, int count) throws IllegalStampAccessException {
		if(count < 0)
			throw new IllegalStampAccessException();
		
		CoffeeStampModel currentCard = this.coffeeStampDao.getCurrentStampCard(barcodeNum);
		
		int maxNum = CoffeeStampModel.MAX_COUNT - currentCard.getCounts();

		try {
			if(count >= maxNum){
				this.coffeeStampDao.addCoffeeStamps(currentCard.getIndex(), maxNum);
				
				//if coffee stamp is full, add another stampcard
				makeNewStampCard(barcodeNum);
				
				addCoffeeStamps(barcodeNum, count-maxNum);
			} 
			else{
				this.coffeeStampDao.addCoffeeStamps(currentCard.getIndex(), count);
			}	
		} catch(IllegalStampAccessException e){
			throw e;
		}

		return true;
	}

	
	
	/**
	 * @param barcodeNumber for identify specific user
	 * @param count of stamp to remove
	 * @return true if success to add a stamp
	 * 
	 * @throws IllegalStampAccessException when 'count' has positive value or has unreliable number
	 */
	public boolean removeCoffeeStamp(String barcodeNum, int count) throws IllegalStampAccessException {
		if(count > 0)
			throw new IllegalStampAccessException();
		
		CoffeeStampModel currentCard = this.coffeeStampDao.getCurrentStampCard(barcodeNum);
		
		int absCnt = Math.abs(count);
		int curCnt = currentCard.getCounts();

		try {

			if(absCnt > curCnt){
				removeStampCard(currentCard.getIndex());
				
				int cntDiff = absCnt - curCnt;
				
				CoffeeStampModel fullStamp = this.coffeeStampDao.getFullNotusedStampCard(barcodeNum);
				this.coffeeStampDao.addCoffeeStamps(fullStamp.getIndex(), -cntDiff);
			} else {
				this.coffeeStampDao.addCoffeeStamps(currentCard.getIndex(), count);
			}
		} catch(IllegalStampAccessException e){
			throw e;
		}

		return true;
	}
	
	
	
	/**
	 * @param barcodeNumber for identify specific user
	 * @param count 
	 * @return true if success to use a stamp-card
	 * 
	 * @throws NoUseableStampcardException when	there is no usable stamp-card data 
	 */
	public boolean useStampCard(String barcodeNum, int count) throws NoUseableStampcardException {
		
		for(int i=0; i<count; i++){
			CoffeeStampModel useableCard = this.coffeeStampDao.getUseableStampCard(barcodeNum);
			if(useableCard == null){
				throw new NoUseableStampcardException();
			}
			
			this.coffeeStampDao.updateUsedFlag(useableCard.getIndex());
		}
		return true;
	}

	
	
	/**
	 * @param barcodeNumber for identify specific user
	 */
	public void makeNewStampCard(String barcodeNum) {
		this.coffeeStampDao.addStampCard(barcodeNum);
	}
	
	
	/**
	 * @param index for identify specific stamp-card
	 */
	public void removeStampCard(int index) {
		this.coffeeStampDao.removeStampCard(index);
	}
}
