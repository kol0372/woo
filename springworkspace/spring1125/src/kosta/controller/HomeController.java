package kosta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value = "/home.kosta")
	public String home(Model model) {
		System.out.println("Ÿ���� Ȩ ����!");
		model.addAttribute("msg", "���� ù��° Ÿ����");
		return "home";
	}

}
