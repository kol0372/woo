package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import vo.PlaymeVO;
import control.ActionFoward;
import dao.PlaymeDao;

public class ActionList implements Action{
	private String url;
	private boolean method;
	@Autowired
	private PlaymeDao jdbcDao;
	
	public void setUrl(String url) {
		this.url = url;
	}

	public void setMethod(boolean method) {
		this.method = method;
	}
	@Override
	public ActionFoward execute(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		List<PlaymeVO> list = jdbcDao.getList();
		req.setAttribute("list", list);
		return new ActionFoward(url, method);
	}

}
