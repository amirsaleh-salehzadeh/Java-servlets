package purchase.servlet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
*/


import java.io.*;
import java.net.*;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import purchase.bs.MyProjBs;
import purchase.common.User;
import purchase.common.Product;


public class ConfirmPurchase extends HttpServlet {
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, SQLException {
        try{
        MyProjBs mybs =new MyProjBs();
        String s = null;
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(true);
        ArrayList<Product> t=(ArrayList<Product>)session.getAttribute("purchasesession");
        ArrayList<User> h=(ArrayList<User>)session.getAttribute("login");
        for (int i=0;i<h.size();i++){
        s = h.get(i).getUsern();
        }
        for(int j=0;j<t.size();j++)
            {
            Product p = new Product();
            p.setPname(t.get(j).getPname());
            mybs.confirmOrder(s,p);
            }
        response.sendRedirect("main.jsp?mess=Your Purchase done successful!");
        }catch(Exception ex){ex.printStackTrace();} 
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

    

