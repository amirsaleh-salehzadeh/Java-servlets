/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import BusinessLayer.BusinessLayer;
import Common.User;
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
           User user=new User();
           user.setName(request.getParameter("name"));
           user.setFamilyName(request.getParameter("fname"));
           user.setUserName(request.getParameter("usern"));
           user.setPassWord(request.getParameter("pass"));
           user.setTelephone(Integer.parseInt(request.getParameter("tel")));
           user.setAddress(request.getParameter("address"));
           BusinessLayer bl =new BusinessLayer();
           if(bl.register(user)) {
            response.sendRedirect("register.jsp?msg=Thank you for your registration");
           }         
           else {
             response.sendRedirect("register.jsp?msg=Unsuccessful registration try again");
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
