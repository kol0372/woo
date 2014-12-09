package kosta.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import kosta.dao.QnADao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vo.QnAVO;

@Controller
public class QnAActionController {
	@Autowired
	private QnADao qnadao;

	// 답글 insert - form
//	@RequestMapping(value = "/writef")
//	public String writef(QnAVO vo) {
//		System.out.println("답글form이야");
//		return "write";
//	}

	// 답글 insert
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public ModelAndView write(QnAVO vo) throws UnknownHostException {
		ModelAndView ma = new ModelAndView();
		// 아이피 받아오는것
//		InetAddress inet = InetAddress.getLocalHost();
		
		qnadao.addBoard(vo);
		ma.setViewName("redirect:/list.kosta");
		System.out.println("답글 작성완료");
		return ma;
	}

	// 답글 list
	@RequestMapping(value = "/list")
	public ModelAndView list(QnAVO vo) {
		System.out.println("답글 리스트");
		List<QnAVO> list = qnadao.listBoard(vo);
		System.out.println("다오완료");
		ModelAndView ma = new ModelAndView();
		ma.setViewName("sangdam_moo_ut");
		ma.addObject("list", list);
		return ma;
	}

	// 답글 detail
	@RequestMapping(value = "/detail")
	public ModelAndView detail(int no) {
		System.out.println("detail 접근");
		ModelAndView ma = new ModelAndView();
		QnAVO vo = qnadao.detailBoard(no);
		ma.setViewName("sangdam_detail");
		ma.addObject("vo", vo);
		return ma;
	}

	// 본격 답글 insert
	@RequestMapping(value = "/reboardf")
	public ModelAndView reboardf(QnAVO vo) {
		ModelAndView ma = new ModelAndView();
		ma.addObject("vo", vo);
		ma.setViewName("reboard");
		System.out.println("본격답글form이야");
		return ma;
	}

	// 수정중
	// 본격 답글 insert
	@RequestMapping(value = "/reboard", method = RequestMethod.POST)
	public ModelAndView reboard(QnAVO vo) throws UnknownHostException {
		System.out.println("본격 답글 시작");
		ModelAndView ma = new ModelAndView();
		// 아이피 받아오는것
		InetAddress inet = InetAddress.getLocalHost();
	
		System.out.println("insert update전 :" + vo.getRef() + ", "
				+ vo.getSeq());
		qnadao.reupBoard(vo);
		System.out.println("insert update후 :" + vo.getRef() + ", "
				+ vo.getSeq());
		ma.setViewName("redirect:/list.kosta");
		System.out.println("답글 작성완료 list로");
		return ma;
	}

	// 본격 답글 tx_insert
	@RequestMapping(value = "/tx_reboardf")
	public ModelAndView tx_reboardf(QnAVO vo) {
		ModelAndView ma = new ModelAndView();
		ma.addObject("vo", vo);
		ma.setViewName("tx_reboard");
		return ma;
	}

	// 본격 답글 update insert로
	@RequestMapping(value = "/tx_reboard", method = RequestMethod.POST)
	public ModelAndView update(QnAVO vo) throws UnknownHostException {
		System.out.println(vo.getQnum());
		System.out.println("=================================================");
		System.out.println("트랜잭션 답글 시작");
		ModelAndView ma = new ModelAndView();

		// 아이피 받아오는것
		InetAddress inet = InetAddress.getLocalHost();
		

		ma.setViewName("redirect:/list?no=" + vo.getQnum());
		return ma;
	}
}
