/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import businessLayer.myProjBS;
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
public class bookServlet extends HttpServlet {
   
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
            bookENT ent = new bookENT();
            ent.setEDate(Date.valueOf(request.getParameter("edate")));
            ent.setSDate(Date.valueOf(request.getParameter("sdate")));
            ent.setUserId(Integer.parseInt(request.getParameter("userId")));
            ent.setRoomId(Integer.parseInt(request.getParameter("roomId")));
            myProjBS bS = new myProjBS();
            String msg = "";
            if(bS.book(ent)){
                msg="You reserved the room between "+request.getParameter("sdate")+ " and "+request.getParameter("edate");
           }else{
                msg="The book process faild";
           }
            response.sendRedirect("reserve.jsp?msg="+msg);
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
