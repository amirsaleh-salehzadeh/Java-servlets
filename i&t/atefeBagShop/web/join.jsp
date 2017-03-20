<%@ page import="java.util.ArrayList" %>
<%@ page import="objects.*" %>
<html>
<head>
<title>Join Us</title>
<LINK href="css.css" rel=stylesheet>
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
<body bgcolor="#fd4040" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('images/Untitled-2_03.jpg','images/Untitled-2_04.jpg','images/Untitled-2_06.jpg','images/Untitled-2_05.jpg')">
<!-- ImageReady Slices (Untitled-1) -->
<br/>
<table id="Table_01" align="center" width="800" height="319" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="195" colspan="6">
			<img src="images/Untitled-1_01.jpg" width="800" height="195" alt=""></td>
	</tr>
	<tr>
		<td height="39">
			<img src="images/Untitled-1_02.jpg" width="179" height="39" alt=""></td>
		<td><a href="index.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image9','','images/Untitled-2_03.jpg',1)"><img src="images/Untitled-1_03.jpg" name="Image9" width="115" height="39" border="0"></a></td>
		<td><a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','images/Untitled-2_04.jpg',1)"><img src="images/Untitled-1_04.jpg" name="Image10" width="141" height="39" border="0"></a></td>
		<td><a href="join.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image12','','images/Untitled-2_05.jpg',1)"><img src="images/Untitled-1_05.jpg" name="Image12" width="132" height="39" border="0"></a></td>
		<td><a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image11','','images/Untitled-2_06.jpg',1)"><img src="images/Untitled-1_06.jpg" name="Image11" width="161" height="39" border="0"></a></td>
		<td>
			<img src="images/Untitled-1_07.jpg" width="72" height="39" alt=""></td>
	</tr>
	<tr>
		<td height="46" colspan="6">
			<img src="images/Untitled-1_08.jpg" width="800" height="46" alt=""></td>
	</tr>
                                                                                                            <tr>
                                     <td align="center">
                                         <%
                                            User user =(User)session.getAttribute("login");
                                            if(user != null){%>
                                            <a href="logOut"> Logout</a>
                                         <%   }
                                         %>
                                     </td>
                                 </tr>
	<tr>
             <td colspan="6" background="images/burberry-check.jpg">
                 <form action="joinServlet" method="post">
                    <table align="center"> 

                        <tr>
                            <td align="center">
                        <span class="alert"><% if(request.getParameter("alert")!= null)out.print(request.getParameter("alert")); %></span></br>
                            </td>
                        </tr>
                        <tr>
                            <td align="center">
                                <span class="title">Registration form</span>
                            </td>
                        </tr>
                        <tr>
                            <td align="center">
<table width="324" border="1">
  <tr>

    <td width="130" class="content">Name: </td>
    <td width="178" class="content"><input name="name" type="text"></td>
  </tr>
  <tr>
    <td class="content">Family Name: </td>
    <td class="content"><input name="fname" type="text"></td>
  </tr>
  <tr>

    <td class="content">Email:</td>
    <td class="content"><input name="email" type="text"></td>
  </tr>
  <tr>
    <td class="content">Password:</td>
    <td class="content"><input name="pass" type="password"></td>
  </tr>
  <tr>

    <td class="content">Retype- Password:</td>
    <td class="content"><input name="Input4" type="password"></td>
  </tr>
  <tr>
    <td colspan="2" class="content" align="center">
	<input name="" type="submit" value="Submit">
	</td>

  </tr>
</table></form>
                            </td>
                        </tr>
                    </table>
                 
                 
                 
                 </td>
	</tr>
</table>
<!-- End ImageReady Slices -->
</body>
</html>