package db;

import java.util.List;

public interface Service {

	public void add(PlayMeVO vo);

	public List<PlayMeVO> getlist();

	public PlayMeVO getView(int num);
}
