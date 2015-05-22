package ghost.android.hisbeans.coffeestamp;

import java.sql.Date;

/**
 * @author HyeonWook Kim
 * @email khw0867@gmail.com
 * @classname CoffeeStampModel.java
 * @package ghost.android.hisbeans.coffeestamp
 * @date 2012. 7. 13.
 * @purpose : Data model for a Coffee stamp card.
 *
 */
public class CoffeeStampModel {
	public static int MAX_COUNT = 10;
	
	private int index;
	private String userBarcodeNum;
	private int counts;
	private Date usedDate;
	private int usedFlag;
	
	/*** Constructors ***/
	public CoffeeStampModel(){
		this.index = -1;
		this.userBarcodeNum = "0";
		this.counts = 0;
		this.usedDate = null;
		this.usedFlag = 0;
	}
	
	public CoffeeStampModel(int index, String userBarcodeNum, int counts, Date usedDate, int usedFlag){
		this.index = index;
		this.userBarcodeNum = userBarcodeNum;
		this.counts = counts;
		this.usedDate = usedDate;
		this.usedFlag = usedFlag;
	}
	
	
	
	/*** Getter and Setters ***/
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getUserBarcodeNum() {
		return userBarcodeNum;
	}
	public void setUserBarcodeNum(String userBarcodeNum) {
		this.userBarcodeNum = userBarcodeNum;
	}
	public int getCounts() {
		return counts;
	}
	public void setCounts(int counts) {
		this.counts = counts;
	}
	public Date getUsedDate() {
		return usedDate;
	}
	public void setUsedDate(Date usedDate) {
		this.usedDate = usedDate;
	}
	public int getUsedFlag() {
		return usedFlag;
	}
	public void setUsedFlag(int usedFlag) {
		this.usedFlag = usedFlag;
	}
}
