/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLayer;

import common.RoomENT;
import common.bookENT;
import common.userENT;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Amirsaleh
 */
public class myProjBS {

    public ArrayList<userENT> allUsers() {
        ArrayList<userENT> al = new ArrayList<userENT>();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldarush", "root", "");
        String sql="Select * from user";
        PreparedStatement ps=con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            userENT user = new userENT();
            user.setConfirmed(rs.getBoolean("confirmed"));
            user.setId(rs.getInt("id"));
            user.setUserName(rs.getString("usern"));
            user.setName(rs.getString("name"));
            user.setFName(rs.getString("fname"));
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

    public boolean book(bookENT ent) {
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldarush", "root", "");
            String sql="Insert into book(toDate, fromDate, userID, roomID) values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1,ent.getEDate());
            ps.setDate(2,ent.getSDate());
            ps.setInt(3,ent.getUserId());
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

    public void confirmUser(int id, String parameter) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldarush", "root", "");
        String sql="UPDATE user SET confirmed =? WHERE id like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,parameter);
        ps.setInt(2, id);
        ps.execute();   
        ps.close();
        
        con.close();
        }
        catch (Exception EX){
           EX.printStackTrace();
        }
    }

    public userENT login(String parameter, String parameter0) {
        userENT user = new userENT();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldarush", "root", "");
        String sql="Select * from user where usern like ? AND pass like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,parameter);
        ps.setString(2,parameter0);
        ResultSet rs = ps.executeQuery();
        
        if(rs.next())
        {
            user.setConfirmed(rs.getBoolean("confirmed"));
            user.setId(rs.getInt("id"));
            user.setUserName(rs.getString("usern"));
            user.setPassword(rs.getString("pass"));
            user.setName(rs.getString("name"));
            user.setFName(rs.getString("fname"));
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
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldarush", "root", "");
            String sql="Insert into user (name, fname, email, pass, phone, usern, confirmed) values (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,ent.getName());
            ps.setString(2,ent.getFName());
            ps.setString(3,ent.getEmail());
            ps.setString(4,ent.getPassword());
            ps.setString(5,ent.getPhoneNo());
            ps.setString(6,ent.getUserName());
            ps.setBoolean(7,ent.isConfirmed());
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

    public void saveRoom(RoomENT rent) {
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldarush", "root", "");
            String sql="Insert into room (image, available, beds, price) values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,rent.getImage());
            ps.setInt(2,rent.getAvailability());
            ps.setInt(3,rent.getBeds());
            ps.setInt(4,rent.getPrice());
            ps.execute();

            ps.close();
            con.close();
            
            }
            catch (Exception EX){
                EX.printStackTrace();
                
            }
    }

    public RoomENT searchForRooms(bookENT eNT, int parseInt) {
        RoomENT roomENT = new RoomENT();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldarush", "root", "");
        String sql="Select * from room where beds like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, parseInt);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            roomENT.setId(rs.getInt("id"));
            roomENT.setAvailability(rs.getInt("available"));
            roomENT.setImage(rs.getString("image"));
            roomENT.setBeds(rs.getInt("beds"));
            roomENT.setPrice(rs.getInt("price"));
        }
        rs.close();
        ps.close();
        ps=con.prepareStatement("Select * from book where roomID = ? and toDate > ? and fromDate < ? ");
        ps.setInt(1, roomENT.getId());
        ps.setDate(2, eNT.getSDate());
        ps.setDate(3, eNT.getEDate());
        rs = ps.executeQuery();
        int numOfReserved = 0;
        while(rs.next())
        {
           numOfReserved++;
        }
        roomENT.setAvailability(roomENT.getAvailability()-numOfReserved);
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
