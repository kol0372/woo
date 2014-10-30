package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exam_005fstar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"JS/httpRequest.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            #wrap div{float:left}\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready (function()\n");
      out.write("            {\n");
      out.write("              $('#ggChoice').change(function(){\n");
      out.write("                  var url=\"ex3_ajax_Data.jsp\";\n");
      out.write("                  var params = \"groupName=\" + $(this).val();\n");
      out.write("                  $.ajax({\n");
      out.write("                      url:url,\n");
      out.write("                      data:params,\n");
      out.write("                      success:function(args){\n");
      out.write("                          $(\"#result>#ggChoice2\").html(args);\n");
      out.write("                      },\n");
      out.write("                      error:function(e){\n");
      out.write("                          alert(e.responseText);\n");
      out.write("                      }\n");
      out.write("                  });\n");
      out.write("              });\n");
      out.write("              $('#ggChoice2').change(function(){\n");
      out.write("                  var url1=\"ex3_ajaxImgData.jsp\";\n");
      out.write("                  //encodeURlComponent - 한글로 get방식으로 전송되었을 때..\n");
      out.write("                  var param1 = \"gname=\"+encodeURIComponent($(this).val());\n");
      out.write("                  $.ajax({\n");
      out.write("                      url:url1,\n");
      out.write("                      data:param1,\n");
      out.write("                      success:function(args){\n");
      out.write("                          //callback된 이미지의 경로값을 이미지태그에 src속성값으로 지정\n");
      out.write("                          $(\"#target\").attr(\"src\",args);\n");
      out.write("                      },\n");
      out.write("                       error:function(e){\n");
      out.write("                          alert(e.responseText);\n");
      out.write("                      }\n");
      out.write("                  });\n");
      out.write("              });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrap\">\n");
      out.write("            <div>\n");
      out.write("                <select id=\"ggChoice\">\n");
      out.write("                    <option>선택</option>\n");
      out.write("                    <option value=\"1\">걸스데이</option>\n");
      out.write("                    <option value=\"2\">티아라</option>       \n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"result\">\n");
      out.write("                 <select id=\"ggChoice2\"><option>=선택=</option></select>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"imgTarget\">\n");
      out.write("                 <img src =\"img/ya.PNG\" id=\"target\" style=\"width:120px\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
