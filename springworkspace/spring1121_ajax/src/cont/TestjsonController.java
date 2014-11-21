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
		// 컨테이너에 JsonView로 등록한 애가 뷰가 되야함.
		ModelAndView mav = new ModelAndView("JsonView");
		// Dao에서 데이터를 구현
		ArrayList<String> list = new ArrayList<String>();
		list.add("치맥");
		list.add(command);
		list.add(name);
		list.add("불고기");
		list.add("아수크림");
		map.addAttribute("menu", list);
		return jsonview;
	}

}
