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
             <%if(user!=null&&"true".equalsIgnoreCase(user.getWebManager())){%> 
                 <form method="post" action="addtea">
                     <table style="background-color:#ff161e; font-size:20px;" align="center" vspace="0" cellpadding="0" cellspacing="0">
                            <tr>
                                 <td>
                                   Tea Bag Producer: </td><td><input type="text" name="producer">
                                 </td>
                            </tr>
                            <tr>
                                 <td>
                                   Bags slices: </td><td><input type="text" name="numbers">
                                 </td>
                            </tr>
                            <tr>
                                 <td>
                                    Image path: </td><td><input type="text" name="image">
                                 </td>
                            </tr>
                            <tr>
                                 <td>
                                    Price: </td><td><input type="text" name="price">
                                 </td>
                            </tr>                            
                            <tr>
                                 <td colspan="2" align="center">
                                      <input type="submit" value="Insert Tea">
                                 </td>
                            </tr>  
                    </table>
                </form>
                <%}%>
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
                        <th>
                            Add to Basket
                        </th>
                    </tr>
                    <%
                           ArrayList<TEA> arrayList = (ArrayList<TEA>)session.getAttribute("teas");
                           
                           for (int i = 0; i<arrayList.size(); i++){
                           TEA tea = new TEA();
                           tea= arrayList.get(i);
                               out.print("<tr><form method=\"get\" name=\"myform"+tea.getName()+"\" action=\"addtobasket?\"><td><img width=\"130\" height=\"130\" src=\"images/teas/");
                               out.print(tea.getImage());
                               out.print(".jpg\"</td><td>");
                               out.print(tea.getName());
                               out.print("</td><td>");
                               out.print(tea.getPrice());
                               out.print("$</td><td>");
                               out.print(tea.getNumber());
                               out.print("</td><td><input type=\"text\" name=\"purchaseNumber\" value=\"0\"><input type=\"hidden\" name=\"param\" value=\""+tea.getName()+"\"></td>");
                               out.print("<td>&nbsp");
                               if(user != null){
                                out.print("<a onclick=\"document.myform"+tea.getName()+".submit();\" style=\"cursor: pointer;\">Add To Basket</a>");
                                }
                                out.print("</td></form></tr>");
                           }
                               %>
                    <%if(user != null && session.getAttribute("basketSession")!=null){%>       
                    <tr>
                        <td colspan="6" align="center">
                            <form action="gotobasket">
                                
                                <input type="submit" value="Go To Basket">
                            </form>
                        </td>
                    </tr>
                    <%}%>
                </table>
             </td>
	</tr>          
</table>
<!-- End ImageReady Slices -->
</body>
</html>