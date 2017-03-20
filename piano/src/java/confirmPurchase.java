

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
*/


import businessLayer.MyProjBs;
import java.io.*;
import java.net.*;

import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.*;


public class confirmPurchase extends HttpServlet {
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, SQLException {          
        response.setContentType("text/html;charset=UTF-8");
        try {
            String userName = request.getParameter("userName");
            int totalPrice = Integer.parseInt(request.getParameter("totalPrice"));
            MyProjBs bs = new MyProjBs();

            bs.confirmPurchase(userName, totalPrice);
            
           response.sendRedirect("index.jsp?alert=purchase Confirmed");
        } finally {
        
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } 

    /** 
    * Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    /** 
    * Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}

    

