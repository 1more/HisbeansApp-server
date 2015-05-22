package ghost.android.hisbeans.setting;


/**
 * @author SeungMin
 * @email rfrost77@gmail.com
 * @classname SettingService.java
 * @package ghost.android.hisbeans.setting
 * @date 2012. 8. 7. 오후 5:55:30
 * @purpose : Interface for services related with a setting.
 *
 * @comment : 
 *
 */

public interface SettingService {
	public String getVersion();
	public String getIsShow();
	public String getNotice();
	public NoticesModel getNotices();
}
