
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2010 Fifa- Administrator</title>
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
                    <form action="addMatchServlet" method="post">
                    <table align="center">
                        <tr>
                            <td>Guest</td>
                            <td><input type="text" name="guest"></td>
                        </tr>
                        <tr>
                            <td>Host</td>
                            <td><input type="text" name="host"></td>
                        </tr>
                        <tr>
                            <td>Date</td>
                            <td><input type="text" name="date"></td>
                        </tr>
                        <tr>
                            <td>Time</td>
                            <td><input type="text" name="time"></td>
                        </tr>
                        <tr>
                            <td>Stadium</td>
                            <td><input type="text" name="stadium"></td>
                        </tr>
                        <tr>
                            <td colspan="2"><input type="submit" value="Add"></td>
                        </tr>
                    </table>
                    </form>
                </td>
            </tr>
        </table>
    </body>
</html>
