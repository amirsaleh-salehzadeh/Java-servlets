<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
 <%@ include file="Header.jsp" %>   
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Register</title>
	<link rel="stylesheet" href="style.css" />
	
	<script type="text/javascript">

		function formValidator(){
			<!-- Make quick references to fields-->
			var fname = document.getElementById('fname');
			var lname = document.getElementById('lname');
			var addr = document.getElementById('addr');
			var city = document.getElementById('city');
			var zipcode = document.getElementById('zipcode');
			var phone = document.getElementById('phone');
			var email = document.getElementById('email');
			var pass = document.getElementById('pass');
			var repass = document.getElementById('repass');
			
			<!--Check each input in the order that it appears in the form-->
			if(isAlphabet(fname, "First Name Should Be Only Letters! ")){
						if(isAlphabet(lname, "Last Name Should Be Only Letters! ")){
							if(isAlphanumeric(addr, "Address Should Only Contain Numbers and Letters!")){
								if(isAlphabet(city, "City Should Be Only Letters! ")){
										if(isNumeric(zipcode, "Please Enter A Valid Zip Code")){
											if(isNumeric(phone, "Please Enter A Valid Phone Number")){
												if(emailValidator(email, "Please Enter A Valid Email Address")){
														if(lengthRestriction(pass, 5, 10)){
															if(lengthRestriction(repass, 5, 10)){		
																return true;
												
										  }
									  }	
							   }
							}
						}
					}
				}
			}
		}	
			
			return false;
			
		}
		
		function notEmpty(elem, helperMsg){
			if(elem.value.length == 0){
				alert(helperMsg);
				elem.focus(); // set the focus to this input
				return false;
			}
			return true;
		}
		
		function isNumeric(elem, helperMsg){
			var numericExpression = /^[0-9]+$/;
			if(elem.value.match(numericExpression)){
				return true;
			}else{
				alert(helperMsg);
				elem.focus();
				return false;
			}
		}
		
		function isAlphabet(elem, helperMsg){
			var alphaExp = /^[a-zA-Z]+$/;
			if(elem.value.match(alphaExp)){
				return true;
			}else{
				alert(helperMsg);
				elem.focus();
				return false;
			}
		}
		
		function isAlphanumeric(elem, helperMsg){
			var alphaExp = /^[0-9a-zA-Z]+$/;
			if(elem.value.match(alphaExp)){
				return true;
			}else{
				alert(helperMsg);
				elem.focus();
				return false;
			}
		}
		
		function lengthRestriction(elem, min, max){
			var uInput = elem.value;
			if(uInput.length >= min && uInput.length <= max){
				return true;
			}else{
				alert("Please enter between " +min+ " and " +max+ " characters");
				elem.focus();
				return false;
			}
		}
		
		
		function emailValidator(elem, helperMsg){
			var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
			if(elem.value.match(emailExp)){
				return true;
			}else{
				alert(helperMsg);
				elem.focus();
				return false;
			}
		}
		
		
		
		</script>

	<!--<script type="text/javascript">
	function checkAll()
		{
		alert(1);
			var b1=checkName();
			var b2=true;
			var b3=true;
			var b4=true;
			
			if(b1 && b2 && b3 && b4)
				return false;
			else return false;
		}
		function checkName()
		{
			var in=document.getElementById("inName");
			var st=in.value;
			if(st.length<3)
			{alert("Name should be greater than 3 characters!");
				return false;
			}
			var isAlphabet=/^[a-z A-z]+$/;
			if(st.match(isAlphabet)
				return true;
			else
			{
				alert("name should be letter");
				return false;
			}
		}
		
	</script> -->
</head>

<body id="body">
	<!--Header-->

	
	<!--MainBody-->	
	<div id="content">
		<!--LeftBaner-->
		<div id="bannerL_register"  class="banL_span">
				<p class="fontTitle">CREATE AN ACCOUNT</p>
			 		Simply complete the fields below to create an account.<br />
					<form action="RegisterServlet" method="get" onsubmit="return checkAll();">
						<table>
							<tr>
								<td>FIRST NAME:<br />
									<input id="inName" type="text" name="name" />								</td>
								<td>LAST NAME:<br />
									<input type="text" name="lname" />								</td>
							</tr>
							<tr>
								<td>TELL NUMBER:<br />
									<input type="text" name="tell" /></td>
								<td>EMAIL ADDRESS<br />
									<input type="text" name="email" /></td>
							</tr>
							<tr>
								<td>USERNAME:<br />
									<input type="text" name="username" />								</td>
								
							</tr>
							<tr>
								<td>PASSWORD:<br />
									<input type="password" name="pass" />								</td>
								<td>VERIFY PASSWORD:<br />
									<input type="password" name="vpass" />								</td>
							</tr>
						</table><br />
						
						<p class="banL_span"><input type="checkbox" name="terms" />
						I have read, understand and agree to be bound by the Terms and<br />
						Conditions and Privacy Policy for this website.</p> 
						<input  class="submit" type="submit" value="SUBMIT" />
					</form>
		</div>	
		<!--MiddleBody-->
		<div id="middleBody_register" ></div>	
		<!--RightBanner-->
		<div id="bannerR" class="fontMenu">
			<div class="banR_span"> 
				<span class="test"><p><a  href="SignIn.html"> Sign In </a> </p></span>
			
				<a  href="#">VIEW BAG</a><br />        
				<a  href="#">MY ACCOUNT</a><br />  
				<a  href="#">FIND STORES</a><br />
				<a  href="#">CUSTOMER SERVICES</a><br />
				<a  href="#">EMAIL AN ARTIST</a>			</div>
		</div>
	</div>
	
	<!--Footer-->
	<div id="footer">
		<font color="#000000">
						© 2010 MELLI CINEMA. All worldwide rights reserved.					</font>	
	</div>	

</body>
</html>
