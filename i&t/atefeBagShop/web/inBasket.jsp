<%@ page import="java.util.ArrayList" %>
<%@ page import="objects.*" %>
<html>
<head>
<title>In Basket</title>
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
		<td><a href="goToShop" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','images/Untitled-2_04.jpg',1)"><img src="images/Untitled-1_04.jpg" name="Image10" width="141" height="39" border="0"></a></td>
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
                    <table width="100%">
                        <tr>
                            <td align="center">
                        
                            </td>
                        </tr>
                        <tr>
                            <td width="25%" align="center">
                    <form action="confirmPurchase" method="get">        
                    <table width="600" align="center">
                       <% 
                           ArrayList<Bag> arrayList = (ArrayList<Bag>)session.getAttribute("bagList");
                           int price=0;
                           for (int i = 0; i<arrayList.size(); i++){
                               out.print("<tr><td align=\"center\"><img src=\"images/gallery/");
                               out.print(arrayList.get(i).getImage());
                               out.print(".jpg\"></td>");
                               out.print("<td align=\"center\" nowrap=\"nowrap\"><span class=\"title\">Bag Name:</span><br/><span class=\"content\">");
                               out.print(arrayList.get(i).getName());
                               out.print("</span><br/></td>");
                               out.print("</tr><tr><td align=\"center\" colspan=\"4\" style=\"background-color: #333;\"><a href=\"toBasket?isForRemove=true&name="+arrayList.get(i).getName()+"\"><img src=\"images/remove.jpg\" height=\"35\"></td></tr>");
                               price += arrayList.get(i).getPrice();
                               }
                            %>
                            <tr>
                                <td colspan="4" style="background-color: #333;" height="15">
                                    <span class="title">Total Price is <%=price%> $</span>
                                </td>
                            </tr>
                                
                        <tr>
                            <td colspan="3" align="center">
                            <input type="hidden" name="email" value="<%=user.getEmail()%>">
                            <input type="hidden" name="price" value="<%=price%>">
                            <input type="submit" value="Confirm order">
                        </form>       <form action="emptyBasket" method="post">
                            <input type="submit" value="Empty Basket">
                        </form>          </td>
                           
                        </tr>
                    </table>
                            </td>
                        </tr>
                    </table>
                     

<!-- End ImageReady Slices -->
</body>
</html>