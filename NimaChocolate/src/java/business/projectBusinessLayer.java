/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import common.Brand;
import common.Chocolate;
import common.User;
import java.sql.*;
//import java.util.ArrayList;
import java.util.ArrayList;



/**
 *
 * @author 844498
 */
public class projectBusinessLayer {

public boolean confirmPurchase(String name, String Fname, String product){
     
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nimaChocolate", "root", "");
        String sql="Insert into purchaseconfirm (name, fname, product) values (? , ? , ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,name);
        ps.setString(2,Fname);
        ps.setString(3,product);
       
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
 
    
public boolean register(User x){
     
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nimaChocolate", "root", "");
        String sql="Insert into user (name, familyName, address, email, userName, password, security) values (?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,x.getName());
        ps.setString(2,x.getFamilyName());
        ps.setString(3,x.getAddress());
        ps.setString(4,x.getEmail());
        ps.setString(5,x.getUserName());
        ps.setString(6,x.getPassWord());
        ps.setString(7,x.getSecurity());        
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
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nimaChocolate", "root", "");
        String sql="Select * from user where userName like ? AND password like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,x.getUserName());
        ps.setString(2,x.getPassWord());
        
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

public boolean adminLog (User x)
    {
        boolean result=false;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nimaChocolate", "root", "");
        String sql="Select security from user where userName like ? AND password like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,x.getUserName());
        ps.setString(2,x.getPassWord());

        
        ResultSet rs = ps.executeQuery();
        
        if(rs.next())
        {
            if (rs.getString("security").equals("admin"))
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
public boolean addBrand (Brand x){
     
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nimaChocolate", "root", "");
        String sql="Insert into brands (brandName , brandDescription , brandImageAddress ) values (?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,x.getBrandName());
        ps.setString(2,x.getBrandDescription());
        ps.setString(3,x.getBrandImageAddress());  
       
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
public boolean addChocolate(Chocolate x){
     
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nimaChocolate", "root", "");
        String sql="Insert into chocolate (chocolateName , chocolateDetail , imageAddress , price , brandName ) values (?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,x.getChocolateName());
        ps.setString(2,x.getChocolateDetail());
        ps.setString(3,x.getImageAddress());
        ps.setInt(4,x.getPrice());
        ps.setString(5,x.getBrandName());
      
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
 public ArrayList <Chocolate> allChocolates() {
       ArrayList<Chocolate> chocolates = new ArrayList<Chocolate>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nimaChocolate", "root", "");
            String sql = "SELECT * FROM chocolate";
            Statement st=con.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next())
            {
            Chocolate chocolate = new Chocolate();
            chocolate.setChocolateName(rs.getString("chocolateName"));
            chocolate.setPrice(rs.getInt("price"));
            chocolate.setChocolateDetail(rs.getString("chocolateDetail"));
            chocolate.setImageAddress(rs.getString("imageAddress"));
            chocolate.setBrandName(rs.getString("brandName"));
            chocolates.add(chocolate);
            }
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return chocolates;
     }
public ArrayList <Brand> allBrands() {
       ArrayList<Brand> brands =new ArrayList<Brand>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nimaChocolate", "root", "");
            String sql = "SELECT * FROM brands";
            Statement st=con.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next())
            {
            Brand brand = new Brand();
            brand.setBrandName(rs.getString("brandName"));
            brand.setBrandDescription(rs.getString("brandDescription"));
            brand.setBrandImageAddress(rs.getString("brandImageAddress"));
            brands.add(brand);
            }
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return brands;
     }
 public ArrayList<Chocolate> allChocolates(Chocolate i) {
        
       ArrayList<Chocolate> chocolates = new ArrayList<Chocolate>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nimaChocolate", "root", "");
            String sql="Select * from chocolate where brandName like (?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,i.getBrandName());
            
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
            Chocolate chocolate = new Chocolate();
            chocolate.setBrandName(rs.getString("brandName"));    
            chocolate.setChocolateDetail(rs.getString("chocolateDetail"));
            chocolate.setPrice(rs.getInt("price"));
            chocolate.setImageAddress(rs.getString("imageAddress"));
            chocolate.setChocolateName(rs.getString("chocolateName"));

            chocolates.add(chocolate);
            }
       

          
         
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return chocolates;
     }
// public ArrayList <User> listUser() {
//        
//       ArrayList<User> ulist=new ArrayList<User>();
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
//            String sql = "SELECT * FROM user";
//            Statement st=con.createStatement();
//            ResultSet rs;
//            rs = st.executeQuery(sql);
//            while(rs.next())
//            {
//            User u = new User();
//            u.setName(rs.getString("name"));
//            u.setUsern(rs.getString("usern"));
//            u.setFname(rs.getString("fname"));
//            u.setPass(rs.getString("pass"));
//            u.setTel(rs.getString("tel"));
//            u.setEmail(rs.getString("email"));
//            u.setAccess(rs.getString("access"));
//        
//            ulist.add(u);
//            
//            }
//       
//
//          
//return ulist;
//         
//        } 
//        catch (Exception EX){
//            EX.printStackTrace();
//        }
//   
//          return ulist;
//     }
// public boolean updateUser(User x){
//     
//    try{
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
//        String sql="UPDATE user SET access='admin' WHERE usern like ?";
//        PreparedStatement ps=con.prepareStatement(sql);
//        ps.setString(1,x.getUsern());
//              
//        ps.execute();
//                
//        ps.close();
//        con.close();
//        return true;
//        }
//        catch (Exception EX){
//            EX.printStackTrace();
//            return false;
//        }
//    
//    
//}
 public ArrayList <User> listUser(User i) {
        
       ArrayList<User> plist=new ArrayList<User>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nimaChocolate", "root", "");
            String sql="Select * from user where userName like ? and password like ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,i.getUserName());
            ps.setString(2,i.getPassWord());
                                    
            ResultSet rs = ps.executeQuery();
            User o = new User();
            while(rs.next())
            {
            o.setName(rs.getString("name"));
            o.setUserName(rs.getString("userName"));
            o.setFamilyName(rs.getString("familyName"));
            o.setPassWord(rs.getString("password"));
            o.setEmail(rs.getString("email"));
            o.setSecurity(rs.getString("security"));
            o.setAddress(rs.getString("address"));
            
                        
            plist.add(o);
            }
       

          
return plist;
         
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return plist;
     }
// public boolean deleteUser(User x){
//     
//    try{
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nimaChocolate", "root", "");
//        String sql="delete from user where userName like ?";
//        PreparedStatement ps=con.prepareStatement(sql);
//        ps.setString(1,x.getUserName());
//
//        ps.execute();
//                
//        ps.close();
//        con.close();
//        return true;
//        }
//        catch (Exception EX){
//            EX.printStackTrace();
//            return false;
//        }
    
//    
//}
// public boolean confirmOrder(String usern,Product o){
//     
//    try{
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
//        String sql ="INSERT INTO `order` (`usern` ,`productn`,`status` )VALUES (?,?,?)";
//        PreparedStatement ps=con.prepareStatement(sql);
//        ps.setString(1,usern);
//        ps.setString(2,o.getPname());
//        ps.setString(3,"false");
//        ps.execute();
//                
//        ps.close();
//        con.close();
//        return true;
//        }
//        catch (Exception EX){
//            EX.printStackTrace();
//            return false;
//        }
//    
//    
//}
 
 public Chocolate listChocolatesSearch(Chocolate i) {
        
            Chocolate chocolate = new Chocolate();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nimaChocolate", "root", "");
            String sql="Select * from chocolate where chocolateName like (?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,i.getChocolateName());
            
            ResultSet rs = ps.executeQuery();

//            while(rs.next())
//            {
                chocolate.setChocolateName(i.getChocolateName());
                chocolate.setPrice(rs.getInt("price"));
                chocolate.setBrandName(rs.getString("brandName"));
                chocolate.setChocolateDetail(rs.getString("chocolateDetail"));
                chocolate.setImageAddress(rs.getString("imageAddress "));
//            }
       

          

         
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return chocolate;
     }
 
// public ArrayList <Order> listOrder() {
//        
//       ArrayList<Order> olist=new ArrayList<Order>();
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
//            String sql = "SELECT * FROM `order`";
//            Statement st=con.createStatement();
//            ResultSet rs;
//            rs = st.executeQuery(sql);
//            while(rs.next())
//            {
//            Order o = new Order();
//            o.setProductn(rs.getString("productn"));
//            o.setUsern(rs.getString("usern"));
//            o.setStatus(rs.getString("status"));
//            o.setId(rs.getInt("ID"));
//            
//            olist.add(o);
//            
//            }
//                      return olist;
//        } 
//        catch (Exception EX){
//            EX.printStackTrace();
//        }
//   
//          return olist;
//     }
// public boolean updateOrder(Order x){
//     
//    try{
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parsian", "root", "");
//        String sql="UPDATE `parsian`.`order` SET `status` = 'true' WHERE `order`.`ID` =?";
//        PreparedStatement ps=con.prepareStatement(sql);
//        ps.setInt(1,x.getId());
//
//        ps.execute();
//                
//        ps.close();
//        con.close();
//        return true;
//        }
//        catch (Exception EX){
//            EX.printStackTrace();
//            return false;
//        }
//    
//    
//}
}