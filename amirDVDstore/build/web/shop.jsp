<%@ page import="java.util.ArrayList" %>
<%@ page import="Common.Dvd" %>
<%@ page import="Common.User" %>
<html>
<head>
<title>Register Page</title>
    <LINK href="images/Style.css" rel=stylesheet>

<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
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
<body bgcolor="#5d2c00" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('images/Untitled-1_04.jpg','images/Untitled-1_07.jpg','images/Untitled-1_09.jpg','images/Untitled-1_10.jpg')">
<!-- ImageReady Slices (Untitled-1.psd) -->
<table id="Table_01" border="0" cellpadding="0" cellspacing="0" align="center">
	<tr>
		<td colspan="2">
			<img src="images/StarMovie_01.jpg" width="800" height="214" alt="">		</td>
	</tr>
	<tr>
		<td valign="top" height="823">
			<table cellpadding="0" cellspacing="0" vspace="0">
				<tr valign="top" >
					<td height="21" align="left" valign="top">
						<img src="images/StarMovie_02.jpg" >					</td>
				</tr>
				<tr>
					<td height="55" ><a href="index.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','images/Untitled-1_04.jpg',1)"><img src="images/StarMovie_04.jpg" name="Image10" width="200" height="55" border="0"></a> </td>
				</tr>
				<tr>
					<td><a href="shopServlet" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image11','','images/Untitled-1_07.jpg',1)"><img src="images/StarMovie_08.jpg" name="Image11" width="200" height="54" border="0"></a> </td>
				</tr>								
				<tr>
					<td height="46"><a href="register.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image12','','images/Untitled-1_09.jpg',1)"><img src="images/StarMovie_10.jpg" name="Image12" width="200" height="46" border="0"></a> </td>
				</tr>
				<tr>
					<td height="47"><a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image13','','images/Untitled-1_10.jpg',1)"><img src="images/StarMovie_11.jpg" name="Image13" width="200" height="47" border="0"></a> </td>
				</tr>								
				<tr>
					<td height="52">
						<img src="images/StarMovie_12.jpg"  alt="">					</td>
				</tr>
			
		  </table>		
		  
	  </td>
		<td  valign="top">
			<table cellpadding="0" cellspacing="0" class="border">
				<tr>
					<td width="600" height="39" valign="top">
						<img src="images/StarMovie_03.jpg"  alt=""></td>
				</tr>
                                                                                                   <tr>
                                     <td align="center">
                                         <%
                                            ArrayList<User> users =(ArrayList<User>)session.getAttribute("login");
                                            if(users != null){%>
                                            <a href="logOut"> Logout</a>
                                         <%   }
                                         %>
                                     </td>
                                 </tr>
				<tr>
					<td height="749" valign="top">
						<table align="center" >
                                                    <tr>
                                                        <td align="center">
                                                            <span class="error">
                                                                <% 
                                                                                    String msg = request.getParameter("msg");
                                                                                    if(msg!= null){
                                                                                    out.print(msg);
                                                                                   } 
                                                                                %>
                                                            </span>
                                                            </br>
                                                               <%if(users != null && users.get(0).isAdminAccess()==true){
                                                                  out.print("<a href=addDVD.html><img src=\"images/Untitled-2.bmp\" style=\"cursor: pointer;\"width=\"80\" height=\"80\"></a><br/>");                                                                   
                                                                   }%>
                                                               

                                                                

                                                            <form action="searchServlet" method="post">
                                                                <label>Search: <input name="search" type="text"></label>
                                                                <input type="submit" value="search">
                                                            </form>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td align="center">
                                                        <span class="rowId">Price per Unit: 29.99$</span>
                                                           <table border="1" width="500">
                                                           <% 
                                                           ArrayList<Dvd> al =(ArrayList<Dvd>)session.getAttribute("dvdList");
                                                           out.println("<span class=\"title\">");
                                                           for (int i = 0; i<al.size(); i++){
                                                               out.print("<form action=\"insertToBasket\" method=\"post\"><tr><td height=\"50\" align=\"center\"><img src=\"images/bar.jpg\"/></td></tr><tr><td align=\"center\"><span class=\"dvdTitle\">");
                                                               out.print(al.get(i).getName());
                                                               out.print("</span><input type=\"hidden\" value=\""+ al.get(i).getName() +"\" name=\"dvdName\"/></tr></td>");
                                                               out.print("<tr><td align=\"center\"><img src=\"images/dvd/");
                                                               out.print(al.get(i).getImage());
                                                               out.print(".jpg\"></tr></td>");
                                                               out.print("<tr><td align=\"center\"><span class=\"title\">Abstract</span><br/><span class=\"description\">");                                                               
                                                               out.print(al.get(i).getDescription());
                                                               out.print("</span></tr></td>");
                                                               if(users != null){
                                                               out.print("<tr><td align=\"center\"><input type=\"submit\" value=\"Add to basket\"></td></tr>");
                                                               }
                                                               out.print("</form>");
                                                               }

                                         
                                                           
                                                            %>
                                                        </table>
                                                        
                                                        </td>
                                                    </tr>
                                            <tr>
                                                <td>
                                                    <%
                                                        if(users != null){%>
                                                    <form action="basketView" method="get">
                                                        <input type="submit" value="Basket Contains ...">
                                                    </form>
                                                    <%}%>
                                                </td>
                                            </tr>
                                            </table>
					
				  </td>
				</tr>
				<tr>
					<td height="33" valign="top" >
						<img src="images/Untitled-1_13.jpg"  alt="" width="600" height="33">					</td>
				</tr>
		  </table>		
		</td>	
	</tr>
</table>
<!-- End ImageReady Slices -->
</body>
</html>