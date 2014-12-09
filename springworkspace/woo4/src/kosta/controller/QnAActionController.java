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

	// ��� insert - form
//	@RequestMapping(value = "/writef")
//	public String writef(QnAVO vo) {
//		System.out.println("���form�̾�");
//		return "write";
//	}

	// ��� insert
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public ModelAndView write(QnAVO vo) throws UnknownHostException {
		ModelAndView ma = new ModelAndView();
		// ������ �޾ƿ��°�
//		InetAddress inet = InetAddress.getLocalHost();
		
		qnadao.addBoard(vo);
		ma.setViewName("redirect:/list.kosta");
		System.out.println("��� �ۼ��Ϸ�");
		return ma;
	}

	// ��� list
	@RequestMapping(value = "/list")
	public ModelAndView list(QnAVO vo) {
		System.out.println("��� ����Ʈ");
		List<QnAVO> list = qnadao.listBoard(vo);
		System.out.println("�ٿ��Ϸ�");
		ModelAndView ma = new ModelAndView();
		ma.setViewName("sangdam_moo_ut");
		ma.addObject("list", list);
		return ma;
	}

	// ��� detail
	@RequestMapping(value = "/detail")
	public ModelAndView detail(int no) {
		System.out.println("detail ����");
		ModelAndView ma = new ModelAndView();
		QnAVO vo = qnadao.detailBoard(no);
		ma.setViewName("sangdam_detail");
		ma.addObject("vo", vo);
		return ma;
	}

	// ���� ��� insert
	@RequestMapping(value = "/reboardf")
	public ModelAndView reboardf(QnAVO vo) {
		ModelAndView ma = new ModelAndView();
		ma.addObject("vo", vo);
		ma.setViewName("reboard");
		System.out.println("���ݴ��form�̾�");
		return ma;
	}

	// ������
	// ���� ��� insert
	@RequestMapping(value = "/reboard", method = RequestMethod.POST)
	public ModelAndView reboard(QnAVO vo) throws UnknownHostException {
		System.out.println("���� ��� ����");
		ModelAndView ma = new ModelAndView();
		// ������ �޾ƿ��°�
		InetAddress inet = InetAddress.getLocalHost();
	
		System.out.println("insert update�� :" + vo.getRef() + ", "
				+ vo.getSeq());
		qnadao.reupBoard(vo);
		System.out.println("insert update�� :" + vo.getRef() + ", "
				+ vo.getSeq());
		ma.setViewName("redirect:/list.kosta");
		System.out.println("��� �ۼ��Ϸ� list��");
		return ma;
	}

	// ���� ��� tx_insert
	@RequestMapping(value = "/tx_reboardf")
	public ModelAndView tx_reboardf(QnAVO vo) {
		ModelAndView ma = new ModelAndView();
		ma.addObject("vo", vo);
		ma.setViewName("tx_reboard");
		return ma;
	}

	// ���� ��� update insert��
	@RequestMapping(value = "/tx_reboard", method = RequestMethod.POST)
	public ModelAndView update(QnAVO vo) throws UnknownHostException {
		System.out.println(vo.getQnum());
		System.out.println("=================================================");
		System.out.println("Ʈ����� ��� ����");
		ModelAndView ma = new ModelAndView();

		// ������ �޾ƿ��°�
		InetAddress inet = InetAddress.getLocalHost();
		

		ma.setViewName("redirect:/list?no=" + vo.getQnum());
		return ma;
	}
}
