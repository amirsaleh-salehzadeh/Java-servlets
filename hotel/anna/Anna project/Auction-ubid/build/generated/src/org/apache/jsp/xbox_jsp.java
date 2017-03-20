package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class xbox_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <td width=\"11%\" align=\"center\" ><a href=\"computers.html\">Computers</a></td>\r\n");
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
      out.write("      \r\n");
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
      out.write("    <td height=\"689\" colspan=\"2\" align=\"center\" background=\"images/bkg.jpg\"><table width=\"98%\" border=\"0\" bgcolor=\"#FFFFFF\" cellpadding=\"5\" cellspacing=\"5\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellpadding=\"5\" cellspacing=\"5\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"48%\" align=\"center\"><img src=\"images/scaleCAZLRSNP.jpg\" width=\"275\" height=\"275\" /></td>\r\n");
      out.write("            <td width=\"30%\"><table width=\"100%\" border=\"0\" cellpadding=\"5\" cellspacing=\"5\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td align=\"center\"><div>\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <h1>$<span id=\"bidToWinPrice1\">95</span> ea.<br />\r\n");
      out.write("                      (Bid to Win) </h1>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <div id=\"countdown\">09:40:52</div>\r\n");
      out.write("                    <span id=\"ctl00_ContentPlaceHolder1_planCloseTimeFormatted\">Jan 30, 2010 6:37PM   PDT</span></div>\r\n");
      out.write("                  <h1>&nbsp;</h1></div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td><form id=\"form1\" name=\"form1\" method=\"post\" action=\"\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                  <tr >\r\n");
      out.write("                    <td width=\"34%\" align=\"center\" bgcolor=\"#CCCCCC\" >I want:</td>\r\n");
      out.write("                    <td width=\"31%\" align=\"center\" bgcolor=\"#CCCCCC\">\r\n");
      out.write("                      <label>\r\n");
      out.write("                        <select name=\"stock\" id=\"stock\">\r\n");
      out.write("                          <option>1</option>\r\n");
      out.write("                        <option>2</option>\r\n");
      out.write("                        <option>3</option>\r\n");
      out.write("                        <option>4</option>\r\n");
      out.write("                        <option>5</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                      \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                      </label>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td width=\"35%\" align=\"center\" bgcolor=\"#CCCCCC\"> In stock 1!</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td >Max Bid:</td>\r\n");
      out.write("                    <td  ><input type=\"text\" name=\"text\" /></td>\r\n");
      out.write("                    <td align=\"center\" ><img src=\"images/ubid-bid-prodpage.png\" width=\"80\" height=\"36\" /></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                </table></form></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              </table></td>\r\n");
      out.write("            <td width=\"22%\" align=\"center\">Winners </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellpadding=\"5\" cellspacing=\"5\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"36%\"><table width=\"99%\" border=\"0\" cellpadding=\"4\" cellspacing=\"4\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td colspan=\"2\">Additional Information</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"43%\">Manufacturer #: </td>\r\n");
      out.write("                <td width=\"57%\">B4J-00107 </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>Shipping:</td>\r\n");
      out.write("                <td>5 lbs</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>Originating Warehouse:</td>\r\n");
      out.write("                <td>Supplier's Warehouse </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>Auction ID: </td>\r\n");
      out.write("                <td align=\"left\"><dl>\r\n");
      out.write("                  <dt>&nbsp; </dt>\r\n");
      out.write("                  <dd>903055927</dd>\r\n");
      out.write("                  <dt>&nbsp;</dt>\r\n");
      out.write("                </dl></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("            <td width=\"34%\"><h3>Warranty</h3>\r\n");
      out.write("              <p>N/A </p>\r\n");
      out.write("              Extended Protection Plan is not available. </td>\r\n");
      out.write("            <td width=\"30%\" valign=\"top\"><h3>Package Contents</h3>\r\n");
      out.write("              <p>Xbox 360 Console , 20gb Detachable Hard Drive , Wireless Controller , Battery   Holder for Controller , Xbox Live Headset , Av Cables , Ethernet Cable , Power   Supply , Power Cord , Instruction Manuals , Warranty Seal</p></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td><table cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><strong>Features and Benefits</strong></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>Microsoft Xbox 360 20gb Pro Console System<br />\r\n");
      out.write("              <br />\r\n");
      out.write("              Product   Features<br />\r\n");
      out.write("              Powerful hardware features 512MB unified memory, custom symmetrical   tripe-core CPU and custom 500MHz ATI graphics processor <br />\r\n");
      out.write("              Every Xbox 360 title   supports 720p and 1080i high definition resolution or 480p standard definition   resolution <br />\r\n");
      out.write("              Exclusive games (not included) shatter expectations with advanced   customization features, HD graphics, full surround sound and online-enabled   gameplay <br />\r\n");
      out.write("              Vibrant characters display depth of emotion to evoke more dramatic   responses, immersing you in the experience <br />\r\n");
      out.write("              Rip music to the Xbox 360 hard   drive and share your latest digital pictures with friends <br />\r\n");
      out.write("              View   progressive-scan DVD movies <br />\r\n");
      out.write("              Support for up to four wireless game controllers</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
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
