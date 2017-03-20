/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import Business.bsManager;
import Common.UserENT;

import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Talieh Dastmalchi
 */
public class register extends HttpServlet {
   
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
        	//1: setting parameters
            String name = request.getParameter("name");
            String fname = request.getParameter("fname");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String phone = request.getParameter("phone");
            String usern = request.getParameter("usern");
            UserENT ent = new UserENT();
            ent.setName(name);
            ent.setFName(fname);
            ent.setAddress(address);
            ent.setEmail(email);
            ent.setPassword(password);
            ent.setPhoneNo(phone);
            ent.setUserName(usern);
            
            //2: calling method
            bsManager bs = new bsManager();
            boolean registered = bs.register(ent);
            
          //3: setting sessions and redirecting to pages
            if(registered){
                response.sendRedirect("register.jsp?message=Thanks for your registration");
            }else{
                response.sendRedirect("register.jsp?message=Registration faild");
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
