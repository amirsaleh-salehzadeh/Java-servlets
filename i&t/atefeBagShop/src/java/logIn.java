



import myProjectBusiness.myProjBs;
import objects.User;
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
            user.setEmail(request.getParameter("email"));
            user.setPassword(request.getParameter("pass"));
            HttpSession session = request.getSession(true);
            myProjBs bl = new myProjBs();
             
             
            User u =new User();
            u = bl.login(user);    
            if(u != null){
            session.setAttribute("login",u);
            response.sendRedirect("goToShop");
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
