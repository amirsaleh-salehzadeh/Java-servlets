package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#500000\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<!-- ImageReady Slices (theme.psd) -->\r\n");
      out.write("<table id=\"Table_01\" width=\"800\" border=\"0\" cellpadding=\"0\" align=\"center\" cellspacing=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t<img src=\"images/index_01.jpg\" width=\"800\" height=\"160\" alt=\"\" ></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"152\" align=\"left\" valign=\"top\">\r\n");
      out.write("\t\t\t<table align=\"left\" vspace=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/index_02.jpg\" width=\"150\" height=\"40\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/index_04.jpg\" width=\"150\" height=\"40\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/index_05.jpg\" width=\"150\" height=\"40\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/index_06.jpg\" width=\"150\" height=\"40\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t\t<td width=\"648\" align=\"left\" valign=\"top\">\r\n");
      out.write("\t\t\t<table style=\"color:#FFCC00\" align=\"left\" vspace=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td  valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"login\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t\tUsername:<input name=\"username\" type=\"text\">\r\n");
      out.write("\t\t\t\t\t\t\tPassword:<input name=\"password\" type=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"logIn\">\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("              </tr><tr>\r\n");
      out.write("                                         <td>\r\n");
      out.write("                                            \r\n");
      out.write("                                            <h2><span style=\"color:white\">History<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></h2>\r\n");
      out.write("        <p><span style=\"color:white\">Kickboxing, as a derivative of <a href=\"http://en.wikipedia.org/wiki/Boxing\" title=\"Boxing\"><span style=\"color:\r\n");
      out.write("white;text-decoration:none;text-underline:none\">Boxing</span></a>, <a href=\"http://en.wikipedia.org/wiki/Karate\" title=\"Karate\"><span style=\"color:\r\n");
      out.write("white;text-decoration:none;text-underline:none\">Karate</span></a>, <a href=\"http://en.wikipedia.org/wiki/Muay_Thai\" title=\"Muay Thai\"><span style=\"color:white;text-decoration:none;text-underline:none\">Muay\r\n");
      out.write("        Thai</span></a> as well as other styles, was created to compete\r\n");
      out.write("        effectively against these martial arts. The initial development of the\r\n");
      out.write("        styles (as well as the name) was in Japan. However, there were also\r\n");
      out.write("        similar influences taking hold in the United States in 1974 (<a href=\"http://en.wikipedia.org/wiki/Wako\" title=\"Wako\"><span style=\"color:white;text-decoration:none;text-underline:none\">Wako</span></a>),\r\n");
      out.write("        and martial artists from many disciplines toured both areas allowing the\r\n");
      out.write("        development of a common kickboxing standard.<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <h3><span style=\"color:white\">Initial Japanese development<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></h3>\r\n");
      out.write("        <p><i><span style=\"color:white\">Kickboxing</span></i><span style=\"color:white\">\r\n");
      out.write("        (as a specific martial art) has its roots in <a href=\"http://en.wikipedia.org/wiki/Muay_Thai\" title=\"Muay Thai\"><span style=\"color:white;text-decoration:none;text-underline:none\">Muay\r\n");
      out.write("        Thai</span></a>. It was developed as a competitive sport to oppose Muay\r\n");
      out.write("        Thai by <a href=\"http://en.wikipedia.org/wiki/Japan\" title=\"Japan\"><span style=\"color:white;\r\n");
      out.write("text-decoration:none;text-underline:none\">Japanese</span></a> boxing promoter <a href=\"http://en.wikipedia.org/wiki/Osamu_Noguchi\" title=\"Osamu Noguchi\"><span style=\"color:white;text-decoration:none;text-underline:none\">Osamu\r\n");
      out.write("        Noguchi</span></a>. He wanted to introduce Japan the <a href=\"http://en.wikipedia.org/wiki/Muay_Thai\" title=\"Muay Thai\"><span style=\"color:white;text-decoration:none;text-underline:none\">Muay\r\n");
      out.write("        Thai</span></a> style of fighting that he had seen in <a href=\"http://en.wikipedia.org/wiki/Thailand\" title=\"Thailand\"><span style=\"color:white;text-decoration:none;text-underline:none\">Thailand</span></a>.\r\n");
      out.write("        The 3 Muay Thai fighters were taken to Japan in 1966, and fought against\r\n");
      out.write("        3 karate fighters from <b>Oyama dojo</b> (<a href=\"http://en.wikipedia.org/wiki/Kyokushin\" title=\"Kyokushin\"><span style=\"color:white;text-decoration:none;text-underline:none\">Kyokushin</span></a>\r\n");
      out.write("        later). Japan won by 2-1 then. Noguchi and <a href=\"http://en.wikipedia.org/w/index.php?title=Kenji_Kurosaki&amp;action=edit\" title=\"Kenji Kurosaki\"><span style=\"color:white;text-decoration:none;\r\n");
      out.write("text-underline:none\">Kenji Kurosaki</span></a> (Kyokushin karate instructor)\r\n");
      out.write("        studied <a href=\"http://en.wikipedia.org/wiki/Muay_thai\" title=\"Muay thai\"><span style=\"color:white;text-decoration:none;text-underline:none\">Muay\r\n");
      out.write("        thai</span></a> and developed a combined martial art which Noguchi named\r\n");
      out.write("        <i>kick boxing</i>. However, <a href=\"http://en.wikipedia.org/wiki/Throw_(grappling)\" title=\"Throw (grappling)\"><span style=\"color:white;text-decoration:none;\r\n");
      out.write("text-underline:none\">throwing</span></a> and <a href=\"http://en.wikipedia.org/wiki/Headbutt\" title=\"Headbutt\"><span style=\"color:white;text-decoration:none;text-underline:none\">butting</span></a>\r\n");
      out.write("        were allowed in the beginning to distinguish from Muay Thai style. This\r\n");
      out.write("        was repealed later. The Kickboxing Association was founded in Japan soon\r\n");
      out.write("        after this. Kickboxing boomed and became popular in Japan as it began to\r\n");
      out.write("        be broadcasted on <a href=\"http://en.wikipedia.org/wiki/Television\" title=\"Television\"><span style=\"color:white;text-decoration:none;text-underline:\r\n");
      out.write("none\">TV</span></a>. <a href=\"http://en.wikipedia.org/wiki/Tadashi_Sawamura\" title=\"Tadashi Sawamura\"><span style=\"color:white;text-decoration:none;\r\n");
      out.write("text-underline:none\">Tadashi Sawamura</span></a> was an especially popular early\r\n");
      out.write("        kickboxer. However, the boom was suddenly finished and became unpopular\r\n");
      out.write("        after Sawamura was retired. Kickboxing had not been on TV until K-1 was\r\n");
      out.write("        founded in 1993.<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <p><span style=\"color:white\">In 1993, as <a href=\"http://en.wikipedia.org/wiki/Kazuyoshi_Ishii\" title=\"Kazuyoshi Ishii\"><span style=\"color:white;text-decoration:none;text-underline:none\">Kazuyoshi\r\n");
      out.write("        Ishii</span></a> (founder of <a href=\"http://en.wikipedia.org/w/index.php?title=Seidokan_karate&amp;action=edit\" title=\"Seidokan karate\"><span style=\"color:white;text-decoration:none;\r\n");
      out.write("text-underline:none\">Seidokan karate</span></a>) produced <a href=\"http://en.wikipedia.org/wiki/K-1\" title=\"K-1\"><span style=\"color:white;\r\n");
      out.write("text-decoration:none;text-underline:none\">K-1</span></a> under special\r\n");
      out.write("        kickboxing rules (No elbow and <a href=\"http://en.wikipedia.org/wiki/Grappling#Stand-up_grappling\" title=\"Grappling\"><span style=\"color:white;text-decoration:none;text-underline:\r\n");
      out.write("none\">neck wrestling</span></a>) in 1993, kickboxing became famous again.<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <p><span style=\"color:white\">The sport has spread through <a href=\"http://en.wikipedia.org/wiki/North_America\" title=\"North America\"><span style=\"color:white;text-decoration:none;text-underline:none\">North\r\n");
      out.write("        America</span></a>, <a href=\"http://en.wikipedia.org/wiki/Europe\" title=\"Europe\"><span style=\"color:white;text-decoration:none;text-underline:none\">Europe</span></a>,\r\n");
      out.write("        and <a href=\"http://en.wikipedia.org/wiki/Australia\" title=\"Australia\"><span style=\"color:white;text-decoration:none;text-underline:none\">Australia</span></a>.<o:p>\r\n");
      out.write("        </span><span style=\"color:white\"></o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <p class=\"MsoNormal\" style=\"margin-left:3.75pt\"><span style=\"color:white\">&nbsp;<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <h3><span style=\"color:white\">Spreading to Europe, Australia, and North\r\n");
      out.write("        America<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></h3>\r\n");
      out.write("        <p><i><span style=\"color:white\">Jan Plas</span></i><span style=\"color:white\">,\r\n");
      out.write("        the Dutch kickboxer founded <i>Mejiro jym</i> with some Muay Thai\r\n");
      out.write("        pioneers in <a href=\"http://en.wikipedia.org/wiki/Netherlands\" title=\"Netherlands\"><span style=\"color:white;text-decoration:none;text-underline:none\">Netherlands</span></a>,\r\n");
      out.write("        1978 after he learned kickboxing from <i>Kenji Kurosaki</i> in Japan. In\r\n");
      out.write("        addition, he also founded NKBB (The Dutch Kickboxing Association) which\r\n");
      out.write("        is the first kickboxing organization in Netherlands in 1978. The sport\r\n");
      out.write("        took off in the U.S. with the popularity and success of <a href=\"http://en.wikipedia.org/wiki/Bill_Wallace_(martial_arts)\" title=\"Bill Wallace (martial arts)\"><span style=\"color:white;text-decoration:\r\n");
      out.write("none;text-underline:none\">Bill &quot;Superfoot&quot; Wallace&quot;</span></a> in\r\n");
      out.write("        the 1970s.<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <p><span style=\"color:white\">As of 2006, the new world champion in\r\n");
      out.write("        American kickboxing is the Pennsylvanian Steve &quot;Slick Poon&quot;\r\n");
      out.write("        Parker.<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <p class=\"MsoNormal\" style=\"margin-left:3.75pt\"><span style=\"color:white\">&nbsp;<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <h2><span style=\"color:white\">Rules<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></h2>\r\n");
      out.write("        <p class=\"MsoNormal\" style=\"margin-left:3.75pt\"><span style=\"color:white\">&nbsp;<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <h3><span style=\"color:white\">Japanese style kickboxing<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></h3>\r\n");
      out.write("        <p><span style=\"color:white\">This is almost same as <a href=\"http://en.wikipedia.org/wiki/Muay_Thai\" title=\"Muay Thai\"><span style=\"color:white;text-decoration:none;text-underline:none\">Muay\r\n");
      out.write("        Thai</span></a> but there are differences between them.<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <ul type=\"disc\">\r\n");
      out.write("          <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("     auto;mso-list:l1 level1 lfo1;tab-stops:list .5in\">Similarities <o:p>\r\n");
      out.write("            </o:p>\r\n");
      out.write("          </li>\r\n");
      out.write("          <ul type=\"circle\">\r\n");
      out.write("            <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("      auto;mso-list:l1 level2 lfo1;tab-stops:list 1.0in\">time: three minutes ×\r\n");
      out.write("              five rounds <o:p>\r\n");
      out.write("              </o:p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("      auto;mso-list:l1 level2 lfo1;tab-stops:list 1.0in\">allowed to attack with <a href=\"http://en.wikipedia.org/wiki/Elbow\" title=\"Elbow\"><span style=\"color:white;text-decoration:none;text-underline:none\">elbow</span></a>\r\n");
      out.write("              <o:p>\r\n");
      out.write("              </o:p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("      auto;mso-list:l1 level2 lfo1;tab-stops:list 1.0in\">allowed to attack with <a href=\"http://en.wikipedia.org/wiki/Knee\" title=\"Knee\"><span style=\"color:white;text-decoration:none;text-underline:none\">knee</span></a>\r\n");
      out.write("              <o:p>\r\n");
      out.write("              </o:p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("      auto;mso-list:l1 level2 lfo1;tab-stops:list 1.0in\">allowed to kick the\r\n");
      out.write("              lower half of the body except <a href=\"http://en.wikipedia.org/wiki/Crotch\" title=\"Crotch\"><span style=\"color:white;text-decoration:none;text-underline:none\">crotch</span></a>\r\n");
      out.write("              <o:p>\r\n");
      out.write("              </o:p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("      auto;mso-list:l1 level2 lfo1;tab-stops:list 1.0in\">allowed to do\r\n");
      out.write("              neck-wrestling (folding opponent's head with arms and elbows to\r\n");
      out.write("              attack the opponent's body or head with knee-strikes) <o:p>\r\n");
      out.write("              </o:p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("      auto;mso-list:l1 level2 lfo1;tab-stops:list 1.0in\"><a href=\"http://en.wikipedia.org/wiki/Head_butt\" title=\"Head butt\"><span style=\"color:white;text-decoration:none;text-underline:none\">head\r\n");
      out.write("              butts</span></a> and throws were banned in 1966 for boxer safety <o:p>\r\n");
      out.write("              </o:p>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul type=\"disc\">\r\n");
      out.write("          <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("     auto;mso-list:l0 level1 lfo2;tab-stops:list .5in\">Differences <o:p>\r\n");
      out.write("            </o:p>\r\n");
      out.write("          </li>\r\n");
      out.write("          <ul type=\"circle\">\r\n");
      out.write("            <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("      auto;mso-list:l0 level2 lfo2;tab-stops:list 1.0in\">No ram muay before\r\n");
      out.write("              match <o:p>\r\n");
      out.write("              </o:p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("      auto;mso-list:l0 level2 lfo2;tab-stops:list 1.0in\">No Thai music at the\r\n");
      out.write("              match <o:p>\r\n");
      out.write("              </o:p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("      auto;mso-list:l0 level2 lfo2;tab-stops:list 1.0in\">Interval takes one\r\n");
      out.write("              minute only <o:p>\r\n");
      out.write("              </o:p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("      auto;mso-list:l0 level2 lfo2;tab-stops:list 1.0in\">Point system: <o:p>\r\n");
      out.write("              </o:p>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <p><span style=\"color:white\">In muay thai, kicking to mid-body and head\r\n");
      out.write("        are judged highly. Moreover, kicking is still judged highly even if\r\n");
      out.write("        kicking was blocked. And punching is judged low. But they aren't in\r\n");
      out.write("        kickboxing.<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <ul type=\"disc\">\r\n");
      out.write("          <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("     auto;mso-list:l2 level1 lfo3;tab-stops:list .5in\">See also <a href=\"http://en.wikipedia.org/wiki/K-1\" title=\"K-1\"><span style=\"color:white;\r\n");
      out.write("     text-decoration:none;text-underline:none\">K-1</span></a> <o:p>\r\n");
      out.write("            </o:p>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <p class=\"MsoNormal\" style=\"margin-left:3.75pt\"><span style=\"color:white\">&nbsp;<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <h3><span style=\"color:white\">American and Australian style kickboxing<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></h3>\r\n");
      out.write("        <p><span style=\"color:white\">These are rules used in American and\r\n");
      out.write("        Australian Full Contact Karate. Opponents are allowed to hit each other\r\n");
      out.write("        with <a href=\"http://en.wikipedia.org/wiki/Fist\" title=\"Fist\"><span style=\"color:white;\r\n");
      out.write("text-decoration:none;text-underline:none\">fists</span></a> and <a href=\"http://en.wikipedia.org/wiki/Foot\" title=\"Foot\"><span style=\"color:white;\r\n");
      out.write("text-decoration:none;text-underline:none\">feet</span></a>, striking above the <a href=\"http://en.wikipedia.org/wiki/Hip\" title=\"Hip\"><span style=\"color:white;\r\n");
      out.write("text-decoration:none;text-underline:none\">hip</span></a>. Using <a href=\"http://en.wikipedia.org/wiki/Elbow_(strike)\" title=\"Elbow (strike)\"><span style=\"color:white;text-decoration:none;text-underline:none\">elbows</span></a>\r\n");
      out.write("        or <a href=\"http://en.wikipedia.org/wiki/Knee_(strike)\" title=\"Knee (strike)\"><span style=\"color:white;text-decoration:none;text-underline:\r\n");
      out.write("none\">knees</span></a> is forbidden and the use of the <a href=\"http://en.wiktionary.org/wiki/shin\" title=\"wiktionary:shin\"><span style=\"color:white;text-decoration:none;text-underline:none\">shins</span></a>\r\n");
      out.write("        is seldom allowed. This is in contrast to Muay Thai where the use of\r\n");
      out.write("        elbows and knees are allowed; in fact some Muay Thai practitioners\r\n");
      out.write("        consider kickboxing a &quot;watered down&quot; version of Muay Thai.\r\n");
      out.write("        Fighters and promoters can agree to various rules including kicks only\r\n");
      out.write("        above the waist, kicks anywhere, no knee strikes, knees only to the\r\n");
      out.write("        body, and so on.<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <p><span style=\"color:white\">Bouts are usually 3 to 12 rounds (lasting 2\r\n");
      out.write("        - 3 minutes each) for amateur and professional contests with a 1-minute\r\n");
      out.write("        rest in between rounds. The round durations and the number of rounds can\r\n");
      out.write("        vary depending on the stipulations agreed to before hand by each fighter\r\n");
      out.write("        or manager. A winner is declared during the bout if there is a <a href=\"http://en.wikipedia.org/wiki/Submission_(combat_sport_term)\" title=\"Submission (combat sport term)\"><span style=\"color:white;text-decoration:\r\n");
      out.write("none;text-underline:none\">submission</span></a> (fighter quits or fighter's\r\n");
      out.write("        corner throws in the towel), <a href=\"http://en.wikipedia.org/wiki/Knockout\" title=\"Knockout\"><span style=\"color:white;text-decoration:none;text-underline:\r\n");
      out.write("none\">knockout</span></a> (KO), or referee stoppage (<a href=\"http://en.wikipedia.org/wiki/Knockout\" title=\"Knockout\"><span style=\"color:white;text-decoration:none;text-underline:none\">Technical\r\n");
      out.write("        Knock Out</span></a>, or TKO). If all of the rounds expire with no\r\n");
      out.write("        knockout then the fight is scored by a team of 3 judges. The judges\r\n");
      out.write("        determine a winner based on their scoring of each round. A split\r\n");
      out.write("        decision indicates a disagreement between the judges, while a unanimous\r\n");
      out.write("        decision indicates that all judges saw the fight the same way and all\r\n");
      out.write("        have declared the same winner.<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <p class=\"MsoNormal\" style=\"margin-left:3.75pt\"><span style=\"color:white\">&nbsp;<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <h3><span style=\"color:white\">European style kickboxing<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></h3>\r\n");
      out.write("        <p><span style=\"color:white\">Originally, American style kickboxing was\r\n");
      out.write("        formed with <a href=\"http://en.wikipedia.org/wiki/Muay_thai\" title=\"Muay thai\"><span style=\"color:white;text-decoration:none;text-underline:none\">Muay\r\n");
      out.write("        thai</span></a> and Japanese kickboxing.<o:p>\r\n");
      out.write("        </o:p>\r\n");
      out.write("        </span></p>\r\n");
      out.write("        <ul type=\"disc\">\r\n");
      out.write("          <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("     auto;mso-list:l3 level1 lfo4;tab-stops:list .5in\">time: 3 minutes × 5\r\n");
      out.write("            rounds <o:p>\r\n");
      out.write("            </o:p>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("     auto;mso-list:l3 level1 lfo4;tab-stops:list .5in\">not allowed to attack to\r\n");
      out.write("            with <a href=\"http://en.wikipedia.org/wiki/Elbow\" title=\"Elbow\"><span style=\"color:white;text-decoration:none;text-underline:none\">elbow</span></a>\r\n");
      out.write("            <o:p>\r\n");
      out.write("            </o:p>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("     auto;mso-list:l3 level1 lfo4;tab-stops:list .5in\">allowed to attack with <a href=\"http://en.wikipedia.org/wiki/Knee\" title=\"Knee\"><span style=\"color:white;text-decoration:none;text-underline:none\">knee</span></a>\r\n");
      out.write("            <o:p>\r\n");
      out.write("            </o:p>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("     auto;mso-list:l3 level1 lfo4;tab-stops:list .5in\">allowed to kick the lower\r\n");
      out.write("            half of the body except <a href=\"http://en.wikipedia.org/wiki/Crotch\" title=\"Crotch\"><span style=\"color:white;text-decoration:none;text-underline:\r\n");
      out.write("     none\">crotch</span></a> <o:p>\r\n");
      out.write("            </o:p>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("     auto;mso-list:l3 level1 lfo4;tab-stops:list .5in\">allowed to do\r\n");
      out.write("            neck-wrestling but frequency is limited. <o:p>\r\n");
      out.write("            </o:p>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"MsoNormal\" style=\"color:white;mso-margin-top-alt:auto;mso-margin-bottom-alt:\r\n");
      out.write("     auto;mso-list:l3 level1 lfo4;tab-stops:list .5in\">headbutts and throws are\r\n");
      out.write("            not allowed <o:p>\r\n");
      out.write("            </o:p>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <p class=\"MsoNormal\"><span style=\"color:white\">&nbsp;<o:p>\r\n");
      out.write("        </span></p> \r\n");
      out.write("                                         </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<!-- End ImageReady Slices -->\r\n");
      out.write("</body>\r\n");
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