/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package purchase.servlet;

import purchase.bs.MyProjBs;
import java.io.*;
import java.net.*;

import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import purchase.common.Product;

/**
 *
 * @author 844498
 */
public class ShopServlet extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      try{
        MyProjBs bs = new MyProjBs();
        HttpSession session = request.getSession(true);
        
    ArrayList<Product> pl=new ArrayList<Product>();
    pl=bs.listProduct();
    
    session.setAttribute("productlist",pl );

     response.sendRedirect("Shop.jsp");
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
