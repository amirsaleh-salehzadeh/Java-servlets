package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Cinema.common.CustomerENT;
import java.util.ArrayList;
import Cinema.common.MovieENT;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title> Home </title>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"style.css\" />\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<!--banner pics-->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("\t\r\n");
      out.write("<body id=\"body\" >\r\n");
      out.write("\t<!--Header-->\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<div >\r\n");
      out.write("                         <img src=\"logo.jpg\" id=\"logoPic\"/> \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--Title-->\r\n");
      out.write("\t\t<div align=\"right\"><span class=\"title\">WELCOME TO <span style=\"font-size:24px;\">Melli Cinema</span> website</span></div>\r\n");
      out.write("\t\t<!--Menu-->\r\n");
      out.write("\t\t<div id=\"menu\" >\r\n");
      out.write("\t\t\t<table class=\"fontMenu\" cellpadding=\"5px\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"menuLink\"><a href=\"#\">Home</a></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"menuLink\"><a href=\"GenreListServlet?next=Genre.jsp\" >Movies</a></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"menuLink\"><a href=\"#\">Reseve a Movie</a></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"menuLink\"><a href=\"#\">About Us</a></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"menuLink\"><a href=\"#\">Contact Us</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--Search-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!--MainBody-->\t\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\t\t<!--LeftBaner-->\r\n");
      out.write("\t\t<div id=\"bannerL_register\"  class=\"banL_span\">\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t<!--MiddleBody-->\r\n");
      out.write("\t\t<div id=\"middleBody_register\" ></div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!--Content-->\r\n");
      out.write("               \r\n");
      out.write("         <table border=\"2\">\r\n");
      out.write("         ");

                    ArrayList<MovieENT> movies = (ArrayList<MovieENT>)session.getAttribute("movielist");
                    for(int i = 0; i < movies.size(); i++) {
                        
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>");
      out.print( movies.get(i).getMovie_name() );
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( movies.get(i).getDirector() );
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( movies.get(i).getProducer() );
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( movies.get(i).getStart_date() );
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( movies.get(i).getPrice() );
      out.write("</td>\r\n");
      out.write("                            \r\n");
      out.write("                             \r\n");
      out.write("                            <td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("                        ");

                    }
                 
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<!--RightBanner-->\r\n");
      out.write("\t\t\t<div id=\"bannerR\" class=\"fontMenu\">\r\n");
      out.write("\t\t\t\t<div class=\"banR_span\"> \r\n");
      out.write("\t\t\t\t\t<span class=\"test\"><p>\r\n");
      out.write("                                             ");
 if(session.getAttribute("customer")==null) { 
      out.write("\r\n");
      out.write("                                                <a  href=\"SignIn.jsp\"> Sign In </a>\r\n");
      out.write("                                                ");
} else { 
                                                 CustomerENT ent = (CustomerENT) session.getAttribute("customer");
                                                 out.println("Welcome " + ent.getName()); 
      out.write("\r\n");
      out.write("                                                    <a href=\"SignOut.jsp\">Sign Out</a>\r\n");
      out.write("                                                ");
 } 
      out.write("\r\n");
      out.write("                                        </p> </span>\r\n");
      out.write("\t\t\t\t\t<a  href=\"#\">VIEW Booking</a><br />        \r\n");
      out.write("                                        <a  href=\"#\">MY ACCOUNT</a><br />  \r\n");
      out.write("                                        <a  href=\"#\">FIND Movies</a><br />\r\n");
      out.write("                                        <a  href=\"#\">CUSTOMER SERVICES</a>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("                        \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!--Footer-->\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t\t<font color=\"#000000\">\r\n");
      out.write("\t\t\t\t\t\t© 2010 MELLI CINEMA. All worldwide rights reserved.\t\t\t\t\t</font>\t\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
