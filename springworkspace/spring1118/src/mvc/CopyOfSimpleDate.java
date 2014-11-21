package mvc;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CopyOfSimpleDate{

	@Autowired
	private SimpleDateFormat sdf;
	@Autowired
	private Date date;
	@Autowired
	private ModelAndView mav;

	// handlerMapping
	// @requestMapping : ������ ��û�� url, method�� ���۹��
	@RequestMapping(value = "/date.kosta", method = RequestMethod.GET)
	public ModelAndView hello() {
		System.out.println("Log : �����Ͻ� ���� ����");
		// modelandview : ��Ʈ�ѷ����� ó������� ������ view , ��
		// ModelAndView mav = new ModelAndView();
		mav.setViewName("date"); // controller - > viewREsolver �� ����
		// Ư�� ��ġ hello.jsp ���·� ������ ��!\
		// moderandview�� ���ؼ� ���� ������.

		mav.addObject("date", sdf.format(date));
		// �𵨾غ� ���� string ��ȯ�� ����
		return mav;
	}
}
