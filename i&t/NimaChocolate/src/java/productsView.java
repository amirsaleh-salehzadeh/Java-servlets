/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import business.projectBusinessLayer;
import java.io.*;
import java.net.*;

import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import common.Chocolate;
/**
 *
 * @author 844498
 */
public class productsView extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      try{
        projectBusinessLayer businessLayer = new projectBusinessLayer();
        HttpSession session = request.getSession(true);
        
    ArrayList<Chocolate> list = new ArrayList<Chocolate>();
    Chocolate c = new Chocolate();
    String brandName;
    if(request.getParameter("brandName") == null){
    brandName = (String) session.getAttribute("brandName");
    } else {
    brandName = request.getParameter("brandName");
    }
    c.setBrandName(brandName);
    list = businessLayer.allChocolates(c);
    
    session.setAttribute("chocolateList",list);

     response.sendRedirect("chocolateGallery.jsp");
      }catch(Exception ex){ex.printStackTrace();}   
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
