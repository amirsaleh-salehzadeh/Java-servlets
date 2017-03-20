<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">

<title>AMS----Shop</title>
<LINK href="main.css" rel=stylesheet>
<script type="text/JavaScript">

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
//validator
function validate_required(field,alerttxt)
{
with (field)
{
if (value==null||value=="")
  {alert(alerttxt);return false}
else {return true}
}
}

function validate_email(field,alerttxt)
{
with (field)
{
apos=value.indexOf("@")
dotpos=value.lastIndexOf(".")
if (apos<1||dotpos-apos<2) 
  {alert(alerttxt);return false}
else {return true}
}
}

function validate_form(thisform)
{
with (thisform)
{
if (validate_required(name,"Name must be filled out!")==false)
  {name.focus();return false}
if (validate_required(familyname,"Family name must be filled out!")==false)
  {familyname.focus();return false}
if (validate_required(acn,"Account number must be filled out!")==false)
  {acn.focus();return false}
if (validate_email(email,"Enter a valid e-mail address!")==false)
  {email.focus();return false}
if (validate_required(address,"Address must be filled out!")==false)
  {address.focus();return false}
if (validate_required(phn,"Phone number must be filled out!")==false)
  {phn.focus();return false}  
}
}
</script>
</head>

<body>
<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td><img src="images/main-page_01.gif" width="800" height="180" alt="logo1"/></td>
  </tr>
  <tr>
    <td><table width="800" border="0" cellpadding="0" cellspacing="0" >
      <tr>
        <td><a href="main-page.html"></a><a href="main-page.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image6','','images/main-page1_02.gif',1)"><img src="images/main-page2_02.gif" alt="main" name="Image6" width="150" height="39" style="border:none"></a></td>
        <td><a href="shop.html"></a><a href="shop.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image7','','images/main-page1_03.gif',1)"><img src="images/main-page2_03.gif" alt="shop" name="Image7" width="150" height="39" style="border:none"></a></td>
        <td><a href="contact.html"></a><a href="contact.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image8','','images/main-page1_04.gif',1)"><img src="images/main-page2_04.gif" alt="contact" name="Image8" width="149" height="39" style="border:none"></a></td>
        <td><img src="images/main-page_05.gif" alt="logo2" width="351"/></td>
     </tr> 
    </table></td>
  </tr>
  <tr>
    <td>
<?php
$pg=$_POST["pureglut"];
$ap=$_POST["awprotein"];
$wp=$_POST["wheyprotein"];
$mc=$_POST["monocreatine"];
$product = array($pg,$ap,$wp,$mc);
$name = array("100% Pure L-Glutamine. ","Awesome Mass - Horleys. ","100% Whey Protein. ","100% Pure Creatine Monohydrate. ");
$prices = array(65,70,18,33);

?>
<h1> you have choose</h1>
<h2>
<?php
$fh = fopen("database.txt", 'w');
fwrite($fh, " ORDERS: ");
for ($j = 0; $j < 4; $j++)
{
if ($product[$j] != 0)
{
echo $product[$j];
echo " number of "; 
echo $name[$j];
echo "</br>";
fwrite($fh, $product[$j]);
fwrite($fh, " ");
fwrite($fh, $name[$j]);
fwrite($fh, " ");
$x++;
}
}
if ($x == 0)

echo "nothing";
?>
</h2>
<h1> And you should pay 
<?php
for ($i = 0; $i < 4; $i++)
$Ttlcash += $product[$i] * $prices[$i];
echo $Ttlcash;
fwrite($fh, "Total payment is: ");
fwrite($fh, $Ttlcash);
fwrite($fh, "$ ");

?> $ </h1>
<h2> To confirm your purchase please complete all this form's fields:</h2>
<form onSubmit="return validate_form(this)" method="post" action="submit.php">
<p>Name:
  <input type="text" name="name">

  <p>Family Name:
  <input type="text" name="familyname">
  <p>
  Account Number:
  <input type="text" name="acn">
  <p> 
  Email: 
  <input name="email" type="text">
  <p>
  Address:
  <textarea name="address" rows="3" cols="20" ></textarea>
  <p>
  Phone number:
   <input name="phn" type="text">
  <p>
   <input type="submit" name="Submit" value="Submit">
  
</form>




</td>
  </tr>
</table>
<p>
    <a href="http://validator.w3.org/check?uri=referer"><img
        src="http://www.w3.org/Icons/valid-html401"
        alt="Valid HTML 4.01 Strict" height="31" width="88"></a>
  </p>

</body>
</html>
