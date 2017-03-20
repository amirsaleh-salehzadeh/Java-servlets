<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="Common.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.DateFormat" %>

<%@ page import="java.text.SimpleDateFormat" %>
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
                            if(!"null".equalsIgnoreCase(msg))
                            out.print(msg);
                        }
                            UserENT uent = (UserENT)session.getAttribute("logIn");    
                        if(uent!=null&&uent.isAdministrator()){
                            %>
                    </span>
                    <form action="InsertMovie" method="post">                                       
                        <table width="332" >
                              <tr>
                                <td class="label" width="120">Name: </td>
                                <td width="196"><input type="text" name="name" /></td>
                              </tr>
                              <tr>
                                <td class="label" valign="top">Director:</td>
                                <td>
                                    <label>
                                      <input type="text" name="director" />
                                  </label>
                                </td>

                              </tr>
                              <tr>
                                <td class="label">Start Date: </td>
                                <td><input type="text" name="sdate" /></td>
                              </tr>
                              <tr>
                                <td class="label">End date: </td>
                                <td><input type="text" name="edate" /></td>
                              </tr>
                              <tr>
                                <td class="label">Image: </td>
                                <td><input type="text" name="image" /></td>
                              </tr>
                              <tr>
                                <td class="label" valign="top">Abstract: </td>
                                <td><textarea name="abstract" rows="6" cols="30"></textarea></td>
                              </tr>                              
                              <tr>
                                <td colspan="2" align="center">
                                    <input type="submit" name="Submit" value="Add Movie" />
                                </td>
                              </tr>
                            </table>
                        </form>
                        <br/>
                        <%}%>
                        
                        
                        
                        
                        <table>
                        <% ArrayList<MovieENT> ml = (ArrayList<MovieENT>)session.getAttribute("allMovies"); 
                            UserENT u = (UserENT)session.getAttribute("logIn");
                            for(int i = 0 ; i < ml.size() ; i ++ ){
                            MovieENT movieENT = ml.get(i);
                        %>
                        <tr>
                            <td colspan="4">
                                <img src="images/pics/<%= movieENT.getImage()%>.jpg">
                            </td>
                        </tr>
                        <tr>
                            <td class="tableHeader">Name: </td>
                            <td class="userListItems"><%= movieENT.getName()%></td>
                            <td class="tableHeader">Director: </td>
                            <td class="userListItems"><%= movieENT.getDirector()%></td>
                        </tr>
                        <tr>
                            <td class="tableHeader">Start Date: </td>
                            <td class="userListItems"><%= movieENT.getStartDate()%></td>
                            <td class="tableHeader">End Date: </td>
                            <td class="userListItems"><%= movieENT.getEndDate()%></td>
                        </tr>
                        <tr>
                            <td colspan="4" class="tableHeader">Absract of the movie:</td>
                        </tr>
                        <tr>
                            <td colspan="4" class="userListItems"><%= movieENT.getSummary()%></td>
                        </tr>
                        <%if(u!=null&&u.isAuthorized()){%>
                        <form action="TicketReserved" method="post">
                        <tr bgcolor="131313" style="color:white;">
                            <td>Number of tickets:<br/><input name="ticketNo" type="text"> </td>
                            <td>Sans: 
                                <select name="interval">
                                    <option>12-14</option>
                                    <option>14-16</option>
                                    <option>16-18</option>
                                    <option>18-20</option>
                                    <option>20-22</option>
                                </select>
                             </td>
                             <%
                                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                                Date date = new Date();
                              %>
                             <td>Date: <input type="text" name="date" value="<%=dateFormat.format(date).replace('/', '-') %>"></td>
                             <td>
                                 <input type="hidden" name="username" value="<%=u.getUserName() %>">
                                 <input type="hidden" name="fname" value="<%=movieENT.getName() %>">
                                 <input type="submit" value="Reserve">
                             </td>
                         </tr>
                        </form>
                        <%}}%>
                        
                    </table>
                </td>
            </tr>
        </table>
    </body>
</html>
