

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
*/


import java.io.*;
import java.net.*;

import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.*;
import business.projectBusinessLayer;
import common.User;


public class reg extends HttpServlet {
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, SQLException {          
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            User user=new User();
            user.setName(request.getParameter("name"));
            user.setFamilyName(request.getParameter("fname"));
            user.setUserName(request.getParameter("usern"));
            user.setPassWord(request.getParameter("pass"));
            user.setEmail(request.getParameter("email"));
            user.setAddress(request.getParameter("address"));
            user.setSecurity("user");
           projectBusinessLayer businessLayer =new projectBusinessLayer();
           if(businessLayer.register(user)) {
           response.sendRedirect("index.jsp?msg=Successful registration");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } 

    /** 
    * Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /** 
    * Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}

    

