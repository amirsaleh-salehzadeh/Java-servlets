/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLayer;

import CommonLayer.Piano;
import CommonLayer.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Amirsaleh
 */
public class MyProjBs {

    public ArrayList<Piano> allPianos() {
      ArrayList<Piano> pianos = new ArrayList<Piano>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piano", "root", "");
            String sql = "SELECT * FROM piano";
            Statement st=con.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                Piano piano = new Piano();
                piano.setCompanyName(rs.getString("companyName"));
                piano.setProductName(rs.getString("productName"));
                piano.setWeight(rs.getInt("weight"));
                piano.setPrice(rs.getInt("price"));
                piano.setImage(rs.getString("image"));
                pianos.add(piano);
            }
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
      return pianos;
    }

    public boolean confirmPurchase(String userName, int totalPrice) {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piano", "root", "");
        String sql="Insert into finalizedorder(userName, totalPrice) values (?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,userName);
        ps.setInt(2,totalPrice);

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
    public boolean insertPiano(Piano piano) {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piano", "root", "");
        String sql="Insert into piano (companyName, productName, weight, price, image) values (?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,piano.getCompanyName());
        ps.setString(2,piano.getProductName());
        ps.setInt(3,piano.getWeight());
        ps.setInt(4,piano.getPrice());
        ps.setString(5,piano.getImage());
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
        User user1 = new User();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/piano", "root", "");
            String sql="Select * from user where userName like ? AND password like ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,user.getUserName());
            ps.setString(2,user.getPassWord());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                user1.setSecurity(rs.getBoolean("access"));
                user1.setName(rs.getString("name"));
                user1.setFamilyName(rs.getString("familyName"));
                user1.setUserName(rs.getString("userName"));
                user1.setPassWord(rs.getString("password"));        
            }
            rs.close();
            ps.close();
            con.close();
        }
        catch (Exception EX){
            EX.printStackTrace();
        }
    return user1;
    }

public boolean register(User user){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piano", "root", "");
        String sql="Insert into user (name, familyName, userName, access, password) values (?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,user.getName());
        ps.setString(2,user.getFamilyName());
        ps.setString(3,user.getUserName());
        ps.setBoolean(4,user.isSecurity());
        ps.setString(5,user.getPassWord());
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
    public Piano searchForPiano(String productName) {
            Piano piano = new Piano();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piano", "root", "");
            String sql="Select * from piano where productName like (?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,productName);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
            piano.setProductName(rs.getString("productName"));    
            piano.setPrice(rs.getInt("price"));
            piano.setImage(rs.getString("image"));
            piano.setCompanyName(rs.getString("companyName"));
            piano.setWeight(rs.getInt("weight"));
            }
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
          return piano;
    }
    
}
