<%@ page import="Common.*" %>
<html>
<head>
<title></title>
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
<LINK href="commonStyle.css" rel=stylesheet>
</head>
<body bgcolor="#380046" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('images/01_02.jpg','images/01_03.jpg','images/01_04.jpg','images/01_05.jpg')">
<!-- ImageReady Slices (Untitled-1) -->
<table id="Table_01" width="1024" height="" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="200" colspan="5">
			<img src="images/01_01.jpg" width="1024" height="200" alt=""></td>
	</tr>
         <% UserENT userENT = (UserENT)session.getAttribute("logIn");
            String userName=null;
            if(userENT!=null){
            userName=userENT.getUserName();
            }
         %>
	<tr>
		<td><a href="index.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image7','','images/01_02.jpg',1)"><img src="images/02_02.jpg" name="Image7" width="149" height="50" border="0"></a></td>
		<td><a href="Register.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image8','','images/01_03.jpg',1)"><img src="images/02_03.jpg" name="Image8" width="149" height="50" border="0"></a></td>
		<td><a href="myPage?userName=<%=userName%>" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image9','','images/01_04.jpg',1)"><img src="images/02_04.jpg" name="Image9" width="149" height="50" border="0"></a></td>
		<td><a href="fetchAllMovies" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','images/01_05.jpg',1)"><img src="images/02_05.jpg" name="Image10" width="149" height="50" border="0"></a></td>
		<td>
			<img src="images/01_06.jpg" width="428" height="50" alt=""></td>
	</tr>
         <%
           
            if(userENT==null){
         %>
         <tr>
             <td colspan="5">
                 <FORM ACTION="logIn" method="post">
                    <table>
                        <tr>
                            <td  align="center">
                                <span class="title">Login form:</span>
                            </td>
                            <td >
                                <span class="label">Username:</span>
                            </td>
                           <td >
                                <input type="text" name="username">
                            </td>
                            <td >
                                <span class="label">Password:</span>

                            </td>
                            <td >
                                <input type="password" name="password">
                            </td>
                            <td  align="center">
                                <input type="submit" value="Login">
                            </td>
                            <td>
                                <span class="message">
                                    <%
                                    String msg = request.getParameter("loginMessage");
                                    if(msg!=null){
                                        out.print(msg);
                                    }

                                        %>
                                </span>
                            </td>
                        </tr>
                    </table>
                </FORM>
             </td>
         </tr>
         <%}else{%>
         <tr><td>
             <div style="position:absolute; cursor: pointer; color: white; background-color:white;"><a href="LogOut">Logout</a></div>         
         </td></tr>
         <%}%>
</table>
<!-- End ImageReady Slices -->
</body>
</html>