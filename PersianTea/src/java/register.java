/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import COMMON.USER;
import DataMngPackage.dataMNG;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class register extends HttpServlet {
   
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
            USER user=new USER();
            user.setName(request.getParameter("name"));
            user.setFamilyName(request.getParameter("FN"));
            user.setPassword(request.getParameter("password"));
            user.setEmail(request.getParameter("email"));
            user.setAddress(request.getParameter("address"));
            String WM=request.getParameter("manager");
            if(WM==null){
                WM = "user";
            }
            user.setWebManager(WM);
            user.setTelephone(request.getParameter("tel"));
            
           dataMNG g = new dataMNG();
           if(g.register(user)) {
           response.sendRedirect("index.jsp?msg=Successful registration");
           }         
           else {
           response.sendRedirect("index.jsp?msg=Unsuccessful registration contact the web manager");
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
