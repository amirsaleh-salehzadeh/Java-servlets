/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlet;

import Business.BusinessLayer;
import Common.UserEntity;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class logIn extends HttpServlet {
   
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
            BusinessLayer bs = new BusinessLayer();
            
            UserEntity user = new UserEntity();
            user=bs.login(request.getParameter("userN"),request.getParameter("pass"));
            //get the user info check the validity of them, then based on the authority of
            //an user redirect it to the related page
            if(user!=null){
            request.getSession().setAttribute("user", user);
            if(user.getUsername().equalsIgnoreCase("admin")&&user.getPassword().equalsIgnoreCase("admin")){
                response.sendRedirect("admin.jsp");
            }else{
                response.sendRedirect("index.jsp?alert=welcome Mr|MRS "+user.getName()+" "+user.getFname());
            }
            }else{
                response.sendRedirect("index.jsp?alert=Invalid username or password");
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
