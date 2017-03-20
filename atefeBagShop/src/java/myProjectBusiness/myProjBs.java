/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myProjectBusiness;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import objects.Bag;
import objects.User;

/**
 *
 * @author Amirsaleh
 */
public class myProjBs {

    public boolean insertBag(Bag bag) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atefehbagshop", "root", "");
            String sql="Insert into bag (name, price, description, image) values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,bag.getName());
            ps.setInt(2,bag.getPrice());
            ps.setString(3,bag.getDescription());
            ps.setString(4,bag.getImage());

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
    
    public boolean insertUser(User u) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atefehbagshop", "root", "");
            String sql="Insert into users (name, surname , email ,password ,security  ) values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,u.getName());
            ps.setString(2,u.getBigName());
            ps.setString(3,u.getEmail());
            ps.setString(4,u.getPassword());
            ps.setBoolean(5,u.isSecurity());
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
    
    public User login(User user) {
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atefehbagshop", "root", "");
        String sql="Select * from users where email like ? AND password like ? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,user.getEmail());
        ps.setString(2,user.getPassword());
        
        ResultSet rs = ps.executeQuery();
        
        if(rs.next())
        {
            user.setSecurity(rs.getBoolean("security"));
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

    public ArrayList<Bag> allBags() {
       ArrayList<Bag> bags = new ArrayList<Bag>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atefehbagshop", "root", "");
            String sql = "SELECT * FROM bag";
            Statement st = con.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next())
            {
            Bag bag = new Bag();
            bag.setName(rs.getString("name"));
            bag.setDescription(rs.getString("description"));
            bag.setPrice(rs.getInt("price"));
            bag.setImage(rs.getString("image"));
            bags.add(bag);
           }
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return bags;
    }

    public boolean purchaseConfirm(String email, int price) {
                try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atefehbagshop", "root", "");
            String sql="Insert into purchase (price, email) values (?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(2,email);
            ps.setInt(1,price);
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

    public Bag searchByBag(String name) {
            Bag bag = new Bag();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atefehbagshop", "root", "");
            String sql="Select * from bag where name like (?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,name);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
            bag.setName(rs.getString("name"));    
            bag.setPrice(rs.getInt("price"));
            bag.setImage(rs.getString("image"));
            }
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
   
          return bag;
    }
    
}