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
        <table>
            <tr>
                <td>
                    <jsp:include page="header.jsp"></jsp:include>
                </td>
            </tr>
            <%
            PassengerENT pent = new PassengerENT();
            if(session.getAttribute("user")!=null)
            pent = (PassengerENT)session.getAttribute("user");
            %>
            <tr>
                <td align="center">
                    <%if(pent.isAdmin()){%>
                    <table>
                        <tr>
                            <td>
                                <form method="post" action="registerRoom">
                                    Add Room
                                    room type:
                                    <select name="roomType">
                                        <option value="Single">Single</option>
                                        <option value="2 Rooms">2 Rooms</option>
                                        <option value="Royal">Royal</option>
                                        <option value="Business">Business</option>
                                    </select>
                                                                        <br/>
                                    number of beds:
                                    
                                      <select name="numberOfBeds">
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="4">4</option>
                                        <option value="6">6</option>
                                    </select>  
                                        <br/>
                                    how many rooms:
                                    <input type="text" name="numberOfRooms"><br/>
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
                    <form action="searchServlet" method="post">
                        <%
                            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                            Date date = new Date();
                            dateFormat.format(date);
                            String dateString = dateFormat.format(date).toString().replaceAll("/", "-");
                            %>
                            <span class="title">From Date:</span><input type="text" name="sdate" value="<%=dateString%>">
                            <span class="title">To Date:</span><input type="text" name="edate" value="<%=dateString%>">
                        <span class="title">Room Type: </span>
                        <select name="roomType">
                            <option value="Single">Single</option>
                            <option value="2 Rooms">2 Rooms</option>
                            <option value="Royal">Royal</option>
                            <option value="Business">Business</option>
                        </select>
                        <span class="title">Number of beds: </span>
                        <select name="numOfRooms">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="4">4</option>
                            <option value="6">6</option>
                        </select>
                        <input type="submit" value="Search">
                    </form>
                    
                        <%
                            RoomENT eNT = new RoomENT();
                            
                            ReserveENT rent = new ReserveENT();
                            if(session.getAttribute("reserve")!=null)
                                rent = (ReserveENT)session.getAttribute("reserve");
                            
                                    
                            if(session.getAttribute("roomENT")!=null){
                                eNT=(RoomENT)session.getAttribute("roomENT");
                        %>
                        <form action="reserveServlet" method="post">
<table align="center">                        
                        <tr>
                            <td>
                                <img src="images/hotel/<%=eNT.getImage()%>">
                            </td>
                            <td colspan="2">
                                <input type="hidden" value="<%=eNT.getId()%>" name="roomId">
                                <input type="hidden" value="<%=pent.getId()%>" name="userId">
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
                                <span class="title">There available only <%=eNT.getNumberOfRooms()%> number of these rooms</span>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="3">
                                From Date:<input type="text" name="sdate" readonly value="<%=rent.getSDate()%>">
                                To Date:<input type="text" name="edate" readonly value="<%=rent.getEDate()%>">
                            </td>
                        </tr>
                        <tr>
                        <td colspan="3">
                            <%if(pent.isAuthorized()){%>
                            <input type="submit" value="Reserve">
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
