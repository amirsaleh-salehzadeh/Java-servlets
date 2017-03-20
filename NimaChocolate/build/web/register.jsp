<html>
<head>
<LINK href="images/styleSheet.css" rel=stylesheet>
<title>Register page</title>
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
function validatePwd() {

var pw1 = document.form.pass.value;
var pw2 = document.form.Input4.value;
// check for a value in both fields.
if (pw1 == '' || pw2 == '') {
alert('Please enter your password twice.');
return false;
}

if (pw1 != pw2) {
alert ("You did not enter the same new password twice. Please re-enter your password.");
return false;
}
}
//-->
</script>
</head>
<body bgcolor="#308938" onLoad="MM_preloadImages('images/Untitled_03.jpg','images/Untitled_04.jpg','images/Untitled_05.jpg')">
<!-- ImageReady Slices (Untitled-1.psd) -->
<table  align="center" >
	<tr>
		<td>
<table align="center" cellspacing="0" >

	<tr>
		<td>
			<table id="Table_01" width="800" border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td height="208" colspan="6">
						<img src="images/Home_01.jpg" width="800" height="208" alt=""></td>
				</tr>
				<tr>
					<td rowspan="2">

						<img src="images/Home_02.jpg" width="60" height="37" alt=""></td>
					<td rowspan="2"><a href="index.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image14','','images/Home_03.jpg',1)"><img src="images/Home-1_03.jpg" name="Image14" width="96" height="37" border="0"></a></td>
					<td rowspan="2"><a href="shopGetInfo" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image15','','images/Home_04.jpg',1)"><img src="images/Home-1_04.jpg" name="Image15" width="78" height="37" border="0"></a></td>
					<td><a href="register.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image16','','images/Home_05.jpg',1)"><img src="images/Home-1_05.jpg" name="Image16" width="126" height="36" border="0"></a></td>
					<td><a href="contactus.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image17','','images/Home_06.jpg',1)"><img src="images/Home-1_06.jpg" name="Image17" width="158" height="36" border="0"></a></td>
					<td>
						<img src="images/Home_07.jpg" width="282" height="36" alt=""></td>
				</tr>
				<tr>

					<td height="1" colspan="3">
						<img src="images/Home_08.gif" width="566" height="1" alt=""></td>
				</tr>
				<tr>
					<td height="39" colspan="6">
						<img src="images/Home_09.jpg" width="800" height="39" alt=""></td>
				</tr>
		  </table>

		</td>
	</tr>
	<tr>
		<td>
			<table width="800" cellspacing="0">
				<tr>
					<td background="images/table_Top.gif" height="14">
					 </td>
				</tr>

				<tr>
					<td class="contentTable" align="center">
<form action="reg" method="post" onSubmit="return validatePwd()" name="form">
    <span class="message">
    <%
        if(request.getParameter("msg")!=null ){
           out.println(request.getParameter("msg"));
         }
     %>
 </span>
<table width="324" border="1">
  <tr>
    <td colspan="2" align="center"><span class="titleForm">
Register Form </span>	</td>
  </tr>
  <tr>

    <td width="130">Name: </td>
    <td width="178"><input name="name" type="text"></td>
  </tr>
  <tr>
    <td>Family Name: </td>
    <td><input name="fname" type="text"></td>
  </tr>
  <tr>

    <td>Email:</td>
    <td><input name="email" type="text"></td>
  </tr>
  <tr>
    <td>Password:</td>
    <td><input name="pass" type="password"></td>
  </tr>
  <tr>

    <td>Retype- Password:</td>
    <td><input name="Input4" type="password"></td>
  </tr>
   <tr>
    <td>Username:</td>
    <td><input name="usern" type="text"></td>
  </tr>
  <tr>

    <td><label> Address: </label></td>
    <td><textarea name="address"></textarea></td>
  </tr>
  <tr>
    <td colspan="2" align="center">
	<input name="" type="submit" value="Submit">
	</td>

  </tr>
</table>
</form>
				 </td>
				</tr>
				<tr>
					<td height="15" background="images/table_Bottom.gif">
					 </td>
				</tr>

			</table>
		</td>
	</tr>
</table>
<!-- End ImageReady Slices -->
</body>
</html>