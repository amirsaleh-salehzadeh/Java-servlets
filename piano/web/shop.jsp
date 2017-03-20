<%@ page import="java.util.ArrayList" %>
<%@ page import="CommonLayer.*" %>

<html>
<head>
<title>01 </title>
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
<body  background="images/bg.jpg" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('images/02-_03.jpg','images/02-_04.jpg','images/02-_05.jpg','images/02-_06.jpg')">
<!-- ImageReady Slices (01 .psd) -->
<br/>
<table bgcolor="#02263d" id="Table_01" width="800" height="267" align="center" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="192" colspan="6">
			<img src="images/01-_01.jpg" width="800" height="192" alt=""></td>
	</tr>
	<tr>
		<td height="28">
			<img src="images/01-_02.jpg" width="98" height="28" alt=""></td>
		<td><a href="index.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image8','','images/02_03.jpg',1)"><img src="images/01-_03.jpg" name="Image8" width="88" height="28" border="0"></a></td>
		<td><a href="shopView" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image9','','images/02_04.jpg',1)"><img src="images/01-_04.jpg" name="Image9" width="79" height="28" border="0"></a></td>
		<td><a href="user.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','images/02_05.jpg',1)"><img src="images/01-_05.jpg" name="Image10" width="73" height="28" border="0"></a></td>
		<td><a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image11','','images/02_06.jpg',1)"><img src="images/01-_06.jpg" name="Image11" width="111" height="28" border="0"></a></td>
		<td>
			<img src="images/01-_07.jpg" width="351" height="28" alt=""></td>
	</tr>
         <tr>
            <td align="center">
                <%
                User user =(User)session.getAttribute("login");
                if(user != null){%>
                    <a href="logOut" style="color:#fff;"> Logout</a>
                <%   }
                %>
            </td>
        </tr>
	<tr>
		<td colspan="6" bgcolor="#02263d" background="images/bg_1.jpg">
                    <table width="600" align="center" style="color:#fff;" >
                        <%if(user != null && user.isSecurity()){%>
                        <tr>
                            <td align="center" colspan="4" >
                                <a href="insertPiano.jsp"><img src="images/add.bmp" height="65" width="65"></a>
                            </td>
                        </tr>
                       <%} %> 
                       
                       <%
                           ArrayList<Piano> arrayList = (ArrayList<Piano>)session.getAttribute("shopList");
                           
                           for (int i = 0; i<arrayList.size(); i++){
                               out.print("<tr><td align=\"center\"><img src=\"images/piano/");
                               out.print(arrayList.get(i).getImage());
                               out.print(".jpg\"></td>");
                               out.print("<td align=\"center\" nowrap=\"nowrap\"><span style=\"font-weight:bold; font-size:18px;\">Producer Company: </span><span>");
                               out.print(arrayList.get(i).getCompanyName());
                               out.print("</span><br/><span style=\"font-weight:bold; font-size:18px;\">Model: </span><span >"+arrayList.get(i).getProductName()+"</span>");
                               out.print("<br/> <span style=\"font-weight:bold; font-size:18px;\">Price: </span><span >");                                                               
                               out.print(arrayList.get(i).getPrice());
                               out.print("$</span>");
                               out.print("<br/> <span style=\"font-weight:bold; font-size:18px;\">weight: </span><span >");                                                               
                               out.print(arrayList.get(i).getWeight());
                               out.print("Kg</span><br/>");
                               if(user !=null){
                               out.print("<a href=\"addToB?productName="+ arrayList.get(i).getProductName()+"\" /><img src=\"images/addtob.gif\"></a>");
                               }
                               out.print("</td></tr>");
                               }
                            %>
                        <tr>
                            <td colspan="6" align="center">
                                 <%if(user != null && session.getAttribute("addToBSession")!=null){%>
                                <form action="shoppingCart" method="post">
                            <input type="submit" value="Go to shopping cart">
                        </form>    <%}%>    </td>
                        </tr>
                    </table>
                 </td>
	</tr>
</table>
<!-- End ImageReady Slices -->
</body>
</html>