package ghost.android.hisbeans.noticeboard;

import java.sql.Date;

/**
 * @author HyeonWook Kim
 * @email khw0867@gmail.com
 * @classname NoticeBoardModel.java
 * @package ghost.android.hisbeans.noticeboard
 * @date 2012. 7. 19.
 * @purpose : Data model for a Notice board.
 *
 */

public class NoticeBoardModel {
	private int docSrl;				// identifier for each notice
	private String title;			// title
	private boolean titleBold;		// true if title is bold-type character
	private String titleColor;		// color code for title
	private String content; 		// contents. it contains HTML tags like <b> or <h2>
	private int readedCount;		// read count
	private int votedCount;			// voted count
	private Date regDate;			// registered date
	
	
	/** Constructors **/
	public NoticeBoardModel() {
	}

	public NoticeBoardModel(int docSrl, String title, boolean titleBold, String titleColor, String content, int readedCount, int votedCount, Date regDate) {
		this.docSrl = docSrl;
		this.title = title;
		this.titleBold = titleBold;
		this.titleColor = titleColor;
		this.content = content;
		this.readedCount = readedCount;
		this.votedCount = votedCount;
		this.regDate = regDate;
	}

	
	/** getters and setters **/
	public int getDocSrl() {
		return docSrl;
	}

	public void setDocSrl(int docSrl) {
		this.docSrl = docSrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean getTitleBold() {
		return titleBold;
	}

	public void setTitleBold(boolean titleBold) {
		this.titleBold = titleBold;
	}

	public String getTitleColor() {
		return titleColor;
	}

	public void setTitle_color(String titleColor) {
		this.titleColor = titleColor;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getReadedCount() {
		return readedCount;
	}

	public void setReadedCount(int readedCount) {
		this.readedCount = readedCount;
	}

	public int getVotedCount() {
		return votedCount;
	}

	public void setVotedCount(int votedCount) {
		this.votedCount = votedCount;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
