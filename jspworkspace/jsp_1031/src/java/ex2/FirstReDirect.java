/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author kosta
 */

@WebServlet(name = "FirstReDirect", urlPatterns = {"/FirstReDirect"})
public class FirstReDirect extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //요청파라미터 받기
        String v = req.getParameter("cmd");
        
        System.out.println("첫번째 페이지 이동" + v);
        
        req.setAttribute("key", v);
        //페이지 이동! , 파마미터는 초기화됨
        //그래서 실행결과 값이 이어지지 않고 null이 나옴.(SecondRedirect)
        //값을 다음페이지로 전송하고 싶으면,, 기존 url방식으로 해야함. (SecondRedirect?v=woo)
        resp.sendRedirect("SecondRedirect?v=woo");
    }
    
    
}
