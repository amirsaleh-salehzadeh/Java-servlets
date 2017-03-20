<%-- 
    Document   : index
    Created on : Apr 5, 2009, 9:38:57 PM
    Author     : Amirsaleh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="purchase.common.Order" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Jewelry----shop</title>



<style type="text/css">
<!--
.style4 {font-size: 18px; color: #FFFFFF; }
.style6 {font-size: 12px; color: #FFFFFF; }
.style7 {color: #FFFFFF; font-size: 18px}
.style5 {
	font-size: 18px;
	color: #FFFFFF;
}

.style8 {
	font-size: 18;
	color: #FFFFFF;
}
.style9 {
	color: #FFFFFF;
	font-weight: bold;
	font-size: 16px;
}
.style11 {font-size: 12px; color: #FFFFFF;}
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
    <td colspan="2"><img src="images/themecopy.jpg" width="789" height="301" alt="01" /></td>
  </tr>

<tr><td colspan="2">	<div align="left" class="style7"><a href="Logout">logout
            </a></div></td></tr>
  <tr>
    <td width="14%">
    <div align="right" class="style4"><a href="Admin.jsp">Admin Page</a></div>    </td>
        <td width="86%" valign="top">
<form action="ConfirmOrder" method="post"><table width="459" border="1">
  <tr>
    <td width="39"><span class="style4">User Name</span></td>
    <td width="87"><span class="style4">Product Name</span></td>
    <td width="35"><span class="style4">Submit</span></td>

  </tr>
    <span class="style6">
    <%
        ArrayList<Order> t=(ArrayList<Order>)session.getAttribute("ordercontrol");
        for(int j=0;j<t.size();j++){                         
            if(t.get(j).getStatus().equals("false")){
                out.println("<tr><td><span class=\"style6\">");
                out.println(t.get(j).getUsern());
                out.println("</span></td><td><span class=\"style6\">");
                out.println(t.get(j).getProductn());
                out.println("</span></td>");
                out.print("<td align=\"center\"><input type=\"checkbox\" name=\"checkbox\" value=\"");
                out.print(t.get(j).getId());                
                out.print("\"/></td>");
                }
              

        }
         
         %>
    
    

</table>  
  <p><label>
    <input type="submit" name="button" id="button" value="Confirm" />
    </label>
  </p>
</form>              
                       
                       
                       
        
	      </td>

  </tr>
    </table>
</body>
</html>
