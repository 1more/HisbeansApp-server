package ghost.android.hisbeans.setting;


/**
 * @author SeungMin
 * @email rfrost77@gmail.com
 * @classname PresentCardModel.java
 * @package ghost.android.hisbeans.presentcard
 * @date 2012. 7. 20. 오후 12:45:52
 * @purpose : Present Card의 DB과 매치되는 Model Class
 *
 * @comment : 
 *
 */

public class NoticesModel {
	private String version;
	private String isShow;
	private String notice;
	
	
	/*** Constructors ***/
	public NoticesModel() {
		super();
	}
	public NoticesModel(String version, String isShow, String notice) {
		super();
		this.version = version;
		this.isShow = isShow;
		this.notice = notice;
	}

	
	/*** Getter and Setters ***/
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getIsShow() {
		return isShow;
	}
	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
}
