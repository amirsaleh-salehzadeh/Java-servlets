/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import Business.bsManager;
import Common.RentENT;

import java.io.*;

import java.sql.Date;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Talieh Dastmalchi
 */
public class rentACar extends HttpServlet {
   
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
        	//1: setting parameters
            RentENT rent = new RentENT();
            rent.setsDate(Date.valueOf(request.getParameter("startDate")));
            rent.seteDate(Date.valueOf(request.getParameter("endDate")));
            rent.setUserName(request.getParameter("userName"));
            rent.setProductId(Integer.parseInt(request.getParameter("carId")));
          //2: calling method
            bsManager bs = new bsManager();
            boolean res = bs.rentCar(rent);
          //3: redirecting to pages
            if(res)
            	response.sendRedirect("rentSucceed.jsp?message=successful renting");
            else
            	response.sendRedirect("rentSucceed.jsp?message=the car rented before");
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
