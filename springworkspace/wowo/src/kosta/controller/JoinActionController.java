package kosta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vo.JoinVO;
import dao.JoinDao;


@Controller
public class JoinActionController {
	@Autowired
	private JoinDao dao;

	@RequestMapping(value="/add.kosta", method=RequestMethod.POST)
	public ModelAndView insert(JoinVO vo){		
		ModelAndView mav = new ModelAndView();
		System.out.println(vo.getId());
		System.out.println(vo.getPwd());
		System.out.println(vo.getName());
		System.out.println(vo.getEmail());
		dao.insertJoin(vo);
		return mav;
	}
	
	public void setDao(JoinDao dao) {
		this.dao = dao;
	}
}
