package dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import vo.ImemberVO;

public class ImemberDao {
	@Autowired
	private SqlSessionTemplate ss;

	public int checkID(String id) {
		System.out.println("ID" + id);
		return ss.selectOne("imem.imemChk", id);
	}

	public int loginCheck(ImemberVO vo){
		return ss.selectOne("imem.loginChk", vo);
		
	}
}
