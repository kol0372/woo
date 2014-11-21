package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ex2.Service;
import vo.PlaymeVO;

public class PlaymeDao implements Service{
	private static PlaymeDao dao;
	public static synchronized PlaymeDao getDao(){
		if(dao == null) dao = new PlaymeDao();
		return dao;
	}
	
	// spring이 제공하는 Template를 사용
	@Autowired
	private JdbcTemplate JdbcTemplate;
	@Override
	public void add(PlaymeVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into playme values(playme_seq.nextVal,?,?,?,sysdate)");
		//parameter
		Object[] param = {vo.getPname(),vo.getPrice(),vo.getUsers()};
		JdbcTemplate.update(sql.toString(),param);
		System.out.println("Insert Ok");
	}

	@Override
	public List<PlaymeVO> getList() {
		StringBuffer sql = new StringBuffer();
		sql.append("select num, pname,price,users");
		sql.append(" ,to_char(rdate,'yyyy-mm-dd') rdate from playme");
		sql.append(" order by 1 desc ");
		// JdbcTemplate 를 사용해서 mapRow()를 사용해서 cursor값을 하나씩 받아서 vo넣고
		// List에 기억을 시켜놓자.
		List<PlaymeVO> list = JdbcTemplate.query(sql.toString(), 
				new RowMapper<PlaymeVO>(){

			@Override
			public PlaymeVO mapRow(ResultSet rs, int arg1)
					throws SQLException {
				PlaymeVO vo = new PlaymeVO();
				vo.setNum(rs.getInt("num"));
				vo.setPname(rs.getString("pname"));
				vo.setPrice(rs.getInt("price"));
				vo.setUsers(rs.getString("users"));
				vo.setRdate(rs.getString("rdate"));
				return vo;					
		}});
		return list;
	}

	@Override
	public PlaymeVO getView(int num) {
		StringBuffer sql = new StringBuffer();
		sql.append("select num, pname,price,users");
		sql.append(" ,to_char(rdate,'yyyy-mm-dd') rdate from playme");
		sql.append(" where num=?");
		sql.append(" order by 1 desc ");
		Object[] param = {num};
		PlaymeVO pmvo = JdbcTemplate.queryForObject(sql.toString(),param, 
				new RowMapper<PlaymeVO>(){

			@Override
			public PlaymeVO mapRow(ResultSet rs, int arg1)
					throws SQLException {
				PlaymeVO vo = new PlaymeVO();
				vo.setNum(rs.getInt("num"));
				vo.setPname(rs.getString("pname"));
				vo.setPrice(rs.getInt("price"));
				vo.setUsers(rs.getString("users"));
				vo.setRdate(rs.getString("rdate"));
				return vo;					
		}});
		return pmvo;
	}
}
