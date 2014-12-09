package dao;

import java.util.List;



import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;


import vo.QnAVO;

public class QnADao {
	@Autowired
	private SqlSessionTemplate ss;

	// ��� insert
	public void addBoard(QnAVO vo) {
		ss.insert("QnA.addQnA", vo);
	}

	// ��� list
	public List<QnAVO> listBoard(QnAVO vo) {
		return ss.selectList("QnA.listQnA", vo);
	}

	// ��� detail
	public QnAVO detailBoard(int no) {
		return ss.selectOne("QnA.detailQnA", no);
	}

	// ������
	// ���� ��� insert
	public void reupBoard(QnAVO vo) {
		System.out.println("update�� :" + vo.getRef() + ", " + vo.getSeq());
		ss.update("QnA.upboard", vo);
		ss.insert("QnA.reboard", vo);
		System.out.println("update�� :" + vo.getRef() + ", " + vo.getSeq());
	}
	//
	// // ���� ��� tx_insert��
	// public void tx_addBoard(Board2VO vo) {
	// ss.insert("kosta.txreinboard", vo);
	// }
	//
	// // ���� ��� tx_update
	// public void tx_upBoard(Board2VO vo) {
	// ss.update("kosta.txreupboard", vo);
	// }
}
