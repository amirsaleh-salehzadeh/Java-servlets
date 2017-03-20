



import business.projectBusinessLayer;
import common.Chocolate;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class addChocolate extends HttpServlet {
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    try {

            Chocolate chocolate = new Chocolate();
            
            chocolate.setBrandName(request.getParameter("brandName"));
            chocolate.setChocolateDetail(request.getParameter("description"));
            chocolate.setImageAddress(request.getParameter("image"));
            chocolate.setPrice(Integer.parseInt(request.getParameter("price")));
            chocolate.setChocolateName(request.getParameter("name"));
            projectBusinessLayer bs = new projectBusinessLayer();
             if(bs.addChocolate(chocolate)) 
             { 
                response.sendRedirect("index.jsp?msg=Successful Chocolate added");
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
