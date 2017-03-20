<%-- 
    Document   : admin
    Created on : Apr 1, 2010, 2:31:09 PM
    Author     : Amirsaleh
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
        <table align="center">
            <tr>
                <td>
                    <jsp:include page="header.jsp"></jsp:include>
                </td>
            </tr>
            <tr>
                <td>
                    <table>
                        <tr>
                            <td>
                                <form action="logIn" method="post">
                                    <table >
                                        <tr>
                                            <td colspan="2" align="center" nowrap>
                                                <a href="userList">Confirm users</a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" align="center" nowrap>
                                                <a href="adminAddRoom.jsp">Add a room</a>
                                            </td>
                                        </tr>
                                    </table>
                                </form>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    </body>
</html>
