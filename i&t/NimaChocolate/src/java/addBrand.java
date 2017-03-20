



import business.projectBusinessLayer;
import common.Brand;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class addBrand extends HttpServlet {
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    try {

            Brand brand = new Brand();
            brand.setBrandName(request.getParameter("name"));
            brand.setBrandDescription(request.getParameter("description"));
            brand.setBrandImageAddress(request.getParameter("image"));
            projectBusinessLayer bs = new projectBusinessLayer();
             if(bs.addBrand(brand)) 
             { 
                response.sendRedirect("index.jsp?msg=Successful Brand added");
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
