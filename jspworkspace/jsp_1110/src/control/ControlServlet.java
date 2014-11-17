package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;

@WebServlet("*.kosta")
public class ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		//����ڷ� ���� ��û�� ����
		String query = request.getParameter("cmd");
		//��ü���� ���� ���ִ� actionFactory�� �̱������� ����
		ActionFactory factory = ActionFactory.getFactory();
		//��û�� ���� ���� ��ü�� �ּҸ� ���������� �޾Ƽ�
		Action action = factory.makeAction(query);
		//��û�� ���� �𵨿��� ���� ��Ű�� ���ؼ� �������̽��� �޼��带 ȣ���ϸ�
		//������ xx�� ��ü�� ȣ���̵�(�������̵� ������ �ٽ��ѹ� �����غ��� �ٶ�)
		//���� ��ȯ�� ���� �м��Ͽ� �̵������ �����ϸ� ��!
		ActionForward af = action.execute(request, response);
		if(af.isMethod()){
			response.sendRedirect(af.getUrl());
		}else{
			RequestDispatcher rd = request.getRequestDispatcher(af.getUrl());
			rd.forward(request, response);
		}

	}

}