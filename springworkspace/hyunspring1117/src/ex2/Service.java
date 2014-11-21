package ex2;

import java.util.List;

import vo.PlaymeVO;

public interface Service {
	public void add(PlaymeVO vo);
	public List<PlaymeVO> getList();
	public PlaymeVO getView(int num);
}
