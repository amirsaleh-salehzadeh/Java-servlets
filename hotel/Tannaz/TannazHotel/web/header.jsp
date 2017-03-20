
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="Common.*" %>
<html>
<head>
<title>Untitled-1</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<LINK href="web.css" rel=stylesheet>
</head>
<body bgcolor="#621b1a" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('images/Untitled-2_03.png','images/Untitled-2_04.png','images/Untitled-2_05.png')">
<!-- ImageReady Slices (Untitled-1.psd) -->
<table id="Table_01" width="1024" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="200" colspan="5">
			<img src="images/Untitled-1_01.png" width="1024" height="200" alt=""></td>
	</tr>
	<tr>
		<td >
			<img src="images/Untitled-1_02.png" width="41" height="51" alt=""></td>
		<td><a href="index.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image7','','images/Untitled-2_03.png',1)"><img src="images/Untitled-1_03.png" name="Image7" width="187" height="51" border="0"></a></td>
		<td><a href="searchServlet" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image8','','images/Untitled-2_04.png',1)"><img src="images/Untitled-1_04.png" name="Image8" width="252" height="51" border="0"></a></td>
		<td><a href="contactus.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image9','','images/Untitled-2_05.png',1)"><img src="images/Untitled-1_05.png" name="Image9" width="314" height="51" border="0"></a></td>
		<td>
			<img src="images/Untitled-1_06.png" width="230" height="51" alt=""></td>
	</tr>
                     <%
                        String msg = request.getParameter("msg");
                        if(msg==null)
                            msg="";
                        if(!msg.equalsIgnoreCase("")){
                    %>
                     <tr>
                <td colspan="5" align="center">
                      
                    <span style="color:#ff5400; font-size:16px; font-weight:bold;"><%=msg%></span>
                </td>                
            </tr>
              <%}
                    %>
                    <%
                        if(session.getAttribute("user")!=null){
                                //PassengerENT pent = (PassengerENT)session.getAttribute("user");
                    %>
                     <tr>
                <td colspan="5">
                    <a href="logOut">LogOut</a>
                    
                </td>                
            </tr>
              <%}
                    %>
</table>
<!-- End ImageReady Slices -->
</body>
</html>
