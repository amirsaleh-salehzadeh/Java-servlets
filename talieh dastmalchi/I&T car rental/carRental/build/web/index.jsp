<%-- 
    Document   : index
    Created on : Mar 11, 2011, 12:38:14 PM
    Author     : Talieh Dastmalchi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <table align="center">
            <tr>
                <td>
                    <jsp:include page="menu.jsp"></jsp:include><%--menu included in every page. Menu is a seperated page--%>
                </td>
            </tr>
            <tr>
                <td>
                    <table>
                        <tr>
                            <td>
                                <form action="logIn" method="post">
                                    <table >
<%--                                        login form--%>
                                        <tr>
                                            <td colspan="2" align="center">Login</td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <span>Username:</span>
                                            </td>
                                           <td>
                                                <input type="text" name="userN">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <span>Password:</span>

                                            </td>
                                            <td>
                                                <input type="password" name="pass">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" align="center">
                                                <input type="submit" value="Login">
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
