package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//@Controller : ���� Ŭ������ spring MVC�� ��Ʈ�ѷ��� ������ 
//���⼭ �����Ͻ� ���� ����

@Controller
public class HelloController {
	// handlerMapping
	// @requestMapping : ������ ��û�� url, method�� ���۹��
	@RequestMapping(value = "/hello.kosta", method = RequestMethod.GET)
	public ModelAndView hello() {
		System.out.println("Log : �����Ͻ� ���� ����");
		// modelandview : ��Ʈ�ѷ����� ó������� ������ view , ��
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello"); // controller - > viewREsolver �� ����
		// Ư�� ��ġ hello.jsp ���·� ������ ��!

		// moderandview�� ���ؼ� ���� ������.

		mav.addObject("msg", "hi ! My name is Kim **!");
		return mav;
	}

}
