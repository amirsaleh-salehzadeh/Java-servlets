<%@ page import="java.util.ArrayList" %>
<%@ page import="COMMON.*" %>
<html>
<head>
<title>HOME</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    <script type="text/javascript">
        function submitform(x) {
            this.form.submit();
        }
    </script> 
</head>
<body bgcolor="#ff581e" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<!-- ImageReady Slices (Untitled-1) -->
<table id="Table_01" width="920" align="center" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="3">
			<img src="images/Untitled-1_01.jpg" width="920" height="202" alt="">
                                      <% 
            USER user =(USER)session.getAttribute("user");
            if(user != null){


        %>  
    <div style="font-size:18px;" >
         <a href="logOut" >Log Out</a>
     </div>
     <%}%>
		</td>
	</tr>
	<tr style="font-weight:bold; color: #fff;">
            <td align="center">
                 <a href="index.jsp">HOME</a>
            </td>
            <td align="center">
                 <a href="AllTeas">SHOP</a>
            </td>
            <td align="center">
                 <a href="register.jsp">USER</a>
            </td>
	</tr> 

        <%if(request.getParameter("msg") != null ){%>
           
         <tr style="font-weight:bold; font-size:20px; color: #000;">
             <td colspan="3" align="center">						
                <%
                if("null".equalsIgnoreCase(request.getParameter("msg"))){
                String x = request.getParameter("msg");
                x="";
                out.println(x);
                }
                %>
             </td>
	</tr>      
      
      <%  }
        %>
        
	<tr style="font-weight:bold; color: #000;">
             <td colspan="3" style="">						
                <table align="center" border="1">
                    <tr>
                        <th>
                            Image
                        </th>
                        <th>
                            Producer Name
                        </th>
                        <th>
                            Price
                        </th>                        
                        <th>
                            Contains (Bags)
                        </th>                        
                        <th>
                            Numbers
                        </th>                                                
                    </tr>
                    <%
                           ArrayList<TEA> arrayList = (ArrayList<TEA>)session.getAttribute("basketTeas");
                                    int totalPrice =0;
                                   for (int i = 0; i < arrayList.size(); i++){
                                       TEA tea = new TEA();
                                       tea= arrayList.get(i);
                                       
                                       out.print("<tr><td><img width=\"130\" height=\"130\" src=\"images/teas/");
                                       out.print(tea.getImage());
                                       out.print(".jpg\"</td><td>");
                                       out.print(tea.getName());
                                       out.print("</td><td>");
                                       out.print(tea.getPrice());
                                       out.print("$</td><td>");
                                       out.print(tea.getNumber());
                                       out.print("</td><td>");
                                       out.print(tea.getPurchasedNumber());
                                       out.print("</td></tr>");
                                       totalPrice = totalPrice + (tea.getPrice() * tea.getPurchasedNumber()); 

                                   }
                               
                               %>
                               <tr>
                                   <td colspan="5" align="center" style="font-size: 18">
                                       Total Price = <%= totalPrice%>
                                   </td>
                               </tr>
                               <tr>
                                   <td colspan="5" align="center" style="font-size: 18">
                                       <form action="confirmation" method="post">
                                           <input type="hidden" name="userEmail" value="<%= user.getEmail()%>">
                                           <input type="hidden" name="totalPrice" value="<%= totalPrice%>">
                                           <input type="submit" value="Confirm Purchase">
                                       </form>
                                   </td>
                               </tr>
                </table>
             </td>
	</tr>          
</table>
<!-- End ImageReady Slices -->
</body>
</html>