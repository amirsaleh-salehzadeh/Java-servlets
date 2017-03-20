/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlet;

import Business.myHotelBusinessLayer;
import Common.RoomENT;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class registerRoom extends HttpServlet {
   
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
            myHotelBusinessLayer hbl = new myHotelBusinessLayer();
            RoomENT rent = new RoomENT();
            rent.setBeds(Integer.parseInt(request.getParameter("numberOfBeds")));
            rent.setImage(request.getParameter("image"));
            rent.setNumberOfRooms(Integer.parseInt(request.getParameter("numberOfRooms")));
            rent.setPrice(Integer.parseInt(request.getParameter("price")));
            rent.setRoomType(request.getParameter("roomType"));
            boolean registered = hbl.registerRoom(rent);
            if(registered){
                response.sendRedirect("reserve.jsp?msg=successfully registered");
            }else{
                response.sendRedirect("reserve.jsp?msg=an error occured during the save process");
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
