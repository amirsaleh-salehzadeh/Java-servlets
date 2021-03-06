

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import common.Chocolate;



public class addToBasket extends HttpServlet {
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");


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
            try {
            
            Chocolate chocolate = new Chocolate();
            chocolate.setChocolateName(request.getParameter("chocoName"));
            ArrayList<Chocolate> chocolates = new ArrayList<Chocolate>();
            HttpSession session = request.getSession(true);
            chocolates.add(chocolate);
            if (session.getAttribute("basketSession") != null)
            {
            ArrayList<Chocolate> t = (ArrayList<Chocolate>)session.getAttribute("basketSession");
            for(int j = 0; j < t.size(); j++)
            {
                Chocolate chocolate1 = new Chocolate();
                chocolate1.setChocolateName(t.get(j).getChocolateName());            
                chocolate1.setBrandName(request.getParameter("brandName"));
                 if(!chocolate.getChocolateName().equals(t.get(j).getChocolateName())){
                     chocolates.add(chocolate1);
                 }
            }
            }
            session.setAttribute("brandName", request.getParameter("brandName"));
            session.setAttribute("basketSession",chocolates);            
            response.sendRedirect("productsView");
         
    }catch(Exception ex){ex.printStackTrace();} 
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
