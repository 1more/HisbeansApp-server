package ghost.android.hisbeans.user;


/**
 * @author SeungMin
 * @email rfrost77@gmail.com
 * @classname UserModel.java
 * @package ghost.android.hisbeans.user
 * @date 2012. 7. 17. 오후 4:05:00
 * @purpose : xedata의 xe_member table attribute 중 not null인 Instance Variable가 일치, User 정보를 담는 Model Class
 *
 * @comment : 
 *
 */

public class UserModel {
	private int srl;
	private String id;
	private String email;
	private String password;
	private String emailId;
	private String emailHost;
	private String name;
	private String nick_name;
	private String phoneNum;
	
	/*** Constructors ***/
	
	public UserModel() {
		super();
	}
	public UserModel(String id, String email, String password, String emailId,
			String emailHost, String name, String nick_name, String phoneNum) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.emailId = emailId;
		this.emailHost = emailHost;
		this.name = name;
		this.nick_name = nick_name;
		this.phoneNum = phoneNum;
	}
	public UserModel(String id, String email, String password, String name, String nick_name, String phoneNum) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.nick_name = nick_name;
		this.phoneNum = phoneNum;
		
		System.out.println("email: "+email);
		String splited[] = email.split("@");
		this.emailId = splited[0];
		this.emailHost = splited[1];
	}
	public UserModel(int srl, String id, String email, String password, String name, String nick_name, String phoneNum) {
		super();
		this.srl = srl;
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.nick_name = nick_name;
		this.phoneNum = phoneNum;
		
		System.out.println("email: "+email);
		String splited[] = email.split("@");
		this.emailId = splited[0];
		this.emailHost = splited[1];
	}
	
	
	
	/*** Getter and Setters ***/
	public int getSrl() {
		return srl;
	}
	public void setSrl(int srl) {
		this.srl = srl;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getEmailHost() {
		return emailHost;
	}
	public void setEmailHost(String emailHost) {
		this.emailHost = emailHost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}
