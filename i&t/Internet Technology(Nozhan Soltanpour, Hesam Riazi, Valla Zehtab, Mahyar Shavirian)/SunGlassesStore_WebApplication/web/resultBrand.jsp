<HTML>
    <%@ page import = "java.sql.*,java.text.*,java.util.*,java.net.*" %>
<HEAD>
<meta http-equiv=Content-Type content="text/html;  charset=ISO-8859-1">
<TITLE>Brand Result</TITLE>

<link rel="stylesheet" href="style.css" type="text/css">

<style>
<!--	
A 		{ color: #C0C0C0; font-weight:bold; text-decoration: none; }		
A:link		{ color: #C0C0C0; font-weight:bold; text-decoration: none; }
A:visited		{ color: #C0C0C0; font-weight:bold; text-decoration: none; }	
A:active		{ color: #358391; font-weight:bold; text-decoration: none;  }	
A:hover		{ color: #358391; font-weight:bold; text-decoration: none;  }

body, td, tr{		
font-family: verdana;		
color:#FFFFFF;		
font-size:11;		
font-weight:normal;
}


</style>



<style type="text/css">
<!--
.style1 {font-family: "Times New Roman", Times, serif}
.style2 {font-size: 16px}
.style3 {font-size: 36px}
-->
</style>

<script language="JavaScript" type="text/JavaScript" src="java/javascript.js"></script>
<SCRIPT TYPE="text/javascript" LANGUAGE="JavaScript" SRC="java/base.js"></SCRIPT>
<script language="JavaScript" src="java/tabel.js" type="text/javascript"></script>


</HEAD>
<BODY background="img/bg.gif" bgcolor="#202020" topmargin="0" leftmargin="0">
    
      
    
<center>
<table bgcolor="#202020" width="776" height="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
<td width="3" bgcolor="#FFFFFF"></td>
<td width="770" valign="top">
 
    <table bgcolor="#202020" width="770" border="0" cellspacing="0" cellpadding="0">
    <tr>
    <td height="32" align="right" valign="middle">&nbsp;</td> 
    </tr>
    <tr>
    <td height="132" align="left" valign="middle" background="img/headerback.jpg"><h1 class="style3"><span class="style1"><strong><em>Sunglass Persia</em></strong></span></h1>
      <br>      </td> 
    </tr>
    <tr>
    <td height="47" align="right">
        <form action="ProdServlet?action=quickSearch" method="post"><span class="style1"><span class="style2">Quick Search</span> 
      <input name="q" type="text"><input name="Go" type="submit" value="Go"></span>
    </form> 
    </td> </tr>
    <tr>
    <td height="32" align="left" valign="middle" background="img/bluebg.gif"><img src="img/pixel.gif" border="0" width="15" height="1">
        <a href="shop.html">Shop</a> | <a href="contact us.html">Contact us</a> | <a href="advanced_search.jsp">Advanced Search </a>|
        <%
                                int loginid=0;if(session.getAttribute("loginid")!=null){
                                    loginid=Integer.parseInt((String)session.getAttribute("loginid"));
                                }else loginid=0;                   
                                %>
                                
                                <%if(loginid>0){%><a href="LoginServlet?action=logout">Logout</a><%}else{%><a href="login.jsp">Login</a>
                                 <%}%>
                                
        
        </td> 
    </tr>
    </table>
 
    <table bgcolor="#464646" width="770" height="350" border="0" cellspacing="0" cellpadding="0">
    <tr>
    <td width="222" bgcolor="#202020" align="left" valign="top">
    
       <table width="222" border="0" cellspacing="0" cellpadding="0" bgcolor="#202020">
        <tr>
        <td height="24" width="222" valign=middle>&nbsp; <b>Categories</b></td>
        </tr>
        <tr>
        <td width="222" height=3 bgcolor="#ffffff"></td>
        </tr>
        <tr>
        <td height="24" width="222" valign=middle onMouseOver="javascript:taust(this,'#0F363F')" onMouseOut="javascript:taust(this,'#202020')">&nbsp; <a href="ProdServlet?action=searchBrand&brand=ray-ban">» RAY-BAN</a></td>
        </tr>
        <tr>
        <td width="222" height=3 bgcolor="#ffffff"></td>
        </tr>
        <tr>
        <td height="24" width="222" valign=middle onMouseOver="javascript:taust(this,'#0F363F')" onMouseOut="javascript:taust(this,'#202020')">&nbsp; <a href="ProdServlet?action=searchBrand&brand=prada">» PRADA</a></td>
        </tr>
        <tr>
        <td width="222" height=3 bgcolor="#ffffff"></td>
        </tr>
        <tr>
        <td height="24" width="222" valign=middle onMouseOver="javascript:taust(this,'#0F363F')" onMouseOut="javascript:taust(this,'#202020')">&nbsp; <a href="ProdServlet?action=searchBrand&brand=d_g">» D &amp; G</a></td>
        </tr>
        <tr>
        <td width="222" height=3 bgcolor="#ffffff"></td>
        </tr>
        <tr>
        <td height="24" width="222" valign=middle onMouseOver="javascript:taust(this,'#0F363F')" onMouseOut="javascript:taust(this,'#202020')">&nbsp; <a href="ProdServlet?action=searchBrand&brand=robertocavalli">» ROBERTO CAVALLI</a></td>
        </tr>
        <tr>
        <td width="222" height=3 bgcolor="#ffffff"></td>
        </tr>
        <tr>
        <td height="24" width="222" valign=middle onMouseOver="javascript:taust(this,'#0F363F')" onMouseOut="javascript:taust(this,'#202020')">&nbsp; <a href="ProdServlet?action=searchBrand&brand=gucci">» GUCCI</a></td>
        </tr>
        <tr>
        <td width="222" height=3 bgcolor="#ffffff"></td>
        </tr>
        <tr>
        <td height="24" width="222" valign=middle onMouseOver="javascript:taust(this,'#0F363F')" onMouseOut="javascript:taust(this,'#202020')">&nbsp; <a href="ProdServlet?action=searchBrand&brand=dior">» DIOR</a></td>
        </tr>
        <tr>
        <td width="222" height=3 bgcolor="#ffffff"></td>
        </tr>
        <tr>
        <td height="24" width="222" valign=middle></td>
        </tr>
        <tr>
        <!--<td height="24" width="222" valign=middle onMouseOver="javascript:taust(this,'#0F363F')" onMouseOut="javascript:taust(this,'#202020')">&nbsp; <a href="admin.html">» Administrator</a></td>-->
        </tr>
        </table>    </td>
        
        <%
        String brand=(String)request.getAttribute("brand")!=null ?(String)request.getAttribute("brand"):"";
        ResultSet result=(ResultSet)request.getAttribute("result");
        %>
     
    <form action="ProdServlet?action=addToCart" method="post">      
    <td width="3" bgcolor="#FFFFFF" align="right" valign="top"></td>
    <td width="10" align="left" valign="top"><img src="img/shadow1.gif" border="0" width="10" height="32"></td> 
    <td width="525" align="left" valign="top"><img src="img/shadow1.gif" border="0" width="525" height="32"><br>
    <p align="center"><strong><%=brand.toUpperCase()%></strong></p>

<p align="center"><input type="submit" name="addToCart" id="button" value="Add To Cart">&nbsp;</p>
    

<%      
    result.last();int count=result.getRow();result.beforeFirst();
    int looper=0;
    while(result.next()){looper++;
%>      
    <p>    
        <img src="<%=result.getString("img1")%>"/>
        <img src="<%=result.getString("img2")%>"/>
        <a href="editProduct.jsp?id=<%=result.getString("id")%>&brand=<%=result.getString("brand")%>&model=<%=result.getString("model")%>&unitPrice=<%=result.getString("unitPrice")%>&img1=<%=result.getString("img1")%>&img2=<%=result.getString("img2")%>">Edit</a> - 
         <a href="deleteProduct.jsp?&id=<%=result.getString("id")%>&brand=<%=result.getString("brand")%>&model=<%=result.getString("model")%>&unitPrice=<%=result.getString("unitPrice")%>&img1=<%=result.getString("img1")%>&img2=<%=result.getString("img2")%>">Delete</a>
    </p>
        <%=result.getString("model")%>, <%=result.getString("unitprice")%>&pound;
        <input type="hidden" name="<%="id"+looper%>" value=<%=result.getString("id")%> >
        <input type="checkbox" name="<%="choosed"+looper%>" >
        <input type="text" name="<%="qty"+looper%>" >
    <%}%>
    <input type="hidden" name="count" value=<%=String.valueOf(count)%>>
<p align="center"><input type="submit" name="addToCart" id="addToCart" value="Add To Cart">&nbsp;</p>
</form>
      <p align="center">&nbsp;</p></td>  
    <td width="10" align="left" valign="top"><img src="img/shadow1.gif" border="0" width="10" height="32"></td> 
    </tr>
    </table> 
 
    <table bgcolor="#464646" width="770" height="32" border="0" cellspacing="0" cellpadding="0">
    <tr>
    <td width="222" bgcolor="#202020" align="left" valign="top"></td>
    <td width="3" bgcolor="#FFFFFF" align="right" valign="top"></td>
    <td width="10" align="left" valign="top"><img src="img/shadow2.gif" border="0" width="10" height="32"></td> 
    <td width="525" align="left" valign="top"><img src="img/shadow2.gif" border="0" width="525" height="32"></td>  
    <td width="10" align="left" valign="top"><img src="img/shadow2.gif" border="0" width="10" height="32"></td> 
    </tr>
    </table>
 
    <table bgcolor="#202020" width="770" border="0" cellspacing="0" cellpadding="0">
    <tr>
    <td height="32" width="30" align="left" valign="middle" background="img/bluebg.gif"><img src="img/pixel.gif" border="0" width="5" height="1"></td>
    <td height="32" width="740" align="right" valign="middle" background="img/bluebg.gif"><div align="center">&copy; 2008 - All rights reserved by Sunglass Persia&nbsp; </div></td> 
    </tr>
    </table>  

</td>
<td width="3" bgcolor="#FFFFFF"></td>
</tr>
</table>
</center>


<div style="font-size: 0.8em; text-align: center; margin-top: 1.0em; margin-bottom: 1.0em;"></div>
</form>
</body>
</HTML>
