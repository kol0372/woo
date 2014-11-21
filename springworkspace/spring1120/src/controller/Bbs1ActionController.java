package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vo.Bbs1CommVO;
import vo.Bbs1VO;
import dao.Bbs1Dao;

// Bbs1�� ���õ� ��� �۾��� �����Ѵ�.
@Controller
public class Bbs1ActionController {
	@Autowired
	private Bbs1Dao bbs1dao;
	
	@RequestMapping(value="/bbs1In.kosta", method=RequestMethod.POST)
	public ModelAndView insert(Bbs1VO vo){
		bbs1dao.insertBbs1(vo);
		// list�� �̵��� ���� redirect�� �̵�!!
		return new ModelAndView("redirect:/bbs1List.kosta");
	}
	
	@RequestMapping(value="/bbs1List.kosta", method=RequestMethod.GET)
	public ModelAndView list() {
		List<Bbs1VO> list = bbs1dao.getList();
		System.out.println("Log D : "+list.size());
		ModelAndView mav = new ModelAndView("bbsList");
		mav.addObject("list",list);
		return mav;
	}
	
	@RequestMapping(value="/bbs1detail.kosta", method=RequestMethod.GET)
	public ModelAndView detail(int num){
		Bbs1VO vo = bbs1dao.getDetail(num);
		// ����� ���� ����Ʈ�� ��� �۾�
		List<Bbs1CommVO> cList = bbs1dao.getCommList(num);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("bbsDetail");
		mav.addObject("vo",vo);
		mav.addObject("cList", cList);
		return mav;
	}
	// insert Comment
	
	@RequestMapping(value="/bbs1Comm.kosta", method=RequestMethod.POST)
	public ModelAndView bbsCommin(Bbs1CommVO vo){
		System.out.println("Lod D:"+vo.getWriter());
		bbs1dao.insertComm(vo);
		//Detail�� �̵� �� get������� ���� detail�� �ĺ�����
		// kcode������ �����ؾ� �Ѵ�.
		StringBuffer redirect = new StringBuffer();
		redirect.append("redirect:bbs1detail.kosta?num=");
		redirect.append(vo.getKcode());
		return new ModelAndView(redirect.toString());
	}
	
	
	
}
