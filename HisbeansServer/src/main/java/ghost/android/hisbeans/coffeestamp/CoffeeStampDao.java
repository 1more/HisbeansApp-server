package ghost.android.hisbeans.coffeestamp;

import java.util.List;

/**
 * @author HyeonWook Kim
 * @email khw0867@gmail.com
 * @classname CoffeeStampDao.java
 * @package ghost.android.hisbeans.coffeestamp
 * @date 2012. 7. 13.
 * @purpose : Interface for DAO related with Coffee Stamp table
 *
 */

public interface CoffeeStampDao {
	public List<CoffeeStampModel> getStampCards(String barcodeNum);
	public CoffeeStampModel getCurrentStampCard(String barcodeNum);
	public CoffeeStampModel getFullNotusedStampCard(String barcodeNum);
	public void  addCoffeeStamps(int stampCardIndex, int count);
	public CoffeeStampModel getUseableStampCard(String barcodeNum);
	public void updateUsedFlag(int stampCardIndex);
	public void addStampCard(String barcodeNum);
	public void removeStampCard(int index);
	public void deleteCoffeeStamp(String barcodeNum);
}
