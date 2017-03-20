/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bs;

import common.BasketENT;
import common.BasketdetailENT;
import common.CategoryENT;
import common.ProductENT;
import common.UserENT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Talieh
 */
public class SaleBS {
    CategoryENT getCategory(int categoryid){
        CategoryENT ent=null;
        try{
            //1 load driver
            Class.forName("com.mysql.jdbc.Driver");
            //2 connect
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales","root","");
            //3 get statement for execute
            Statement stmt = cn.createStatement();
            //4 get result
            ResultSet rs = stmt.executeQuery("select * from category where categoryid="+categoryid);
            if(rs.next()){
                ent = new CategoryENT();
                ent.setCategoryid(rs.getInt("categoryid"));
                ent.setName(rs.getString("name"));
            }
            rs.close();
            stmt.close();
            cn.close();
               
            }catch(Exception ex){
              ex.printStackTrace();
            }
            return ent;
    }
        ProductENT getProduct(int productid){
            ProductENT ent=null;
            try{
                
             //1 load driver
            Class.forName("com.mysql.jdbc.Driver");
            //2 connect
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales","root","");
            //3 get statement for execute
            Statement stmt = cn.createStatement();
            //4 get result
            ResultSet rs = stmt.executeQuery("select * from Product where productid="+productid);
            if(rs.next()){
                ent = new ProductENT();
                ent.setProductid(rs.getInt("productid"));
                ent.setName(rs.getString("name"));
                ent.setPrice(rs.getInt("price"));
                ent.setCategoryid(rs.getInt("categoryid"));
                
                
                CategoryENT category = getCategory(ent.getCategoryid());
                ent.setCategory(category);
                
            }
            rs.close();
            stmt.close();
            cn.close();
               
            }catch(Exception ex){
              ex.printStackTrace();
            }
            return ent;
        }
    
        UserENT getUser(int userid){
            UserENT ent=null;
            try{
                
             //1 load driver
            Class.forName("com.mysql.jdbc.Driver");
            //2 connect
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales","root","");
            //3 get statement for execute
            Statement stmt = cn.createStatement();
            //4 get result
            ResultSet rs = stmt.executeQuery("select * from user where userid="+userid);
            if(rs.next()){
                ent = new UserENT();
                ent.setUserid(rs.getInt("userid"));
                ent.setUsername(rs.getString("username"));
                ent.setPassword(rs.getString("password"));
                ent.setAddress(rs.getString("address"));
                ent.setTel(rs.getString("tel"));
                ent.setEmail(rs.getString("email"));
                ent.setFname(rs.getString("fname"));
                ent.setGender(rs.getBoolean("gender"));
                ent.setLname(rs.getString("lname"));
                ent.setIsactive(rs.getBoolean("isactive"));
                
                
                
            }
            rs.close();
            stmt.close();
            cn.close();
               
            }catch(Exception ex){
              ex.printStackTrace();
            }
            return ent;
    }
         BasketENT getBasket(int basketid){
            BasketENT ent=null;
            try{
                
             //1 load driver
            Class.forName("com.mysql.jdbc.Driver");
            //2 connect
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales","root","");
            //3 get statement for execute
            Statement stmt = cn.createStatement();
            //4 get result
            ResultSet rs = stmt.executeQuery("select * from Basket where productid="+basketid);
            if(rs.next()){
                ent = new BasketENT();
                ent.setBasketid(rs.getInt("basketid"));
                ent.setDate(rs.getString("date"));
                ent.setUserid(rs.getInt("userid"));
                
                
                
                UserENT user = getUser(ent.getUserid());
                ent.setUser(user);
                ArrayList<BasketdetailENT> basketdetails= getBasketDetails(basketid);
                ent.setBasketdetails(basketdetails);
                
            }
            rs.close();
            stmt.close();
            cn.close();
               
            }catch(Exception ex){
              ex.printStackTrace();
            }
            return ent;
        }
    
        ArrayList<BasketdetailENT> getBasketDetails(int basketid){
            ArrayList<BasketdetailENT> ar = null;
        
            
            
          try{
                
             //1 load driver
            Class.forName("com.mysql.jdbc.Driver");
            //2 connect
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales","root","");
            //3 get statement for execute
            Statement stmt = cn.createStatement();
            //4 get result
            ResultSet rs = stmt.executeQuery("select * from basketdetail where basketid="+basketid);
            ar =new ArrayList<BasketdetailENT>();
            while(rs.next()){
                BasketdetailENT ent = new BasketdetailENT();
                
                ent.setBasketid(rs.getInt("basketid"));
                ent.setPrice(rs.getInt("price"));
                ent.setBasketdetailid(rs.getInt("basketdetailid"));
                ent.setProductid(rs.getInt("productid"));
                ent.setQty(rs.getInt("qty"));
                
                
                ProductENT product = getProduct(ent.getProductid());
                ent.setProduct(product);
                ar.add(ent);
                 }
            rs.close();
            stmt.close();
            cn.close();
               
            }catch(Exception ex){
              ex.printStackTrace();
            }
            return ar;
        }
public void regirster(UserENT ent){
                
 try{
                
             //1 load driver
            Class.forName("com.mysql.jdbc.Driver");
            //2 connect
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales","root","");
            //3 get statement for execute
            //Statement stmt = cn.createStatement();
            PreparedStatement ps = cn.prepareStatement("insert into user"+
                    "(username,password,address,tel,email,fname,gender,lname,isactive)"+
                    "values (?,?,?,?,?,?,?,?,?)");
            //4 get result
            ps.setString(1,ent.getUsername());
            ps.setString(2,ent.getPassword());
            ps.setString(3,ent.getAddress());
            ps.setString(4,ent.getTel());
            ps.setString(5,ent.getEmail());
            ps.setString(6,ent.getFname());
            ps.setBoolean(7,ent.isGender());
            ps.setString(8,ent.getLname());
            ps.setBoolean(9,ent.isIsactive());
            
            ps.execute();
            
            
          
          
            ps.close();
  
            cn.close();
            
               
            }catch(Exception ex){
              ex.printStackTrace();
            }
    }
            
    public UserENT login(String username,String password){
            UserENT ent=null;
            try{
                
             //1 load driver
            Class.forName("com.mysql.jdbc.Driver");
            //2 connect
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales","root","");
            //3 get statement for execute
            Statement stmt = cn.createStatement();
            //4 get result
            ResultSet rs = stmt.executeQuery("select * from user where username like '"+ username+"'");
            if(rs.next()){
                ent = new UserENT();
                ent.setUserid(rs.getInt("userid"));
                ent.setUsername(rs.getString("username"));
                ent.setPassword(rs.getString("password"));
                ent.setAddress(rs.getString("address"));
                ent.setTel(rs.getString("tel"));
                ent.setEmail(rs.getString("email"));
                ent.setFname(rs.getString("fname"));
                ent.setGender(rs.getBoolean("gender"));
                ent.setLname(rs.getString("lname"));
                ent.setIsactive(rs.getBoolean("isactive"));
                
                
                
            }
            rs.close();
            stmt.close();
            cn.close();
               
            }catch(Exception ex){
              ex.printStackTrace();
            }
            return ent;        
    }           
            
               
       
            
     

}
