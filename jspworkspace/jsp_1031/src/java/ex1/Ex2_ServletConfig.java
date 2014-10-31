/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kosta
 */
public class Ex2_ServletConfig extends HttpServlet {
   private String admin_id, test_id, address;
   //�ٽ�: ServletContext�� ��� ���ø����̼ǿ��� ���Ǵ� ����
   //ServletConfig�� ������ ���������� ��ȿ�ϴ�.
 @Override
    public void init() throws ServletException {
        //int-param ���� ����� ������ servletConfig�� ����ȴ�. 
        admin_id = getServletConfig().getInitParameter("admin_id");
        //int-xontext���� ����� ������ servletConfig�� ����ȴ�. 
        test_id = getServletContext().getInitParameter("admin_id");
        address =  getServletContext().getInitParameter("address");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("euc-kr");
       //PrintWriter 
        PrintWriter out= resp.getWriter(); //�������� ����� �� �ִ� ��Ʈ��
       out.print("Admin: Servletconfig" + admin_id +"\n");
       out.print("test :"+test_id+ "\n");
       out.print("address :" + address);
    }
     //���� ��� : test_id�� null ����   xml��  config�Ķ� ��⶧���� ..

}

   
