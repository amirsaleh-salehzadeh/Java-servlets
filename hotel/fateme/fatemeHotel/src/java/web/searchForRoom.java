/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import Business.projbs;
import Common.reserveENT;
import Common.roomENT;
import java.io.*;
import java.net.*;

import java.sql.Date;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class searchForRoom extends HttpServlet {
   
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
            reserveENT ent = new reserveENT();
            projbs bS = new projbs();
            ent.setFromDate(Date.valueOf(request.getParameter("startDate")));
            ent.setToDate(Date.valueOf(request.getParameter("endDate")));
            roomENT rent = new roomENT() ;
            int number = Integer.parseInt(request.getParameter("numOfRooms"));
            rent = bS.searchForRooms(ent,number);
            request.getSession().setAttribute("room", rent);
            request.getSession().setAttribute("reserve", ent);
            response.sendRedirect("search.jsp");
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
