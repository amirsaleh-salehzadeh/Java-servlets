/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sales.servlet;

import java.io.*;
import java.net.*;

import java.sql.SQLException;
import java.sql.Date;
import javax.servlet.*;
import javax.servlet.http.*;
import sales.common.Products;

/**
 *
 * @author hesam
 */
public class ProdServlet extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, SQLException {          
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(true);
       
        String s = request.getParameter("action") != null ? request.getParameter("action") : "";
        if(s.equals("searchBrand")){              
        try {
            Products products=new Products();
            products.brand = request.getParameter("brand");
                                  
            request.setAttribute("result", products.searchOnBrand());
            request.setAttribute("brand", products.brand);
            getServletConfig().getServletContext().getRequestDispatcher("/resultBrand.jsp").forward(request, response);
        
        } finally { 
            out.close();
        }
        }        
        if(s.equals("advancedSearch")){              
        try {
            Products products=new Products();
            products.brand = request.getParameter("brand");
            products.unitPrice = Integer.parseInt(request.getParameter("unitprice"));
            String enq=(products.unitPrice==99) ? "<=" : ">=";
            
            request.setAttribute("result", products.advancedSearch(enq));
            request.setAttribute("brand", products.brand);
            getServletConfig().getServletContext().getRequestDispatcher("/resultBrand.jsp").forward(request, response);
        
        } finally { 
            out.close();
        }
        }        
        if(s.equals("quickSearch")){              
        try {
            Products products=new Products();
            String q = request.getParameter("q");
            
            request.setAttribute("result", products.quickSearch(q));
            getServletConfig().getServletContext().getRequestDispatcher("/resultBrand.jsp").forward(request, response);        
        } finally { 
            out.close();
        }
        }
        if(s.equals("addToCart")){            
             String mysession=String.valueOf(Math.random());session.setAttribute("mysession", mysession);
             String loginid=(String)session.getAttribute("loginid");
             Products products=new Products();
             String count=request.getParameter("count");
             String prodId[]=new String[Integer.parseInt(count)];
             String qty[]=new String[Integer.parseInt(count)];
             String choosed[]=new String[Integer.parseInt(count)];
             int countG=0;
             for(int i=1;i<=Integer.parseInt(count);i++){                
                choosed[i-1]=request.getParameter("choosed"+i);                
                if(choosed[i-1]!=null){
                    prodId[countG]=request.getParameter("id"+i);
                    qty[countG]=request.getParameter("qty"+i);
                    countG++;                    
                }                
             }
             for(int j=0;j<countG;j++){
                 products.insertInvoice(loginid,qty[j],prodId[j],mysession);                 
             }
             request.setAttribute("result", products.viewCart(mysession));
             getServletConfig().getServletContext().getRequestDispatcher("/viewCart.jsp").forward(request, response);        
        }
        
        if(s.equals("addProduct")){       
       
        try {
            Products products=new Products();
            products.brand = request.getParameter("brand");
            products.model = request.getParameter("model");
            products.unitPrice = Integer.parseInt(request.getParameter("price"));
            products.img1 = request.getParameter("imagepath1");
            products.img2 = request.getParameter("imagepath2");
           
            
            products.addProduct();
            
            getServletConfig().getServletContext().getRequestDispatcher("/addProduct.jsp").forward(request, response);
        
        } finally { 
            out.close();
        }
        }
        if(s.equals("updateProducts")){       
       
        try {
            Products products=new Products();
            products.id = Integer.parseInt(request.getParameter("id"));
            products.brand = request.getParameter("brand");
            products.model = request.getParameter("model");
            products.unitPrice=Integer.parseInt(request.getParameter("price")) ;
            products.img1 = request.getParameter("imagepath1");
            products.img2 = request.getParameter("imagepath2");           
            
            products.updateProducts();
                        
            getServletConfig().getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
        
        } finally { 
            out.close();
        }
        }
         if(s.equals("deleteProduct")){       
       
        try {
            Products products=new Products();
            products.id = Integer.parseInt(request.getParameter("id"));
            products.brand = request.getParameter("brand");
            products.model = request.getParameter("model");
            products.unitPrice=Integer.parseInt(request.getParameter("price")) ;
            products.img1 = request.getParameter("imagepath1");
            products.img2 = request.getParameter("imagepath2");           
            
            products.deleteProduct();
                        
            getServletConfig().getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
        
        } finally { 
            out.close();
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } 

    /** 
    * Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /** 
    * Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
