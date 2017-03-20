/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bs;

import com.mysql.jdbc.Statement;
import common.Userparam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Mohammad
 */
public class MyprojBS {

    public ArrayList<String> allRoles() throws SQLException {
           ArrayList<String> roles = new ArrayList<String>();
        try {
        
            String url = "com.mysql.jdbc.Driver";
            String role = null;
            Class.forName(url);
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
            String sql = "select * from roles";
            Statement st = (Statement) cn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next()){
                role = rs.getString("role");
                roles.add(role);
            }

           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyprojBS.class.getName()).log(Level.SEVERE, null, ex);
        }
            return roles;
    }

    public ArrayList<Userparam> allUsers() throws ClassNotFoundException {
           ArrayList<Userparam> us = new ArrayList<Userparam>();
           
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
            String sql = "select * from users";
            Statement st = (Statement) cn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next()){
                Userparam u = new Userparam();
                u.setUsername(rs.getString("Username"));
                u.setPassword(rs.getString("Password"));
                u.setName(rs.getString("Name"));
                u.setFamily(rs.getString("Family"));
                u.setAddress(rs.getString("Address"));
                u.setEmail(rs.getString("email"));
                u.setPhone_number1(rs.getString("phone"));
                u.setRole(rs.getString("role"));
                us.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyprojBS.class.getName()).log(Level.SEVERE, null, ex);
        } 
            return us;
    }

   //method checkuser
    public Userparam checkUser (Userparam uparam) throws ClassNotFoundException
    {			Userparam u = new Userparam();
        try {
            String url = "com.mysql.jdbc.Driver";
            Class.forName(url);
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
            String sql = "select * from users where Username like ? AND Password like ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, uparam.getUsername());
            ps.setString(2, uparam.getPassword());
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                
                u.setUsername(rs.getString("Username"));
                u.setPassword(rs.getString("Password"));
                u.setName(rs.getString("Name"));
                u.setFamily(rs.getString("Family"));
                u.setAddress(rs.getString("Address"));
                u.setEmail(rs.getString("email"));
                u.setPhone_number1(rs.getString("phone"));
                u.setRole(rs.getString("role"));
            }
            rs.close();
            ps.close();
            cn.close();


        } catch (SQLException ex) {
            Logger.getLogger(MyprojBS.class.getName()).log(Level.SEVERE, null, ex);
            
        }          
            return u;

           
    }

    public boolean delete(String username) {
        
     try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
            String sql="delete from users where Username like ?";
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,username);

            ps.execute();

            ps.close();
            cn.close();
            return true;
            }
        catch (Exception EX){
            EX.printStackTrace();
            return false;
        }
    }
  //method user register (revised )
    public void register (Userparam uparam){
     
       try{ 
         
         String url = "com.mysql.jdbc.Driver";
         Class.forName(url);
         Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
         
         String sql = "insert into users (Username,Password,Name,Family,Address,email,phone,role) values(?,?,?,?,?,?,?,?)";
         PreparedStatement ps = cn.prepareStatement(sql);
         ps.setString(1, uparam.getUsername());
         ps.setString(2,uparam.getPassword());
         ps.setString(3,uparam.getName());
         ps.setString(4,uparam.getFamily());
         ps.setString(5, uparam.getAddress());
         ps.setString(6, uparam.getEmail());
         ps.setString(7, uparam.getPhone_number1());
         ps.setString(8, uparam.getRole());
         ps.execute();
         ps.close();
         cn.close();
         
         }catch(SQLException ex){
           Logger.getLogger(MyprojBS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyprojBS.class.getName()).log(Level.SEVERE, null, ex);
         
       }
    }
    public void addRole (String role) throws ClassNotFoundException{
     
       try{ 
         Class.forName("com.mysql.jdbc.Driver");
         Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
         String sql = "insert into roles (role) values(?)";
         PreparedStatement ps = cn.prepareStatement(sql);
         ps.setString(1, role);
         ps.execute();
         ps.close();
         cn.close();
         
         }catch(SQLException ex){
           Logger.getLogger(MyprojBS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   //method confirm registered users by admin
    public boolean confirmUser(Userparam uparam,boolean confirm){
        
        boolean result=false;
        //return false;
        try {
            String url = "com.mysql.jdbc.Driver";
            Class.forName(url);
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
            String sql = "UPDATE users SET is_active=? WHERE Username like ?"; 
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, confirm?1:0);
            ps.setString(2, uparam.getUsername());
            
            ps.execute();
            ps.close();
            return result;

        } catch (SQLException ex) {
            Logger.getLogger(MyprojBS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyprojBS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;

    }
  
   // method get userdetail
    public Userparam getuser(Userparam uparam){
        
        Userparam result = new Userparam();
        
        try {
        String url = "com.mysql.jdbc.Driver";
        Class.forName(url);
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
        String sql = "select * from users Where Username=?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, uparam.getUsername());
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            uparam.setName(rs.getString("Name"));
            uparam.setFamily(rs.getString("Family"));
            uparam.setAddress(rs.getString("Address"));
            uparam.setEmail(rs.getString("email"));
            uparam.setPhone_number1(rs.getString("phone_number1"));
            
            result = uparam;
        }
        
        result.setUsername(uparam.getUsername());
        
        rs.close();
        ps.close();
        cn.close();
        return result;
    
        }catch (SQLException ex) {
            Logger.getLogger(MyprojBS.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(MyprojBS.class.getName()).log(Level.SEVERE, null, ex);
        }
    return  result;
    
    }
   
    
    public ArrayList<Userparam> retrieveUserRegisterd(){
        ArrayList<Userparam> New_registered_users_List = new ArrayList<Userparam>();
        
        try {

            String url = "com.mysql.jdbc.Driver";
            Class.forName(url);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");

            String sql = "select * from users where is_active is null";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Userparam user = new Userparam();
                user.setUsername(rs.getString("Username"));
                user.setPassword(rs.getString("Password"));
                user.setName(rs.getString("Name"));
                user.setFamily(rs.getString("Family"));
                user.setEmail(rs.getString("email"));
                
                New_registered_users_List.add(user);
            }
            rs.close();
            ps.close();

            return New_registered_users_List;
        } catch (SQLException ex) {
            Logger.getLogger(MyprojBS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyprojBS.class.getName()).log(Level.SEVERE, null, ex);
        }
     return New_registered_users_List;
      
    }

    public ArrayList<Userparam> searchForRole(String userRole, boolean isForRole) {
            ArrayList<Userparam> al = new ArrayList<Userparam>();
        try {

            String url = "com.mysql.jdbc.Driver";
            Class.forName(url);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
            String sql = "";
            if(isForRole){
                 sql = "select * from users where role like ?";
            } else {
                sql = "select * from users where Username like ?";
            }
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userRole);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Userparam u = new Userparam();
                u.setUsername(rs.getString("Username"));
                u.setPassword(rs.getString("Password"));
                u.setName(rs.getString("Name"));
                u.setFamily(rs.getString("Family"));
                u.setAddress(rs.getString("Address"));
                u.setEmail(rs.getString("email"));
                u.setPhone_number1(rs.getString("phone"));
                u.setRole(rs.getString("role"));
                al.add(u);
            }
            rs.close();
            ps.close();

            return al;
        } catch (SQLException ex) {
            Logger.getLogger(MyprojBS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyprojBS.class.getName()).log(Level.SEVERE, null, ex);
        }
     return al;
    }

    public boolean update(String username, String userRole) {
         try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
        String sql="UPDATE users set role = ?  WHERE Username like ?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,userRole);
        ps.setString(2,username);
              
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
