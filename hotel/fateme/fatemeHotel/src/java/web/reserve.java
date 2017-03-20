/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import Business.projbs;
import Common.reserveENT;
import java.io.*;
import java.net.*;

import java.sql.Date;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class reserve extends HttpServlet {
   
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
            ent.setToDate(Date.valueOf(request.getParameter("todate")));
            ent.setFromDate(Date.valueOf(request.getParameter("fromdate")));
            ent.setUserName(request.getParameter("username"));
            ent.setRoomId(Integer.parseInt(request.getParameter("roomId")));
            projbs bS = new projbs();
            String message = "";
            if(bS.reserve(ent)){
                message="Reserved successfuly";
           }else{
                message="The book process faild";
           }
            response.sendRedirect("search.jsp?message="+message);
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
