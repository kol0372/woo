package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.BoardVO;
import control.ActionForward;
import dao.BoardDao;

public class BoardAdd implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req,
			HttpServletResponse resp) throws IOException {
		BoardVO v = new BoardVO();
		v.setTitle(req.getParameter("title"));
		v.setWriter(req.getParameter("writer"));
		v.setContent(req.getParameter("content"));
		v.setGroupno(Integer.parseInt(req.getParameter("groupno")));
		BoardDao.getDao().insert(v);
		
		// TODO Auto-generated method stub
		return new ActionForward("board.kosta?query=boardList", true);
		//false, true로 forward인지 redirect인지 결정
	}

}
