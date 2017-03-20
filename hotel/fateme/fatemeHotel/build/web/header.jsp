
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<title>Untitled-1</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<style type="css/text">
    a{
    border: none;
}
    
</style>
</head>
<body bgcolor="#daf5fb" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">

<table id="Table_01" width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="4">
			<img src="images/azodi_01.jpg" width="800" height="350" alt=""></td>
	</tr>

	<tr>
		<td>
                    <a href="index.jsp"><img src="images/azodi_02.jpg" width="109" height="50" alt=""></a></td>
		<td>
			<a href="login.jsp"><img src="images/azodi_03.jpg" width="120" height="50" alt=""></a></td>
		<td>
			<a href="register.jsp"><img src="images/azodi_04.jpg" width="159" height="50" alt=""></a></td>
		<td>
			<a href="search.jsp"><img src="images/azodi_05.jpg" width="412" height="50" alt=""></a></td>

	</tr>
	<tr>
		<td colspan="4">
			<img src="images/azodi_06.png" width="800" height="200" alt=""></td>
	</tr>

                    <%
                        if(session.getAttribute("user")!=null){
                                
                    %>
                     <tr>
                <td colspan="5" align="center">
                    <a href="logout">Logout</a>
                    
                </td>                
            </tr>
             
         
         <%}%><%
                        String msg = request.getParameter("message");
                        if(msg==null)
                            msg="";
                        if(!msg.equalsIgnoreCase("")){
                    %>
                     <tr>
                <td colspan="4" align="center">
                      
                    <span style="color:#ff2a00; font-size:20px; font-weight:bold;"><%=msg%></span>
                </td>    
                <%}%>

</table>
<!-- End ImageReady Slices -->
</body>
</html>