package purchase.servlet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
*/


import java.io.*;
import java.net.*;

import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.*;
import purchase.bs.MyProjBs;
import purchase.common.Product;


public class ProdServlet extends HttpServlet {
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, SQLException {          
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            Product prod=new Product();
            prod.setPname(request.getParameter("pname"));
            prod.setPrice(Integer.parseInt(request.getParameter("price")));
            prod.setImg(request.getParameter("img"));
            prod.setDescription(request.getParameter("description"));
            prod.setSelect(request.getParameter("select"));
            
           MyProjBs mybs =new MyProjBs();
           if(mybs.addProduct(prod)) {
           response.sendRedirect("Admin.jsp?msg3=Successful product added");
           }         
           else {
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

    

