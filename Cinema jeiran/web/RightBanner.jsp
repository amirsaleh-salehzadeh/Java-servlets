<%-- 
    Document   : RightBanner
    Created on : Feb 7, 2010, 8:00:16 PM
    Author     : Jeiran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="Cinema.common.CustomerENT" %>


<div id="bannerR" class="fontMenu">
				<div class="banR_span"> 
					<span class="test"><p>
                                             <% if(session.getAttribute("customer")==null) { %>
                                                <a  href="SignIn.jsp"> Sign In </a>
                                                <%} else { 
                                                 CustomerENT ent = (CustomerENT) session.getAttribute("customer");
                                                 out.println("Welcome " + ent.getName()); %>
                                                    <a href="SignOut.jsp">Sign Out</a>
                                                <% } %>
                                        </p> </span>
					<a  href="#">VIEW Booking</a><br />        
                                        <a  href="#">MY ACCOUNT</a><br />  
                                        <a  href="#">FIND Movies</a><br />
                                        <a  href="#">CUSTOMER SERVICES</a>	
				</div>
			</div>
                        
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   