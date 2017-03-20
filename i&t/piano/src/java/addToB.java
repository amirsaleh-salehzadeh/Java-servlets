/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import CommonLayer.Piano;
import java.io.*;
import java.net.*;

import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class addToB extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       try {
            Piano piano = new Piano();
            String reqCode = request.getParameter("reqCode");
            HttpSession session = request.getSession(true);
            ArrayList<Piano> pianos = new ArrayList<Piano>();
            ArrayList<Piano> arrayList = (ArrayList<Piano>)session.getAttribute("addToBSession");
            piano.setProductName(request.getParameter("productName"));
            if("".equalsIgnoreCase(reqCode)||reqCode==null){
                pianos.add(piano);
                if (session.getAttribute("addToBSession") != null)
                {
                    for(int j = 0; j < arrayList.size(); j++)
                    {
                        Piano piano1 = new Piano();
                        piano1.setProductName(arrayList.get(j).getProductName());            
                        if(!piano.getProductName().equalsIgnoreCase(arrayList.get(j).getProductName())){
                             pianos.add(piano1);
                         }
                    }
                }
                session.setAttribute("addToBSession",pianos); 
                response.sendRedirect("shopView");
            } else if("remove".equalsIgnoreCase(reqCode)){
                for(int j = 0; j < arrayList.size(); j++)
                {
                    if(piano.getProductName().equalsIgnoreCase(arrayList.get(j).getProductName())){
                         arrayList.remove(j);
                     }
                }
                session.setAttribute("addToBSession",arrayList); 
                response.sendRedirect("shoppingCart");
            }


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
