<%-- 
    Document   : login
    Created on : Jan 20, 2011, 7:29:28 AM
    Author     : Talieh
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
        <table>
            <tr>
                <td colspan="2">
                <%@ include file="header.jsp" %>
            </td>
            <tr>
                <td colspan="2">
                <%@ include file="menu.jsp" %>
            </td>
            <tr>
                <td>
                    <span style="color:red;">
                        <%= session.getAttribute("ErrorMessage")%>
                    </span>
                    <form action="loginServlet" method="POST">
                        Username:<input type="text" name="username"/><br/>
                        Password:<input type="password" name="password"/><br/>
                        <input type="submit" value="OK"/>
                        
                    </form>
            </td>
            <tr>
               <td>
                <%@ include file="banner.jsp" %>
            </td>
            <tr>
                <td colspan="2">
                <%@ include file="footer.jsp" %>
            </td>
            
                    
            </tr>
        </table>
    </body>
</html>
