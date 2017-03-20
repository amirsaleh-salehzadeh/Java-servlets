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
            UserENT user=new UserENT();
            user.setUserName(request.getParameter("username"));
            user.setPassWord(request.getParameter("password"));
            HttpSession session = request.getSession(true);
            MyProjBS bs = new MyProjBS();
            user =bs.logIn(user);    
            if(user!=null){
                session.setAttribute("logIn",user);
                if(user.isAdministrator()){
                    ArrayList<UserENT> ul =bs.getAllUsers();
                    session.setAttribute("usersList", ul);
                }
                response.sendRedirect("myPage.jsp");
            } else {
                response.sendRedirect("index.jsp?loginMessage=Invalid username and password");
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
