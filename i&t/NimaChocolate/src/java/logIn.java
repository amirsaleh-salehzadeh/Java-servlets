



import business.projectBusinessLayer;
import common.User;
import java.io.*;
import java.net.*;

import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;


public class logIn extends HttpServlet {
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    try {

            User user=new User();
            user.setUserName(request.getParameter("usern"));
            user.setPassWord(request.getParameter("pass"));
            HttpSession session = request.getSession(true);
            projectBusinessLayer businessLayer = new projectBusinessLayer();
            if(businessLayer.login(user)) 
            { 
                ArrayList<User> ul=new ArrayList<User>();
                ul = businessLayer.listUser(user);    
                session.setAttribute("login",ul);
                response.sendRedirect("shopGetInfo");
               
            } else {
                response.sendRedirect("index.jsp?msg=Invalid username and password");
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