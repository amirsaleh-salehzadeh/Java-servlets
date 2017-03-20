/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import businessLayer.myProjBS;
import common.RoomENT;
import common.bookENT;
import java.io.*;
import java.net.*;

import java.sql.Date;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class search extends HttpServlet {
   
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
            bookENT eNT = new bookENT();
            myProjBS bS = new myProjBS();
            eNT.setSDate(Date.valueOf(request.getParameter("sdate").replace("/","-")));
            eNT.setEDate(Date.valueOf(request.getParameter("edate").replace("/","-")));
            RoomENT rent = new RoomENT() ;
            rent = bS.searchForRooms(eNT,Integer.parseInt(request.getParameter("numOfRooms")));
            request.getSession().setAttribute("room", rent);
            request.getSession().setAttribute("book", eNT);
            response.sendRedirect("reserve.jsp");
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
