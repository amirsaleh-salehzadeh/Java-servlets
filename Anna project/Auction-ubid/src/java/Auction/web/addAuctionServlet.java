/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Auction.web;

import business.BSManager;
import common.auctionENT;
import common.categoryENT;
import common.usersENT;
import java.io.*;
import java.net.*;

import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Home
 */
public class addAuctionServlet extends HttpServlet {
   
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
            BSManager bs = new BSManager();
            String path = request.getParameter("path");
            HttpSession session = request.getSession();
            
            if("add".equals(path)) {
                usersENT ent = (usersENT) session.getAttribute("user");
                auctionENT a = new auctionENT();
                a.setBasePrice(Float.parseFloat(request.getParameter("bPrice")));
                a.setCategory_id(Integer.parseInt(request.getParameter("catid")));
                a.setDesc(request.getParameter("descp"));
                a.setEndDate(request.getParameter("endDate"));
                a.setStartDate("2010/10/09");
                a.setImg("");
                a.setIsActive(0);
                a.setTitle(request.getParameter("title"));
                a.setUser_id(ent.getUser_id());
                bs.insertauction(a);
            }
            
            ArrayList<categoryENT> catlist = bs.categorylist();
            session.setAttribute("catlist", catlist);
            response.sendRedirect("addAuction.jsp");
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
