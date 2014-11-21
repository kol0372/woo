package dao;

import java.sql.SQLException;

import vo.MJoinVO;

public interface DaoService {
	
	public void transaction(MJoinVO vo) throws SQLException;

}
