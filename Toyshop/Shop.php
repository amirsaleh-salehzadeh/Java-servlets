<html>
<head>
<title>Untitled-1</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<LINK href="style.css" rel=stylesheet>
<script type="text/javascript">
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
<body bgcolor="#0094be" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('images/shop2_02.gif','images/shop2_03.gif','images/shop2_04.gif','images/shop2_05.gif')">
<!-- ImageReady Slices (Untitled-1.psd) -->
<br><table id="Table_01" width="801" height="100%" border="0" cellpadding="0" cellspacing="0" align="center">
<tr>
		<td height="200" colspan="4">
			<img src="images/shop_01.gif" width="800" height="200" alt=""></td>
  </tr>
	<tr>
		<td width="801" height="51"><a href="About us.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image6','','images/shop2_02.gif',1)"><img src="images/shop_02.gif" name="Image6" width="234" height="51" border="0"></a><a href="game.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image7','','images/shop2_03.gif',1)"><img src="images/shop_03.gif" name="Image7" width="175" height="51" border="0"></a><a href="shop.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image8','','images/shop2_04.gif',1)"><img src="images/shop_04.gif" name="Image8" width="172" height="51" border="0"></a><a href="contact.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image9','','images/shop2_05.gif',1)"><img src="images/shop_05.gif" name="Image9" width="219" height="51" border="0"></a></td>
</tr>
<tr><td>
<?php
$T1=$HTTP_POST_VARS["CheckPoint1"];
$T2=$HTTP_POST_VARS["CheckPoint2"];
$T3=$HTTP_POST_VARS["CheckPoint3"];
$T4=$HTTP_POST_VARS["CheckPoint4"];
$F1=$HTTP_POST_VARS["name"];
$F2=$HTTP_POST_VARS["familyname"];
$F3=$HTTP_POST_VARS["acn"];
$F4=$HTTP_POST_VARS["address"];
$F5=$HTTP_POST_VARS["email"];
$F6=$HTTP_POST_VARS["phn"];
$toy = array($T1,$T2,$T3,$T4);
$Name = array("4WD-Car", "Lego Train", "Barbie House", "Star Trek");
$price = array(3,5,12,13);


$filehandle = fopen("database.txt", 'w');
echo "In your basket there is: ";

fwrite($filehandle, " Name: ");
fwrite($filehandle, $F1);
fwrite($filehandle, " Family Name: ");
fwrite($filehandle, $F2);
fwrite($filehandle, " Account number: ");
fwrite($filehandle, $F3);
fwrite($filehandle, " Email: ");
fwrite($filehandle, $F4);
fwrite($filehandle, " Address: ");
fwrite($filehandle, $F5);
fwrite($filehandle, " Phone number: ");
fwrite($filehandle, $F6);
fwrite($filehandle, " purchased: ");

for ($i = 0; $i < 4; $i++) 
{
if ($toy[$i] == "checkbox"){
$cash += $price[$i];
fwrite($filehandle, $Name[$i]);
fwrite($filehandle, ", ");
echo $Name[$i];
echo ", ";
}}

if ($cash == 0)
{
echo "nothing";
} 
else
{

fwrite($filehandle," _Should pay: ");
fwrite($filehandle, $cash);
fwrite($filehandle," $");
fclose($filehandle);
echo "And you have paid ";
echo $cash;
echo " $";
}
$subject = "Toy shop confirmation mail";
if (mail($email, $subject, $contents)) {
  echo("The E-mail sent you sucessfully");
 } else {
  echo("E-mail sending failed");
 }
 echo "Your request is done completely";
?>
  </td>
</tr>
</table>
<!-- End ImageReady Slices -->
</body>
</html>