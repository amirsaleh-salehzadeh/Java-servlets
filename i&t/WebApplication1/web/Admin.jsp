<%-- 
    Document   : index
    Created on : Apr 5, 2009, 9:38:57 PM
    Author     : Amirsaleh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="purchase.common.User" %>
<%@ page import="purchase.common.Category" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <style type="text/css">
<!--
.style4 {
	font-size: 24px;
	font-weight: bold;
	color: #FFFFFF;
}
.style5 {
	font-size: 18px;
	color: #FF0000;
}
.style6 {font-size: 14px}
-->
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator-page</title>
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
    <body background="images/BR-bg.gif" onLoad="MM_preloadImages('images/register1.jpg')">
<table width="200" border="0" align="center" cellspacing="0" cellpadding="0">
  <tr>
    <td><img src="images/themecopy.jpg" width="789" height="301" alt="01" /></td>
  </tr>
  <tr>
    <td width="100%"><div align="right" class="style7"><a href="Logout">logout
            </a></div>
         <div align="center" class="style5">   
            <%
        if(request.getParameter("msg3")!=null)
           out.println(request.getParameter("msg3"));
        out.println("<br>");
         
     %>
 </div>         
<div align="center" class="style4">   
            Administrator
         <table border="1"><tr><td height="216">  
         <form id="form1" name="form1" method="post" action="
         <%
        ArrayList<User> t=(ArrayList<User>)session.getAttribute("login");
        for(int j=0;j<t.size();j++){                         
            if(t.get(j).getAccess().equals("admin")){
            out.println("CategServlet");
        }
            }
         
         %>
         ">
            <label>Add category:<br />
            <span class="style6">Category Name:</span>
            <input type="text" name="name" />
            </label>
                    <p>
                      <label><span class="style6">Category Description:
                      
                      </span><br>
                      <textarea name="description" id="textarea" cols="45" rows="5"></textarea>
                      </label>
</p>
            <p>
                      <label></label><label>Add Category
                      <input type="submit" name="Submit" value="Add" />
                      </label>
                    </p>
            </form></td></tr></table>
          <table border="1"><tr><td>  
          <form id="form1" name="form1" method="post" action="
<%

        for(int j=0;j<t.size();j++){                         
            if(t.get(j).getAccess().equals("admin")){
            out.println("ProdServlet");
        }
            }
         
%>  ">            
            <label>Add Product:<br />
            <span class="style6">Product Name:</span>
            <input type="text" name="pname" />
            </label>
                    <p>
                      <label><span class="style6">Price:</span>
                      <input type="text" name="price" />
                      </label>
</p>
                    <p>
                      <label><span class="style6">Product Description: </span><br>
                      <textarea name="description" id="textarea" cols="45" rows="5"></textarea>
                      </label>
</p>
                        <p>
              <label><span class="style6">Image Source:</span>
              <input type="text" name="img" />
              </label>
</p>
            <p>
              <label><span class="style6">Category Name:</span>
              <select name="select" id="select">
              <%
        ArrayList<Category> categ=(ArrayList<Category>)session.getAttribute("category");
        for(int i=0;i<categ.size();i++){                         
            out.println("<option>");
            out.println(categ.get(i).getCategn());
            out.println("</option>");
                        
        }
         
%>
              </select>
              </label>
</p>
            <p>
                      <label>Add Product
                      <input type="submit" name="Submit" value="Add" />
                      </label>
                    </p>
          </form></td></tr></table>
<%

        for(int j=0;j<t.size();j++){                         
            if(t.get(j).getAccess().equals("admin")){
            out.println("<a href=\"UserControl\"><span class=\"style7\">User Control</span></a>");
            out.println("<br><a href=\"OrderControl\"><span class=\"style7\">Orders Submit</span></a>");
        }
            }
         
%>           
          
          </div></td>

      </tr>
    </table>
    </body>
</html>
