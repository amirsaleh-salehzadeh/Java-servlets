/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Common.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//This class contains methods which filled the objects from database and vice versa
public class BusinessLayer {

    public boolean book(BookEntity bookEntity) {
        //this method save information about a book
        try{
            Class.forName("com.mysql.jdbc.Driver");//define the driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/2010fifa", "root", "");
            //creates a connection to 2010fifa database with its username and password
            String sql="Insert into booking values (?,?,?,?)";
            //creates and sql statement which insert values in the related table
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,bookEntity.getUserName());
            ps.setInt(2,bookEntity.getMatchEntity().getId());
            ps.setInt(3,bookEntity.getTotalPrice());
            ps.setInt(4,bookEntity.getQuantity());
            //creates a statement which filled by the related values based on the connection info.
            
            
            ps.execute();//execute of the statement
            ps.close();//closing the statement
            con.close();//closing the connection
            return true;//when process done with no error the methods return true
            }
        catch (Exception EX){
                EX.printStackTrace();
                return false;
            }
    }

   
    public boolean insertMatch(MatchEntity matchEntity) {
        //this method insert a match information into a table
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
        //this method insert a user information into a table
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
     public BookEntity previewAMatch(int id) {
         //this method get the information about a match based on its matchID
        BookEntity bookEntity = new BookEntity();
         try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/2010fifa", "root", "");
        String sql="Select * from booking where matchID like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        int availableSeat = 0;
        //based on the reserved number of tickets fixed the attribute of quantity in a match
        while(rs.next()){
            availableSeat = availableSeat + rs.getInt("qty");
        }
        bookEntity.setQuantity(availableSeat);
        ps.close();
        rs.close();
        sql = "Select * from matches where matchID like ? ";
        
        PreparedStatement ps2=con.prepareStatement(sql);
        ps2.setInt(1,id);
        ResultSet rs2 = ps2.executeQuery();//create a result from the statement
        MatchEntity matchEntity = new MatchEntity();
        if(rs2.next()){
            matchEntity.setDate(rs2.getDate("date"));
            matchEntity.setGuest(rs2.getString("guest"));
            matchEntity.setHost(rs2.getString("host"));
            matchEntity.setTime(rs2.getString("time"));
            matchEntity.setStadium(rs2.getString("stadium"));
            matchEntity.setId(rs2.getInt("matchID"));
        }
        bookEntity.setMatchEntity(matchEntity);
       
        rs2.close();
        ps2.close();
        con.close();
        }
        catch (Exception EX){
            EX.printStackTrace();
        }
        return bookEntity;
    }
    public UserEntity login(String a, String b) {
        //check the validity of a user based on its username and password
        //then return the logged in user info as result
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

    public ArrayList<MatchEntity> searchForaMatch(String parameter) {
        //this method searches a match based on the name of teams, guest or host
        ArrayList<MatchEntity> matchEntitys = new ArrayList<MatchEntity>();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/2010fifa", "root", "");
        String sql="Select * from matches where guest like ? or host like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,"%"+parameter+"%");
        ps.setString(2,"%"+parameter+"%");
        ResultSet rs = ps.executeQuery();
        
        while(rs.next())
        {
            MatchEntity matchEntity = new MatchEntity();
            matchEntity.setDate(rs.getDate("date"));
            matchEntity.setGuest(rs.getString("guest"));
            matchEntity.setHost(rs.getString("host"));
            matchEntity.setTime(rs.getString("time"));
            matchEntity.setStadium(rs.getString("stadium"));
            matchEntity.setId(rs.getInt("matchID"));
            matchEntitys.add(matchEntity);
        }
       
        rs.close();
        ps.close();
        con.close();
        }
        catch (Exception EX){
           
            EX.printStackTrace();
        }
    
    return matchEntitys;
    }


    public void userConfirmation(String uname, String parameter) {
        //this method updates the confirmation status of a user from false to true
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
        //this method create an array list of users and retuen it as result
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
