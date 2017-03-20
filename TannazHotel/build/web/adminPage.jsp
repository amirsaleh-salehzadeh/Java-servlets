<%-- 
    Document   : register
    Created on : Mar 29, 2010, 1:10:32 PM
    Author     : Amirsaleh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>

   <%@ page import="Common.*" %>
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
                <td>
                    <form action="userUpdate" method="post">
                        <table border="1" align="center">
                            <tr>
                                <th class="header">
                                    Username
                                </th>
                                <th class="header">
                                    Is active
                                </th>
                                
                            </tr>
                            <% ArrayList<PassengerENT> pl = (ArrayList<PassengerENT>)session.getAttribute("users"); 
                                for(int i = 0 ; i < pl.size() ; i ++ ){
                                    PassengerENT p = pl.get(i);
                        
                            
                            %>
                            <tr>    
                                <td class="listItem">
                                    <%= p.getUserName() %>
                                </td>
                                <td class="listItem">
                                    <input name="isactive" type="checkbox" <%if(p.isAuthorized()) out.print("checked");%> value="<%= p.getId() %>"> 
                                </td>
                                
                            </tr>
                            <%}%>
                            <tr>
                                <td colspan="3">
                                    <input type="submit" value="Confirm Edit">
                                </td>
                            </tr>
                        </table>
                        
                    </form>
                </td>
            </tr>
        </table>
        
    </body>
</html>
