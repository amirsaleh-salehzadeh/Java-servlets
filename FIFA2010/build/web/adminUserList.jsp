
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@ page import="java.util.ArrayList" %>
   <%@ page import="Common.UserEntity" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2010 Fifa</title>
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
                    <table border="1" align="center" >
                        <tr>
                            <td colspan="2" align="center">
                                <a href="admin.jsp">Administrator Page</a>
                            </td>
                        </tr>
                        <tr>
                            <th class="header">
                                Username
                            </th>
                            <th class="header">
                                Activation Status
                            </th>

                        </tr>
                        <% 
                        ArrayList<UserEntity> ul = (ArrayList<UserEntity>)session.getAttribute("userList"); 
                            for(int i = 0 ; i < ul.size() ; i ++ ){
                        %>
                        <tr>    
                            <td class="listItem">
                                <%= ul.get(i).getUsername() %>
                            </td>
                            <td class="listItem">
                                <a href="activateUserServlet?userName=<%= ul.get(i).getUsername() %>&isActive=<%if(ul.get(i).isConfirmed()){
                                    out.print("true");}else{out.print("false");
                                    }%>">

                                <%
                                if(ul.get(i).isConfirmed()){
                                    out.print("Deactive");
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
                </td>
            </tr>
        </table>
    </body>
</html>
    