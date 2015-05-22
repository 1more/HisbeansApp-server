package ghost.android.hisbeans.noticeboard;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author HyeonWook Kim
 * @email khw0867@gmail.com
 * @classname NoticeBoardServiceImpl.java
 * @package ghost.android.hisbeans.noticeboard
 * @date 2012. 7. 19.
 * @purpose : implements NoticeBoardService using NoticeBoardDao
 *
 */
@Transactional
public class NoticeBoardServiceImpl implements NoticeBoardService {
	private NoticeBoardDao noticeBoardDao;

	public void setNoticeBoardDao(NoticeBoardDao noticeBoardDao) {
		this.noticeBoardDao = noticeBoardDao;
	}

	
	/*************** Override Methods ***************/
	
	/**
	 * @return List of NoticeBoardModel which has every notices in database
	 */
	public List<NoticeBoardModel> getAllNotices() {
		return noticeBoardDao.getAllNotices();
	}
}
