package dao;

import java.sql.SQLException;
import java.util.List;

import ex1.TBoardVO;

public interface DaoService {

	public void transaction(TBoardVO vo) throws SQLException;

	

	public List<TBoardVO> getList();
}
