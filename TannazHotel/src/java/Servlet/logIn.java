/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlet;

import Business.myHotelBusinessLayer;
import Common.PassengerENT;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class logIn extends HttpServlet {
   
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
            String u = request.getParameter("userN");
            String p = request.getParameter("pass");
            PassengerENT eNT = new PassengerENT();
            eNT=hbl.login(u,p);
            if(eNT!=null){
                request.getSession().setAttribute("user", eNT);
                if(eNT.isAdmin()){
                    response.sendRedirect("passengerList");
                }else{
                    response.sendRedirect("index.jsp?msg=welcome Mr/MRS "+eNT.getName()+" "+eNT.getFName());
                }
                
            }else{
                response.sendRedirect("index.jsp?msg=Invalid username or password");
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