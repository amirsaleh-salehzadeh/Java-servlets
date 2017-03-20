<%-- 
    Document   : index
    Created on : Apr 5, 2009, 9:38:57 PM
    Author     : Amirsaleh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
.style5 {font-size: 18px}
-->
</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register-page</title>
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

var pw1 = document.form1.password.value;
var pw2 = document.form1.re-password.value;
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
    <body background="images/BR-bg.gif">
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
            <td><a href="ShopServlet" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image4','','images/shop1.jpg',1)"><img src="images/shop.jpg" name="Image4" width="200" height="75" border="0" id="Image4" /></a></td>
          </tr>
          <tr>
            <td><img src="images/register1.jpg" name="Image5" width="200" height="75" border="0" id="Image5" /></td>
			<td></td>
          </tr>
          <tr>
            <td><a href="contact us.html" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image7','','images/contactus1.jpg',1)"><img src="images/contactus.jpg" name="Image7" width="200" height="75" border="0" id="Image7" /></a></td>
          </tr>
        </table></td>
        <td width="100%"><div align="center" class="style4">
          <form id="form1" name="form1" method="post" onSubmit="return validatePwd()" action="RegServlet">
            <label><span class="style5">
                <%
        if(request.getParameter("msg2")!=null)
           out.println(request.getParameter("msg2"));
         
     %>
                
                
                Please fill the following form to confirm your registration, and wait to recieve the email by the administrator for your registration confirm. </span><br />
            <br />
            Name
            <input type="text" name="name" />
            </label>
                    <p>
                      <label>Family name 
                      <input type="text" name="fname" />
                      </label>
</p>
                    <p>
                      <label>Email
                      <input type="text" name="email" />
                      </label>
</p>
                    <p>Tel number
                      <label>
                      <input type="text" name="tel" />
                      </label>
</p>
                    <p>
                      <label>UserName
                      <input type="text" name="usern" />
                      </label>
</p>
                    <p>
                      <label>Password
                      <input type="password" name="pass" />
                      </label>
</p>
                    <p>Re-password
                      <label>
                      <input type="password" name="re-password" />
                      </label>
</p>
                    <p>
                      <label>Submit
                      <input type="submit" name="Submit" value="Submit" />
                      </label>
                    </p>
          </form>
          </div></td>

      </tr>
    </table></td>
  </tr>
</table>
    </body>
</html>
