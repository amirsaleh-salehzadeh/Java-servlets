<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page import="java.util.ArrayList" %>
<%@ page import="common.usersENT" %>

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
        <td height="29"  bgcolor="#013481"  style="color:#FFF"><form action="" method="get"><table width="500" border="0" cellpadding="5" cellspacing="5">
  <tr>
    <td width="64"><select name="jumpMenu" id="jumpMenu" onchange="MM_jumpMenu('parent',this,0)">
      <option>Computers</option>
      <option>Electronics</option>
      <option>Televisions</option>
      <option>Watches</option>
      <option>Jewerlry</option>
      <option>Fine Art</option>
      <option>Home & Garden</option>
    </select></td>
    <td width="150"><input type="text" name="search" /></td>
    <td width="272"><input type="button" value="search" name="search" /></td>
  </tr>
 
</table></form>
</td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="634" colspan="2" background="images/bkg.jpg" valign="top"><p>
        <table width="90%" border="0" align="center" cellspacing="5" cellpadding="5">
          <tr>
           <td>First Name</td>
           <td>Last Name</td>
           <td>Accept/Deny</td>
           <td>View</td>
           </tr>
           <% 
           ArrayList<usersENT> userlist = (ArrayList<usersENT>) session.getAttribute("userList");
           for (int i=0; i<userlist.size(); i++) {
               %>
                <tr>
                    <td><%= userlist.get(i).getFname() %></td>
                    <td><%= userlist.get(i).getLname() %></td>
                    <td>
                        <% if(userlist.get(i).getActive() == 0) { %>
                        Not Confirmed: 
                            <a href="userauthServlet?task=accept&id=<%= userlist.get(i).getUser_id() %>">Accept</a>
                            <a href="userauthServlet?task=deny&id=<%= userlist.get(i).getUser_id() %>">Deny</a>
                        <% } else if(userlist.get(i).getActive() == 1) { %>
                        Accept: <a href="userauthServlet?task=deny&id=<%= userlist.get(i).getUser_id() %>">Deny</a>
                        <% } else if(userlist.get(i).getActive() == 2) { %>
                        Deny: <a href="userauthServlet?task=accept&id=<%= userlist.get(i).getUser_id() %>">Accept</a>
                        <% } %>
                    </td>
                    <td><a href="detailUserServlet?id=<%= userlist.get(i).getUser_id() %>">Detail</a></td>
           </tr>
               <%
           }
           %>
        </table></td>
  </tr>
</table></p>

</body>
</html>
