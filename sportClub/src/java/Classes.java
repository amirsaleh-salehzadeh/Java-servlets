/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Obj.Clazz;
import dataFactory.dataFactory;
import java.io.*;
import java.net.*;

import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class Classes extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String goTo = request.getParameter("goTo");
        dataFactory f = new  dataFactory();
        if(goTo==null){
            try {
                ArrayList<Clazz> c = new ArrayList<Clazz>() ;
                c = f.getClazzes();
                HttpSession session = request.getSession();
                session.setAttribute("classes", c);
                String msg =request.getParameter("msg");
                if(msg!=null){
                    response.sendRedirect("Classes.jsp?msg="+msg);
                }else{
                    response.sendRedirect("Classes.jsp");
                }
            } finally { 
                out.close();
            }
        } else if("registerClass".equalsIgnoreCase(goTo)){
            if(f.registerClass(Integer.parseInt(request.getParameter("userID")),Integer.parseInt(request.getParameter("classID")))){
                response.sendRedirect("Classes");
            } else {
                response.sendRedirect("Classes?msg=You have registered in this class");
            }
            
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
