/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BusinessLayer;


import Common.Dvd;
import Common.Order;
import Common.User;
import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author Amirsaleh
 */
public class BusinessLayer {

    public boolean addDvd(Dvd dvd) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amirdvdstore", "root", "");
            String sql="Insert into dvd (name, description, imageAddress ) values (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,dvd.getName());
            ps.setString(2,dvd.getDescription());
            ps.setString(3,dvd.getImage());
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

    public boolean confirmOrder(Order order) {
        try{    
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amirdvdstore", "root", "");
            String sql="Insert into confirmedorder (userName , price) values (?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,order.getUserName());
            ps.setString(2,order.getPrice());
            
            ps.execute();

            ps.close();
            con.close();
                return true;
        }catch (Exception EX){
            EX.printStackTrace();
                return false;
        }
        
    }

    public boolean isAdmin(User user) {
        boolean result = false;
        try{
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amirdvdstore", "root", "");
        String sql="Select security from user where userName like ? AND passWord like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,user.getUserName());
        ps.setString(2,user.getPassWord());

        
        ResultSet rs = ps.executeQuery();
        
        if(rs.next())
        {
            if (rs.getBoolean("adminAccess")){
                result = true;
            }
            else {
                result = false;
            }
        }

        rs.close();
        ps.close();
        con.close();
        
        }
        catch (Exception EX){
            EX.printStackTrace();
        }
    
    return result;
    
    }


    public User login(User user) {
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amirdvdstore", "root", "");
        String sql="Select * from user where userName like ? AND passWord like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,user.getUserName());
        ps.setString(2,user.getPassWord());
        
        ResultSet rs = ps.executeQuery();
        boolean b =false;
        if(rs.next())
        {
            if("1".equalsIgnoreCase(rs.getString("adminAccess"))){
              b = true;  
            }
            user.setAdminAccess(b);
            user.setFamilyName(rs.getString("fName"));
        }
       
        rs.close();
        ps.close();
        con.close();
        }
        catch (Exception EX){
            EX.printStackTrace();
        }
    
    return user;
    }

    public boolean register(User i) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amirdvdstore", "root", "");
            String sql="Insert into user (name, fName, telephone, userName , passWord , address, adminAccess ) values (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,i.getName());
            ps.setString(2,i.getFamilyName());
            ps.setString(3,i.getAddress());
            ps.setInt(4,i.getTelephone());
            ps.setString(5,i.getUserName());
            ps.setString(6,i.getPassWord());
            ps.setBoolean(7,i.isAdminAccess());        
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

    public ArrayList<Dvd> retriveShop() {
       ArrayList<Dvd> dvds = new ArrayList<Dvd>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amirdvdstore", "root", "");
            String sql = "SELECT * FROM dvd";
            Statement st = con.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next())
            {
            Dvd dvd = new Dvd();
            dvd.setName(rs.getString("name"));
            dvd.setDescription(rs.getString("description"));
            dvd.setImage(rs.getString("imageAddress"));
            dvds.add(dvd);
           }
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return dvds;
    }

    public Dvd searchForDvd(String searchName) {
            Dvd dvd = new Dvd();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amirdvdstore", "root", "");
            String sql="Select * from dvd where name like (?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,searchName);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
            dvd.setName(rs.getString("name"));    
            dvd.setDescription(rs.getString("description"));
            dvd.setImage(rs.getString("imageAddress"));
            }
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return dvd;
    }
    

}
