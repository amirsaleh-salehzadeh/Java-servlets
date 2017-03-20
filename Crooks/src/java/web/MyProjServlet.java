/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import bs.MyprojBS;
import common.Userparam;
import java.io.*;
import java.net.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Amirsaleh
 */
public class MyProjServlet extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
             String whatToDo = request.getParameter("whatToDo");       
             MyprojBS bs = new MyprojBS();
             HttpSession session = request.getSession(true);
             if("register".equalsIgnoreCase(whatToDo)){
                 try {

                    Userparam uparam = new Userparam();
                    uparam.setName(request.getParameter("Name"));
                    uparam.setFamily(request.getParameter("Family"));
                    uparam.setUsername(request.getParameter("Username"));
                    uparam.setPassword(request.getParameter("Password"));
                    uparam.setEmail(request.getParameter("email"));
                    uparam.setPhone_number1(request.getParameter("phone_number"));
                    uparam.setAddress(request.getParameter("Address"));

                    bs.register(uparam);

                    response.sendRedirect("Login.jsp");
                } finally { 
                    out.close();
                }

             } else if ("login".equalsIgnoreCase(whatToDo)){
                 try {
                        Userparam curtuserFirst = new Userparam();
                        curtuserFirst.setUsername(request.getParameter("Username"));
                        curtuserFirst.setPassword(request.getParameter("Password"));
                        
                        
                     if("".equalsIgnoreCase(bs.checkUser(curtuserFirst).getUsername()) || bs.checkUser(curtuserFirst).getUsername()!=null) {
                           Userparam curtuser = bs.checkUser(curtuserFirst);
                           session.setAttribute("user", curtuser);
                           if("superAdmin".equalsIgnoreCase(curtuser.getRole())){
                                response.sendRedirect("Admin.jsp");
                           }else{
                                response.sendRedirect("shop.jsp");
                           }
                     }else{
                          response.sendRedirect("Login.jsp?alert=Invalid username or password");
                        }
                } catch(Exception e) { 
                    e.printStackTrace();
                    out.close();
                }
             } else if ("addRole".equalsIgnoreCase(whatToDo)){
                try {
                    bs.addRole(request.getParameter("role"));
                    response.sendRedirect("Admin.jsp?alert=Role added successfully");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MyProjServlet.class.getName()).log(Level.SEVERE, null, ex);
                    response.sendRedirect("Admin.jsp?alert=Role coudln't be add");
                }
             }else if ("allUsers".equalsIgnoreCase(whatToDo)){
                try {
                    ArrayList<String> al = new ArrayList<String>();
                    ArrayList<Userparam> users = new ArrayList<Userparam>();
                    al = bs.allRoles();
                    users = bs.allUsers();
                    session.setAttribute("roles", al);
                    session.setAttribute("users", users);
                    String alert = "";
                    if(request.getParameter("alert")!=null){
                        alert = request.getParameter("alert");
                    }
                    response.sendRedirect("members.jsp?alert="+alert);
                } catch (SQLException ex) {
                    Logger.getLogger(MyProjServlet.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MyProjServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
             }else if ("deleteUser".equalsIgnoreCase(whatToDo)){
                String username = request.getParameter("userName");
                if(bs.delete(username)){
                    response.sendRedirect("MyProjServlet?whatToDo=allUsers&alert=User deleted successfully");
                } else {
                    response.sendRedirect("MyProjServlet?whatToDo=allUsers&alert=An error occured suring the delete process");
                }
             }else if ("updateUser".equalsIgnoreCase(whatToDo)){
                String userRole = request.getParameter("role");
                String username = request.getParameter("userName");
                if(bs.update(username, userRole)){
                    response.sendRedirect("MyProjServlet?whatToDo=allUsers&alert=User updated successfully");
                } else {
                    response.sendRedirect("MyProjServlet?whatToDo=allUsers&alert=An error occured suring the update process");
                }
             }else if ("searchByRole".equalsIgnoreCase(whatToDo) || "searchByUsername".equalsIgnoreCase(whatToDo)){
            try {
                String userRole = request.getParameter("role");
                boolean isForRole = true;
                if("searchByUsername".equalsIgnoreCase(whatToDo)){
                    isForRole = false;
                    userRole = request.getParameter("username");
                }
                ArrayList<String> al = new ArrayList<String>();
                ArrayList<Userparam> users = new ArrayList<Userparam>();
                al = bs.allRoles();
                if(!"".equalsIgnoreCase(userRole)){
                    users = bs.searchForRole(userRole,isForRole);
                } else {
                    users = bs.allUsers();
                }
                session.setAttribute("roles", al);
                session.setAttribute("users", users);
                response.sendRedirect("members.jsp");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MyProjServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MyProjServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
             } else if ("logout".equalsIgnoreCase(whatToDo)){
                session.invalidate();
                response.sendRedirect("main.html");
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
