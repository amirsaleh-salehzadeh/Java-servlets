/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Common.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Amirsaleh
 */
public class projbs {

    public ArrayList<userENT> allUsers() {
        ArrayList<userENT> al = new ArrayList<userENT>();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
        String sql="Select * from user";
        PreparedStatement ps=con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            userENT user = new userENT();
            user.setConfirmed(rs.getBoolean("authurized"));
            user.setUserName(rs.getString("username"));
            
            
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

    public boolean reserve(reserveENT ent) {
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            String sql="Insert into reserve(toDate, fromDate, userName, roomID) values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1,ent.getToDate());
            ps.setDate(2,ent.getFromDate());
            ps.setString(3,ent.getUserName());
            ps.setInt(4,ent.getRoomId());
            
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

    public void activeUser(String un, String parameter) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
        String sql="update user set authurized =? where username like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,parameter);
        ps.setString(2, un);
        ps.execute();   
        ps.close();
        
        con.close();
        }
        catch (Exception EX){
           EX.printStackTrace();
        }
    }

    public userENT login(String un, String pass) {
        userENT user = new userENT();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
        String sql="Select * from user where username like ? AND pass like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,un);
        ps.setString(2,pass);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            user.setConfirmed(rs.getBoolean("authurized"));
            user.setUserName(rs.getString("username"));
            user.setPassword(rs.getString("pass"));
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

    public boolean registerUser(userENT ent) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            String sql="Insert into user (name, family, email, pass, username, authurized) values (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,ent.getName());
            ps.setString(2,ent.getFamilyName());
            ps.setString(3,ent.getEmail());
            ps.setString(4,ent.getPassword());
            ps.setString(5,ent.getUserName());
            ps.setBoolean(6,ent.isConfirmed());
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

    public void insertRoom(roomENT rent) {
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            String sql="Insert into room (image, available, beds, price) values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,rent.getImage());
            ps.setInt(2,rent.getAvailabile());
            ps.setInt(3,rent.getNumOfBeds());
            ps.setInt(4,rent.getPrice());
            ps.execute();

            ps.close();
            con.close();
            
            }
            catch (Exception EX){
                EX.printStackTrace();
                
            }
    }

    public roomENT searchForRooms(reserveENT ent, int bedNo) {
        roomENT roomENT = new roomENT();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
        String sql="Select * from room where beds like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, bedNo);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            roomENT.setRoomId(rs.getInt("roomID"));
            roomENT.setAvailabile(rs.getInt("available"));
            roomENT.setNumOfBeds(rs.getInt("beds"));
            roomENT.setPrice(rs.getInt("price"));
            roomENT.setImage(rs.getString("image"));
        }
        rs.close();
        ps.close();
        ps=con.prepareStatement("Select * from book where roomID = ? and toDate > ? and fromDate < ? ");
        ps.setInt(1, roomENT.getRoomId());
        ps.setDate(2, ent.getFromDate());
        ps.setDate(3, ent.getToDate());
        rs = ps.executeQuery();
        int x = 0;
        while(rs.next())
        {
           x++;
        }
        x=roomENT.getAvailabile()-x;
        roomENT.setAvailabile(x);
        rs.close();
        ps.close();
        con.close();
        }
        catch (Exception EX){
            EX.printStackTrace();
        }
        return roomENT;
    }

    

}
