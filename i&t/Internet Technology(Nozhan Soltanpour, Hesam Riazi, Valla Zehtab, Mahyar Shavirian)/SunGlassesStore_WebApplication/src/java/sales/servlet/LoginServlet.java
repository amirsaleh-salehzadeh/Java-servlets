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
import javax.swing.JOptionPane;

import sales.common.Users;
/**
 *
 * @author hesam
 */
public class LoginServlet extends HttpServlet {
    
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, SQLException {
          try {
       //JOptionPane.showMessageDialog(null, "we are in LoginServlet!");
       HttpSession session = request.getSession(true);
       
       String user = request.getParameter("Username");
       String pass = request.getParameter("Password");
       System.out.println(user);
       System.out.println(pass);
       String s = request.getParameter("action") != null ? request.getParameter("action") : "";

       if(s.equals("doLogin")){       
           int i=Users.checkUser(user, pass);
           new Users(i);
            if(i != 0){
                session.setAttribute("loginid",String.valueOf(i));                
                session.setAttribute("user",user);
                System.out.println("Salaam! No. "+session.getAttribute("user"));                            
                response.sendRedirect("home.jsp");           
           }else{
               request.setAttribute("message","Error: Username or Password incorrect");
               System.out.println(request.getAttribute("message"));                            
               getServletConfig().getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
               //response.sendRedirect("login.jsp");                              
           }
       }
       
        if(s.equals("logout"))
        {
            request.getSession().invalidate();
            request.setAttribute("message", "<center>Logout successful!</center>");
            getServletConfig().getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
        } 
               
           
           
       
        } finally { 
            
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

    private boolean checkUser(String user, String pass) {
        return true;
        //throw new UnsupportedOperationException("Not yet implemented");
    }
    
    // </editor-fold>
}
