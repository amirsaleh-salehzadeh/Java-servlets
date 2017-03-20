
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.ArrayList" %>
   <%@ page import="Common.*" %>
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
                <td align="center">
                    <form action="searchServlet" method="post" >
                                Search for a match:<input type="text" name="search" ><input type="submit" value="Search">
                                </form>
                    <table align="center" border="1">
                        
                        <%
                            UserEntity userEntity = (UserEntity)session.getAttribute("user");
                            if(session.getAttribute("matchList")!=null){
                        %>
                        <tr>
                            <th>Index</th>
                            <th>Guest</th>
                            <th>Host</th>
                            <th>Date</th>
                            <th>Time</th>
                            <th>Location</th>
                            
                            <th>Book</th>
                            
                        </tr>
                        <%
                            ArrayList<MatchEntity> al = (ArrayList<MatchEntity>)session.getAttribute("matchList"); 
                            for(int i = 0 ; i < al.size() ; i ++){
                                MatchEntity matchEntity = al.get(i);
                        %>
                        <tr>
                            <td><%=i+1%></td>
                            <td><%=matchEntity.getGuest()%></td>
                            <td><%=matchEntity.getHost()%></td>
                            <td><%=matchEntity.getDate()%></td>
                            <td><%=matchEntity.getTime()%></td>
                            <td><%=matchEntity.getStadium()%></td>
                            <%if(userEntity !=null&&userEntity.isConfirmed()){%>
                            <td><a href="bookViewServlet?id=<%=matchEntity.getId()%>">Book</a></td>
                            <%}else{%>
                            <td><a href="#" onclick="alert('Please signIn or contact administrator to confirm You as a user')">Book</a></td>
                        </tr>
                        <%}
                            }
                            }%>
                    </table>
                </td>
            </tr>
        </table>
    </body>
</html>
