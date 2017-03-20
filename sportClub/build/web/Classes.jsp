<%@ page import="java.util.ArrayList" %>
<%@ page import="Obj.*" %>
<html>
<head>
<title>Classes</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body bgcolor="#500000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<!-- ImageReady Slices (theme.psd) -->
<table id="Table_01" width="800" border="0" cellpadding="0" align="center" cellspacing="0">
	<tr>
		<td colspan="2">
		<div style="position:absolute;" align="center">
                        <%
                       User u = (User)session.getAttribute("user");
                        if(u != null){%>
                            <a href="logOut" style="color:#fff;"> Logout</a>
                        <%   }
                        %>
                    </div>
                 <img src="images/index_01.jpg" width="800" height="160" alt="" >
                             
                    
                </td>
	</tr>
	<tr>
		<td width="152" align="left" valign="top">
			<table align="left" vspace="0" cellpadding="0" cellspacing="0">
				<tr>
					<td>
                                             <a href="index.jsp" style="border:0px;"><img border="0" src="images/index_02.jpg" width="150" height="40" alt=""></a>
					</td>
				</tr>
				<tr>
					<td>
                                             <a href="Classes"><img border="0" src="images/index_04.jpg" width="150" height="40" alt=""></a>
					</td>
				</tr>
				<tr>
					<td>
                                             <a href="register.jsp"> <img border="0" src="images/index_05.jpg" width="150" height="40" alt=""></a>
					</td>
				</tr>								
				<tr>
					<td>
                                             <a href="kickboxing.jsp"> <img border="0" src="images/index_06.jpg" width="150" height="40" alt=""></a>
					</td>
				</tr>
			</table>
	  </td>
            <td width="648" align="center" valign="top">
               
                        <%if(u!=null&&"admin".equalsIgnoreCase(u.getAdmin())){%>
                 <form method="post" action="reg?goTo=insertClass">
                     <table style="color:#FFCC00; font-size:20px;" align="center" vspace="0" cellpadding="0" cellspacing="0">
                            <tr>
                                 <td>
                                   Sport Type: </td><td><input type="text" name="ST">
                                 </td>
                            </tr>
                            <tr>
                                 <td>
                                   Start Date: </td><td><input type="text" name="SD">
                                 </td>
                            </tr>
                            <tr>
                                 <td>
                                    End date: </td><td><input type="text" name="ED">
                                 </td>
                            </tr>                            
                            <tr>
                                 <td>
                                    Time: </td><td><input type="text" name="TI">
                                 </td>
                            </tr>
                            <tr>
                                 <td>
                                    Capacity: </td><td><input type="text" name="CA">
                                 </td>
                            </tr>
                            <tr>
                                 <td>
                                     Days: </td><td><input type="text" name="DA">
                                 </td>
                            </tr>
                            <tr>
                                 <td>
                                     Tutor: </td><td><input type="text" name="TU">
                                 </td>
                            </tr>                            
                            <tr>
                                 <td colspan="2" align="center">
                            <input type="submit" value="Add Class">
                                 </td>
                            </tr>  
                    </table></form><%}%><br/>
                    
                    <table border="1" style="color:#FFCC00; font-size:20px;" align="center" vspace="0" cellpadding="0" cellspacing="0">
                                        <% if(request.getParameter("msg")!= null){%>
                                 
<tr>
					<td colspan="8" valign="top" align="center" style="color:#bbbb00; font-size:26px; font-weight:bold;">
                                                <%=request.getParameter("msg")%>
					</td>
              </tr>                                 
                                 <%}%>
                            <tr>
                                 <th nowrap>
                                   Sport Type 
                                 </th>
                                 <th>
                                   Start Date 
                                 </th>
                                 <th>
                                    End date 
                                 </th>
                                 <th>
                                    Time 
                                 </th><th>
                                    Capacity 
                                 </th><th>
                                     Days 
                                 </th><th>
                                     Tutor 
                                 </th>
                                 <%if(u!=null){%>
                                 <th>
                                     Register 
                                 </th>
                                 <%}%>
                            </tr>
                            <%
                           ArrayList<Clazz> arrayList = (ArrayList<Clazz>)session.getAttribute("classes");
                           
                           for (int i = 0; i<arrayList.size(); i++){
                               out.print("</td><td align=\"center\">");
                               out.print(arrayList.get(i).getSportType());
                               out.print("</td><td>");
                               out.print(arrayList.get(i).getStartDate());
                               out.print("</td><td>");
                               out.print(arrayList.get(i).getEndDate());
                               out.print("</td><td>");
                               out.print(arrayList.get(i).getTime());
                               out.print("</td><td align=\"center\">");
                               if(arrayList.get(i).getCapacity()>0){
                                out.print(arrayList.get(i).getCapacity());
                               }else {
                               out.print("Completed");
                               }
                               out.print("</td><td>");
                               out.print(arrayList.get(i).getDays());
                               out.print("</td><td>");
                               out.print(arrayList.get(i).getTutor());
                               out.print("</td>");
                               if(u!=null&&arrayList.get(i).getCapacity()>0)
                               out.print("<td><a href=\"Classes?goTo=registerClass&userID="+u.getID()+"&classID="+arrayList.get(i).getID()+"\">Register class</a></td>");
                               
                               out.print("</tr>");
                               }
                            %>
                    </table>
                 
            </td>
	</tr>
</table>
<!-- End ImageReady Slices -->
</body>
</html>