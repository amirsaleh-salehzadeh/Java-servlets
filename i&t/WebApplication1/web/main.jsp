<%-- 
    Document   : Home
    Created on : Apr 6, 2009, 2:06:28 PM
    Author     : 844498
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="purchase.common.User" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Main-page</title>
<style type="text/css">
<!--
.style2 {color: #FFFFFF}
.style3 {
	font-size: 20px;
	font-weight: bold;
         color: #FFFFFF
}
.style5 {
	font-size: 12px;
         color: #FF0000
}
.style4 {
	font-size: 24px;
	font-weight: bold;
	color: #FFFFFF;
}
-->
</style>
<script type="text/JavaScript">
<!--
function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
</script>
    </head>
    <body background="images/BR-bg.gif" onload="MM_preloadImages('images/home1.jpg','images/shop1.jpg','images/register1.jpg','images/contactus1.jpg')">
<table width="200" border="0" align="center" cellspacing="0" cellpadding="0">
  <tr>
    <td><img src="images/themecopy.jpg" width="789" height="301" alt="01" /></td>
  </tr>
  <tr>
    <td ><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="24%" valign="top"><table width="200" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td><img src="images/home1.jpg" name="Image3" width="200" height="75" border="0" id="Image3" /></td>
          </tr>
          <tr>
            <td><a href="ShopServlet" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image4','','images/shop1.jpg',1)"><img src="images/shop.jpg" name="Image4" width="200" height="75" border="0" id="Image4" /></a></td>
          </tr>
          <tr>
            <td><a href="Register.jsp" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image5','','images/register1.jpg',1)"><img src="images/Register.jpg" name="Image5" width="200" height="75" border="0" id="Image5" /></a></td>
			<td></td>
          </tr>
          <tr>
            <td><a href="contact us.html" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image6','','images/contactus1.jpg',1)"><img src="images/contactus.jpg" name="Image6" width="200" height="75" border="0" id="Image6" /></a></td>
          </tr>
        </table></td><td width="48%"> <div align="center" class="style4">           
                                
            <br>Welcome to Parsian jewelry online shopping centre. </div>
            <br>
        <div align="center" class="style3">        <%
        if(request.getParameter("mess")!=null)
           out.println(request.getParameter("mess"));
         
     %>  </td>
        <td width="28%" bgcolor="#003300">
            <form id="form1" name="form1" method="post" action="LoginServlet">

            
            <div align="center">
            <span class="style3">Log-in to system </span><span class="style2"><br />
            <span class="style2">
            </span>
            <p align="left">
             <label>    
              <span class="style2">Username:              </span>
              <input type="text" name="usern" />
      </label></p>
            <p align="left">
            <label><span class="style2">Password:</span>
              <br>
              <input type="password" name="pass" />
              </label>
            </p>
          <p align="right">
            <label>
            <div align="center"><span class="style2">Submit</span>
              <input type="submit" name="Submit" value="Submit" />
            </label>
            <%
        if(request.getParameter("messl")!=null){
           out.println("<div class=\"style5\">");
           out.println(request.getParameter("messl"));
           out.println("</div>");}%>

<%        if(request.getParameter("msg")!=null){
        out.println("<div class=\"style5\">");
           out.println(request.getParameter("msg"));
           out.println("</div>");
        }
     %>
            <p class="style2">Click <a href="Register.jsp">here</a> to register as new user </p>
        </form>
        </td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
