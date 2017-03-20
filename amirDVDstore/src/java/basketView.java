/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import BusinessLayer.BusinessLayer;
import Common.Dvd;
import java.io.*;
import java.net.*;

import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class basketView extends HttpServlet {
   
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
            HttpSession session = request.getSession(true);
            ArrayList<Dvd> al = (ArrayList<Dvd>)session.getAttribute("basketSession");
            ArrayList<Dvd> dvds = new ArrayList<Dvd>();

            BusinessLayer bl = new BusinessLayer();
            for(int i = 0; i < al.size(); i++){
               Dvd dvd = new Dvd();
               dvd = bl.searchForDvd( al.get(i).getName());
               dvds.add(dvd);
             }
            session.setAttribute("dvdList", dvds);
            response.sendRedirect("basketContainer.jsp");
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
