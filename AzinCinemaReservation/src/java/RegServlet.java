/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Common.UserENT;
import MyProjBS.MyProjBS;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class RegServlet extends HttpServlet {
   
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
           user.setName(request.getParameter("name"));
           user.setFamilyName(request.getParameter("fname"));
           user.setUserName(request.getParameter("usern"));
           user.setPassWord(request.getParameter("pass"));
           user.setTelephone(request.getParameter("tel"));
           user.setAddress(request.getParameter("address"));
           MyProjBS bs =new MyProjBS();
           if(bs.registerNewUser(user)) {
               response.sendRedirect("Register.jsp?msg=Thank you for your registration, Registration successfully done!");
           }else{
               response.sendRedirect("Register.jsp?msg=Unsuccessful registration please try again");
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
