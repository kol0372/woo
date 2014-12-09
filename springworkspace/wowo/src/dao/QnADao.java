package dao;

import java.util.List;



import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;


import vo.QnAVO;

public class QnADao {
	@Autowired
	private SqlSessionTemplate ss;

	// 답글 insert
	public void addBoard(QnAVO vo) {
		ss.insert("QnA.addQnA", vo);
	}

	// 답글 list
	public List<QnAVO> listBoard(QnAVO vo) {
		return ss.selectList("QnA.listQnA", vo);
	}

	// 답글 detail
	public QnAVO detailBoard(int no) {
		return ss.selectOne("QnA.detailQnA", no);
	}

	// 수정중
	// 본격 답글 insert
	public void reupBoard(QnAVO vo) {
		System.out.println("update전 :" + vo.getRef() + ", " + vo.getSeq());
		ss.update("QnA.upboard", vo);
		ss.insert("QnA.reboard", vo);
		System.out.println("update후 :" + vo.getRef() + ", " + vo.getSeq());
	}
	//
	// // 본격 답글 tx_insert로
	// public void tx_addBoard(Board2VO vo) {
	// ss.insert("kosta.txreinboard", vo);
	// }
	//
	// // 본격 답글 tx_update
	// public void tx_upBoard(Board2VO vo) {
	// ss.update("kosta.txreupboard", vo);
	// }
}
