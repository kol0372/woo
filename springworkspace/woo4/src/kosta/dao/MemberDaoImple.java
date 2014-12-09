package kosta.dao;

import java.util.List;




import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.ChooldonglistVO;
import vo.DispatchRecordVO;
import vo.MemberVO;



@Repository
public class MemberDaoImple implements MemberDaoInter {
	
	@Autowired
	private SqlSessionTemplate ss;
	
	@Override
	public MemberVO getUserPassword(String mnum) {
		System.out.println("MemberDaoImple:"+mnum);
		MemberVO rev = ss.selectOne("manager.loginok", mnum);
		System.out.println("rev:"+rev);
		return rev;
	}
	@Override
	public List<ChooldonglistVO> chooldonglist(ChooldonglistVO vo) {
		return ss.selectList("manager.chooldonglist", vo);
	}
	@Override
	public void insertDispatchRecord(DispatchRecordVO vo) {
		ss.insert("manager.dispatchrecord", vo);
		
	}
	
	
}
