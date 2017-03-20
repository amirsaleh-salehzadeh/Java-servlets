<%-- 
    Document   : Header
    Created on : Feb 6, 2010, 8:36:52 PM
    Author     : Jeiran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div id="header">
		<div >
                         <img src="logo.jpg" id="logoPic"/> 
		</div>
		<!--Title-->
		<div align="right"><span class="title">WELCOME TO <span style="font-size:24px;">Melli Cinema</span> website</span></div>
		<!--Menu-->
		<div id="menu" >
			<table class="fontMenu" cellpadding="5px">
					<tr>
                                        <td class="menuLink"><a href="index.jsp">Home</a></td>
                                        <td class="menuLink"><a href="GenreListServlet?next=Genre.jsp" >Movies</a></td>
                                        <td class="menuLink"><a href="#">Contact Us</a></td>
                                        </tr>

			</table>
		</div>
		<!--Search-->
		
	</div>
	
    </body>
</html>
