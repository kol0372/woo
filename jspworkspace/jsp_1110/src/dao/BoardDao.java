package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;

import vo.BoardVO;

public class BoardDao {

	private static BoardDao dao;

	public static synchronized BoardDao getDao() {
		if (dao == null)
			dao = new BoardDao();
		return dao;
	}

	public void insert(BoardVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.insert("board.insert", vo);
		// ss.commit(); �̰Ŵ�� ���� true�� �Ҽ� �Ӥ�����.
		ss.close();
	}

	// select�� ������ VO�� ��Ƽ� list�� ��ȯ���ִ� �޼���
	public List<BoardVO> getList(Map<String, Integer> map) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<BoardVO> list = ss.selectList("board.list", map);
		ss.close();
		return list;
	}

	public int getTotalCount() {
		SqlSession ss = FactoryService.getFactory().openSession();
		int cnt = ss.selectOne("board.totalCount");
		ss.close();
		return cnt;
	}
}