package ghost.android.hisbeans.setting;

import org.apache.ibatis.session.SqlSession;

/**
 * @author SeungMin
 * @email rfrost77@gmail.com
 * @classname SettingDaoJdbc.java
 * @package ghost.android.hisbeans.setting
 * @date 2012. 8. 7. 오후 5:14:08
 * @purpose : 
 *
 * @comment : 
 *
 */
public class SettingDaoJdbc implements SettingDao{
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession = sqlSession;
	}


	
	/*************** DAO Methods ***************/
	
	/** get version from db
	 * 
	 * @return version code
	 */
	public String getVersion() {
		return sqlSession.selectOne("getVersion");
	}

	/** get isShow value from db
	 * 
	 * @return isShow value
	 */
	public String getIsShow() {
		return sqlSession.selectOne("getIsShow");
	}

	/** get notice from db
	 * 
	 * @return notice value
	 */
	public String getNotice() {
		return sqlSession.selectOne("getNotice");
	}

	/** get notice info from db
	 * 
	 * @return NoticesModel
	 */
	public NoticesModel getNotices() {
		return sqlSession.selectOne("getNotices");
	}
}
