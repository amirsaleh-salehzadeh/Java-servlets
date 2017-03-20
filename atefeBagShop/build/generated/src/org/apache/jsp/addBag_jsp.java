package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addBag_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Join Us</title>\n");
      out.write("<LINK href=\"css.css\" rel=stylesheet>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("<script type=\"text/JavaScript\">\n");
      out.write("<!--\n");
      out.write("function MM_swapImgRestore() { //v3.0\n");
      out.write("  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function MM_preloadImages() { //v3.0\n");
      out.write("  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();\n");
      out.write("    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)\n");
      out.write("    if (a[i].indexOf(\"#\")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function MM_findObj(n, d) { //v4.01\n");
      out.write("  var p,i,x;  if(!d) d=document; if((p=n.indexOf(\"?\"))>0&&parent.frames.length) {\n");
      out.write("    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}\n");
      out.write("  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];\n");
      out.write("  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);\n");
      out.write("  if(!x && d.getElementById) x=d.getElementById(n); return x;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function MM_swapImage() { //v3.0\n");
      out.write("  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)\n");
      out.write("   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}\n");
      out.write("}\n");
      out.write("//-->\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#fd4040\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" onLoad=\"MM_preloadImages('images/Untitled-2_03.jpg','images/Untitled-2_04.jpg','images/Untitled-2_06.jpg','images/Untitled-2_05.jpg')\">\n");
      out.write("<!-- ImageReady Slices (Untitled-1) -->\n");
      out.write("<br/>\n");
      out.write("<table id=\"Table_01\" align=\"center\" width=\"800\" height=\"319\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td height=\"195\" colspan=\"6\">\n");
      out.write("\t\t\t<img src=\"images/Untitled-1_01.jpg\" width=\"800\" height=\"195\" alt=\"\"></td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td height=\"39\">\n");
      out.write("\t\t\t<img src=\"images/Untitled-1_02.jpg\" width=\"179\" height=\"39\" alt=\"\"></td>\n");
      out.write("\t\t<td><a href=\"index.jsp\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image9','','images/Untitled-2_03.jpg',1)\"><img src=\"images/Untitled-1_03.jpg\" name=\"Image9\" width=\"115\" height=\"39\" border=\"0\"></a></td>\n");
      out.write("\t\t<td><a href=\"#\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image10','','images/Untitled-2_04.jpg',1)\"><img src=\"images/Untitled-1_04.jpg\" name=\"Image10\" width=\"141\" height=\"39\" border=\"0\"></a></td>\n");
      out.write("\t\t<td><a href=\"join.jsp\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image12','','images/Untitled-2_05.jpg',1)\"><img src=\"images/Untitled-1_05.jpg\" name=\"Image12\" width=\"132\" height=\"39\" border=\"0\"></a></td>\n");
      out.write("\t\t<td><a href=\"#\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image11','','images/Untitled-2_06.jpg',1)\"><img src=\"images/Untitled-1_06.jpg\" name=\"Image11\" width=\"161\" height=\"39\" border=\"0\"></a></td>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t\t<img src=\"images/Untitled-1_07.jpg\" width=\"72\" height=\"39\" alt=\"\"></td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td height=\"46\" colspan=\"6\">\n");
      out.write("\t\t\t<img src=\"images/Untitled-1_08.jpg\" width=\"800\" height=\"46\" alt=\"\"></td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("             <td colspan=\"6\" background=\"images/burberry-check.jpg\">\n");
      out.write("                 <form action=\"addBag\" method=\"post\">\n");
      out.write("                    <table align=\"center\"> \n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td align=\"center\">\n");
      out.write("                                <span class=\"alert\">");
 if(request.getParameter("alert")!= null)out.print(request.getParameter("alert")); 
      out.write("</span></br>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td align=\"center\">\n");
      out.write("                                <span class=\"title\">Add a Bag</span>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td align=\"center\">\n");
      out.write("<table width=\"324\" border=\"1\">\n");
      out.write("  <tr>\n");
      out.write("\n");
      out.write("    <td width=\"130\" class=\"content\">Name: </td>\n");
      out.write("    <td width=\"178\" class=\"content\"><input name=\"name\" type=\"text\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"content\">Description: </td>\n");
      out.write("    <td class=\"content\"><input name=\"description\" type=\"text\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("\n");
      out.write("    <td class=\"content\">Price:</td>\n");
      out.write("    <td class=\"content\"><input name=\"price\" type=\"text\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"content\">Image:</td>\n");
      out.write("    <td class=\"content\"><input name=\"img\" type=\"password\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td colspan=\"2\" class=\"content\" align=\"center\">\n");
      out.write("\t<input name=\"\" type=\"submit\" value=\"Submit\">\n");
      out.write("\t</td>\n");
      out.write("\n");
      out.write("  </tr>\n");
      out.write("</table></form>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 </td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("<!-- End ImageReady Slices -->\n");
      out.write("</body>\n");
      out.write("</html>");
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
