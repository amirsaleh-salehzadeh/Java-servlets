<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="Common.*" %>
<%@ page import="java.util.*" %>
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
                <td align="center">
                    <span class="message">
                        <%
                        String msg = request.getParameter("msg");
                        if(msg!=null){
                            out.print(msg);
                        }
                        UserENT uent = (UserENT)session.getAttribute("logIn");    
                        if(uent!=null&&uent.isAdministrator()){
                            %>
                    </span>
                    <form action="updateUser?userName=<%=uent.getUserName()%>" method="get">
                        <table border="1">
                            <tr>
                                <th class="tableHeader">
                                    Username
                                </th>
                                <th class="tableHeader">
                                    Is active
                                </th>
                                <th class="tableHeader">
                                    Is admin
                                </th>
                            </tr>
                            <% ArrayList<UserENT> ul = (ArrayList<UserENT>)session.getAttribute("usersList"); 
                                for(int i = 0 ; i < ul.size() ; i ++ ){
                                    UserENT u = ul.get(i);
                             %>
                            <tr>    
                                <td class="userListItems">
                                    <%= u.getUserName() %>
                                </td>
                                <td class="userListItems">
                                    <input name="isactive" type="checkbox" <%if(u.isAuthorized()) out.print("checked");%> value="<%= u.getUserName() %>"> 
                                </td>
                                <td class="userListItems">
                                    <input name="isadmin" type="checkbox" <%if(u.isAdministrator()) out.print("checked");%>  value="<%= u.getUserName() %>"> 
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
                    
                    <table>        
                            <%}%>
                            <%
                    ArrayList<TicketENT> tl = (ArrayList<TicketENT>)session.getAttribute("ticketsList");
                    if (uent!=null&&tl!=null){%>
                    <tr>
                        <td align="center">
                            <span class="title">My Tickets</span>
                            <table border="2" align="center" style="border-color: pink; border-style: dotted;">
                                <%  
                                    for(int i = 0 ; i < tl.size() ; i ++ ){
                                    TicketENT ticketENT = tl.get(i);
                                    MovieENT movieENT = ticketENT.getMovieENT();
                                %>
                                <tr>
                                    <td colspan="4"  style="color:#380046; background-color:#ffa200;"><%=i+1%></td>
                                </tr>
                                <tr>
                                    <td colspan="4"><img src="images/movies/<%= movieENT.getImage()%>.jpg"></td>
                                </tr>
                                <tr>
                                    <td class="tableHeader" style="background-color:#555555;">Name: </td>
                                    <td class="userListItems"><%= movieENT.getName()%></td>
                                    <td class="tableHeader" style="background-color:#555555;">Director: </td>
                                    <td class="userListItems"><%= movieENT.getDirector()%></td>
                                </tr>
                                <tr>
                                    <td class="tableHeader" style="background-color:#555555;">Start Date: </td>
                                    <td class="userListItems"><%= movieENT.getStartDate()%></td>
                                    <td class="tableHeader" style="background-color:#555555;">End Date: </td>
                                    <td class="userListItems"><%= movieENT.getEndDate()%></td>
                                </tr>
                                <tr>
                                    <td class="tableHeader" style="background-color:#555555;">Number of tickets: </td>
                                    <td class="userListItems"><%= ticketENT.getNumOfTickets()%></td>
                                    <td class="tableHeader" style="background-color:#555555;">Reserved date:</td>
                                    <td class="userListItems"><%= ticketENT.getDate()%></td>
                                </tr>
                                <tr>
                                    <td colspan="4"><br/></td>
                                </tr>                        
                                <%}%>
                            </table>

                        </td>
                    </tr>
                </table>
                <%}%>
                </td>
            </tr>
        </table>
    </body>
</html>
