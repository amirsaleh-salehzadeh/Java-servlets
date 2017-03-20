<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <td colspan="4"><img src="logo.jpg"></td>
            </tr>
            <tr>
                <td>
                    <a href="index.jsp">Home</a>
                </td>
                
                <td>
                    <a href="register.jsp">Register</a>
                </td>
                <td>
                    <a href="search.jsp">Search</a>
                </td>
                <td>
                    <%if(session.getAttribute("user")!=null){%>
                        <a href="logout">Logout</a>
                    <%}else{%>
                        <a href="signin.jsp">Sign in</a>
                    <%}%>
                </td>
            </tr>
            
                    <%
                        String alert = request.getParameter("alert");
                        if(alert==null)
                            alert="";
                        if(!alert.equalsIgnoreCase("")){
                    %>
                     <tr>
                <td colspan="4" align="center">
                    <span style="color:red; font-size:22px; font-weight:bold;"><strong><%=alert%></strong></span>
                </td>                
            </tr>
              <%}
                    %>
                    
               
        </table>
    </body>
</html>
