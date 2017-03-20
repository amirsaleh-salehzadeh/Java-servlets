/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.*;
import java.net.*;

import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import objects.Bag;

/**
 *
 * @author Amirsaleh
 */
public class toBasket extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            Bag bag = new Bag();
            bag.setName(request.getParameter("name"));
            HttpSession session = request.getSession(true);
            ArrayList<Bag> bags = new ArrayList<Bag>();
            ArrayList<Bag> al = (ArrayList<Bag>)session.getAttribute("basketSession");
            bags.add(bag);
            if("".equalsIgnoreCase(request.getParameter("isForRemove"))||request.getParameter("isForRemove")==null){
                if (session.getAttribute("basketSession") != null)
                {
                  for(int j = 0; j < al.size(); j++)
                    {
                        Bag b = new Bag();
                        b.setName(al.get(j).getName());            
                        if(!bag.getName().equalsIgnoreCase(al.get(j).getName())){
                             bags.add(b);
                         }
                    }
                }
                session.setAttribute("basketSession",bags);            
                response.sendRedirect("goToShop");
            } else if("true".equalsIgnoreCase(request.getParameter("isForRemove"))) {
                for(int j = 0; j < al.size(); j++)
                {
                    if(bag.getName().equalsIgnoreCase(al.get(j).getName())){
                         al.remove(j);
                     }
                }
                session.setAttribute("addToBSession",al); 
                response.sendRedirect("basketPreview");
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
