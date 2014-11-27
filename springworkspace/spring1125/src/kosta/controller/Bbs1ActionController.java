package kosta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vo.Bbs1VO;
import dao.Bbs1Dao;

// Bbs1과 관련된 모든 작업을 수행한다.
@Controller
public class Bbs1ActionController {
	@Autowired
	private Bbs1Dao bbs1dao;

	@RequestMapping(value = "/list.kosta", method = RequestMethod.GET)
	public ModelAndView list() {
		List<Bbs1VO> list = bbs1dao.getList();
		System.out.println("Log D : " + list.size());
		ModelAndView mav = new ModelAndView("bbsList");
		mav.addObject("list", list);
		return mav;
	}

	// insert Comment

}
