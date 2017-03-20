/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import BusinessLayer.BusinessLayer;
import Common.Dvd;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class addDvd extends HttpServlet {
   
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
           Dvd dvd = new Dvd();
           dvd.setName(request.getParameter("name"));
           dvd.setDescription(request.getParameter("description"));
           dvd.setImage(request.getParameter("image"));
           BusinessLayer bl = new BusinessLayer();
           
           if(bl.addDvd(dvd)){
               response.sendRedirect("shop.jsp?msg=Dvd added Successfully");
           } else {
               response.sendRedirect("shop.jsp?msg=Not successed");
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
