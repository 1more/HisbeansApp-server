package ghost.android.hisbeans.noticeboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author HyeonWook Kim
 * @email khw0867@gmail.com
 * @classname NoticeBoardController.java
 * @package ghost.android.hisbeans.noticeboard
 * @date 2012. 7. 20.
 * @purpose : Controll http-requests related with Notices
 *
 */

@Controller
public class NoticeBoardController {
	@Autowired
	NoticeBoardService noticeBoardService;
	
	
	/************ Controller Methods ***************/
	
	/**
	 * @return ModelAndView object with stamp card info and view info(json view)
	 * 
	 * @usage ./notices.html
	 */
	@RequestMapping(value = "notices", method = RequestMethod.GET)
	public ModelAndView getNotices(){
		List<NoticeBoardModel> notices = noticeBoardService.getAllNotices();
		
		return new ModelAndView("jsonView", "notices", notices);
	}
}
