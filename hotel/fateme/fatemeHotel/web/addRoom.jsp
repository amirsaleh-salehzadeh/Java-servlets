<%-- 
    Document   : adminAddRoom
    Created on : Mar 31, 2010, 6:16:17 PM
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
                        <td align="center">
                            <a href="administrator.jsp">Administrator Home</a>
                        </td>
                    </tr>
            <tr>
            <td>
                <table align="center">
                    <tr>
                        <td>
                            <form method="post" action="insertRoom">
                                insert a Room
                                <br/>
                                Beds:

                                  <select name="number">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="4">4</option>
                                    <option value="6">6</option>
                                    <option value="8">8</option>
                                </select> 
                                    <br/>
                                number of rooms:
                                <input type="text" name="available"><br/>
                                image:
                                <input type="text" name="image"><br/>
                                price:
                                <input type="text" name="price"><br/>
                                <input type="submit" value="insert">

                            </form>
                        </td>
                    </tr>
                    </table>
            </td>
        </tr>
    </table>
    </body>
</html>




                    