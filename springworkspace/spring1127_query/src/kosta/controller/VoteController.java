package kosta.controller;

import java.util.List;

import kosta.dao.VoteDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import resource.vo.VoteVO;

@Controller
public class VoteController {
	@Autowired
	private VoteDao dao;

	@RequestMapping(value = "/votein.kosta", method = RequestMethod.POST)
	public ModelAndView addVote(VoteVO vo) {
		System.out.println("----------------------------------------------log");
		System.out.println(vo.getSub());
		System.out.println(vo.getCode());
		ModelAndView mav = new ModelAndView();
		dao.voteAdd(vo);
		mav.setViewName("redirect:/voteList.kosta");
		System.out.println("답글 작성완료");
		return mav;
	}

	@RequestMapping(value = "/voteList.kosta")
	public ModelAndView voteList() {
		List<VoteVO> list = dao.getList();
		ModelAndView mav = new ModelAndView();

		mav.setViewName("voteList");
		mav.addObject("list", list);
		return mav;
	}

	@RequestMapping(value = "/voteDetail.kosta")
	public ModelAndView voteDetail(int num) {

		VoteVO v = dao.getDetail(num);
		ModelAndView mav = new ModelAndView();

		mav.setViewName("voteDetail");
		mav.addObject("v", v);
		System.out.println(num);
		return mav;
	}

	@RequestMapping(value = "/voteup.kosta", method = RequestMethod.POST)
	public ModelAndView upVote(VoteVO vo) {
		dao.voteUpdate(vo);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/voteList.kosta");
		System.out.println("업데이트 작성완료");
		return mav;
	}

}
