/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlet;

import Business.BusinessLayer;
import Common.BookEntity;
import Common.MatchEntity;
import Common.UserEntity;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class bookAMatchServlet extends HttpServlet {
   
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
            BookEntity bookEntity = new BookEntity();
            BusinessLayer bs = new BusinessLayer();
            UserEntity user = (UserEntity)request.getSession().getAttribute("user");
            bookEntity.setQuantity(Integer.parseInt(request.getParameter("qty")));
            bookEntity.setTotalPrice(Integer.parseInt(request.getParameter("totalPrice")));
            bookEntity.setUserName(user.getUsername());
            MatchEntity matchEntity = new MatchEntity();
            matchEntity.setId(Integer.parseInt(request.getParameter("matchID")));
            bookEntity.setMatchEntity(matchEntity);
            if(bs.book(bookEntity)){
                response.sendRedirect("index.jsp?alert=You booked these "+bookEntity.getQuantity()+" tickets successfuly!");
            }else{
                response.sendRedirect("index.jsp?alert=Sorry booking process faild!!!");
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
