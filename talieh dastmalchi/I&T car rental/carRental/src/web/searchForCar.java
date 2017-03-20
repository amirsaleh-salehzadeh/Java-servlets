/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import Business.bsManager;
import Common.CarENT;
import Common.CategoryENT;
import Common.RentENT;
import java.io.*;

import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Talieh Dastmalchi
 */
public class searchForCar extends HttpServlet {
   
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
           CarENT ent = new CarENT();
           ArrayList<CarENT> ents = new ArrayList<CarENT>();
           CategoryENT categoryENT = new CategoryENT();
           int categId = Integer.parseInt(request.getParameter("categId"));
           String name = request.getParameter("search");
           if("null".equalsIgnoreCase(name)||name==null)
           	name="";
           ent.setCategoryid(categId);
           ent.setName(name);
         //2: calling method
           bsManager bs = new bsManager();
           ents = bs.searchACar(ent);
           categoryENT = bs.getCategory(categId);
         //3: setting sessions and redirecting to pages
           request.getSession().setAttribute("category", categoryENT);
           request.getSession().setAttribute("cars", ents);
	       response.sendRedirect("carList.jsp");
               
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
