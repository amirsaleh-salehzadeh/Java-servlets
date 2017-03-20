/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import CommonLayer.Piano;
import businessLayer.MyProjBs;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class insertPiano extends HttpServlet {
   
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
            Piano piano = new Piano();
            piano.setCompanyName(request.getParameter("cname"));
            piano.setProductName(request.getParameter("pname"));
            piano.setImage(request.getParameter("image"));
            piano.setPrice(Integer.parseInt(request.getParameter("price")));
            piano.setWeight(Integer.parseInt(request.getParameter("weight"))); 
            MyProjBs bs = new MyProjBs();
            if(bs.insertPiano(piano)){
                response.sendRedirect("insertPiano.jsp?alert=The piano added to system successfully");
            }else{
                response.sendRedirect("insertPiano.jsp?alert=An error occured through the process, try again later or contact the web designer");
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
