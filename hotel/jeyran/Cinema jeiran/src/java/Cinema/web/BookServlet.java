/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cinema.web;

import Cinema.bs.BSManager;
import Cinema.common.BookENT;
import Cinema.common.CustomerENT;
import java.io.*;
import java.net.*;


import java.sql.Date;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Jeiran
 */
public class BookServlet extends HttpServlet {
   
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
                HttpSession session=request.getSession();
                CustomerENT cent= (CustomerENT)session.getAttribute("customer");
                
                
                BookENT ent=new BookENT();
                ent.setCustomer_id(cent.getCustomer_id());
                ent.setTime(request.getParameter("time"));
                ent.setTotal_price(Integer.parseInt(request.getParameter("price"))*Integer.parseInt(request.getParameter("tickets")));
                ent.setQty(Integer.parseInt(request.getParameter("tickets")));
                ent.setDate(Date.valueOf(request.getParameter("date")));
                int movieid;
                movieid=Integer.parseInt(request.getParameter("movieId"));
                ent.setMovie_id(movieid);
                
                BSManager bs=new BSManager();
                bs.insertBooking(ent);
                
                response.sendRedirect("previewMovie?Movieid="+movieid);
                
            
           
            
            
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
