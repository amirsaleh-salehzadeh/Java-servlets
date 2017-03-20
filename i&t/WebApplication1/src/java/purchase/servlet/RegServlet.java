package purchase.servlet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
*/


import java.io.*;
import java.net.*;

import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.*;
import purchase.bs.MyProjBs;
import purchase.common.User;


public class RegServlet extends HttpServlet {
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, SQLException {          
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            User user=new User();
            user.setName(request.getParameter("name"));
            user.setFname(request.getParameter("fname"));
            user.setUsern(request.getParameter("usern"));
            user.setPass(request.getParameter("pass"));
            user.setTel(request.getParameter("tel"));
            user.setEmail(request.getParameter("email"));
            user.setAccess("user");
            
           MyProjBs mybs =new MyProjBs();
           if(mybs.register(user)) {
           response.sendRedirect("main.jsp?msg=Successful registration");
           }         
           else {
           response.sendRedirect("Register.jsp?msg2=Unsuccessful registration try again");
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

    
