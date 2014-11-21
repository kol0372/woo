package mvc;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SimpleDate {
	// handlerMapping
	// @requestMapping : 값으로 요청을 url, method로 전송방식
	@RequestMapping(value = "/date.kosta", method = RequestMethod.GET)
	public ModelAndView hello() {
		System.out.println("Log : 비지니스 로직 수행");
		// modelandview : 컨트롤러에게 처리결과를 보여줄 view , 값
		ModelAndView mav = new ModelAndView();
		mav.setViewName("date"); // controller - > viewREsolver 에 의해
		// 특정 위치 hello.jsp 형태로 제작이 됨!\

		// moderandview를 통해서 값을 설정함.
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");	
		 Date date = new Date();
		mav.addObject("date", sdf.format(date));
		return mav;
	}
}
