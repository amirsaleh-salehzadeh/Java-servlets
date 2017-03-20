/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import Business.projbs;
import Common.userENT;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class login extends HttpServlet {
   
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
            projbs bs = new projbs();
            userENT user = new userENT();
            String UN = request.getParameter("usern");
            String pass = request.getParameter("password");
            user = bs.login(UN,pass);
            if(user!=null){
                request.getSession().setAttribute("user", user);
                if(user.getUserName().equalsIgnoreCase("administrator")&&user.getPassword().equalsIgnoreCase("admin")){
                    response.sendRedirect("administrator.jsp");
                }else{
                    response.sendRedirect("login.jsp?message=welcome "+UN);
                }
            }else{
                response.sendRedirect("login.jsp?message=Incorrect username or password");
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
