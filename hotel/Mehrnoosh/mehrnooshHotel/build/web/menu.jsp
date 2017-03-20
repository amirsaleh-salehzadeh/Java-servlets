<html>
<head>
<title>Untitled-3</title>
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
<body background="images/bg.gif" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('images/mehr1_02.png','images/mehr1_04.png','images/mehr1_05.png','images/mehr1_06.png')">
<!-- ImageReady Slices (Untitled-3) -->
<table id="Table_01" width="801" align="center" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="2">
			<img src="images/mehr1_01.png" width="800" height="149" alt=""></td>
		<td>
			<img src="images/spacer.gif" width="1" height="149" alt=""></td>
	</tr>
	<tr>
		<td><a href="index.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image16','','images/mehr1_02.png',1)"><img src="images/mehr0_02.png" name="Image16" width="272" height="52" border="0"></a></td>
		<td rowspan="5">
			<img src="images/mehr1_03.png" width="528" height="252" alt=""></td>
		<td>
			<img src="images/spacer.gif" width="1" height="52" alt=""></td>
	</tr>
	<tr>
		<td><a href="register.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image17','','images/mehr1_04.png',1)"><img src="images/mehr0_04.png" name="Image17" width="272" height="48" border="0"></a></td>
		<td>
			<img src="images/spacer.gif" width="1" height="48" alt=""></td>
	</tr>
	<tr>
		<td><a href="reserve.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image18','','images/mehr1_05.png',1)"><img src="images/mehr0_05.png" name="Image18" width="272" height="51" border="0"></a></td>
		<td>
			<img src="images/spacer.gif" width="1" height="51" alt=""></td>
	</tr>
	<tr>
		<td><a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image19','','images/mehr1_06.png',1)"><img src="images/mehr0_06.png" name="Image19" width="272" height="50" border="0"></a></td>
		<td>
			<img src="images/spacer.gif" width="1" height="50" alt=""></td>
	</tr>
         <%if(session.getAttribute("userSession")!=null){%>
                     <tr>
                <td colspan="3">
                    <a href="logout">LogOut</a>
                        </td>                
            </tr>
              <%} %>
              
<%
                        String msg = request.getParameter("message");
                        if(msg==null)
                            msg="";
                        if(!msg.equalsIgnoreCase("")){
                    %>
                     <tr>
                <td colspan="5" align="center">
                      
                    <span style="color:red; background:#aaa; font-size:22px; font-weight:bold;"><%=msg%></span>
                </td>                
            </tr>
              <%}
                    %>
	
</table>

</body>
</html>