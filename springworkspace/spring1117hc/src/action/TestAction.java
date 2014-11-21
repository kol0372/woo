package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import vo.PlaymeVO;
import control.ActionFoward;
import dao.PlaymeDao;

public class TestAction implements Action{
	private String url;
	private boolean method;
	@Autowired
	private PlaymeDao dao;
	@Override
	public ActionFoward execute(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		List<PlaymeVO> list = dao.getList();
		
		return new ActionFoward(url,method);
	}

}
