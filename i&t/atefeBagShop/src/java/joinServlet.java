/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;
import myProjectBusiness.myProjBs;
import objects.User;


/**
 *
 * @author Amirsaleh
 */
public class joinServlet extends HttpServlet {
   
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
           user.setBigName(request.getParameter("fname"));
           user.setEmail(request.getParameter("email"));
           user.setPassword(request.getParameter("pass"));
           
           
           myProjBs bs = new myProjBs();
           if(bs.insertUser(user)) {
            response.sendRedirect("join.jsp?alert=Thank you for your registration");
           }         
           else {
             response.sendRedirect("join.jsp?alert=Unsuccessful registration try it again later");
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
