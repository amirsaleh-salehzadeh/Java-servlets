<%-- 
    Document   : reserve
    Created on : Mar 29, 2010, 8:16:23 PM
    Author     : Amirsaleh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@ page import="java.text.DateFormat" %>
   <%@ page import="java.text.SimpleDateFormat" %>
   <%@ page import="java.util.ArrayList" %>
   <%@ page import="java.util.Date" %>
   <%@ page import="Common.*" %>
   

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reserve</title>
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
                   <form action="searchForRoom" method="post">
                        <%
                            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            Date date = new Date();
                            dateFormat.format(date);
                            %>
                            <span class="title">From:</span><input type="text" name="startDate" value="<%=dateFormat.format(date)%>">
                            <span class="title">To:</span><input type="text" name="endDate" value="<%=dateFormat.format(date)%>">
                        <span class="title">Beds: </span>
                        <select name="numOfRooms">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="4">4</option>
                            <option value="6">6</option>
                            <option value="8">8</option>
                        </select>
                        <input type="submit" value="Search">
                    </form>
                    <%
                            roomENT rooment = new roomENT();
                            userENT userent = new userENT();
                            reserveENT reserveent = new reserveENT();
                            if(session.getAttribute("user")!=null)
                                userent = (userENT)session.getAttribute("user");
                            if(session.getAttribute("reserve")!=null)
                                reserveent = (reserveENT)session.getAttribute("reserve");
                            if(session.getAttribute("room")!=null){
                                rooment=(roomENT)session.getAttribute("room");
                        %>
                        <form action="reserve" method="post">
                        <table align="center">                        
                        <tr>
                            <td>
                                <img src="images/hotel/<%=rooment.getImage()%>">
                            </td>
                            <td colspan="2">
                                <span class="title">Number of Beds:</span> <%=rooment.getNumOfBeds() %>
                            </td>
                        </tr>
                        <tr>
                            <td >
                                <span class="title">Price:</span><%=rooment.getPrice()%>
                            </td>
                            <td >
                                <span class="title">Available rooms <%=rooment.getAvailabile()%></span>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                From Date:<%=reserveent.getFromDate()%>
                                To Date:<%=reserveent.getToDate()%>
                                <input type="hidden" value="<%=reserveent.getFromDate()%>" name="fromdate">
                                <input type="hidden" value="<%=reserveent.getToDate()%>" name="todate">
                                <input type="hidden" value="<%=rooment.getRoomId()%>" name="roomId">
                                <input type="hidden" value="<%=userent.getUserName()%>" name="username">
                            </td>
                        </tr>
                        <tr>
                        <td colspan="2">
                            <%if(userent.isConfirmed()&&rooment.getAvailabile()>0){%>
                            <input type="submit" value="Reserve">
                                <%}%>
                                &nbsp;
                        </td>
                    </tr>
                        
                    </table>
                    <%}%>
                                
</form>
                </td>
            </tr>
        </table>
    </body>
</html>
