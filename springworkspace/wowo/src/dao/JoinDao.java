package dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import vo.JoinVO;

public class JoinDao {
	@Autowired
	private SqlSessionTemplate template;
	
	public void insertJoin(JoinVO vo){
		template.insert("join.ins", vo);
	}
}
