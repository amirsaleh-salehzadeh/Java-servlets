/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DataMngPackage;

import COMMON.TEA;
import COMMON.USER;
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
public class dataMNG {

    public ArrayList<TEA> allTeas() {
        ArrayList<TEA> teas = new ArrayList<TEA>();
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/persiantea", "root", "");
            String sql="select * from tea";
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                TEA tea = new TEA();
                tea.setName(rs.getString("producer"));
                tea.setNumber(rs.getInt("number"));
                tea.setImage(rs.getString("image"));
                tea.setPrice(rs.getInt("price"));
                teas.add(tea);
            }            
            con.close();
        }
        catch (Exception EX){
            EX.printStackTrace();
        }        
        return teas;
    }

    public boolean confirmation(String email, int price) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/persiantea", "root", "");
            String sql="Insert into purchase (email, price) values (?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,email);
            ps.setInt(2,price);
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

    public TEA getTea(String string) {
       TEA tea = new TEA();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/persiantea", "root", "");
            String sql="select * from tea where producer like ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,string);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                tea.setName(rs.getString("producer"));
                tea.setNumber(rs.getInt("number"));
                tea.setImage(rs.getString("image"));
                tea.setPrice(rs.getInt("price"));
            }            
            con.close();
        }
        catch (Exception EX){
            EX.printStackTrace();
        }        
        return tea;
    }
    
    public boolean insertTea(TEA tea) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/persiantea", "root", "");
            String sql="Insert into tea (producer , image, number, price) values (?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,tea.getName());
            ps.setString(2,tea.getImage());
            ps.setInt(3,tea.getNumber());
            ps.setInt(4, tea.getPrice());

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

    public boolean register(USER user) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/persiantea", "root", "");
        String sql="Insert into user (name, family, tel, address, password, manager, email) values (?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,user.getName());
        ps.setString(2,user.getFamilyName());
        ps.setString(3,user.getTelephone());
        ps.setString(4,user.getAddress());
        ps.setString(5,user.getPassword());
        ps.setString(6,user.getWebManager());
        ps.setString(7,user.getEmail());        
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
public USER login (USER user)
    {
        USER user2 = new USER();
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/persiantea", "root", "");
        String sql="Select * from user where email like ? AND password like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,user.getEmail());
        ps.setString(2,user.getPassword());
        
        ResultSet rs = ps.executeQuery();
        
        if(rs.next())
        {
           user2.setWebManager(rs.getString("manager"));
           user2.setName(rs.getString("name"));
           user2.setFamilyName(rs.getString("family"));
           user2.setEmail(rs.getString("email"));
        }
        else
        {
           user2 = null;
        }
        rs.close();
        ps.close();
        con.close();
        
        }
        catch (Exception EX){
            EX.printStackTrace();
        }
    
    return user2;
    
    }
    


}
