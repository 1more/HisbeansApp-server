package ghost.android.hisbeans.noticeboard;

import java.util.List;

/**
 * @author HyeonWook Kim
 * @email khw0867@gmail.com
 * @classname NoticeBoardService.java
 * @package ghost.android.hisbeans.noticeboard
 * @date 2012. 7. 20.
 * @purpose :  Interface for services related with a Notice board.
 *
 */

public interface NoticeBoardService {
	public List<NoticeBoardModel> getAllNotices();
}
