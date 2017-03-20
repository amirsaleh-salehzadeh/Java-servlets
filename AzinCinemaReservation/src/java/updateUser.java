/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Common.UserENT;
import MyProjBS.MyProjBS;
import java.io.*;
import java.net.*;

import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class updateUser extends HttpServlet {
   
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
            String[] admins = request.getParameterValues("isadmin");
            String[] actives = request.getParameterValues("isactive");
            MyProjBS bs = new MyProjBS();
            String administrators="";
            String isauthorized="";
            if(admins!=null){
                for(int i = 0 ; i < admins.length ; i ++){
                    administrators = administrators + admins[i] + ',';
                }
            }
            bs.setAdministrator(administrators);
            if(actives!=null){
                 for(int i = 0 ; i < actives.length ; i ++){
                    isauthorized = isauthorized+ actives[i] + ','; 
                }
            }
             bs.setAuthorizedUsers(isauthorized);
             HttpSession session = request.getSession();
             ArrayList<UserENT> ul =bs.getAllUsers();
             session.setAttribute("usersList", ul);
            response.sendRedirect("myPage?userName="+request.getParameter("userName"));
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
