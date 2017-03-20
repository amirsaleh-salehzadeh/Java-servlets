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
                        <td>
                            <a href="admin.jsp">adminPage</a>
                        </td>
                    </tr>
            <tr>
            <td>
                <table>
                    <tr>
                        <td>
                            <form method="post" action="saveRoom">
                                Add Room
                                <br/>
                                number of beds:

                                  <select name="numberOfBeds">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                    <option value="6">6</option>
                                </select>  
                                    <br/>
                                available rooms:
                                <input type="text" name="availabality"><br/>
                                image:
                                <input type="text" name="image"><br/>
                                price:
                                <input type="text" name="price"><br/>
                                <input type="submit" value="Save">

                            </form>
                        </td>
                    </tr>
                    </table>
            </td>
        </tr>
    </table>
    </body>
</html>




                    