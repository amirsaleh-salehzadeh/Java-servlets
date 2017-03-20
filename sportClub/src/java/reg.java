/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Obj.*;
import dataFactory.dataFactory;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class reg extends HttpServlet {
   
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
        try {
            if("registerUser".equalsIgnoreCase(goTo)){
                User u = new User();
                u.setAddress(request.getParameter("address"));
                u.setFName(request.getParameter("Fname"));
                u.setAge(Integer.parseInt(request.getParameter("age")));
                u.setName(request.getParameter("name"));
                u.setPass(request.getParameter("password"));
                u.setTel(request.getParameter("tel"));
                u.setUName(request.getParameter("uname"));
                u.setAdmin(request.getParameter("admin"));
                if(f.registerUser(u)){
                    response.sendRedirect("index.jsp?msg=welcome Mr/Mrs. "+u.getName()+" "+u.getFName());
                }else {
                    response.sendRedirect("index.jsp?msg=An error occured during the register process");
                }
            } else if("insertClass".equalsIgnoreCase(goTo)){
                Clazz c = new Clazz();
                c.setCapacity(Integer.parseInt(request.getParameter("CA")));
                c.setDays(request.getParameter("DA"));
                c.setEndDate(request.getParameter("ED"));
                c.setSportType(request.getParameter("ST"));
                c.setStartDate(request.getParameter("SD"));
                c.setTime(request.getParameter("TI"));
                c.setTutor(request.getParameter("TU"));
                if(f.insertClass(c)){
                    response.sendRedirect("Classes?msg=Class addedd successfully");
                }
             } else if("registerClass".equalsIgnoreCase(goTo)){
                
             } else if("logIn".equalsIgnoreCase(goTo)){
               User u = new User() ;
               u.setUName(request.getParameter("username"));
               u.setPass(request.getParameter("password"));
               User u1 = new User();
               u1 = f.login(u);
               HttpSession session = request.getSession();
               session.setAttribute("user", u1);
               if(u1.getName()==null){
                    response.sendRedirect("index.jsp?msg=Invalid Username or Password");
               }else{
                    response.sendRedirect("Classes");
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
