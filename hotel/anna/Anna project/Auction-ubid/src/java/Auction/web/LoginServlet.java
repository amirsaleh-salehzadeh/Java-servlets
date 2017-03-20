/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Auction.web;

import business.BSManager;
import common.usersENT;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author User
 */
public class LoginServlet extends HttpServlet {
   
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
            String user = request.getParameter("username");
            String password = request.getParameter("password");
            
            if("admin".equals(user) && "admin".equals(password)) {
                response.sendRedirect("admin.html");
            } else {
                System.out.println(user);
                System.out.println(password);
                
                BSManager bs = new BSManager();
                usersENT ENT = bs.login(user, password);
                
                if (ENT==null){
                    response.sendRedirect("login.html");
                    // response.sendRedirect("login.jsp?msg=failed");
                } else {
                      HttpSession session = request.getSession();
                      session.setAttribute("user", ENT);
                      response.sendRedirect("HomeServlet");
                }
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
