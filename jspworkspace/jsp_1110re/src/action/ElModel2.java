package action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.El2VO;
import control.ActionForward;

public class ElModel2 implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req,
			HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> singerList = new ArrayList<String>();
		El2VO vo= new El2VO();
		vo.setName("±è¿ì¸®");
		vo.setEmail("kol7456@naver.com");
		vo.setPhone("01056220372");
		singerList.add(vo.getName());
		singerList.add(vo.getEmail());
		singerList.add(vo.getPhone());
		req.setAttribute("singerList", singerList);
		
		return new ActionForward("el2.jsp", false);
	}

}
