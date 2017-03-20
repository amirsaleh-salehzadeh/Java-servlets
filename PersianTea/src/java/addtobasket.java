/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.net.*;

import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class addtobasket extends HttpServlet {
   
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

            int number = Integer.parseInt(request.getParameter("purchaseNumber"));
           
            String name = request.getParameter("param");
            String toBasket = number +"," +name;
            ArrayList<String> al = new ArrayList<String>();
            al.add(toBasket);
            HttpSession session = request.getSession(true);
            if (session.getAttribute("basketSession") != null){
                ArrayList<String> list = (ArrayList<String>)session.getAttribute("basketSession");
                String[] withNoSemiColumn;
                for(int i = 0 ; i < list.size() ; i ++){
                    withNoSemiColumn = list.get(i).split(",");
                    if(!withNoSemiColumn[1].equalsIgnoreCase(name)){
                        al.add(list.get(i));
                    }
                }
            }
            session.setAttribute("basketSession",al);            
            response.sendRedirect("AllTeas");
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
