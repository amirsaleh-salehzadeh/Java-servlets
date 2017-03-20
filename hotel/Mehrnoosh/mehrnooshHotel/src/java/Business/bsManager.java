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
public class bsManager {

    public ArrayList<PassengerENT> allUsers() {
        ArrayList<PassengerENT> al = new ArrayList<PassengerENT>();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mehrnooshhotel", "root", "");
        String sql="Select * from passenger";
        PreparedStatement ps=con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next())
        {
            PassengerENT user = new PassengerENT();
            user.setAdmin(rs.getBoolean("admin"));
            user.setAuthorized(rs.getBoolean("confirmed"));
            user.setUserName(rs.getString("username"));
            user.setName(rs.getString("name"));
            user.setFName(rs.getString("familyName"));
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

    public PassengerENT login(String u, String p) {
        PassengerENT user = new PassengerENT();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mehrnooshhotel", "root", "");
        String sql="Select * from passenger where username like ? AND password like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,u);
        ps.setString(2,p);
        ResultSet rs = ps.executeQuery();
        
        if(rs.next())
        {
            user.setAdmin(rs.getBoolean("admin"));
            user.setAuthorized(rs.getBoolean("confirmed"));
            user.setUserName(rs.getString("username"));
            user.setName(rs.getString("name"));
            user.setFName(rs.getString("familyName"));
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

    public void insertBook(ReserveENT ent) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mehrnooshhotel", "root", "");
            String sql="Insert into booking (userName, fromDate, toDate, roomid) values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,ent.getUserName());
            ps.setDate(2,ent.getSDate());
            ps.setDate(3,ent.getEDate());
            ps.setInt(4,ent.getRoomId());
            
            ps.execute();

            ps.close();
            con.close();
            
            }
            catch (Exception EX){
                EX.printStackTrace();
                
            }
    }

    public void insertRoom(RoomENT rent) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mehrnooshhotel", "root", "");
            String sql="Insert into room(beds, type, available, image, price) values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,rent.getBeds());
            ps.setString(2,rent.getRoomType());
            ps.setInt(3,rent.getNumRooms());
            ps.setString(4,rent.getImage());
            ps.setInt(5,rent.getPrice());
            ps.execute();

            ps.close();
            con.close();
            
            }
            catch (Exception EX){
                EX.printStackTrace();
                }
    }

    public boolean register(PassengerENT passengerENT) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mehrnooshhotel", "root", "");
            String sql="Insert into passenger (name, familyName, address, email, password, phone, username, admin, confirmed) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,passengerENT.getName());
            ps.setString(2,passengerENT.getFName());
            ps.setString(3,passengerENT.getAddress());
            ps.setString(4,passengerENT.getEmail());
            ps.setString(5,passengerENT.getPassword());
            ps.setString(6,passengerENT.getPhoneNo());
            ps.setString(7,passengerENT.getUserName());
            ps.setBoolean(8,passengerENT.isAdmin());
            ps.setBoolean(9,passengerENT.isAuthorized());
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

    public RoomENT searchForRoom(ReserveENT reserveENT) {
        RoomENT roomENT = new RoomENT();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mehrnooshhotel", "root", "");
        String sql="Select * from room where beds like ? and type = ?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, reserveENT.getNumOfBeds());
        ps.setString(2, reserveENT.getRoomType());
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            roomENT.setId(rs.getInt("id"));
            roomENT.setNumRooms(rs.getInt("available"));
            roomENT.setImage(rs.getString("image"));
            roomENT.setRoomType(rs.getString("type"));
            roomENT.setBeds(rs.getInt("beds"));
            roomENT.setPrice(rs.getInt("price"));
        }
        rs.close();
        ps.close();
        sql="Select * from booking where roomId = ? and toDate > ? and fromDate < ? ";
        ps=con.prepareStatement(sql);

        ps.setInt(1, roomENT.getId());
        ps.setDate(2, reserveENT.getSDate());
        ps.setDate(3, reserveENT.getEDate());
        
        rs = ps.executeQuery();
        int counter = 0;
        while(rs.next())
        {
        counter++;
        }
        roomENT.setNumRooms(roomENT.getNumRooms()-counter);
        rs.close();
        ps.close();
        con.close();
        }
        catch (Exception EX){
            EX.printStackTrace();
        }
        return roomENT;
    }

    public void activation(String[] p) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mehrnooshhotel", "root", "");
        String sql1="UPDATE passenger SET confirmed ='0'";
        PreparedStatement ps1=con.prepareStatement(sql1);
        ps1.execute();
        ps1.close();
        String sql="UPDATE passenger SET confirmed ='1' WHERE username like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        for(int i = 0 ; i < p.length ; i ++){
            ps.setString(1,p[i]);
            ps.execute();   
        }

        ps.close();
        
        con.close();
        }
        catch (Exception EX){
           EX.printStackTrace();
        }
    }
    

}
