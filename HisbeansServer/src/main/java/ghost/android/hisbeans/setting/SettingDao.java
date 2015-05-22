package ghost.android.hisbeans.setting;



/**
 * @author SeungMin
 * @email rfrost77@gmail.com
 * @classname SettingDao.java
 * @package ghost.android.hisbeans.setting
 * @date 2012. 8. 7. 오후 5:09:23
 * @purpose : 
 *
 * @comment : 
 *
 */

public interface SettingDao {
	public String getVersion();
	public String getIsShow();
	public String getNotice();
	public NoticesModel getNotices();
}
