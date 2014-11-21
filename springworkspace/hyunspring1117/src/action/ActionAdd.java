package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import vo.PlaymeVO;
import control.ActionFoward;
import dao.PlaymeDao;
import ex2.Service;

public class ActionAdd implements Action{
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
		req.setCharacterEncoding("euc-kr");
		PlaymeVO vo = new PlaymeVO();
		vo.setPname(req.getParameter("pname"));
		vo.setPrice(Integer.parseInt(req.getParameter("price")));
		vo.setUsers(req.getParameter("users"));
		jdbcDao.add(vo);
		return new ActionFoward(url,method);
	}

}
