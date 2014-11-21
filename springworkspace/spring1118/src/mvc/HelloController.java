package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//@Controller : 현재 클래스가 spring MVC의 컨트롤러를 구현할 
//여기서 비지니스 로직 수행

@Controller
public class HelloController {
	// handlerMapping
	// @requestMapping : 값으로 요청을 url, method로 전송방식
	@RequestMapping(value = "/hello.kosta", method = RequestMethod.GET)
	public ModelAndView hello() {
		System.out.println("Log : 비지니스 로직 수행");
		// modelandview : 컨트롤러에게 처리결과를 보여줄 view , 값
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello"); // controller - > viewREsolver 에 의해
		// 특정 위치 hello.jsp 형태로 제작이 됨!

		// moderandview를 통해서 값을 설정함.

		mav.addObject("msg", "hi ! My name is Kim **!");
		return mav;
	}

}
