package dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import vo.SreqVO;

public class SreqDao {
	@Autowired
	private SqlSessionTemplate template;
	
	public void insertJoin(SreqVO vo){
		template.insert("sreq.ins", vo);
	}
}
