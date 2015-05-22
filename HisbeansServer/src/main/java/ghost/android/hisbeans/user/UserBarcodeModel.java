package ghost.android.hisbeans.user;

/**
 * @author Hyeonwook Kim
 * @email khw0867@gmail.com
 * @classname UserBarcodeModel.java
 * @package ghost.android.hisbeans.user
 * @date 2012. 10. 28.
 * @purpose : User Barcode의 DB schema와 매치되는 Model Class
 *
 * @comment :
 *
 */

public class UserBarcodeModel {
	private String id;
	private String barcodeNum;
	private String barcodeImgUrl;
	
	
	/*** Constructors ***/
	public UserBarcodeModel() {
	}
	public UserBarcodeModel(String id, String barcodeNum, String barcodeImgUrl) {
		this.id = id;
		this.barcodeNum = barcodeNum;
		this.barcodeImgUrl = barcodeImgUrl;
	}
	
	
	/*** Getter and Setters ***/	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBarcodeNum() {
		return barcodeNum;
	}
	public void setBarcodeNum(String barcodeNum) {
		this.barcodeNum = barcodeNum;
	}
	public String getBarcodeImgUrl() {
		return barcodeImgUrl;
	}
	public void setBarcodeImgUrl(String barcodeImgUrl) {
		this.barcodeImgUrl = barcodeImgUrl;
	}
}
