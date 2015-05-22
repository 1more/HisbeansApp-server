package ghost.android.hisbeans.setting;

import ghost.android.hisbeans.presentcard.PresentCardSaveException;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author SeungMin
 * @email rfrost77@gmail.com
 * @classname SettingServiceImpl.java
 * @package ghost.android.hisbeans.setting
 * @date 2012. 8. 7. 오후 5:55:52
 * @purpose : implements 선물카드 Service using SettingService
 *
 * @comment : 
 *
 */

@Transactional
public class SettingServiceImpl implements SettingService{
	private SettingDao settingDao;

	public void setSettingDao(SettingDao settingDao) {
		this.settingDao = settingDao;
	}

	
	
	/*************** Override Methods ***************/
	
	/** application의 version을 가지고오는 Method
	 * 
	 * @return string - version code  
	 */
	public String getVersion() {
		return settingDao.getVersion();
	}

	/** application의 notice의 isShow 정보를 가지고오는 Method
	 * 
	 * @return string - isShow value in DB
	 */
	public String getIsShow() {
		return settingDao.getIsShow();
	}

	/** application pop-up으로 표시되는 notice을 가지고오는 Method
	 * 
	 * @return string - notice message
	 */
	public String getNotice() {
		return settingDao.getNotice();
	}

	/** notice 정보 DB data 가지고오는 Method
	 * 
	 * @return NoticeModel
	 */
	public NoticesModel getNotices() {
		return settingDao.getNotices();
	}
}
