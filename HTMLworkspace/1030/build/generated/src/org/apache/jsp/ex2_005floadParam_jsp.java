package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ex2_005floadParam_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.0.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-migrate-1.2.1.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $(document).ready (function()\n");
      out.write("            {\n");
      out.write("                var $menu = $('.menu>input');\n");
      out.write("                $menu.click(function(){\n");
      out.write("                    //alert(\"menu 안의 button 클릭!!\");\n");
      out.write("                    //서버로 보내기 위한 버튼의 value\n");
      out.write("                    var $val = $(this).val();\n");
      out.write("                    console.log('클릭한 값 : ' + $val);\n");
      out.write("                               \n");
      out.write("                    //로드된 서버로 데이터를 get 방식으로 전송 후 callback 받기\n");
      out.write("                    $('#new-projects').load('Ex2_Sevlet?num='+$val + \" li\",function(resp,status,xhr){\n");
      out.write("                            console.log('resp:'+resp);\n");
      out.write("                            console.log('status:'+status); //success\n");
      out.write("                            console.log('xhr:'+xhr.statusText); //OK\n");
      out.write("                            if(status == \"error\"){\n");
      out.write("                                var msg = \"페이지 오류\";\n");
      out.write("                                $('#error').html(msg+\",\"+xhr.status+\",\"+xhr.statusText);\n");
      out.write("                            }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <input type =\"button\" value=\"Click1\">\n");
      out.write("            <input type=\"button\" value=\"Click2\">\n");
      out.write("        </div>\n");
      out.write("       <!-- <input type=\"button\" value=\"noClick\">-->\n");
      out.write("        <b>Projects:</b>\n");
      out.write("        <ol id=\"new-projects\">df</ol>\n");
      out.write("        <div id=\"error\">d</div>\n");
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
