package ghost.android.hisbeans.presentcard;

import java.util.List;

/**
 * @author SeungMin
 * @email rfrost77@gmail.com
 * @classname PresentCardService.java
 * @package ghost.android.hisbeans.presentcard
 * @date 2012. 8. 8. 오전 8:49:28
 * @purpose : Interface for services related with a present card.
 *
 * @comment : 
 *
 */

public interface PresentCardService {
	public PresentCardModel present(String senderId, String receiverPhoneNum, String email, String menu, String message, String receiverName);
	public List<PresentCardModel> getPresentCardsAsSender(String id);
	public List<PresentCardModel> getPresentCardsAsReceiver(String phoneNum);
	public int usePresentCard(int pnumber);
	public PresentCardModel getPresentCardWithIndex(String index);
	public List<PresentCardMenuModel> getAllMenu();
	public List<String> getMenuType();
}
