package kosta.controller;

import java.security.Principal;

import java.util.Map;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



import kosta.service.MemberService;





@Controller
public class SercurityController {
	@Resource(name="memberService")
	private MemberService service;
	
	
	
	@RequestMapping("/login.kosta")
	public void login(@RequestParam Map<String, Object> paramMap,
			ModelMap model) throws Throwable{	
		System.out.println("šx!!!!");
	}
	@RequestMapping("/loginFail.kosta")
	public void loginFail(@RequestParam Map<String, Object> paramMap,
	ModelMap model) throws Throwable{
	}
	@RequestMapping("/*.kosta")
	public void schedule(@RequestParam Map<String,Object> paramMap,
			ModelMap model,Principal principal) throws Throwable{
		String name=principal.getName();
		System.out.println("Name:"+name);
		model.addAttribute("username",name);
	}
	
	public void setService(MemberService service) {
		this.service = service;
	}
	
	
}
