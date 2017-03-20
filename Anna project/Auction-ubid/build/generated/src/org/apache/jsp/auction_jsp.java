package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import common.auctionENT;

public final class auction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("function MM_jumpMenu(targ,selObj,restore){ //v3.0\r\n");
      out.write("  eval(targ+\".location='\"+selObj.options[selObj.selectedIndex].value+\"'\");\r\n");
      out.write("  if (restore) selObj.selectedIndex=0;\r\n");
      out.write("}\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"800\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"205\" rowspan=\"2\" align=\"center\" ><img src=\"images/logo1.PNG\" width=\"150\" height=\"150\" align=\"bottom\" /></td>\r\n");
      out.write("   \r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"595\" height=\"223\" align=\"right\" valign=\"bottom\" bgcolor=\"#FFFFFF\" ><p><strong><a href=\"login.html\">Sign in</a> | <a href=\"register.html\">Registeration</a></strong></p>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"2\"><table width=\"800\" border=\"0\" cellpadding=\"5\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td bgcolor=\"#006CD9\" ><table width=\"100%\" border=\"0\"  style=\"size:2px; color:#FFF; font-family:Arial, Helvetica, sans-serif;\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"11%\" align=\"center\"><a href=\"computers.html\">Computers</a></td>\r\n");
      out.write("            <td width=\"13%\" align=\"center\"><a href=\"electronics.html\">Electronics</a></td>\r\n");
      out.write("            <td width=\"11%\" align=\"center\"><a href=\"televisions.html\">Televisions</a></td>\r\n");
      out.write("            <td width=\"12%\" align=\"center\"><a href=\"watches.html\">Watches</a></td>\r\n");
      out.write("            <td width=\"13%\" align=\"center\"><a href=\"jewerlry.html\">Jewerlry</a></td>\r\n");
      out.write("            <td width=\"10%\" align=\"center\"><a href=\"fineart.html\">Fine-Art</a></td>\r\n");
      out.write("            <td width=\"14%\" align=\"center\"><a href=\"garden.html\">Home&amp;Garden</a></td>\r\n");
      out.write("           \r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"29\"  bgcolor=\"#013481\"  style=\"color:#FFF\"><form action=\"\" method=\"get\"><table width=\"500\" border=\"0\" cellpadding=\"5\" cellspacing=\"5\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"64\"><select name=\"jumpMenu\" id=\"jumpMenu\" onchange=\"MM_jumpMenu('parent',this,0)\">\r\n");
      out.write("      <option>Computers</option>\r\n");
      out.write("      <option>Electronics</option>\r\n");
      out.write("      <option>Televisions</option>\r\n");
      out.write("      <option>Watches</option>\r\n");
      out.write("      <option>Jewerlry</option>\r\n");
      out.write("      <option>Fine Art</option>\r\n");
      out.write("      <option>Home & Garden</option>\r\n");
      out.write("    </select></td>\r\n");
      out.write("    <td width=\"150\"><input type=\"text\" name=\"search\" /></td>\r\n");
      out.write("    <td width=\"272\"><input type=\"button\" value=\"search\" name=\"search\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write(" \r\n");
      out.write("</table></form>\r\n");
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"634\" colspan=\"2\" background=\"images/bkg.jpg\" valign=\"top\">\r\n");
      out.write("        <p>\r\n");
      out.write("            <table width=\"90%\" border=\"0\" align=\"center\" cellspacing=\"5\" cellpadding=\"5\">\r\n");
      out.write("      <tr>\r\n");
      out.write("           <td>Title</td>\r\n");
      out.write("           <td>Description</td>\r\n");
      out.write("           <td>Start Date</td>\r\n");
      out.write("           <td>End Date</td>\r\n");
      out.write("           <td>view details</td>\r\n");
      out.write("           </tr>\r\n");
      out.write("             ");
 
           ArrayList<auctionENT> auctionlist = (ArrayList<auctionENT>) session.getAttribute("auctionlist");
           for (int i=0; i<auctionlist.size(); i++) {
               
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print( auctionlist.get(i).getTitle() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( auctionlist.get(i).getDesc() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( auctionlist.get(i).getStartDate() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( auctionlist.get(i).getEndDate() );
      out.write("</td>\r\n");
      out.write("           </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>");
 if(auctionlist.get(i).isIsActive()==0){
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            Not confirmed:\r\n");
      out.write("            \r\n");
      out.write("            <a href=\"auctionauthServlet?task=accept&id=");
      out.print( auctionlist.get(i).getAuction_id());
      out.write("\">Accept</a>\r\n");
      out.write("            <a href=\"auctionauthServlet?task=deny&id=");
      out.print(auctionlist.get(i).getAuction_id() );
      out.write("\">Deny</a>\r\n");
      out.write("            ");
 } else if(auctionlist.get(i).isIsActive()==1){
      out.write("\r\n");
      out.write("            Accept:<a href=\"auctionauthServlet?task=deny&id=");
      out.print(auctionlist.get(i).getAuction_id());
      out.write("\">Deny</a>\r\n");
      out.write("            Deny:<a href=\"auctionauthServlet?task=accept&id=");
      out.print(auctionlist.get(i).getAuction_id());
      out.write("\">Accept</a>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td><a href=\"detailAuctionServlet?id=");
      out.print( auctionlist.get(i).getAuction_id() );
      out.write("\">Detail</a></td>\r\n");
      out.write("           </tr>\r\n");
      out.write("            \r\n");
      out.write("               ");

           }
           
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </table></p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
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
