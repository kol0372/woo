package cont;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class TestjsonController {
	@Autowired
	private View jsonview;

	@RequestMapping(value = "/testJson.kosta")
	public View testJson1(String command, String name, ModelMap map) {
		System.out.println("Command : " + command);
		System.out.println("name : " + name);
		// �����̳ʿ� JsonView�� ����� �ְ� �䰡 �Ǿ���.
		ModelAndView mav = new ModelAndView("JsonView");
		// Dao���� �����͸� ����
		ArrayList<String> list = new ArrayList<String>();
		list.add("ġ��");
		list.add(command);
		list.add(name);
		list.add("�Ұ��");
		list.add("�Ƽ�ũ��");
		map.addAttribute("menu", list);
		return jsonview;
	}

}
