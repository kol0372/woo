package dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import vo.MJoinVO;

public class DaoServiceImple implements DaoService {

	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public void transaction(MJoinVO vo) throws SQLException {
		// ���� �۾��� ���ؼ� rollback ��Ȳ�� ���������� ������ �ؿ�
		StringBuffer[] sql = new StringBuffer[5];
		for ( int i =0; i < sql.length; i ++){
			sql[i] = new StringBuffer();
			sql[i].append("insert into mjoin values (mjoin_seq.nextVal, ? ,?, ? ,? , sysdate, ?)");
			int number = ((1000+1)*i);
			if(i ==3){
			 number = 1000/0; //0���� ���� ���� ���⶧���� ���⼭ ���ܰ� �߻���. 
			}
			JdbcTemplate.update(sql[i].toString(), vo.getId()+"_"+i, vo.getPwd(), vo.getName(), vo.getInfo(), number);
		}
	}
}
