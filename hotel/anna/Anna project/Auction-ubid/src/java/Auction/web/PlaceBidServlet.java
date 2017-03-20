/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Auction.web;

import business.BSManager;
import common.bidENT;
import java.io.*;
import java.net.*;

import java.sql.Date;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author User
 */
public class PlaceBidServlet extends HttpServlet {
   
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
            int user_id = Integer.parseInt(request.getParameter("user_id"));
            int auction_id = Integer.parseInt(request.getParameter("auction_id"));
            
            Float price =Float.parseFloat(request.getParameter("price")) ;
            
            bidENT bids = new bidENT() ;
            bids.setAuction_id(auction_id);
            bids.setUser_id(user_id);
            bids.setRegister_date(Date.valueOf(request.getParameter("register_date")));
            bids.setPrice(price);
            
            BSManager bs = new BSManager();
            bs.insertBid(bids);
            response.sendRedirect("home.html");
            
            
            
            
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
