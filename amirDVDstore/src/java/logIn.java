



import BusinessLayer.BusinessLayer;
import Common.User;
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
            BusinessLayer bl = new BusinessLayer();
             
             
            ArrayList<User> ul=new ArrayList<User>();
            User user1 = new User();
            user1 = bl.login(user);
            if(user1.getFamilyName() != null || "".equalsIgnoreCase(user1.getFamilyName())){
            ul.add(bl.login(user));    
            }
            if(ul.size() > 0){
            session.setAttribute("login",ul);
            response.sendRedirect("shopServlet");
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
