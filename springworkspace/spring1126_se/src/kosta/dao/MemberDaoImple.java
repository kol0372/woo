package kosta.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.AdminVO;

@Repository
public class MemberDaoImple implements MemberDaoInter{
	
	@Autowired
	private SqlSessionTemplate ss;

	@Override
	public AdminVO getUserPassword(String userid) {
		System.out.println("MemberDaoImple"+userid);
		AdminVO rev = ss.selectOne("login.loginok", userid);
		System.out.println("rev:"+rev);
		return rev;
	}


}
