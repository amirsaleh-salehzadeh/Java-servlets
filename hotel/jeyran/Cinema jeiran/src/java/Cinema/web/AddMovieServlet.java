/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cinema.web;

import Cinema.bs.BSManager;
import Cinema.common.MovieENT;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Jeiran
 */
public class AddMovieServlet extends HttpServlet {
   
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
            
            MovieENT ent = new MovieENT();
            ent.setMovie_name(request.getParameter("movie_name"));
            ent.setDirector(request.getParameter("director"));
            ent.setProducer(request.getParameter("producer"));
            ent.setStart_date(request.getParameter("date"));
            try {    
                int price = 0;
                
            price = Integer.parseInt(request.getParameter("price"));
            ent.setPrice(price);
             
            }catch(java.lang.NumberFormatException ex){
                //ex.printStackTrace();
                 }
            try {
                int genreId = 0;
                genreId = Integer.parseInt(request.getParameter("genre"));
                ent.setGenre_id(genreId);
            }catch(java.lang.NumberFormatException ex) {
                //ex.printStackTrace();
            }
            
           
            try {
                
            
            BSManager bs = new BSManager();
             bs.insertMovie(ent);
             
             response.sendRedirect("MovieAdminServlet");
             
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
                request.getSession().setAttribute("AddMovieError", ex.getMessage());
                response.sendRedirect("AddMovie.jsp");
               
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
