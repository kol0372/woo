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
   //핵심: ServletContext는 모든 어플리케이션에서 사용되는 범위
   //ServletConfig는 설정된 서블릿에서만 유효하다.
 @Override
    public void init() throws ServletException {
        //int-param 으로 등록한 내용은 servletConfig에 저장된다. 
        admin_id = getServletConfig().getInitParameter("admin_id");
        //int-xontext으로 등록한 내용은 servletConfig에 저장된다. 
        test_id = getServletContext().getInitParameter("admin_id");
        address =  getServletContext().getInitParameter("address");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("euc-kr");
       //PrintWriter 
        PrintWriter out= resp.getWriter(); //브라우저로 출력할 수 있는 스트림
       out.print("Admin: Servletconfig" + admin_id +"\n");
       out.print("test :"+test_id+ "\n");
       out.print("address :" + address);
    }
     //실행 결과 : test_id는 null 나옴   xml에  config파람 줬기때문에 ..

}

   
