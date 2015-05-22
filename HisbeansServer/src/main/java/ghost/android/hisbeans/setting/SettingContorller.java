package ghost.android.hisbeans.setting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author SeungMin
 * @email rfrost77@gmail.com
 * @classname SettingContorller.java
 * @package ghost.android.hisbeans.setting
 * @date 2012. 8. 7. 오후 5:09:42
 * @purpose : it is controller about other setting process
 *
 * @comment : 
 *
 */

@Controller
public class SettingContorller {
	@Autowired
	private SettingService settingService;

	
	
	/************ Controller Methods ***************/
	
	/** get version method
	 * 
	 * @return String to jsonView
	 * 
	 * @usage ./getVersion.html
	 */
	@RequestMapping(value = "getVersion", method = RequestMethod.GET)
	public ModelAndView getVersionMethod(){
		String result = settingService.getVersion();
		
		return new ModelAndView("jsonView", "getVersion", result);
	}
	
	
	
	/** get is show method
	 * 
	 * @return String to jsonView
	 * 
	 * @usage ./getIsShow.html
	 */
	@RequestMapping(value = "getIsShow", method = RequestMethod.GET)
	public ModelAndView getIsShowMethod(){
		String result = settingService.getIsShow();
		
		return new ModelAndView("jsonView", "getIsShow", result);
	}
	
	
	
	/** get notice show method
	 * 
	 * @return String to jsonView
	 * 
	 * @usage ./getNotice.html
	 */
	@RequestMapping(value = "getNotice", method = RequestMethod.GET)
	public ModelAndView getNoticeMethod(){
		String result = settingService.getNotice();
		
		return new ModelAndView("jsonView", "getNotice", result);
	}
	
	
	
	/** get notices show method
	 * 
	 * @return String to jsonView
	 * 
	 * @usage ./getNotices.html
	 */
	@RequestMapping(value = "getNotices", method = RequestMethod.GET)
	public ModelAndView getNoticesMethod(){
		NoticesModel result = settingService.getNotices();
		
		return new ModelAndView("jsonView", "getNotices", result);
	}
}
