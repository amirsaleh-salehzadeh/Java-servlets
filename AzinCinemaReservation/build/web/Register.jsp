<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <table>
            <tr>
                <td>
                    <jsp:include page="header.jsp"></jsp:include>
                </td>
            </tr>
            <tr>
                <td align="center">
                    <span class="message">
                        <%
                        String msg = request.getParameter("msg");
                        if(msg!=null){
                            out.print(msg);
                        }
                            
                            %>
                    </span>
                    <form action="RegServlet" method="post" name="form">
                        <table width="324" border="0" align="center">
                          <tr>
                            <td colspan="2" align="center"><span class="title">
                                Registeration Form </span>	</td>
                          </tr>
                          <tr>

                            <td width="130" class="label">Name: </td>
                            <td width="178"><input name="name" type="text"></td>
                          </tr>
                          <tr>
                            <td class="label">Family Name: </td>
                            <td><input name="fname" type="text"></td>
                          </tr>
                          <tr>

                            <td class="label">Telephone:</td>
                            <td><input name="tel" type="text"></td>
                          </tr>
                          <tr>
                            <td class="label">Password:</td>
                            <td><input name="pass" type="password"></td>
                          </tr>
                           <tr>
                            <td class="label">Username:</td>
                            <td><input name="usern" type="text"></td>
                          </tr>
                          <tr>

                            <td class="label"><label> Address: </label></td>
                            <td><textarea name="address"></textarea></td>
                          </tr>

                          <tr>

                            <td colspan="2" align="center">
                                <input name="" type="submit" value="Register">
                                </td>
                          </tr>
                        </table>
                        </form>
                </td>
            </tr>
        </table>
    </body>
</html>
