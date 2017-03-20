/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;
import myProjectBusiness.myProjBs;
import objects.Bag;



/**
 *
 * @author Amirsaleh
 */
public class addBag extends HttpServlet {
   
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
           Bag bag= new Bag();
           bag.setName(request.getParameter("name"));
           bag.setDescription(request.getParameter("description"));
           bag.setPrice(Integer.parseInt(request.getParameter("price")));
           bag.setImage(request.getParameter("img"));
           
           
           myProjBs bs = new myProjBs();
           if(bs.insertBag(bag)) {
            response.sendRedirect("addBag.jsp?alert=Bag added successfully");
           }         
           else {
             response.sendRedirect("addBag.jsp?alert=Unsuccessful add bag");
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
