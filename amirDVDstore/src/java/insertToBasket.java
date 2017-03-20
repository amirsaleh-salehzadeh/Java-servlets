/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Common.Dvd;
import java.io.*;
import java.net.*;

import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class insertToBasket extends HttpServlet {
   
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
            
            Dvd dvd = new Dvd();
            dvd.setName(request.getParameter("dvdName"));
            ArrayList<Dvd> dvds = new ArrayList<Dvd>();
            HttpSession session = request.getSession(true);
            dvds.add(dvd);
            if (session.getAttribute("basketSession") != null)
            {
                ArrayList<Dvd> al = (ArrayList<Dvd>)session.getAttribute("basketSession");
                for(int j = 0; j < al.size(); j++)
                {
                    Dvd d = new Dvd();
                    d.setName(al.get(j).getName());            
                    if(!dvd.getName().equalsIgnoreCase(al.get(j).getName())){
                         dvds.add(d);
                     }
                }
            }
            
            session.setAttribute("basketSession",dvds);            
            response.sendRedirect("shopServlet");
         
        }catch(Exception ex){
            ex.printStackTrace();
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
