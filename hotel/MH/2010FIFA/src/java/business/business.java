/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package business;
import Common.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class business {

    public boolean insertMatch(MatchEntity matchEntity) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/2010fifa", "root", "");
            String sql="Insert into matches (guest ,host ,time ,date ,stadium ) values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,matchEntity.getGuest());
            ps.setString(2,matchEntity.getHost());
            ps.setString(3,matchEntity.getTime());
            ps.setDate(4,matchEntity.getDate());
            ps.setString(5,matchEntity.getStadium());
            
            
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
    public boolean insertUser(UserEntity user) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/2010fifa", "root", "");
            String sql="Insert into user values (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,user.getName());
            ps.setString(2,user.getFname());
            ps.setString(3,user.getEmail());
            ps.setString(4,user.getUsername());
            ps.setString(5,user.getPassword());
            ps.setBoolean(6, user.isConfirmed());
            
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
    public UserEntity login(String a, String b) {
        UserEntity user = new UserEntity();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/2010fifa", "root", "");
        String sql="Select * from user where usern like ? AND pass like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,a);
        ps.setString(2,b);
        ResultSet rs = ps.executeQuery();
        
        if(rs.next())
        {
            user.setConfirmed(rs.getBoolean("confirm"));
            user.setUsername(rs.getString("usern"));
            user.setPassword(rs.getString("pass"));
            user.setName(rs.getString("name"));
            user.setFname(rs.getString("fname"));
        }else{
            user=null;
        }
       
        rs.close();
        ps.close();
        con.close();
        }
        catch (Exception EX){
            user=null;
            EX.printStackTrace();
        }
    
    return user;
    }

    public void userConfirmation(String uname, String parameter) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/2010fifa", "root", "");
        String sql="update user set confirm =? where usern like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        String val = "0";
        if(parameter.equals("false")){
        val="1";
        }
        ps.setString(1,val);
        ps.setString(2, uname);
        ps.execute();   
        ps.close();
        
        con.close();
        }
        catch (Exception EX){
           EX.printStackTrace();
        }
    }
    public ArrayList<UserEntity> userList() {
        ArrayList<UserEntity> al = new ArrayList<UserEntity>();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/2010fifa", "root", "");
        String sql="Select * from user";
        PreparedStatement ps=con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next())
        {
            UserEntity user = new UserEntity();
            user.setUsername(rs.getString("usern"));
            user.setName(rs.getString("name"));
            user.setFname(rs.getString("fname"));
            user.setConfirmed(rs.getBoolean("confirm"));
            al.add(user);
        }
       
        rs.close();
        ps.close();
        con.close();
        }
        catch (Exception EX){
            EX.printStackTrace();
        }
        return al;
    }
}
