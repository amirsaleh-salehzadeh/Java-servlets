/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MyProjBS;

import Common.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Amirsaleh
 */
public class MyProjBS {

    public boolean addMovie(MovieENT movieENT) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "");
            String sql="Insert into movie (movieName, director, EndDate, StartDate, image, summary) values (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,movieENT.getName());
            ps.setString(2,movieENT.getDirector());
            ps.setDate(3,movieENT.getEndDate());
            ps.setDate(4,movieENT.getStartDate());
            ps.setString(5,movieENT.getImage());
            ps.setString(6, movieENT.getSummary());
            
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

    public ArrayList<TicketENT> allTicketsInfo(String userName) {
        ArrayList<TicketENT> tl = new ArrayList<TicketENT>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "");
            String sql1="select * from tickets where userName = ?";
            PreparedStatement ps1=con.prepareStatement(sql1);
            ps1.setString(1, userName);
            ResultSet rs = ps1.executeQuery();
            String sql2="select * from movie where movieName = ?";
            PreparedStatement ps2=con.prepareStatement(sql2);
            while(rs.next()){
                TicketENT ticketENT = new TicketENT();
                ticketENT.setDate(rs.getDate("date"));
                ticketENT.setFilmName(rs.getString("movieName"));
                ticketENT.setInterval(rs.getString("intervals"));
                ticketENT.setNumOfTickets(rs.getInt("tickets"));
                ticketENT.setUserName(rs.getString("userName"));
                ps2.setString(1, rs.getString("movieName"));
                ResultSet rs2 = ps2.executeQuery();
                while(rs2.next()){
                    MovieENT movieENT = new MovieENT();
                    movieENT.setDirector(rs2.getString("director"));
                    movieENT.setEndDate(rs2.getDate("EndDate"));
                    movieENT.setImage(rs2.getString("image"));
                    movieENT.setName(rs2.getString("movieName"));
                    movieENT.setStartDate(rs2.getDate("StartDate"));
                    movieENT.setSummary(rs2.getString("summary"));
                    ticketENT.setMovieENT(movieENT);
                }
            tl.add(ticketENT);
            }
            ps2.close();
            ps1.close();
            con.close();
            }
        catch (Exception EX){
           EX.printStackTrace();
        }
        return tl;
    }

    public ArrayList<MovieENT> fetchAllMovies() {
        ArrayList<MovieENT> ml = new ArrayList<MovieENT>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "");
            String sql = "Select * from movie where EndDate > ?";
            PreparedStatement ps=con.prepareStatement(sql);
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            ps.setString(1, dateFormat.format(date));
            ResultSet rs = ps.executeQuery(); 
            
            while (rs.next()) {
                MovieENT movieENT = new MovieENT();
                movieENT.setDirector(rs.getString("director"));
                movieENT.setEndDate(rs.getDate("EndDate"));
                movieENT.setImage(rs.getString("image"));
                movieENT.setName(rs.getString("movieName"));
                movieENT.setStartDate(rs.getDate("StartDate"));
                movieENT.setSummary(rs.getString("summary"));

                ml.add(movieENT);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return ml;
    }

    public ArrayList<UserENT> getAllUsers() {
        ArrayList<UserENT> us = new ArrayList<UserENT>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "");
            String sql = "Select * from user";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); 
            
            while (rs.next()) {
                UserENT u = new UserENT();
                u.setUserName(rs.getString("userName"));
                u.setAuthorized(rs.getBoolean("authorized"));
                u.setAdministrator(rs.getBoolean("administrator"));
                us.add(u);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        return us;
    }

    public UserENT logIn(UserENT user) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "");
        String sql="Select * from user where userName like ? AND password like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,user.getUserName());
        ps.setString(2,user.getPassWord());
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            user.setAdministrator(rs.getBoolean("administrator"));
            user.setAuthorized(rs.getBoolean("authorized"));
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

    public boolean registerNewUser(UserENT user) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "");
            String sql="Insert into user (name, familyName, telephone, userName , password , address, administrator, authorized) values (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,user.getName());
            ps.setString(2,user.getFamilyName());
            ps.setString(3,user.getTelephone());
            ps.setString(4,user.getUserName());
            ps.setString(5,user.getPassWord());
            ps.setString(6,user.getAddress());
            ps.setBoolean(7,user.isAdministrator());
            ps.setBoolean(8, user.isAuthorized());
            ps.execute();
            ps.close();
            con.close();
            }
            catch (Exception EX){
                EX.printStackTrace();
                return false;
            }
        return true;
    }

    public String reserveTicket(TicketENT ticketENT) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "");
                String sql1="select * from tickets where movieName = ? AND date = ? AND intervals = ?";
                PreparedStatement ps1=con.prepareStatement(sql1);
                ps1.setString(1, ticketENT.getFilmName());
                ps1.setDate(2, ticketENT.getDate());
                ps1.setString(3, ticketENT.getInterval());
                ResultSet rs = ps1.executeQuery();
                int counter = ticketENT.getNumOfTickets();
                while(rs.next()){
                    counter = counter + rs.getInt("tickets");
                    if(counter>=50){
                        return "The capacity of the saloon can not be more than 50. It is full! ";
                    }
                }
                
                ps1.close();
                String sql="Insert into tickets (movieName, userName, date, intervals, tickets) values (?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1,ticketENT.getFilmName());
                ps.setString(2,ticketENT.getUserName());
                ps.setDate(3,ticketENT.getDate());
                ps.setString(4,ticketENT.getInterval());
                ps.setInt(5,ticketENT.getNumOfTickets());

                ps.execute();
                con.close();
                }
            catch (Exception EX){
               EX.printStackTrace();
            }
        return "Succesfully reserved";
    }

    public void setAdministrator(String administrators) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "");
        String sql1="UPDATE user SET administrator ='0'";
        PreparedStatement ps1=con.prepareStatement(sql1);
        ps1.execute();
        ps1.close();
        if(!"".equalsIgnoreCase(administrators)){
            String sql="UPDATE user SET administrator ='1' WHERE userName like ? ";
            PreparedStatement ps=con.prepareStatement(sql);
            String[] isAdmin = administrators.split(",");
            for(int i = 0 ; i < isAdmin.length ; i ++){
                ps.setString(1,isAdmin[i]);
                ps.execute();   
            }
            ps.close();
        }
        con.close();
        }
        catch (Exception EX){
           EX.printStackTrace();
        }
    }

    public void setAuthorizedUsers(String authorized) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "");
        String sql1="UPDATE user SET authorized ='0'";
        PreparedStatement ps1=con.prepareStatement(sql1);
        ps1.execute();
        ps1.close();
        if(!"".equalsIgnoreCase(authorized)){
            String sql="UPDATE user SET authorized ='1' WHERE userName like ? ";
            PreparedStatement ps=con.prepareStatement(sql);
            String[] isAuthorized = authorized.split(",");
            for(int i = 0 ; i < isAuthorized.length ; i ++){
                ps.setString(1,isAuthorized[i]);
                ps.execute();   
            }

            ps.close();
        }
        con.close();
        }
        catch (Exception EX){
           EX.printStackTrace();
        }
    }

}
