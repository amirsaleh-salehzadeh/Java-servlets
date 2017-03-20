/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import business.business;
import Common.UserEntity;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class registerUser extends HttpServlet {
   
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
            UserEntity user = new UserEntity();
           user.setName(request.getParameter("name"));
           user.setFname(request.getParameter("fname"));
           user.setEmail(request.getParameter("email"));
           user.setPassword(request.getParameter("pass"));
           user.setUsername(request.getParameter("uname"));
           
           business bs = new business();
           if(bs.insertUser(user)) {
            response.sendRedirect("index.jsp?alert=Thank for your registaration Mr/Mrs "+user.getName()+" " +user.getFname());
           }         
           else {
             response.sendRedirect("index.jsp");
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
