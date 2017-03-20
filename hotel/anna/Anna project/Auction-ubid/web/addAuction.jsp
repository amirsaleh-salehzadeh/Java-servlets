<%-- 
    Document   : addAuction
    Created on : Feb 19, 2010, 6:13:20 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.ArrayList" %>
<%@ page import="common.categoryENT" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="addAuctionServlet?path=add" method="post">
            Title: <input type="text" name="title" /><br />
            Description: <input type="text" name="descp" /><br />
            Category:
            <select name="catid">
                <%
                    ArrayList<categoryENT> catlist = (ArrayList<categoryENT>) session.getAttribute("catlist");
                    for(int i = 0; i < catlist.size(); i++) {
                        out.println("<option value='"+catlist.get(i).getCategory_id()+"'>"+ catlist.get(i).getName() +"</option>");
                    }
                %>
            </select><br />
            Best Price: <input type="text" name="bPrice" /><br />
            End Date: <input type="text" name="endDate" /> (2010/10/10)<br />
            <input type="submit" value="add" />
        </form>
    </body>
</html>
