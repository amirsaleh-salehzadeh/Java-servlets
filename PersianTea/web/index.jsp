<%@ page import="COMMON.*" %>
<html>
<head>
<title>HOME</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
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

        <%
        if(request.getParameter("msg") != null){%>
           
         <tr style="font-weight:bold; font-size:20px; color: #000;">
             <td colspan="3" align="center">						
                <%out.println(request.getParameter("msg"));%>
             </td>
	</tr>      
      
      <%  }
        %>
        
	<tr style="font-weight:bold; color: #000;">
             <td colspan="3" style="background-color:#ff161e;">						
             <form action="logIn" method="post">
                Email:<input name="email" type="text">
                Password:<input name="password" type="password">
                <input type="submit" value="logIn">
            </form></td>
	</tr> 
         <tr>
             <td colspan="3" align="center">
                 Tea is the agricultural product of the leaves, leaf buds, and internodes of the Camellia sinensis plant, prepared and cured by various methods. "Tea" also refers to the aromatic beverage prepared from the cured leaves by combination with hot or boiling water, and is the common name for the Camellia sinensis plant itself.<br/>

After water, tea is the most widely-consumed beverage in the world. It has a cooling, slightly bitter, astringent flavour which many enjoy.<br/>

The four types of tea most commonly found on the market are black tea, oolong tea, green tea and white tea, all of which can be made from the same bushes, processed differently, and, in the case of fine white tea, grown differently.<br/> Pu-erh tea, a post-fermented tea, is also often classified as amongst the most popular types of tea.<br/>

The term "herbal tea" usually refers to an infusion or tisane of leaves, flowers, fruit, herbs or other plant material that contains no Camellia sinensis.<br/> The term "red tea" either refers to an infusion made from the South African rooibos plant, also containing no Camellia sinensis, or, in Chinese, Korean, Japanese and other East Asian languages, refers to black tea.
             </td>
         </tr>
</table>
<!-- End ImageReady Slices -->
</body>
</html>