package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;




import ex1.TBoardVO;

public class DaoServiceImple implements DaoService{
	
	@Autowired
	private JdbcTemplate JdbcTemplate;


	@Override
	public void transaction(TBoardVO vo) throws SQLException {
		// 단위 작업을 위해서 rollback 상황을 인위적으로 만들어야 해요
		
			StringBuffer sql = new StringBuffer();
			
			
			sql.append("insert into woo values (woo_seq.nextVal, ? ,?, ? ,? ,?)");
		
			System.out.println(vo.getSub());
			System.out.println(vo.getWriter());
			System.out.println(vo.getContent());
			System.out.println(vo.getPwd());
			
			Object[] param = {vo.getSub(), vo.getWriter(), vo.getContent(), vo.getPwd(), vo.getMfile2()};
			JdbcTemplate.update(sql.toString(), param);
		
		
	}


	@Override
	public List<TBoardVO> getList() {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from woo");
		// JdbcTemplate 를 사용해서 mapRow()를 사용해서 cursor값을 하나씩 받아서 vo넣고
		// List에 기억을 시켜놓자.
		List<TBoardVO> list = JdbcTemplate.query(sql.toString(), 
				new RowMapper<TBoardVO>(){

			@Override
			public TBoardVO mapRow(ResultSet rs, int arg1)
					throws SQLException {
				TBoardVO vo = new TBoardVO();
				vo.setSub(rs.getString("sub"));
				vo.setWriter(rs.getString("writer"));
				vo.setContent(rs.getString("content"));
				vo.setPwd(rs.getString("pwd"));
				vo.setMfile2(rs.getString("mfile"));
				return vo;					
		}});
		return list;
	}

}
