package ghost.android.hisbeans.presentcard;

import java.util.List;

/**
 * @author SeungMin
 * @email rfrost77@gmail.com
 * @classname PresentCardDao.java
 * @package ghost.android.hisbeans.presentcard
 * @date 2012. 8. 8. 오전 8:49:15
 * @purpose : 
 *
 * @comment : 
 *
 */

public interface PresentCardDao {
	public int getPresentCardIndex();
	public List<PresentCardModel> getPresentCardsById(String id);
	public List<PresentCardModel> getPresentCardsByPhoneNum(String phoneNum);
	public PresentCardModel getPresentCardByIndex(int index);
	public boolean checkDupBarcodeNum(String barcodeNum);
	public void addPresentCard(PresentCardModel presentCard);
	public void updatePresentCard(PresentCardModel presentCard);
	public String getLatestBarcodeNum(String minNum, String maxNum);
	public List<PresentCardMenuModel> getAllMenu();
	public List<String> getMenuType();
}
