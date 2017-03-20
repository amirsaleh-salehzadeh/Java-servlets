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
                    <jsp:include page="menu.jsp"></jsp:include>
                </td>
            </tr>
            <%
            PassengerENT pent = new PassengerENT();
            if(session.getAttribute("userSession")!=null)
            pent = (PassengerENT)session.getAttribute("userSession");
            %>
            <tr>
                <td align="center">
                    <%if(pent.isAdmin()){%>
                    <table>
                        <tr>
                            <td>
                                <form method="post" action="insertRoom">
                                    Add Room
                                    room type:
                                    <select name="type">
                                        <option value="Single">Single Rooms</option>
                                        <option value="Royal">Royal</option>
                                        <option value="SuperRoyal">Super Royal</option>
                                        <option value="Penthouse">Penthouse</option>
                                    </select>
                                                                        <br/>
                                    number of beds:
                                    <input type="text" name="numberOfBeds">
                                        <br/>
                                    Availability of this type of room:
                                    <input type="text" name="availability"><br/>
                                    image:
                                    <input type="text" name="image"><br/>
                                    price:
                                    <input type="text" name="price"><br/>
                                    <input type="submit" value="Save room">
                                        
                                </form>
                            </td>
                        </tr>
                    </table>
                    <%}%>
                    <form action="searchForRoom" method="post">
                        <%
                            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            Date date = new Date();
                            %>
                            <span class="title">From Date:</span><input type="text" name="startDate" value="<%=dateFormat.format(date)%>">
                            <span class="title">To Date:</span><input type="text" name="endDate" value="<%=dateFormat.format(date)%>">
                        <span class="title">Room Type: </span>
                        <select name="type">
                            <option value="Single">Single Rooms</option>
                            <option value="Royal">Royal</option>
                            <option value="SuperRoyal">Super Royal</option>
                            <option value="Penthouse">Penthouse</option>
                        </select>
                        <span class="title">Number of beds: </span>
                        <input type="text" name="numberOfBeds" size="1" value="1">
                        <input type="submit" value="Search">
                    </form>
                    
                        <%
                            RoomENT eNT = new RoomENT();
                            ReserveENT rent = new ReserveENT();
                            if(session.getAttribute("reserveSession")!=null)
                                rent = (ReserveENT)session.getAttribute("reserveSession");
                            if(session.getAttribute("roomSession")!=null){
                                eNT=(RoomENT)session.getAttribute("roomSession");

                        %>
                        <form action="bookServlet" method="post">
<table align="center">                        
                        <tr>
                            <td>
                                <img src="images/hotel/<%=eNT.getImage()%>">
                            </td>
                            <td colspan="2">
                                <input type="hidden" value="<%=eNT.getId()%>" name="roomId">
                                <input type="hidden" value="<%=pent.getUserName()%>" name="userName">
                                <span class="title">Room Type:</span><%=eNT.getRoomType()%>
                            <span class="title">Number of Beds:</span> <%=eNT.getBeds() %>
                            </td>
                        </tr>
                        <tr>
                            <td >
                                <span class="title">Room Type:</span><%=eNT.getRoomType()%>
                            </td>
                            <td >
                                <span class="title">Price per night:</span><%=eNT.getPrice()%>
                            </td>
                            <td >
                                <span class="title">There available only <%=eNT.getNumRooms()%> number of these rooms</span>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="3">
                                From Date:<input type="text" name="sdate" readonly value="<%=rent.getSDate()%>">
                                To Date:<input type="text" name="edate" readonly value="<%=rent.getEDate()%>">
                            </td>
                        </tr>
                        <tr>
                        <td colspan="3" align="center">
                            <%if(pent.isAuthorized()){%>
                            <input type="submit" value="Book">
                                <%}%>&nbsp;
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
