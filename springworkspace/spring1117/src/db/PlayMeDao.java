package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class PlayMeDao implements Service {

	// spring이 제공하는 template를 사용
	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public void add(PlayMeVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into playme values(playme_seq.nextVal, ?,?,?,sysdate)");

		// parameter
		Object[] param = { vo.getPname(), vo.getPrice(), vo.getUsers() };
		JdbcTemplate.update(sql.toString(), param);
		System.out.println("insert ok");

	}

	@Override
	public List<PlayMeVO> getlist() {

		StringBuffer sql = new StringBuffer();
		sql.append("select num, pname, price, users, to_char(rdate,'yyyy-mm-dd') rdate from playme order by 1 desc");
		// jdbcTemplate를 사용해서 Maprow()사용해서 cursor값을 하나씩 받아서
		// VO에 넣고 List에 기억을 시켜놓자
		List<PlayMeVO> list = JdbcTemplate.query(sql.toString(),
				new RowMapper<PlayMeVO>() {
					// 이게 while(rs.next())라 생각해
					@Override
					public PlayMeVO mapRow(ResultSet rs, int arg1)
							throws SQLException {
						PlayMeVO vo = new PlayMeVO();
						vo.setNum(rs.getInt("num"));
						vo.setPname(rs.getString("pname"));
						vo.setUsers(rs.getString("users"));
						vo.setPrice(rs.getInt("price"));
						vo.setRdate(rs.getString("rdate"));
						return vo;
					}
				});
		return list;
	}

	@Override
	public PlayMeVO getView(int num) {
		StringBuffer sql = new StringBuffer();
		sql.append("select num, pname, price, users, to_char(rdate,'yyyy-mm-dd') rdate from playme where num=? order by 1 desc");
		// jdbcTemplate를 사용해서 Maprow()사용해서 cursor값을 하나씩 받아서
		// VO에 넣고 List에 기억을 시켜놓자

		Object[] param = { num };
		PlayMeVO pmvo = JdbcTemplate.queryForObject(sql.toString(), param,
				new RowMapper<PlayMeVO>() {
					// 이게 while(rs.next())라 생각해
					@Override
					public PlayMeVO mapRow(ResultSet rs, int arg1)
							throws SQLException {
						PlayMeVO vo = new PlayMeVO();
						vo.setNum(rs.getInt("num"));
						vo.setPname(rs.getString("pname"));
						vo.setUsers(rs.getString("users"));
						vo.setPrice(rs.getInt("price"));
						vo.setRdate(rs.getString("rdate"));
						return vo;
					}
				});
		return pmvo;
	}
}
