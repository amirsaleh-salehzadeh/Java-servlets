/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cinema.web;

import Cinema.bs.BSManager;
import Cinema.common.CustomerENT;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Jeiran
 */
public class LoginServlet extends HttpServlet {
   
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
            
            String user = request.getParameter("username");
            String password = request.getParameter("password");
            
            
            if("admin".equals(user) && "admin".equals(password)){
                response.sendRedirect("AdminHome.jsp");
            }
            else  {
                BSManager bs = new BSManager();
            CustomerENT ent = bs.login(user, password);
            if(ent == null) {
                //out.println("<html><body>failure</body></html>");
                response.sendRedirect("SignIn.jsp?msg=Incorrect username or password!");
            }
            else{
                request.getSession().setAttribute("userENT", ent);
               // out.println("<html><body>welcome"+ent.getName()+"</body></html>");
                response.sendRedirect("Home.jsp");
                
                HttpSession userSession=request.getSession();
                userSession.setAttribute("customer", ent);
            }
            
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
