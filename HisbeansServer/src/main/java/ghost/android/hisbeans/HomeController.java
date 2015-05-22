package ghost.android.hisbeans;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author SeungMin
 * @email rfrost77@gmail.com
 * @classname HomeController.java
 * @package ghost.android.hisbeans
 * @date 2012. 7. 6. 오후 7:45:40
 * @purpose : Handles requests for the application home page.
 *
 * @comment : 
 * 			@SMLee Window -> Java -> Code Sytle -> Code Template -> Comments -> Types -> Edit 
 * 					순으로 들어가 기본주석 위 양식으로 변경하기. 기본주석 다는 단축키는 Shift + Alt + J
 * 			@SMLee 모든 Class에 위와 같이 주석 달면서 시작하기. Comment 있을 경우 @(본인 이니셜) Comment 형식으로 달아주기.
 * 			@SMLee 주석은 가능한 쉽게 많이 달아주기.
 * 			@SMLee 공모전 화이팅!
 *
 */

@Controller
public class HomeController {
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView homeMethod(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		
		Date date = new Date();
		
		mav.addObject("serverTime", date);
		return mav;
	}
}
