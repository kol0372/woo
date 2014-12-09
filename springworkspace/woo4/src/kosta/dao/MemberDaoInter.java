package kosta.dao;

import java.util.List;

import vo.ChooldonglistVO;
import vo.DispatchRecordVO;
import vo.MemberVO;

public interface MemberDaoInter {
	public MemberVO getUserPassword(String mnum);
	public List<ChooldonglistVO> chooldonglist(ChooldonglistVO vo);
	public void insertDispatchRecord(DispatchRecordVO vo);
}
