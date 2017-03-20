package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Common.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("   \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <table align=\"center\">\n");
      out.write("       <tr>\n");
      out.write("        <td>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        </td>\n");
      out.write("         </tr>\n");
      out.write("          <tr>\n");
      out.write("             <td>\n");
      out.write("                  <form action=\"registerUser\" method=\"post\" name=\"form\" >\n");
      out.write("                  <table width=\"324\" border=\"1\" align=\"center\">\n");
      out.write("                      <tr>\n");
      out.write("                            <td colspan=\"2\" align=\"center\"><span >\n");
      out.write("                        Registeration Form </span></td>\n");
      out.write("                      </tr>\n");
      out.write("                      \n");
      out.write("                       <tr>\n");
      out.write("\n");
      out.write("                       <td width=\"130\" >Name: </td>\n");
      out.write("                       <td width=\"178\"><input name=\"name\" type=\"text\"></td>\n");
      out.write("                       </tr>\n");
      out.write("                       \n");
      out.write("                       <tr>\n");
      out.write("                         <td >Family Name: </td>\n");
      out.write("                         <td><input name=\"fname\" type=\"text\"></td>\n");
      out.write("                       </tr>\n");
      out.write("                       \n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                         <td >Telephone:</td>\n");
      out.write("                         <td><input name=\"phone\" type=\"text\"></td>\n");
      out.write("                          </tr>\n");
      out.write("                          \n");
      out.write("                        <tr>\n");
      out.write("                            <td >Email:</td>\n");
      out.write("                            <td><input name=\"email\" type=\"text\"></td>\n");
      out.write("                          </tr>\n");
      out.write("                          \n");
      out.write("                          <tr>\n");
      out.write("                           <td >Password:</td>\n");
      out.write("                           <td><input name=\"password\" type=\"password\"></td>\n");
      out.write("                          </tr>\n");
      out.write("                          \n");
      out.write("                          <tr>\n");
      out.write("                          <td >Username:</td>\n");
      out.write("                          <td><input name=\"usern\" type=\"text\"></td>\n");
      out.write("                          </tr>\n");
      out.write("                          \n");
      out.write("                          <tr>\n");
      out.write("                           <td ><label> Address: </label></td>\n");
      out.write("                           <td><textarea name=\"address\"></textarea></td>\n");
      out.write("                           \n");
      out.write("                          </tr>\n");
      out.write("                          \n");
      out.write("                          ");
if(session.getAttribute("user")!=null){
                            PassengerENT pent = (PassengerENT)session.getAttribute("user");
                            if(pent.isAdmin()){
                          
      out.write("\n");
      out.write("                          <tr>\n");
      out.write("                            <td ><label> Is Admin </label></td>\n");
      out.write("                            <td><input type=\"checkbox\" name=\"admin\" value=\"isAdmin\"></td>\n");
      out.write("                          </tr>\n");
      out.write("                          ");
}}
      out.write("\n");
      out.write("                          <tr>\n");
      out.write("\n");
      out.write("                            <td colspan=\"2\" align=\"center\">\n");
      out.write("                                <input name=\"\" type=\"submit\" value=\"Submit\">\n");
      out.write("                                </td>\n");
      out.write("                          </tr>\n");
      out.write("                        </table>\n");
      out.write("                         </form>   \n");
      out.write("                               </td>\n");
      out.write("                                 </tr>\n");
      out.write("                     </table>\n");
      out.write("        \n");
      out.write("             </body>\n");
      out.write("         \n");
      out.write("         </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
