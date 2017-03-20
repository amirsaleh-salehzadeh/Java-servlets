<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">

<title>AMS----Shop</title>
<LINK href="main.css" rel=stylesheet>
<script type="text/JavaScript">
<!--
function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
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

<body onLoad="MM_preloadImages('images/main-page1_02.gif','images/main-page1_03.gif','images/main-page1_04.gif')">
<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td><img src="images/home_01.gif" width="100%" height="100%" alt="logo1"/></td>
  </tr>
  <tr>
    <td><table width="800" border="0" cellpadding="0" cellspacing="0" >
      <tr>
        <td width="113" height="39"><a href="main-page.html"></a><a href="main-page.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image6','','images/home2_02.gif',1)"><img src="images/home_02.gif" alt="main" name="Image6" width="100%" height="39" style="border:none"></a></td>
        <td width="114"><a href="shop.html"></a><a href="shop.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image7','','images/home2_03.gif',1)"><img src="images/home_03.gif" alt="shop" name="Image7" width="100%" height="39" style="border:none"></a></td>
        <td width="113"><a href="contact.html"></a><a href="contact.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image8','','images/home2_04.gif',1)"><img src="images/home_04.gif" alt="contact" name="Image8" width="100%" height="39" style="border:none"></a></td>
        <td width="460">&nbsp;</td>
     </tr> 
    </table></td>
  </tr>
  <tr>
    <td>
<?php	
$n = $_POST["N"];
$fn = $_POST["FN"];
$tel = $_POST["Tel"];
$email = $_POST["Email"];
$accn = $_POST["ACCN"];


$filename = "Order.txt";
$handle = fopen($filename, "r");
$contents = fread($handle, filesize($filename));
fclose($handle);
echo "you have charged";
echo $contents;


$fh = fopen("order.txt", 'w');
fwrite($fh, " Name: ");
fwrite($fh, $n);
fwrite($fh, " Familyname: ");
fwrite($fh, $fn);
fwrite($fh, " Telephone: ");
fwrite($fh, $tel);
fwrite($fh, " E-mail: ");
fwrite($fh, $email);
fwrite($fh, " Account Number: ");
fwrite($fh, $accn);
fwrite($fh, $contents);
fclose($fh);

$subject = "Thank you for your purchase, this is your purchase information e-mail";
if (mail($email, $subject, $contents)) {
  echo("E-mail sent sucessfully");
 } else {
  echo("E-mail sending has failed, check your mail service");
 }

?>
	
    </td>
  </tr>
	
	
	</td>
  </tr>
  

</table>

</body>
</html>
