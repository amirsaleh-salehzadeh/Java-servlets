<%-- 
    Document   : index
    Created on : Mar 29, 2010, 12:38:14 PM
    Author     : Amirsaleh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel</title>
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
                    
                    <form action="register" method="post" name="form">
                        <table width="324" border="1" align="center">
                          <tr>
                            <td colspan="2" align="center"><span>
                        Registeration Form </span></td>
                          </tr>
                          <tr>

                            <td width="130" >Name: </td>
                            <td width="178"><input name="name" type="text"></td>
                          </tr>
                          <tr>
                            <td >Family Name: </td>
                            <td><input name="fname" type="text"></td>
                          </tr>
                          <tr>
                            <td >Telephone:</td>
                            <td><input name="phone" type="text"></td>
                          </tr>
                          <tr>
                            <td >Email:</td>
                            <td><input name="email" type="text"></td>
                          </tr>
                          <tr>
                            <td >Password:</td>
                            <td><input name="password" type="password"></td>
                          </tr>
                          <tr>
                            <td >Username:</td>
                            <td><input name="usern" type="text"></td>
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
    </body>
</html>
