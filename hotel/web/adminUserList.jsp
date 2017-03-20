<%-- 
    Document   : adminAddRoom
    Created on : Mar 31, 2010, 6:16:17 PM
    Author     : Amirsaleh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@ page import="java.util.ArrayList" %>
   <%@ page import="java.util.Date" %>
   <%@ page import="common.*" %>

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
                                    <% ArrayList<userENT> pl = (ArrayList<userENT>)session.getAttribute("users"); 
                                        for(int i = 0 ; i < pl.size() ; i ++ ){
                                    %>
                                    <tr>    
                                        <td class="listItem">
                                            <%= pl.get(i).getUserName() %>
                                        </td>
                                        <td class="listItem">
                                            <a href="userConfirm?id=<%= pl.get(i).getId() %>&isactive=<%if(pl.get(i).isConfirmed()){
                                                out.print("0");
                                                }else{
                                                out.print("1");
                                                }%>">
                                                
                                            <%
                                            if(pl.get(i).isConfirmed()){
                                                out.print("deActive");
                                                }else{
                                                out.print("Active");
                                                }%> </a>
                                            
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
            </td>
        </tr>
    </table>
    </body>
</html>




                    