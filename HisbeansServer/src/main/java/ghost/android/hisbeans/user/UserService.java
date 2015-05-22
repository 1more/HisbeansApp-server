package ghost.android.hisbeans.user;

import java.util.Map;



/**
 * @author SeungMin
 * @email rfrost77@gmail.com
 * @classname UserService.java
 * @package ghost.android.hisbeans.user
 * @date 2012. 7. 13. 오후 3:07:46
 * @purpose : User 관련 Service들의 Method Interface
 *
 * @comment : 
 *
 */

public interface UserService {
	public Map<String, String> login(String id, String password);
	public int signUp(String id, String email, String password, String name, String phoneNum) throws MakeBarcodeException;
	public int makeBarcode(String id);
	public boolean signOut(String id);
	public String findIdByEmail(String name, String email);
	public String findIdByPhoneNum(String name, String phoneNum);
	public boolean findPasswordByEmail(String id, String name, String email);
	public boolean findPasswordByPhoneNum(String id, String name, String phoneNum);
	public boolean modifyUser(String id, String email, String phoneNum);
	public boolean modifyPassword(String id, String validCode, String password);
	public boolean modifyPasswordWithNoneValid(String id, String password);
	public UserBarcodeModel getBarcodeNumber(String id);
	public boolean validateForMail(String id, String email);
	public boolean validateForPhone(String id, String pNum);
	public boolean checkValidCode(String id, String validCode);
	public void sleepAndRemoveValideCode(String id);
	public boolean checkDupId(String id);
	public boolean checkDupPhoneEmail(String phoneNum, String email);
}
