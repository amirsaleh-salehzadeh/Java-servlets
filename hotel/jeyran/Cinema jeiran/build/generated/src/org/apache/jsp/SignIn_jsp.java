package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Cinema.common.CustomerENT;

public final class SignIn_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/RightBanner.jsp");
  }

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("   ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"bannerR\" class=\"fontMenu\">\n");
      out.write("\t\t\t\t<div class=\"banR_span\"> \n");
      out.write("\t\t\t\t\t<span class=\"test\"><p>\n");
      out.write("                                             ");
 if(session.getAttribute("customer")==null) { 
      out.write("\n");
      out.write("                                                <a  href=\"SignIn.jsp\"> Sign In </a>\n");
      out.write("                                                ");
} else { 
                                                 CustomerENT ent = (CustomerENT) session.getAttribute("customer");
                                                 out.println("Welcome " + ent.getName()); 
      out.write("\n");
      out.write("                                                    <a href=\"SignOut.jsp\">Sign Out</a>\n");
      out.write("                                                ");
 } 
      out.write("\n");
      out.write("                                        </p> </span>\n");
      out.write("\t\t\t\t\t<a  href=\"#\">VIEW Booking</a><br />        \n");
      out.write("                                        <a  href=\"#\">MY ACCOUNT</a><br />  \n");
      out.write("                                        <a  href=\"#\">FIND Movies</a><br />\n");
      out.write("                                        <a  href=\"#\">CUSTOMER SERVICES</a>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                        \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   ");
      out.write(" \n");
      out.write("   \n");
      out.write("   \n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>SignIn</title>\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"body\">\n");
      out.write("\t<!--Header-->\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<div >\n");
      out.write("\t\t\t<a href=\"Home.html\" ><img src=\"logo.jpg\" alt=\"Home\" id=\"logoPic\" class=\"picLink\"/></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--Title-->\n");
      out.write("\t\t<div align=\"right\"><span class=\"title\">WELCOME TO <span style=\"font-size:24px;\">Melli Cinema</span> website</span></div>\n");
      out.write("\t\t<!--Menu-->\n");
      out.write("\t\t<div id=\"menu\" >\n");
      out.write("\t\t\t<table class=\"fontMenu\" cellpadding=\"5px\">\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td class=\"menuLink\"><a href=\"#\">Home</a></td>\n");
      out.write("\t\t\t\t\t\t<td class=\"menuLink\"><a href=\"#\" >Movies</a></td>\n");
      out.write("\t\t\t\t\t\t<td class=\"menuLink\"><a href=\"#\">Reseve a Movie</a></td>\n");
      out.write("\t\t\t\t\t\t<td class=\"menuLink\"><a href=\"#\">About Us</a></td>\n");
      out.write("\t\t\t\t\t\t<td class=\"menuLink\"><a href=\"#\">Contact Us</a></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--Search-->\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!--MainBody-->\t\n");
      out.write("\t<div id=\"content\">\n");
      out.write("\t\t<!--LeftBaner-->\n");
      out.write("\t\t<div id=\"bannerL_signIn\"  class=\"banL_span\">\n");
      out.write("\t\t\t\t<p class=\"fontTitle\">SIGN In</p>\n");
      out.write("                                        <p id=\"error\">\n");
      out.write("                                        ");
 if (request.getParameter("msg") != null) {
                out.println(request.getParameter("msg"));
                } 
      out.write("</p>\n");
      out.write("\t\t\t \t\t<b>I have an account.</b><br /> \n");
      out.write("\t\t\t\t\tIf you have already created an account with MELLI CINEMA Online, \n");
      out.write("\t\t\t\t\tplease enter your username and password below.<br />\n");
      out.write("\t\t\t\t\t<form action=\"LoginServlet\" method=\"get\">\n");
      out.write("\t\t\t\t\t\tUSERNAME:<br />\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"username\" /><br />\n");
      out.write("\t\t\t\t\t\tPASSWORD:<br />\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"password\" /><br /><br />\n");
      out.write("\t\t\t\t\t\t<input class=\"submit\" type=\"submit\" value=\"SIGN IN\" />\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t\t<!--MiddleBody-->\n");
      out.write("\t\t<div id=\"middleBody_signIn\"  class=\"banL_span\">\n");
      out.write("\t\t\t<p><b>NOT A MEMBER YET?</b><br />\n");
      out.write("\t\t\t\tTo be ale to RESERVE A MOVIE ONLINE you ned to create an account!\n");
      out.write("\t\t\t\tWe welcome you to create an account now. </p>\n");
      out.write("\t\t\t\t<form action=\"Register.jsp\" method=\"get\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<input class=\"submit\" type=\"submit\" value=\"REGISTER\" />\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t </div>\t\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t<!--Footer-->\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t<font color=\"#000000\">\n");
      out.write("\t\t\t\t\t\t© 2010 MELLI CINEMA. All worldwide rights reserved.\t\t\t\t\t</font>\t\n");
      out.write("\t</div>\t\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
