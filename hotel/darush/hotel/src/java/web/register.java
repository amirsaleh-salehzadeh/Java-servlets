/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import businessLayer.myProjBS;
import common.userENT;
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
            
            myProjBS bl = new myProjBS();
            userENT ent = new userENT();
            ent.setName(request.getParameter("name"));
            ent.setFName(request.getParameter("fname"));
            ent.setEmail(request.getParameter("email"));
            ent.setPassword(request.getParameter("password"));
            ent.setPhoneNo(request.getParameter("phone"));
            ent.setUserName(request.getParameter("usern"));
            
            boolean registered = bl.registerUser(ent);
            if(registered){
                response.sendRedirect("register.jsp?msg=successfully registered");
            }else{
                response.sendRedirect("register.jsp?msg=an error occured during the save process");
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
