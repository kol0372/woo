package kosta.controller;

import java.util.List;

import kosta.dao.MemberDaoImple;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vo.ChooldonglistVO;
import vo.DispatchRecordVO;
@Controller
public class ChooldonglistContreoller {
	@Autowired
	private MemberDaoImple mdao;
	
	@RequestMapping(value = "/chooldonglist")
	public ModelAndView chooldonglist(ChooldonglistVO vo) {
		System.out.println("출동 리스트");
		List<ChooldonglistVO> list = mdao.chooldonglist(vo);
		ModelAndView ma = new ModelAndView();
		ma.setViewName("chooldonglist");
		ma.addObject("chooldonglist", list);
		return ma;
	}
	@RequestMapping(value="/chooldong", method=RequestMethod.POST)
	public ModelAndView dispatchrecord(DispatchRecordVO vo){
		System.out.println("출동기록입력");		
		mdao.insertDispatchRecord(vo);
		return new ModelAndView("redirect:/chooldonglist.kosta");
		
	}
}
