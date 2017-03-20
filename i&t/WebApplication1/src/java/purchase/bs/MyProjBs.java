/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package purchase.bs;

import purchase.common.User;
import purchase.common.Category;
import purchase.common.Product;
import java.sql.*;
import java.util.ArrayList;
import purchase.common.Order;


/**
 *
 * @author 844498
 */
public class MyProjBs {
 
    
public boolean register(User x){
     
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
        String sql="Insert into user (name, fname, email, tel, usern, pass, access) values (?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,x.getName());
        ps.setString(2,x.getFname());
        ps.setString(3,x.getEmail());
        ps.setString(4,x.getTel());
        ps.setString(5,x.getUsern());
        ps.setString(6,x.getPass());
        ps.setString(7,x.getAccess());        
        ps.execute();
                
        ps.close();
        con.close();
        return true;
        }
        catch (Exception EX){
            EX.printStackTrace();
            return false;
        }
    
    
}
public boolean login (User x)
    {
        boolean result=false;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
        String sql="Select * from user where usern like ? AND pass like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,x.getUsern());
        ps.setString(2,x.getPass());
        
        ResultSet rs = ps.executeQuery();
        
        if(rs.next())
        {
            result=true;
        }
        else
        {
            result=false;
        }
        rs.close();
        ps.close();
        con.close();
        return result;
        }
        catch (Exception EX){
            EX.printStackTrace();
        }
    
    return result;
    
    }

public boolean loginAdmin (User x)
    {
        boolean result=false;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
        String sql="Select access from user where usern like ? AND pass like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,x.getUsern());
        ps.setString(2,x.getPass());

        
        ResultSet rs = ps.executeQuery();
        
        if(rs.next())
        {
            if (rs.getString("access").equals("admin"))
                result=true;
            else 
                return false;
        }

        rs.close();
        ps.close();
        con.close();
        return result;
        }
        catch (Exception EX){
            EX.printStackTrace();
        }
    
    return result;
    
    }
public boolean addCategory (Category x){
     
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
        String sql="Insert into category (categn, description) values (?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,x.getCategn());
        ps.setString(2,x.getDescription());
  
       
        ps.execute();
                
        ps.close();
        con.close();
        return true;
        }
        catch (Exception EX){
            EX.printStackTrace();
            return false;
        }
    
    
}
public boolean addProduct(Product x){
     
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
        String sql="Insert into product (pname, price, description, categn, image) values (?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,x.getPname());
        ps.setInt(2,x.getPrice());
        ps.setString(3,x.getDescription());
        ps.setString(4,x.getSelect());
        ps.setString(5,x.getImg());
      
        ps.execute();
                
        ps.close();
        con.close();
        return true;
        }
        catch (Exception EX){
            EX.printStackTrace();
            return false;
        }
    
    
}
 public ArrayList <Product> listProduct() {
        
       ArrayList<Product> plist=new ArrayList<Product>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
            String sql = "SELECT * FROM product";
            Statement st=con.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next())
            {
            Product p = new Product();
            p.setPname(rs.getString("pname"));
            p.setPrice(rs.getInt("price"));
            p.setDescription(rs.getString("description"));
            p.setSelect(rs.getString("categn"));
            p.setImg(rs.getString("image"));
            
            
            plist.add(p);
            
            }
       

          
return plist;
         
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return plist;
     }
public ArrayList <Category> listCategory() {
        
       ArrayList<Category> clist=new ArrayList<Category>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
            String sql = "SELECT * FROM category";
            Statement st=con.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next())
            {
            Category p = new Category();
            p.setCategn(rs.getString("categn"));
            p.setDescription(rs.getString("description"));
          
            clist.add(p);
            
            }
       

          
