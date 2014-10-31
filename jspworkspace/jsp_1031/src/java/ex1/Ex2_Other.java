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
public class Ex2_Other extends HttpServlet {
    
   private String admin_id, test_id, address;
   
 @Override
    public void init() throws ServletException {
        admin_id = getServletConfig().getInitParameter("admin_id");
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
    //admin_id, test_id null xml에 servletconfig에만  config파람 줬기때문에 ..
    //address는 나옴 전체적용 

}
