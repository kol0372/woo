package kosta.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import resource.vo.VoteVO;

@Repository
public class VoteDao {
	@Autowired
	private SqlSessionTemplate ss;

	public void voteAdd(VoteVO v) {
		ss.insert("vote.voteadd", v);
	}

	public List<VoteVO> getList() {
		return ss.selectList("vote.voteList");
	}

	public VoteVO getDetail(int num) {
		return ss.selectOne("vote.voteDetail", num);
	}

	public void voteUpdate(VoteVO v) {
		
		ss.update("vote.voteUp", v);
	}
}
