package ghost.android.hisbeans.noticeboard;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

/**
 * @author HyeonWook Kim
 * @email khw0867@gmail.com
 * @classname NoticeBoardDaoJdbc.java
 * @package ghost.android.hisbeans.noticeboard
 * @date 2012. 7. 19.
 * @purpose : implements NoticeBoardDao with mybatis
 *
 */
public class NoticeBoardDaoJdbc implements NoticeBoardDao{
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession = sqlSession;
	}
	
	
	/*************** DAO Methods ***************/
	
	/**
	 * @return every Notices
	 */
	public List<NoticeBoardModel> getAllNotices() {
		return sqlSession.selectList("getAllNotices");
	}
}
