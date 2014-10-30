package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ex2_005fajaxScript_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            *{margin: 0px;\n");
      out.write("            padding: 0}\n");
      out.write("            div#view{\n");
      out.write("                width: 500px;\n");
      out.write("                height: 100px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                border: 1px solid black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .java{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                background-color: lightsteelblue;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 3em;\n");
      out.write("            }\n");
      out.write("            .ms{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                background-color: snow;\n");
      out.write("                color: salmon;\n");
      out.write("                font-size: 3em;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script src=\"js/httpRequest.js\"></script>\n");
      out.write("        <script>\n");
      out.write("           function ex(obj){\n");
      out.write("               var str = obj.value;\n");
      out.write("               var param = \"v1=\"+str;\n");
      out.write("               \n");
      out.write("              // sendRequest(\"test1.jsp\",param,res,\"post\",true);\n");
      out.write("               sendRequest(\"Ex1_Sevlet\",param,res,\"post\",true);\n");
      out.write("           }\n");
      out.write("           function res(){\n");
      out.write("               var v = document.getElementById(\"view\");\n");
      out.write("                    //response 된 문자열을 받아서 표현\n");
      out.write("               v.innerHTML = xhr.responseText;\n");
      out.write("           }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <select onchange=\"ex(this)\">\n");
      out.write("            <option value=\"\">선택</option>\n");
      out.write("             <option value=\"java\">자바</option>\n");
      out.write("              <option value=\"ms\">마이크로 소프트</option>\n");
      out.write("        </select>\n");
      out.write("        <div id=\"view\"></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
