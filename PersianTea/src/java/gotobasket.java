/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import COMMON.TEA;
import DataMngPackage.dataMNG;
import java.io.*;
import java.net.*;

import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class gotobasket extends HttpServlet {
   
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
            HttpSession session = request.getSession(true);
            ArrayList<String> list = (ArrayList<String>)session.getAttribute("basketSession");
            String[] withNoSemiColumn;
            dataMNG g = new dataMNG();
            ArrayList<TEA> al = new ArrayList<TEA>();
            for(int i = 0 ; i < list.size() ; i ++){
                TEA tea = new TEA();
                withNoSemiColumn = list.get(i).split(",");
                tea = g.getTea(withNoSemiColumn[1]);
                tea.setPurchasedNumber(Integer.parseInt(withNoSemiColumn[0]));
                al.add(tea);
            }
            session.setAttribute("basketTeas", al);
            response.sendRedirect("basket.jsp");
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
