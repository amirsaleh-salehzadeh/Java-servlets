<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
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
                                <form action="registerUser" method="post">
                                    <table width="" border="1" align="center" style="border-color:#bf0000; ">
                                      <tr>
                                        <td width="130">Name:</td>
                                        <td width="178"><input name="name" type="text"></td>
                                      </tr>
                                      <tr>
                                        <td>Family Name: </td>
                                        <td><input name="fname" type="text"></td>
                                      </tr>
                                      <tr>
                                        <td>Email:</td>
                                        <td><input name="email" type="text"></td>
                                      </tr>
                                      <tr>
                                        <td>Username:</td>
                                        <td><input name="uname" type="text"></td>
                                      </tr>
                                      <tr>
                                        <td>Password:</td>
                                        <td><input name="pass" type="password"></td>
                                      </tr>
                                      <tr>
                                        <td colspan="2" align="center">
                                            <input name="" type="submit" value="Submit">
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
