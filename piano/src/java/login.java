/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import CommonLayer.User;
import businessLayer.MyProjBs;
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
    try {
            User user=new User();
            user.setUserName(request.getParameter("username"));
            user.setPassWord(request.getParameter("password"));
            HttpSession session = request.getSession(true);
            MyProjBs bs = new MyProjBs();
            User u = new User();
            u = bs.login(user);    
            if(u.getName()!=null){
             session.setAttribute("login",u);
               response.sendRedirect("shopView");
            }else{
                response.sendRedirect("index.jsp?alert=Invalid username or password");
            }
             
         
        } finally { 
            out.close();
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
