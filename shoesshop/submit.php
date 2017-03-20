<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Submission page</title>
</head>

<body bgcolor="#9999CC">
<p>
  <?php
$shoes1=$HTTP_POST_VARS["011"];
$shoes2=$HTTP_POST_VARS["012"];
$shoes3=$HTTP_POST_VARS["013"];
$name=$HTTP_POST_VARS["name"];
$family=$HTTP_POST_VARS["familyname"];
$email=$HTTP_POST_VARS["email"];
$address=$HTTP_POST_VARS["address"];
$paid=$HTTP_POST_VARS["paid"];
$phonenumber=$HTTP_POST_VARS["phone"];

$shoes= array($shoes1,$shoes2,$shoes3);
$shoesname = array("shoes number one", "shoes number two", "shoes number three");

$shoes1p=60;
$shoes2p=70;
$shoes3p=100;

$filehandle = fopen("database.txt", 'w');
echo "In your basket there is: ";
fwrite($filehandle, " Name: ");
fwrite($filehandle, $name);
fwrite($filehandle, " Family Name: ");
fwrite($filehandle, $family);
fwrite($filehandle, " paid type: ");
fwrite($filehandle, $paid);
fwrite($filehandle, " Email: ");
fwrite($filehandle, $email);
fwrite($filehandle, " Address: ");
fwrite($filehandle, $address);
fwrite($filehandle, " Phone number: ");
fwrite($filehandle, $phonenumber);

fwrite($filehandle, " bought: ");
echo "You have bought ";
$t = 0;
for ($i=0; $i<3; $i++)
{
if ($shoes[$i] != 0)
{
echo $shoes[$i];
echo " number of "; 
echo $shoesname[$i];
fwrite($filehandle, $shoes[$i]);
fwrite($filehandle, " number of ");
fwrite($filehandle, $shoesname[$i]);
$t++;
}
}
if ($t == 0){
echo "nothing";
fwrite($filehandle, " nothing");
}

$subject = "confirmation mail";
if (mail($email, $subject, $contents)) {
  echo("The E-mail has been sent to you");
 } else {
  echo("E-mail sending failed");
 }
 echo "Your request is done completely";



?>
</p>
<p><a href="shop.html">click to back to shop</a></p>
</body>
</html>
