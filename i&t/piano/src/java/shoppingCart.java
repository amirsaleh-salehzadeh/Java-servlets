/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import CommonLayer.Piano;
import businessLayer.MyProjBs;
import java.io.*;
import java.net.*;

import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class shoppingCart extends HttpServlet {
   
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
        try {
            HttpSession session = request.getSession(true);
            ArrayList<Piano> pianosInBasket = (ArrayList<Piano>)session.getAttribute("addToBSession");
            ArrayList<Piano> pianos = new ArrayList<Piano>();
            MyProjBs bs = new MyProjBs();
            for(int i = 0; i < pianosInBasket.size(); i++){
               Piano piano = new Piano();
               piano = bs.searchForPiano(pianosInBasket.get(i).getProductName());
               pianos.add(piano);
             }
            session.setAttribute("shopList", pianos);
            response.sendRedirect("shoppingCart.jsp");
        } finally { 
            out.close();
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
