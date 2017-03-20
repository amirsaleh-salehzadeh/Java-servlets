/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlet;

import Business.bsManager;
import Common.ReserveENT;
import Common.RoomENT;
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
           ReserveENT rent = new ReserveENT();
           bsManager bs = new bsManager();
           RoomENT ent = new RoomENT();
           if(request.getParameter("type")!=null){
               rent.setSDate(Date.valueOf(request.getParameter("startDate")));
               rent.setEDate(Date.valueOf(request.getParameter("endDate")));
               rent.setNumOfBeds(Integer.parseInt(request.getParameter("numberOfBeds")));
               rent.setRoomType(request.getParameter("type"));

               ent = bs.searchForRoom(rent);
               if(ent.getNumRooms()<=0){
               request.getSession().setAttribute("reserveSession", null);
                request.getSession().setAttribute("roomSession", null);
                response.sendRedirect("reserve.jsp?message=Sorry right now there is no available of the searched room");
               }else{
               request.getSession().setAttribute("reserveSession", rent);
               request.getSession().setAttribute("roomSession", ent);
               response.sendRedirect("reserve.jsp");
               }
               
           }else{
                request.getSession().setAttribute("reserveSession", null);
                request.getSession().setAttribute("roomSession", null);
                response.sendRedirect("reserve.jsp");
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
