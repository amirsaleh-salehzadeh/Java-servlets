<%-- 
    Document   : SignOut
    Created on : Feb 6, 2010, 12:53:07 PM
    Author     : Jeiran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<%
    session.invalidate();
    response.sendRedirect("Home.jsp");
  %>