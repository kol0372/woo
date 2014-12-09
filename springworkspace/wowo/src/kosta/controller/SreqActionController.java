package kosta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.SreqDao;
import vo.SreqVO;

@Controller
public class SreqActionController {
	@Autowired
	private SreqDao dao;
	
	public void setDao(SreqDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value="/sadd.kosta", method=RequestMethod.POST)
	public ModelAndView insert(SreqVO vo){
		ModelAndView mav= new ModelAndView();
		dao.insertJoin(vo);
		System.out.println(vo.getNum());
		System.out.println(vo.getSrname());
		System.out.println(vo.getSraddress());
		System.out.println(vo.getSrtel());	
		System.out.println(vo.getSrdate());
		return mav;
	}
}
