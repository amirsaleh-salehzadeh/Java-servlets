/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Common.MovieENT;
import MyProjBS.MyProjBS;
import java.io.*;
import java.net.*;

import java.sql.Date;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class InsertMovie extends HttpServlet {
   
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
            MovieENT movieENT = new MovieENT();
            movieENT.setDirector(request.getParameter("director"));
            movieENT.setEndDate(Date.valueOf(request.getParameter("edate")));
            movieENT.setStartDate(Date.valueOf(request.getParameter("sdate")));
            movieENT.setName(request.getParameter("name"));
            movieENT.setImage(request.getParameter("image"));
            movieENT.setSummary(request.getParameter("abstract"));
            MyProjBS bl = new MyProjBS();
            if(bl.addMovie(movieENT)){
                response.sendRedirect("Movies.jsp?msg=Successfully Inserted into the movies list");
            }else{
                response.sendRedirect("Movies.jsp?msg=There exist an error in insert process");
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
