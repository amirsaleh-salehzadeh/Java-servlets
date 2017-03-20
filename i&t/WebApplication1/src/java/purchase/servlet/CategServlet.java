

package purchase.servlet;

import purchase.bs.MyProjBs;
import purchase.common.Category;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class CategServlet extends HttpServlet {
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    try {

               Category categ=new Category();
            categ.setCategn(request.getParameter("name"));
            categ.setDescription(request.getParameter("description"));
            MyProjBs bs = new MyProjBs();
             if(bs.addCategory(categ)) 
             { 
                response.sendRedirect("SelectCategory?msg3=Successful category added");
            } else {

                response.sendRedirect("Admin.jsp?msg3=Unsuccessful!");
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
