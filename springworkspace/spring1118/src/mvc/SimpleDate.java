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
	// @requestMapping : ������ ��û�� url, method�� ���۹��
	@RequestMapping(value = "/date.kosta", method = RequestMethod.GET)
	public ModelAndView hello() {
		System.out.println("Log : �����Ͻ� ���� ����");
		// modelandview : ��Ʈ�ѷ����� ó������� ������ view , ��
		ModelAndView mav = new ModelAndView();
		mav.setViewName("date"); // controller - > viewREsolver �� ����
		// Ư�� ��ġ hello.jsp ���·� ������ ��!\

		// moderandview�� ���ؼ� ���� ������.
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");	
		 Date date = new Date();
		mav.addObject("date", sdf.format(date));
		return mav;
	}
}
