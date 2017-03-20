package sales.servlet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.net.*;

import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.*;
import sales.common.Users;

/**
 *
 * @author delta
 */
public class RegServlet extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, SQLException {          
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String s = request.getParameter("action") != null ? request.getParameter("action") : "";
        if(s.equals("newMember")){       
       
        try {
            Users users=new Users();
            users.name = request.getParameter("name");
            users.fname = request.getParameter("family");
            users.username = request.getParameter("username");
            users.password = request.getParameter("password");
            users.address = request.getParameter("address");
            users.tel = request.getParameter("tel");
            users.email = request.getParameter("email");
            
            users.addUsers();
            
            getServletConfig().getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
        
        } finally { 
            out.close();
        }
        }
        
        
        if(s.equals("profile")){       
       
        try {
            Users users=new Users();
            users.id = Integer.parseInt(request.getParameter("id"));
            
            request.setAttribute("result", users.giveUser());
                        
            getServletConfig().getServletContext().getRequestDispatcher("/profile.jsp").forward(request, response);
        
        } finally { 
            out.close();
        }
        }
        
        
        if(s.equals("updateProfile")){       
       
        try {
            Users users=new Users();
            users.id = Integer.parseInt(request.getParameter("id"));
            users.name = request.getParameter("name");
            users.fname = request.getParameter("family");
            users.address = request.getParameter("address");
            users.password = request.getParameter("password");
            users.tel = request.getParameter("tel");
            users.email = request.getParameter("email");
            
            users.updateUser();
                        
            getServletConfig().getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
        
        } finally { 
            out.close();
        }
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
