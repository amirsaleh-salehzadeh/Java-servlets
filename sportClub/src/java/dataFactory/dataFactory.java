/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataFactory;

import Obj.Clazz;
import Obj.User;
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
public class dataFactory {

    public ArrayList<Clazz> getClazzes() {
        ArrayList<Clazz> al = new ArrayList<Clazz>();
try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sportClub", "root", "");
            String sql = "SELECT * FROM classes";
            Statement st=con.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                Clazz clazz = new Clazz();
                clazz.setDays(rs.getString("days"));
                clazz.setEndDate(rs.getString("EndDate"));
                clazz.setID(rs.getInt("ID"));
                String sql2 = "SELECT * FROM classstudent where ClassID=? ";
                PreparedStatement ps = con.prepareStatement(sql2);
                ps.setInt(1,clazz.getID());
                ResultSet rs2 = ps.executeQuery();
                int p = 0;
                while(rs2.next()){
                    p++;
                }
                ps.close();
                clazz.setSportType(rs.getString("SportType"));
                clazz.setStartDate(rs.getString("StartDate"));
                clazz.setCapacity(rs.getInt("Capacity")-p);
                clazz.setTime(rs.getString("Time"));
                clazz.setTutor(rs.getString("Tutor"));
                al.add(clazz);
            }
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
        return al;
    }

    public boolean insertClass(Clazz c) {
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sportClub", "root", "");
        String sql="Insert into classes (SportType, StartDate, EndDate, Time, Capacity, days, Tutor) values (?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,c.getSportType());
        ps.setString(2,c.getStartDate());
        ps.setString(3,c.getEndDate());
        ps.setString(4,c.getTime());
        ps.setInt(5,c.getCapacity());
        ps.setString(6,c.getDays());
        ps.setString(7,c.getTutor());
        
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

    public User login(User u) {
        User u1 = new User();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sportClub", "root", "");
            String sql = "SELECT * FROM user where Username=? AND Password=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,u.getUName());
            ps.setString(2,u.getPass());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                u1.setID(rs.getInt("ID"));
                u1.setName(rs.getString("Name"));
                u1.setFName(rs.getString("FamilyName"));
                u1.setAdmin(rs.getString("Admin"));
            }
        } 
        catch (Exception EX){
            EX.printStackTrace();
        }
        return u1;
    }

    public boolean registerClass(int i, int j) {
         try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sportClub", "root", "");
        String sql2 = "SELECT * FROM classstudent where ClassID=? AND UserID =?";
        PreparedStatement ps = con.prepareStatement(sql2);
        ps.setInt(1,j);
        ps.setInt(2,i);
        ResultSet rs = ps.executeQuery();
        int q = 0;
        while(rs.next()){
            q++;
            return false;
        }
        String sql="Insert into classstudent (ClassID ,UserID) values (?,?)";
        PreparedStatement ps2=con.prepareStatement(sql);
        ps2.setInt(1,j);
        ps2.setInt(2,i);
        if(q==0){
            ps2.execute();
        }
        
        ps2.close();
        con.close();
        return true;
        }
        catch (Exception EX){
            EX.printStackTrace();
            return false;
        }
    }

    public boolean registerUser(User u) {
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sportClub", "root", "");
        String sql="Insert into user (Name, FamilyName, Address, Telephone, Age, Username, Password, Admin) values (?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,u.getName());
        ps.setString(2,u.getFName());
        ps.setString(3,u.getAddress());
        ps.setString(4,u.getTel());
        ps.setInt(5,u.getAge());
        ps.setString(6,u.getUName());
        ps.setString(7,u.getPass());
        ps.setString(8,u.getAdmin());
        
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
