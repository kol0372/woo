package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ActionForward;

//모델은 비지니스 로직을 수행해야 하고, 반드시 컨트럴러에 의한
//요청이 있을 때 수행되어야 하기 때문에 컨트롤러에게 메뉴로 제공될
//인터페이스를
//구현해야한다.
public class IndexAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req,
			HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("INdexModel이 수행되었음");
		System.out.println("데베관련 작업도 여기서 함.");
		return new ActionForward("index.jsp", false);
	}

}
