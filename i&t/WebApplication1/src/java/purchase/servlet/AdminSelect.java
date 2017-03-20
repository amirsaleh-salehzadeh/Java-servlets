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


public class AdminSelect extends HttpServlet {
    private int j;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, SQLException {          
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        MyProjBs mybs =new MyProjBs();
        try {
            User user = new User();
            User user1 = new User();
            String[] s = request.getParameterValues("checkbox");
            String[] p = request.getParameterValues("delete");
            if (s!=null){
            for(j=0;j<s.length;j++){
            user.setUsern(s[j]);
            mybs.updateUser(user);
                        }}
            if (p!=null){
            for(j=0;j<p.length;j++){
            user1.setUsern(p[j]);
            mybs.deleteUser(user1);
            }}
            response.sendRedirect("UserControl");
          
        }                 
         finally { 
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

    

