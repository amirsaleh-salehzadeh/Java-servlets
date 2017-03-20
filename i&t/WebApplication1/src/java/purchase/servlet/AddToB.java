package purchase.servlet;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import purchase.common.Product;



public class AddToB extends HttpServlet {
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    try {
            Product product1 = new Product();

            product1.setPname(request.getParameter("textfield"));
            ArrayList<Product> a2b = new ArrayList<Product>();
            HttpSession session = request.getSession(true);
            if (session.getAttribute("purchasesession") == null){
            a2b.add(product1);
            }
            else
            {
            ArrayList<Product> t=(ArrayList<Product>)session.getAttribute("purchasesession");
            for(int j=0;j<t.size();j++)
            {
            Product p = new Product();
            p.setPname(t.get(j).getPname());            
            a2b.add(p);
            }
            a2b.add(product1);
            }
            session.setAttribute("purchasesession",a2b);            
            response.sendRedirect("ShopServlet");
         
    }catch(Exception ex){ex.printStackTrace();} 
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
