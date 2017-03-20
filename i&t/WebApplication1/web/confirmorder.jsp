<%-- 
    Document   : index
    Created on : Apr 5, 2009, 9:38:57 PM
    Author     : Amirsaleh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="purchase.common.Product" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Jewelry----shop</title>
<style type="text/css">
<!--
.style5 {
	font-size: 18px;
	color: #FFFFFF;
}
.style7 {font-size: 18px}
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
    <td><img src="images/themecopy.jpg" width="789" height="301" alt="01" /></td>
  </tr>
  <tr>
    <td ><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="24%" valign="top"><table width="200" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td><a href="main.jsp" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image3','','images/home1.jpg',1)"><img src="images/home.jpg" name="Image3" width="200" height="75" border="0" id="Image3" /></a></td>
          </tr>
          <tr>
            <td><img src="images/shop1.jpg" name="Image4" width="200" height="75" border="0" id="Image4" /></td>
          </tr>
          <tr>
            <td><a href="Register.jsp" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image5','','images/register1.jpg',1)"><img src="images/Register.jpg" name="Image5" width="200" height="75" border="0" id="Image5" /></a></td>
			<td></td>
          </tr>
          <tr>
            <td><a href="contact us.html" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image6','','images/contactus1.jpg',1)"><img src="images/contactus.jpg" name="Image6" width="200" height="75" border="0" id="Image6" /></a></td>
          </tr>
        </table></td>
        <td width="100%" valign="top">
            <div align="right" class="style7"><a href="Logout">
            <% if(session.getAttribute("login")!=null){
                out.println("<a href=\"Logout\">");
                out.println("Log-out");}
            else{   out.println("<a href=\"main.jsp\">");
                out.println("Log-in");}
            
            %>
            
            </a></div>
          <form id="form1" name="form1" method="post" action="SearchServlet">
         
          <span class="style5">
          <label>Product search</label>
          </span>
          <span class="style7">
          <label></label>
          </span>
          <label>
          <input type="text" name="product" />
          </label>
          <label><span class="style8">Search:</span>
          <input type="submit" name="Submit" value="Search" />
          </label>
        </form>  
		      
<table width="100%" border="1" >
                <%
        ArrayList<Product> t=(ArrayList<Product>)session.getAttribute("search");
        for(int i=0;i<t.size();i++){
                         
            out.println("<tr><td valign=\"top\" width=\"120\" ><img src=\"images/shoppics/");
            out.println(t.get(i).getImg());
            out.println(".jpg\" width=\"120\" height=\"120\"></td><td><p class=\"style9\">Product Name:</p><p class=\"style11\">");
            out.println(t.get(i).getPname());
            out.println("</p><p class=\"style11\"><span class=\"style9\">Price:</span> </p><p class=\"style11\">" );
            out.println(t.get(i).getPrice());
            out.println("</p><p class=\"style11\"><span class=\"style9\">Description:</span></p><p class=\"style11\">");
            out.println(t.get(i).getDescription());    
            out.println("</p></td>");
            out.println("<td valign=\"bottom\" width=\"120\">");
            out.println("</td>");
        }
        
         
%>
<td>
<form method="post" action="ConfirmPurchase" name="confirmpurchase">
          <input type="submit" name="Submit" value="Confirm Purchase" />
</form>
</td></tr>    
              
              </table>

	      </td>

      </tr>
    </table>
</body>
</html>
