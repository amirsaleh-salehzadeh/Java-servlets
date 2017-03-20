
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.ArrayList" %>
   <%@ page import="Common.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2010 Fifa</title>
        <script>
            function calculateValue(){
            var price = document.form1.qty.value;
            document.form1.totalPrice.value = price*150;
            
        }
         
        </script>
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
                    
                    <table align="center" border="1">
                        
                        <tr>
                            
                            <th>Guest</th>
                            <th>Host</th>
                            <th>Date</th>
                            <th>Time</th>
                            <th>Location</th>
                            <th>Available Seats</th>
                        </tr>
                        <%
                            
                            BookEntity bookEntity = (BookEntity)session.getAttribute("match");
                            MatchEntity matchEntity = bookEntity.getMatchEntity();
                            int availableSeats = 100000-bookEntity.getQuantity();
                        %>
                        <tr>
                            
                            <td><%=matchEntity.getGuest()%></td>
                            <td><%=matchEntity.getHost()%></td>
                            <td><%=matchEntity.getDate()%></td>
                            <td><%=matchEntity.getTime()%></td>
                            <td><%=matchEntity.getStadium()%></td>
                            <td><%=availableSeats%></td>
                            
                        </tr>
                       
                    </table>
                    <form action="bookAMatchServlet" name="form1" onsubmit="calculateValue();">
                        <strong> Price per ticket is 150$</strong><br/>
                        Number of tickets you want:<input type="text" size="4" name="qty">
                            <input type="button" value="Calculate Total Price" onclick="calculateValue();">
                            <br/>
                            Total Price:<input type="text" readonly name="totalPrice"><strong>$</strong><br/>
                            <input type="hidden" name="matchID" value="<%=matchEntity.getId()%>">
                            <%if(availableSeats>0){%>
                            <input type="submit" value="Book">
                                <%}else{%>
                                <strong style="color:red;"> Sorry no available seats for this match</strong>
                                <%}%>
                    </form>
                </td>
            </tr>
        </table>
    </body>
</html>
