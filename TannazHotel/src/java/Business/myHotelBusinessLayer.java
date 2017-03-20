/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Common.PassengerENT;
import Common.ReserveENT;
import Common.RoomENT;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Amirsaleh
 */
public class myHotelBusinessLayer {

    public ArrayList<PassengerENT> allPassengers() {
        ArrayList<PassengerENT> al = new ArrayList<PassengerENT>();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tannazhotel", "root", "");
        String sql="Select * from passenger";
        PreparedStatement ps=con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next())
        {
            PassengerENT user = new PassengerENT();
            user.setAdmin(rs.getBoolean("admin"));
            user.setAuthorized(rs.getBoolean("confirmed"));
            user.setId(rs.getInt("id"));
            user.setUserName(rs.getString("username"));
            user.setName(rs.getString("name"));
            user.setFName(rs.getString("family"));
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
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tannazhotel", "root", "");
        String sql="Select * from passenger where username like ? AND password like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,u);
        ps.setString(2,p);
        ResultSet rs = ps.executeQuery();
        
        if(rs.next())
        {
            user.setAdmin(rs.getBoolean("admin"));
            user.setAuthorized(rs.getBoolean("confirmed"));
            user.setId(rs.getInt("id"));
            user.setUserName(rs.getString("username"));
            user.setName(rs.getString("name"));
            user.setFName(rs.getString("family"));
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

    public void registerReserve(ReserveENT rent) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tannazhotel", "root", "");
            String sql="Insert into reserve (passengerID, sdate, edate, roomID) values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,rent.getUserId());
            ps.setDate(2,rent.getSDate());
            ps.setDate(3,rent.getEDate());
            ps.setInt(4,rent.getRoomId());
            
            ps.execute();

            ps.close();
            con.close();
            
            }
            catch (Exception EX){
                EX.printStackTrace();
                
            }
    }

    public boolean registerRoom(RoomENT rent) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tannazhotel", "root", "");
            String sql="Insert into rooms (image, type, num, bed, price) values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,rent.getImage());
            ps.setString(2,rent.getRoomType());
            ps.setInt(3,rent.getNumberOfRooms());
            ps.setInt(4,rent.getBeds());
            ps.setInt(5,rent.getPrice());
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

    public boolean registerUser(PassengerENT passengerENT) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tannazhotel", "root", "");
            String sql="Insert into passenger (name, family, address, email, password, tel, username, admin, confirmed) values (?,?,?,?,?,?,?,?,?)";
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

    public RoomENT searchForRoom(ReserveENT rent) {
        RoomENT roomENT = new RoomENT();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tannazhotel", "root", "");
        String sql="Select * from rooms where bed like ? and type = ?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, rent.getNumOfBeds());
        ps.setString(2, rent.getRoomType());
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            roomENT.setId(rs.getInt("roomid"));
            roomENT.setNumberOfRooms(rs.getInt("num"));
            roomENT.setImage(rs.getString("image"));
            roomENT.setRoomType(rs.getString("image"));
            roomENT.setBeds(rs.getInt("bed"));
            roomENT.setPrice(rs.getInt("price"));
        }
        rs.close();
        ps.close();
        sql="Select * from reserve where roomID = ? and edate > ? and sdate < ? ";
        ps=con.prepareStatement(sql);
        
        System.out.println(rent.getSDate());
        ps.setInt(1, roomENT.getId());
        ps.setDate(2, rent.getSDate());
        ps.setDate(3, rent.getEDate());
        
        rs = ps.executeQuery();
        int counter = 0;
        while(rs.next())
        {
            
            counter++;
        }
        roomENT.setNumberOfRooms(roomENT.getNumberOfRooms()-counter);
        rs.close();
        ps.close();
        con.close();
        }
        catch (Exception EX){
            EX.printStackTrace();
        }
        return roomENT;
    }

    public void setActive(String[] p) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tannazhotel", "root", "");
        String sql1="UPDATE passenger SET confirmed ='0'";
        PreparedStatement ps1=con.prepareStatement(sql1);
        ps1.execute();
        ps1.close();
        String sql="UPDATE passenger SET confirmed ='1' WHERE id like ? ";
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
