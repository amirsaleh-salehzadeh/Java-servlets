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
        <table align="center">
            <tr>
                <td>
                    <jsp:include page="menu.jsp"></jsp:include>
                </td>
            </tr>
            <tr>
                <td>
                    <form action="confirmUser" method="post">
                        <table border="1" align="center">
                            <tr>
                                <th class="header">
                                    Index
                                </th>
                                <th class="header">
                                    Username
                                </th>
                                <th class="header">
                                    Name
                                </th>
                                <th class="header">
                                    Familyname
                                </th>
                                <th class="header">
                                    Is active
                                </th>
                                
                            </tr>
                            <% ArrayList<PassengerENT> pl = (ArrayList<PassengerENT>)session.getAttribute("userListSession"); 
                                for(int i = 0 ; i < pl.size() ; i ++ ){
                                    PassengerENT p = pl.get(i);
                            %>
                            <tr>    
                                <td class="listItem">
                                    <%= i+1 %>
                                </td>
                                <td class="listItem">
                                    <%= p.getUserName() %>
                                </td>
                                <td class="listItem">
                                    <%= p.getName() %>
                                </td>
                                <td class="listItem">
                                    <%= p.getFName() %>
                                </td>
                                <td class="listItem">
                                    <input name="activationList" type="checkbox" <%if(p.isAuthorized()) out.print("checked");%> value="<%= p.getUserName() %>"> 
                                </td>
                                
                            </tr>
                            <%}%>
                            <tr>
                                <td colspan="5">
                                    <input type="submit" value="Update">
                                </td>
                            </tr>
                        </table>
                        
                    </form>
                </td>
            </tr>
        </table>
        
    </body>
</html>
