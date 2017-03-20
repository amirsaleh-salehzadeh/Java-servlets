/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cinema.web;

import Cinema.bs.BSManager;
import Cinema.common.SeatENT;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Jeiran
 */
public class AddSeatServlet extends HttpServlet {
   
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
           SeatENT ent = new SeatENT();
            try {    
                int seatnum = 0;
                
            seatnum = Integer.parseInt(request.getParameter("seatnumber"));
            ent.setSeat_number(seatnum);
             
            }catch(java.lang.NumberFormatException ex){
                //ex.printStackTrace();
                 }
            
            try {    
                int row = 0;
                
            row = Integer.parseInt(request.getParameter("row"));
            ent.setRow(row);
             
            }catch(java.lang.NumberFormatException ex){
                //ex.printStackTrace();
                 }
           
            try {
          
            BSManager bs = new BSManager();
             bs.insertSeat(ent);
             
             response.sendRedirect("AddSeat.jsp");
             
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
                request.getSession().setAttribute("AddSeatError", ex.getMessage());
                response.sendRedirect("AddSeat.jsp");
               
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
