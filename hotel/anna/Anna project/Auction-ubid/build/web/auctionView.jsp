<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page import="java.util.ArrayList" %>
<%@ page import="common.categoryENT" %>
<%@ page import="common.auctionENT" %>
<%@ page import="common.bidENT" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<script type="text/javascript">
<!--
function MM_jumpMenu(targ,selObj,restore){ //v3.0
  eval(targ+".location='"+selObj.options[selObj.selectedIndex].value+"'");
  if (restore) selObj.selectedIndex=0;
}
//-->
</script>
</head>

<body>
<table width="800" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="205" rowspan="2" align="center" ><img src="images/logo1.PNG" width="150" height="150" align="bottom" /></td>
   
  </tr>
  <tr>
    <td width="595" height="223" align="right" valign="bottom" bgcolor="#FFFFFF" ><p><strong><a href="login.html">Sign in</a> | <a href="register.html">Registeration</a></strong></p>
    </td>
  </tr>
  <tr>
    <td colspan="2"><table width="800" border="0" cellpadding="5" cellspacing="0">
      <tr>
        <td bgcolor="#006CD9" ><table width="100%" border="0"  style="size:2px; color:#FFF; font-family:Arial, Helvetica, sans-serif;">
          <tr>
            <td width="11%" align="center"><a href="computers.html">Computers</a></td>
            <td width="13%" align="center"><a href="electronics.html">Electronics</a></td>
            <td width="11%" align="center"><a href="televisions.html">Televisions</a></td>
            <td width="12%" align="center"><a href="watches.html">Watches</a></td>
            <td width="13%" align="center"><a href="jewerlry.html">Jewerlry</a></td>
            <td width="10%" align="center"><a href="fineart.html">Fine-Art</a></td>
            <td width="14%" align="center"><a href="garden.html">Home&amp;Garden</a></td>
           
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="29"  bgcolor="#013481"  style="color:#FFF"><form action="SearchServlet" method="get"><table width="500" border="0">
  <tr>
    <td width="64"></td>
    <td width="150"><input type="text" name="search" /></td>
    <td width="272"><input type="submit" value="search" name="search" /></td>
  </tr>
 
</table></form>
</td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td colspan="2" background="images/bkg.jpg"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td width="24%" valign="top" ><table width="99%" border="0" cellpadding="5" cellspacing="0" valign="top" >
          <tr>
            <td  align="center"  ><img src="images/tab_top_200px2.gif" width="189" height="65" /></td>
          </tr>
          <tr>
              <td height="32" align="center" bgcolor="#CCCCCC"><strong><a href="HomeServlet">All</a></strong></td>
          </tr>
          <%
            ArrayList<categoryENT> catlist = (ArrayList<categoryENT>) session.getAttribute("categorylist");
            for(int i = 0; i < catlist.size(); i++) {
          %>
          <tr>
            <td height="32" align="center" bgcolor="#CCCCCC"><strong><a href="HomeServlet?path=browseCat&catid=<%= catlist.get(i).getCategory_id() %>"><%= catlist.get(i).getName() %></a></strong></td>
          </tr>
          <% } %>
          </table></td>
        <td width="43%"><p>
            <%
                if(session.getAttribute("user") != null ) {
                    out.println("<a href='addAuctionServlet'>Add Auction</a>");
                }
            %>
        </p>
        
        <%
        auctionENT auc = (auctionENT)session.getAttribute("auent");
        
       %>
        
<%= auc.getTitle() %><br/>
<strong>BasePrice:
<%= auc.getBasePrice() %>
        
          <table width="100%" border="0" cellpadding="5" cellspacing="5">
            <tr>
              <td><table width="87%" border="0" align="center" cellpadding="3" cellspacing="3">
                  <%
                    ArrayList<bidENT> bidlist =auc.getArBids();
                    for(int i = 0; i < bidlist.size(); i++) {
                  %>
              <tr>
                <td style="font-size:14px"><strong><a href="DetailAuctionServlet?id=<%= bidlist.get(i).getAuction_id() %>"><%= bidlist.get(i).getBid_id() %></a></strong></td>
              </tr>
              <tr>
                <td><table width="100%" border="0">
                  <tr>
                    <td>Price: <%= bidlist.get(i).getPrice() %></td>
                  </tr>
                   <tr>
                    <td>Register Date: <%= bidlist.get(i).getRegister_date() %></td>
                  </tr>
                   
                  
                  
                </table></td>
              </tr>
              <% } %>
            </table></td>
            </tr>
            
          </table>
          </td>
        </tr>
    </table></td>
  </tr>
</table>

</body>
</html>
