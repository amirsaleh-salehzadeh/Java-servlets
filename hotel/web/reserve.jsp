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
   <%@ page import="common.*" %>
   

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reserve</title>
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
                   <form action="search" method="post">
                        <%
                            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                            Date date = new Date();
                            dateFormat.format(date);
                            %>
                            <span class="title">From:</span><input type="text" name="sdate" value="<%=dateFormat.format(date)%>">
                            <span class="title">To:</span><input type="text" name="edate" value="<%=dateFormat.format(date)%>">
                        <span class="title">Beds: </span>
                        <select name="numOfRooms">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                        </select>
                        <input type="submit" value="Search">
                    </form>
                    <%
                            RoomENT eNT = new RoomENT();
                            userENT ent = new userENT();
                            bookENT bent = new bookENT();
                            if(session.getAttribute("user")!=null)
                                ent = (userENT)session.getAttribute("user");
                            if(session.getAttribute("book")!=null)
                                bent = (bookENT)session.getAttribute("book");
                            if(session.getAttribute("room")!=null){
                                eNT=(RoomENT)session.getAttribute("room");
                        %>
                        <form action="bookServlet" method="post">
                        <table align="center">                        
                        <tr>
                            <td>
                                <img src="images/hotel/<%=eNT.getImage()%>">
                            </td>
                            <td colspan="2">
                                <input type="hidden" value="<%=eNT.getId()%>" name="roomId">
                                <input type="hidden" value="<%=ent.getId()%>" name="userId">
                                <span class="title">Number of Beds:</span> <%=eNT.getBeds() %>
                            </td>
                        </tr>
                        <tr>
                            <td >
                                <span class="title">Price per night:</span><%=eNT.getPrice()%>
                            </td>
                            <td >
                                <span class="title">Available rooms <%=eNT.getAvailability()%></span>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="3">
                                From Date:<input type="text" name="sdate" readonly value="<%=bent.getSDate()%>">
                                To Date:<input type="text" name="edate" readonly value="<%=bent.getEDate()%>">
                            </td>
                        </tr>
                        <tr>
                        <td colspan="3">
                            <%if(ent.isConfirmed()&&eNT.getAvailability()>0){%>
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
