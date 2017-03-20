/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sales.dal;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nozhan
 */
public class JDBCManager {
Connection a;
    public void disconnectFromDbase() {
       if(a==null){
           return;
       }
       try{
           a.close();
           a=null;
           return;
           
       }
       catch(SQLException e){
               System.out.println(e);
       }
    }

    //@SuppressWarnings("empty-statement")
    public void setConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCManager.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } 

        try {
            a = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sunglasses", "root", "");

        } catch (SQLException sqlexception) {
            System.out.println("Error :SQL Connection");
        }

    }

    /*  public static ArrayList search(String from, String to, String srch) {
    ArrayList arResult = new ArrayList();
    try {
    Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
    Logger.getLogger(JDBCManager.class.getName()).log(Level.SEVERE, null, ex);
    ex.printStackTrace();
    }
    try {
    System.out.println("Connecting...");
    java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sales", "root", "");
    PreparedStatement ps = cn.prepareStatement("select * from" + " Orders where SDate between ? and ? and (rtrim(No)" + " Like ? or customer Like ?)");
    ps.setString(1, from);
    ps.setString(2, to);
    ps.setString(3,"%"+srch+"%");
    ps.setString(4,"%"+srch+"%");
    ResultSet rs = ps.executeQuery();
    while (rs.next()) {
    OrderENT ent = new OrderENT();
    ent.setId(rs.getInt(1));
    ent.setNo(rs.getInt(2));
    ent.setSDate(rs.getString(3));
    ent.setCustomer(rs.getString(4));
    ent.setDetails(getOrderDetails(ent.getId()));
    arResult.add(ent);
    }
    } catch (SQLException ex) {
    Logger.getLogger(JDBCManager.class.getName()).log(Level.SEVERE, null, ex);
    ex.printStackTrace();
    }
    return arResult;
    }
     */
    /* public static ArrayList getOrderDetails(int OrderId) {
    ArrayList arResult = new ArrayList();
    try {
    Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
    Logger.getLogger(JDBCManager.class.getName()).log(Level.SEVERE, null, ex);
    ex.printStackTrace();
    }
    try {
    System.out.println("Connecting...");
    java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sales", "root", "");
    Statement stmt = cn.createStatement();
    ResultSet rs = stmt.executeQuery("select * from OrderDetails where F_OrderID = " + OrderId);
    while (rs.next()) {
    OrderDetailENT ent = new OrderDetailENT();
    ent.setId(rs.getInt(1));
    ent.setF_orderId(rs.getInt(3));
    ent.setProductCode(rs.getString(4));
    ent.setQty(rs.getInt(5));
    ent.setUnitPrice(rs.getInt(6));
    arResult.add(ent);
    }
    } catch (SQLException ex) {
    Logger.getLogger(JDBCManager.class.getName()).log(Level.SEVERE, null, ex);
    ex.printStackTrace();
    }
    return arResult;
    }
     */
    public ResultSet submitExecuteQuery(String s) throws SQLException {
        if (a==null){
            setConnection();
        }
        Statement statement;
        
        try {
            statement = a.createStatement();
        } 
        catch (SQLException e) {
            setConnection();
            try {
                statement = a.createStatement();
            }
            catch(SQLException e1){ 
                throw e1;
            }
            
        }
        ResultSet rs;
        
        try{
           rs= statement.executeQuery(s);
        
        }
        catch(SQLException e){
            throw e;            
        }
            
            return rs;
        }
    
    public void submitUpdateQuery(String s)
        throws SQLException
    {
        if(a == null)
            setConnection();
        Statement statement;
        try
        {
            statement = a.createStatement();
        }
        catch(SQLException _ex)
        {
            setConnection();
            try
            {
                statement = a.createStatement();
            }
            catch(SQLException sqlexception1)
            {
                System.err.println("Error: dbase(submitQuery): createStatement failed - servlet exiting");
                throw sqlexception1;
            }
        }
        try
        {
            statement.executeUpdate(s);
            return;
        }
        catch(SQLException sqlexception)
        {
            System.err.println((new StringBuilder()).append("Error: dbase(submitQuery): execute query failed: ").append(sqlexception).append("\nQuery:").append(s).toString());
            throw sqlexception;
        }
    }



        
    }
      

