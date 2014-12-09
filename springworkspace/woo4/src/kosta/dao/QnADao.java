package kosta.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.QnAVO;
@Repository
public class QnADao {
	@Autowired
	private SqlSessionTemplate ss;

	// ��� insert
	public void addBoard(QnAVO vo) {
		ss.insert("manager.addQnA", vo);
	}

	// ��� list
	public List<QnAVO> listBoard(QnAVO vo) {
		return ss.selectList("manager.listQnA", vo);
	}

	// ��� detail
	public QnAVO detailBoard(int no) {
		return ss.selectOne("manager.detailQnA", no);
	}

	// ������
	// ���� ��� insert
	public void reupBoard(QnAVO vo) {
		System.out.println("update�� :" + vo.getRef() + ", " + vo.getSeq());
		ss.update("manager.upboard", vo);
		ss.insert("manager.reboard", vo);
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
