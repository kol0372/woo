package control;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import action.Action;

@WebServlet("*.kosta")
public class ControlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}

	private void process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		String query = request.getParameter("query");
		
		ApplicationContext ctx = new GenericXmlApplicationContext("ex2/jdbc.xml");
		Action action = ctx.getBean(query, Action.class);
		ActionForward af = action.execute(request, response);
		
		if(af.isMethod()){
			response.sendRedirect(af.getUrl());
		}else{
			RequestDispatcher rd = request.getRequestDispatcher(af.getUrl());
			rd.forward(request,response);
		}
	}	
}
