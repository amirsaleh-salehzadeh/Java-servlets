/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sales.common;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import sales.dal.JDBCManager;

/**
 *
 * @author nozhan
 */
public class Products {

    public int id;
    public String model;
    public String color;
    public String brand;
    public int unitPrice;
    public String img1;
    public String img2;

    public Products() {
    id = 0;
    model = "";
    brand = "";
    color = "";
    unitPrice = 0;
    img1 = "";
    img2 = "";
    }

    public Products(int i) {
    id = 0;
    model = "";
    brand = "";
    color = "";
    unitPrice = 0;
    img1 = "";
    img2 = "";
     try{
    JDBCManager jm = new JDBCManager();
   ResultSet rs=null;
        jm.setConnection();
        String s="select * from product where id=i";
        if( (rs = jm.submitExecuteQuery(s)).next()){
              id=rs.getInt("id");
              model=rs.getString("model");
              brand=rs.getString("brand");
              color=rs.getString("color");
              unitPrice=rs.getInt("unitPrice");
              img1=rs.getString("img1");
              img2=rs.getString("img2");
              
        }
        jm.disconnectFromDbase();
        return;
    }
     catch(SQLException e){
         return;
     }
    }        
    public ResultSet searchOnBrand() throws SQLException
    {
        ResultSet resultset;
        JDBCManager jdbcManager;
        (jdbcManager = new JDBCManager()).setConnection();
        String s2 = null;
        s2 ="SELECT  *   from product WHERE   brand='"+brand+"'";
        resultset = jdbcManager.submitExecuteQuery(s2);        
        return resultset;                
    }
    public ResultSet advancedSearch(String enq) throws SQLException
    {
        ResultSet resultset;
        JDBCManager jdbcManager;
        (jdbcManager = new JDBCManager()).setConnection();
        String s2 = null;
        s2 ="SELECT  *   from product WHERE   brand='"+brand+"' and unitprice "+enq+" '"+unitPrice+"'";
        resultset = jdbcManager.submitExecuteQuery(s2);        
        return resultset;                
    }
    public ResultSet quickSearch(String q) throws SQLException
    {
        ResultSet resultset;
        JDBCManager jdbcManager;
        (jdbcManager = new JDBCManager()).setConnection();
        String s2 = null; s2 ="SELECT  *   from product WHERE   model like'%"+q+"%' ";                          
        resultset = jdbcManager.submitExecuteQuery(s2);
        return resultset;                
    }
    public ResultSet selectProducts(String ch[],HttpServletRequest request) throws SQLException
    {
        int ch_len=ch.length;
        ResultSet resultset;
        JDBCManager jdbcManager;
        (jdbcManager = new JDBCManager()).setConnection();System.out.println(request.getParameter("id"));
        String s2 = null; s2 ="SELECT * from product WHERE id="+ch[0];
        resultset = jdbcManager.submitExecuteQuery(s2);
        return resultset;                
    }
       
    public void insertInvoice(String loginid,String qty,String prodId,String session)
    {
        try
        {
            JDBCManager jdbcManager = new JDBCManager();
            jdbcManager.setConnection();
            String s = null;
            s = "Insert into invoice(date,userId,prodId,qty,session) values (";
            s+="'"+"2008/07/19"+"',";
            s+=""+loginid+",";
            s+="'"+prodId+"',";
            s+="'"+qty+"',";
            s+="'"+session+"')";
            jdbcManager.submitUpdateQuery(s);                        
            
            jdbcManager.disconnectFromDbase();
            return;
        }
        catch(SQLException sqlexception)
        {
            System.out.println(sqlexception.toString());
        }
    }
    public void addProduct() {
        try
        {
            JDBCManager jdbcManager = new JDBCManager();
            jdbcManager.setConnection();
            String s = null;
            s = "Insert into product (brand,model,unitPrice,img1,img2) values (";
            s+="'"+brand+"',";
            s+="'"+model+"',";
            s+="'"+unitPrice+"',";
            s+="'"+img1+"',";
            s+="'"+img2+"')";
           
            jdbcManager.submitUpdateQuery(s);                        
            
            jdbcManager.disconnectFromDbase();
            return;
        }
        catch(SQLException sqlexception)
        {
            System.out.println(sqlexception.toString());
        }
       
    }
    public void updateProducts() {
         try
        {
            JDBCManager jdbcManager = new JDBCManager();
            jdbcManager.setConnection();
            String s = null;
            s = "UPDATE product SET brand='"+brand+"' , model='"+model+"' , unitPrice='"+unitPrice+"' , img1='"+img1+"' , img2='"+img2+"' WHERE id="+id;
            jdbcManager.submitUpdateQuery(s);                        
            
            jdbcManager.disconnectFromDbase();
            return;
        }
        catch(SQLException sqlexception)
        {
            System.out.println(sqlexception.toString());
        }
    
}
    public void deleteProduct() {
       try
        {
            JDBCManager jdbcManager = new JDBCManager();
            jdbcManager.setConnection();
            String s = null;
            s = "DELETE from product WHERE id="+id;
            jdbcManager.submitUpdateQuery(s);                        
            
            jdbcManager.disconnectFromDbase();
            return;
        }
        catch(SQLException sqlexception)
        {
            System.out.println(sqlexception.toString());
        }
    }    
    public ResultSet viewCart(String mysession) throws SQLException
    {
        ResultSet resultset;
        JDBCManager jdbcManager;
        (jdbcManager = new JDBCManager()).setConnection();
        String s2 = null; s2 ="SELECT  *   from invoice WHERE   session= '"+mysession+"' ";                          
        resultset = jdbcManager.submitExecuteQuery(s2);
        return resultset;                
    }
}