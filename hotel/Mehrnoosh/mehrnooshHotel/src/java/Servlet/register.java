/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlet;

import Business.bsManager;
import Common.PassengerENT;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class register extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            bsManager manager = new bsManager();
            PassengerENT passengerENT = new PassengerENT();
            passengerENT.setName(request.getParameter("name"));
            passengerENT.setFName(request.getParameter("fname"));
            passengerENT.setAddress(request.getParameter("address"));
            passengerENT.setEmail(request.getParameter("email"));
            passengerENT.setPassword(request.getParameter("password"));
            passengerENT.setPhoneNo(request.getParameter("phone"));
            passengerENT.setUserName(request.getParameter("usern"));
            boolean isAdmin = false;
            if(request.getParameter("admin")!=null&&request.getParameter("admin").equalsIgnoreCase("true"))
                isAdmin = true;
            passengerENT.setAdmin(isAdmin);
            boolean registered = manager.register(passengerENT);
            if(registered){
                response.sendRedirect("register.jsp?message=Thanks for your registration");
            }else{
                response.sendRedirect("register.jsp?msg=Registration faild");
            }
            
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
    * Handles the HTTP <code>GET</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
    * Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
    * Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
