<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign in</title>
    </head>
    <body>
        <table align="center">
            <tr>
                <td>
                    <jsp:include page="menu.jsp"></jsp:include>
                </td>
            </tr>
            <tr>
                <td>
                    <table align="center">
                        <tr>
                            <td>
                                <form action="logIn" method="post">
                                    <table >
                                        <tr>
                                            <td colspan="2" align="center">Sign In form</td>
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