return clist;
         
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return clist;
     }
 public ArrayList<Product> listProductSearch(Product i) {
        
       ArrayList<Product> plist=new ArrayList<Product>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
            String sql="Select * from product where pname like (?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,i.getPname());
            
            ResultSet rs = ps.executeQuery();
            Product o = new Product();
            while(rs.next())
            {
            o.setPname(rs.getString("pname"));
            o.setPrice(rs.getInt("price"));
            o.setDescription(rs.getString("description"));
            o.setSelect(rs.getString("categn"));
            o.setImg(rs.getString("image"));
                        
            plist.add(o);
            }
       

          
return plist;
         
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return plist;
     }
 public ArrayList <User> listUser() {
        
       ArrayList<User> ulist=new ArrayList<User>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
            String sql = "SELECT * FROM user";
            Statement st=con.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next())
            {
            User u = new User();
            u.setName(rs.getString("name"));
            u.setUsern(rs.getString("usern"));
            u.setFname(rs.getString("fname"));
            u.setPass(rs.getString("pass"));
            u.setTel(rs.getString("tel"));
            u.setEmail(rs.getString("email"));
            u.setAccess(rs.getString("access"));
        
            ulist.add(u);
            
            }
       

          
return ulist;
         
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return ulist;
     }
 public boolean updateUser(User x){
     
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
        String sql="UPDATE user SET access='admin' WHERE usern like ?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,x.getUsern());
              
        ps.execute();
                
        ps.close();
        con.close();
        return true;
        }
        catch (Exception EX){
            EX.printStackTrace();
            return false;
        }
    
    
}
 public ArrayList <User> listUserSession(User i) {
        
       ArrayList<User> plist=new ArrayList<User>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
            String sql="Select * from user where usern like ? and pass like ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,i.getUsern());
            ps.setString(2,i.getPass());
                                    
            ResultSet rs = ps.executeQuery();
            User o = new User();
            while(rs.next())
            {
            o.setName(rs.getString("name"));
            o.setUsern(rs.getString("usern"));
            o.setFname(rs.getString("fname"));
            o.setPass(rs.getString("pass"));
            o.setTel(rs.getString("tel"));
            o.setEmail(rs.getString("email"));
            o.setAccess(rs.getString("access"));
            
                        
            plist.add(o);
            }
       

          
return plist;
         
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return plist;
     }
 public boolean deleteUser(User x){
     
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
        String sql="delete from user where usern like ?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,x.getUsern());

        ps.execute();
                
        ps.close();
        con.close();
        return true;
        }
        catch (Exception EX){
            EX.printStackTrace();
            return false;
        }
    
    
}
 public boolean confirmOrder(String usern,Product o){
     
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
        String sql ="INSERT INTO `order` (`usern` ,`productn`,`status` )VALUES (?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,usern);
        ps.setString(2,o.getPname());
        ps.setString(3,"false");
        ps.execute();
                
        ps.close();
        con.close();
        return true;
        }
        catch (Exception EX){
            EX.printStackTrace();
            return false;
        }
    
    
}
 public Product listProductSearch2(Product i) {
        

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
            String sql="Select * from product where pname like (?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,i.getPname());
            
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
            i.setPrice(rs.getInt("price"));
            i.setDescription(rs.getString("description"));
            i.setSelect(rs.getString("categn"));
            i.setImg(rs.getString("image"));
            }
       

          

         
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return i;
     }
 public ArrayList <Order> listOrder() {
        
       ArrayList<Order> olist=new ArrayList<Order>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
            String sql = "SELECT * FROM `order`";
            Statement st=con.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next())
            {
            Order o = new Order();
            o.setProductn(rs.getString("productn"));
            o.setUsern(rs.getString("usern"));
            o.setStatus(rs.getString("status"));
            o.setId(rs.getInt("ID"));
            
            olist.add(o);
            
            }
                      return olist;
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return olist;
     }
 public boolean updateOrder(Order x){
     
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
        String sql="UPDATE `parsian`.`order` SET `status` = 'true' WHERE `order`.`ID` =?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,x.getId());

        ps.execute();
                
        ps.close();
        con.close();
        return true;
        }
        catch (Exception EX){
            EX.printStackTrace();
            return false;
        }
    
    
}
}