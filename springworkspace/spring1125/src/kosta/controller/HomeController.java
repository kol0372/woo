package kosta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value = "/home.kosta")
	public String home(Model model) {
		System.out.println("타일즈 홈 동작!");
		model.addAttribute("msg", "나의 첫번째 타일즈");
		return "home";
	}

}
