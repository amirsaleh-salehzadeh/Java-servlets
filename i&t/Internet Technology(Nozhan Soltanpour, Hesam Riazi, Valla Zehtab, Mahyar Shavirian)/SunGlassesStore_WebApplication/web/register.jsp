<HTML>
<HEAD>
<meta http-equiv=Content-Type content="text/html;  charset=ISO-8859-1">
<TITLE>Register</TITLE>

<link rel="stylesheet" href="style.css" type="text/css">

<style>
<!--	
A 		{ color: #C0C0C0; font-weight:bold; text-decoration: none; }		
A:link		{ color: #C0C0C0; font-weight:bold; text-decoration: none; }
A:visited		{ color: #C0C0C0; font-weight:bold; text-decoration: none; }	
A:active		{ color: #358391; font-weight:bold; text-decoration: none;  }	
A:hover		{ color: #358391; font-weight:bold; text-decoration: none;  }

body, td, tr{		
font-family: verdana;		
color:#FFFFFF;		
font-size:11;		
font-weight:normal;
}


</style>



<style type="text/css">
<!--
.style1 {font-family: "Times New Roman", Times, serif}
.style2 {font-size: 16px}
.style3 {font-size: 36px}
-->
</style>

<script language="JavaScript" type="text/JavaScript" src="java/javascript.js"></script>
<SCRIPT TYPE="text/javascript" LANGUAGE="JavaScript" SRC="java/base.js"></SCRIPT>
<script language="JavaScript" src="java/tabel.js" type="text/javascript"></script>

<SCRIPT LANGUAGE="Javascript">
<!--
function check(){
    if (document.form1.name.value.length==0){
        alert("You must fill the name field!");
        return false;
    }
    if (document.form1.family.value.length==0){
        alert("You must fill the family field!");
        return false;
    }
    if (document.form1.username.value.length==0){
        alert("You must fill the username field!");
        return false;
    }
    if (document.form1.email.value.length==0){
        alert("You must fill the email field!");
        return false;
    }
    if (document.form1.tel.value.length==0){
        alert("You must fill the Tel. field!");
        return false;
    }
    if (document.form1.address.value.length==0){
        alert("You must fill the address field!");
        return false;
    }
    if (!(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(document.form1.email.value))){
        alert("Invalid E-mail Address! Please re-enter.");
        return false;
    }
    return true;
}
-->

    </script>    
    
<script>
function emailCheck (emailStr) {

var emailPat=/^(.+)@(.+)$/

var specialChars="\\(\\)<>@,;:\\\\\\\"\\.\\[\\]"

var validChars="\[^\\s" + specialChars + "\]"

var quotedUser="(\"[^\"]*\")"

var ipDomainPat=/^\[(\d{1,3})\.(\d{1,3})\.(\d{1,3})\.(\d{1,3})\]$/

var atom=validChars + '+'

var word="(" + atom + "|" + quotedUser + ")"

var userPat=new RegExp("^" + word + "(\\." + word + ")*$")

var domainPat=new RegExp("^" + atom + "(\\." + atom +")*$")



var matchArray=emailStr.match(emailPat)
if (matchArray==null) {
  
	alert("Email address seems incorrect (check @ and .'s)")
	return false
}
var user=matchArray[1]
var domain=matchArray[2]

 
if (user.match(userPat)==null) {

    alert("The username doesn't seem to be valid.")
    return false
}


var IPArray=domain.match(ipDomainPat)
if (IPArray!=null) {
   
	  for (var i=1;i<=4;i++) {
	    if (IPArray[i]>255) {
	        alert("Destination IP address is invalid!")
		return false
	    }
    }
    return true
}


var domainArray=domain.match(domainPat)
if (domainArray==null) {
	alert("The domain name doesn't seem to be valid.")
    return false
}




var atomPat=new RegExp(atom,"g")
var domArr=domain.match(atomPat)
var len=domArr.length
if (domArr[domArr.length-1].length<2 || 
    domArr[domArr.length-1].length>3) {
   
   alert("The address must end in a three-letter domain, or two letter country.")
   return false
}


if (len<2) {
   var errStr="This address is missing a hostname!"
   alert(errStr)
   return false
}


return true;
}

</script>

</HEAD>
<BODY background="img/bg.gif" bgcolor="#202020" topmargin="0" leftmargin="0">
    
    <form name="form1" id="form1" onSubmit="return check();" method="post" action="RegServlet">
     <input type="hidden" name="action" value="newMember">
      
    
<center>
<table bgcolor="#202020" width="776" height="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td width="3" bgcolor="#FFFFFF"></td>
<td width="770" valign="top">
 
    <table bgcolor="#202020" width="770" border="0" cellspacing="0" cellpadding="0">
    <tr>
    <td height="32" align="right" valign="middle">&nbsp;</td> 
    </tr>
    <tr>
    <td height="132" align="left" valign="middle" background="img/headerback.jpg"><h1 class="style3"><span class="style1"><strong><em>Sunglass Persia</em></strong></span></h1>
      <br>      </td> 
    </tr>
    <tr>
    <td height="47" align="right">&nbsp;</td> 
    </tr>
    <tr>
    <td height="32" align="left" valign="middle" background="img/bluebg.gif"><img src="img/pixel.gif" border="0" width="15" height="1"> <a href="shop.html">Shop</a> | <a href="contact us.html">Contact us</a> | <a href="login.jsp">Login</a> | <a href="advanced_search.html">Advanced Search </a></td> 
    </tr>
    </table>
 
    <table bgcolor="#464646" width="770" height="350" border="0" cellspacing="0" cellpadding="0">
    <tr>
    <td width="222" bgcolor="#202020" align="left" valign="top">
    
      <table width="222" border="0" cellspacing="0" cellpadding="0" bgcolor="#202020">
        <tr>
        <td height="24" width="222" valign=middle>&nbsp; <b>Categories</b></td>
        </tr>
        <tr>
        <td width="222" height=3 bgcolor="#ffffff"></td>
        </tr>
        <tr>
        <td height="24" width="222" valign=middle onMouseOver="javascript:taust(this,'#0F363F')" onMouseOut="javascript:taust(this,'#202020')">&nbsp; <a href="ProdServlet?action=searchBrand&brand=ray-ban">» RAY-BAN</a></td>
        </tr>
        <tr>
        <td width="222" height=3 bgcolor="#ffffff"></td>
        </tr>
        <tr>
        <td height="24" width="222" valign=middle onMouseOver="javascript:taust(this,'#0F363F')" onMouseOut="javascript:taust(this,'#202020')">&nbsp; <a href="ProdServlet?action=searchBrand&brand=prada">» PRADA</a></td>
        </tr>
        <tr>
        <td width="222" height=3 bgcolor="#ffffff"></td>
        </tr>
        <tr>
        <td height="24" width="222" valign=middle onMouseOver="javascript:taust(this,'#0F363F')" onMouseOut="javascript:taust(this,'#202020')">&nbsp; <a href="ProdServlet?action=searchBrand&brand=d_g">» D &amp; G</a></td>
        </tr>
        <tr>
        <td width="222" height=3 bgcolor="#ffffff"></td>
        </tr>
        <tr>
        <td height="24" width="222" valign=middle onMouseOver="javascript:taust(this,'#0F363F')" onMouseOut="javascript:taust(this,'#202020')">&nbsp; <a href="ProdServlet?action=searchBrand&brand=robertocavalli">» ROBERTO CAVALLI</a></td>
        </tr>
        <tr>
        <td width="222" height=3 bgcolor="#ffffff"></td>
        </tr>
        <tr>
        <td height="24" width="222" valign=middle onMouseOver="javascript:taust(this,'#0F363F')" onMouseOut="javascript:taust(this,'#202020')">&nbsp; <a href="ProdServlet?action=searchBrand&brand=gucci">» GUCCI</a></td>
        </tr>
        <tr>
        <td width="222" height=3 bgcolor="#ffffff"></td>
        </tr>
        <tr>
        <td height="24" width="222" valign=middle onMouseOver="javascript:taust(this,'#0F363F')" onMouseOut="javascript:taust(this,'#202020')">&nbsp; <a href="ProdServlet?action=searchBrand&brand=dior">» DIOR</a></td>
        </tr>
        <tr>
        <td width="222" height=3 bgcolor="#ffffff"></td>
        </tr>
        <tr>
        <td height="24" width="222" valign=middle></td>
        </tr>
        <tr>
        <!--<td height="24" width="222" valign=middle onMouseOver="javascript:taust(this,'#0F363F')" onMouseOut="javascript:taust(this,'#202020')">&nbsp; <a href="admin.html">» Administrator</a></td>-->
        </tr>
        </table> 
        </td>
    <td width="3" bgcolor="#FFFFFF" align="right" valign="top"></td>
    <td width="10" align="left" valign="top"><img src="img/shadow1.gif" border="0" width="10" height="32"></td> 
    <td width="525" align="left" valign="top"><img src="img/shadow1.gif" border="0" width="525" height="32"><br>
      <p align="center">
        <label>Name
        <input type="text" name="name" id="name" value="">
        </label>
      </p>
      <p align="center">
        <label>Family Name
        <input type="text" name="family" id="family">
        </label>
      </p>
      <p align="center">
        <label>Username
        <input type="text" name="username" id="username">
        </label>
      </p>
      <p align="center">
        <label>Password
        <input type="password" name="password" id="password">
        </label>
      </p>
      <p align="center">
        <label>Address
        <input type="text" name="address" id="address">
        </label>
      </p>
      <p align="center">
        <label>Tel
        <input type="text" name="tel" id="tel">
</label>
      </p>
      <p align="center">
        <label>Email
        <input type="text" name="email" id="email">
        </label>
      </p>
      <p align="center"><input type="submit" name="submit" id="button" value="Submit">&nbsp;</p>
      <p align="center">&nbsp;</p></td>  
    <td width="10" align="left" valign="top"><img src="img/shadow1.gif" border="0" width="10" height="32"></td> 
    </tr>
    </table> 
 
    <table bgcolor="#464646" width="770" height="32" border="0" cellspacing="0" cellpadding="0">
    <tr>
    <td width="222" bgcolor="#202020" align="left" valign="top"></td>
    <td width="3" bgcolor="#FFFFFF" align="right" valign="top"></td>
    <td width="10" align="left" valign="top"><img src="img/shadow2.gif" border="0" width="10" height="32"></td> 
    <td width="525" align="left" valign="top"><img src="img/shadow2.gif" border="0" width="525" height="32"></td>  
    <td width="10" align="left" valign="top"><img src="img/shadow2.gif" border="0" width="10" height="32"></td> 
    </tr>
    </table>
 
    <table bgcolor="#202020" width="770" border="0" cellspacing="0" cellpadding="0">
    <tr>
    <td height="32" width="30" align="left" valign="middle" background="img/bluebg.gif"><img src="img/pixel.gif" border="0" width="5" height="1"></td>
    <td height="32" width="740" align="right" valign="middle" background="img/bluebg.gif"><div align="center">&copy; 2008 - All rights reserved by Sunglass Persia&nbsp; </div></td> 
    </tr>
    </table>  

</td>
<td width="3" bgcolor="#FFFFFF"></td>
</tr>
</table>
</center>


<div style="font-size: 0.8em; text-align: center; margin-top: 1.0em; margin-bottom: 1.0em;"></div>
</form>
</body>
</HTML>
