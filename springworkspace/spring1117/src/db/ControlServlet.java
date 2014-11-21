package db;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@WebServlet("*.kosta")
public class ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext ctx;
	public ControlServlet() {
		ctx = new GenericXmlApplicationContext("db/db.xml");
		
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		process(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}

	private void process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		// 사용자로 부터 요청을 받음
		String query = request.getParameter("query");

	
		Action action = ctx.getBean(query, Action.class);
		// 요청에 따른 모델에게 일을 시키기 위해서 인터페이스의 메서드를 호출하면
		// 구현된 xx모델 객체가 호출이됨(오버라이딩 개념을 다시한번 생각해보기 바람)
		// 모델이 반환한 값을 분석하여 이동방식을 지정하면 끝!
		ActionForward af = action.execute(request, response);
		
		StringBuffer path = new StringBuffer();
		path.append("/WEB-INF/jsp/").append(af.getUrl());
		
		if (af.isMethod()) {
			response.sendRedirect(af.getUrl());
		} else {
			RequestDispatcher rd = request.getRequestDispatcher(af.getUrl());
			rd.forward(request, response);
		}

	}

}
