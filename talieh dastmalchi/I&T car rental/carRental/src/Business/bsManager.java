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
 * @author Talieh Dastmalchi
 */
public class bsManager {

	public CategoryENT getCategory(int categoryid){
        CategoryENT ent=null;
        try{
            //1 load driver
            Class.forName("com.mysql.jdbc.Driver");
            //2 connect
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "root");
            //3 get statement for execute
            Statement stmt = cn.createStatement();
            //4 get result
            ResultSet rs = stmt.executeQuery("select * from category where categoryId="+categoryid);
            if(rs.next()){
                ent = new CategoryENT();
                ent.setCategoryid(rs.getInt("categoryId"));
                ent.setName(rs.getString("name"));
            }
            rs.close();
            stmt.close();
            cn.close();
               
            }catch(Exception ex){
              ex.printStackTrace();
            }
            return ent;
    }
	
	public ArrayList<CategoryENT> getCategoryList(){
		ArrayList<CategoryENT> ents=null;
        try{
            //1 load driver
            Class.forName("com.mysql.jdbc.Driver");
            //2 connect
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "root");
            //3 get statement for execute
            Statement stmt = cn.createStatement();
            //4 get result
            ResultSet rs = stmt.executeQuery("select * from category");
            if(rs.next()){
            	CategoryENT ent = new CategoryENT();
                ent.setCategoryid(rs.getInt("categoryId"));
                ent.setName(rs.getString("name"));
                ents.add(ent);
            }
            rs.close();
            stmt.close();
            cn.close();
               
            }catch(Exception ex){
              ex.printStackTrace();
            }
            return ents;
    }
	
	CarENT getCar(int carid){
		CarENT ent=null;
        try{
            
         //1 load driver
        Class.forName("com.mysql.jdbc.Driver");
        //2 connect
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales","root","");
        //3 get statement for execute
        Statement stmt = cn.createStatement();
        //4 get result
        ResultSet rs = stmt.executeQuery("select * from product where id="+carid);
        if(rs.next()){
            ent = new CarENT();
            ent.setProductid(rs.getInt("id"));
            ent.setName(rs.getString("name"));
            ent.setPrice(rs.getInt("price"));
            ent.setCategoryid(rs.getInt("categoryId"));
            
            
            CategoryENT category = getCategory(ent.getCategoryid());
            ent.setCategory(category);
            
        }
        rs.close();
        stmt.close();
        cn.close();
           
        }catch(Exception ex){
          ex.printStackTrace();
        }
        return ent;
    }
	public ArrayList<UserENT> usersList() {
        ArrayList<UserENT> al = new ArrayList<UserENT>();
        try{
        	//1 load driver
        Class.forName("com.mysql.jdbc.Driver");
      //2 connect
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "root");
      //3 get statement for execute
        String sql="Select * from user";
        Statement stmt=con.createStatement();
      //4 get result
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next())
        {
            UserENT user = new UserENT();
            user.setActive(rs.getBoolean("confirmed"));
            user.setUserName(rs.getString("username"));
            user.setName(rs.getString("name"));
            user.setFName(rs.getString("familyName"));
            al.add(user);
        }
       
        rs.close();
        stmt.close();
        con.close();
        }
        catch (Exception EX){
            EX.printStackTrace();
        }
        return al;
    }

    public UserENT login(String u, String p) {
    	UserENT user = new UserENT();
        try{
        	//1 load driver
        Class.forName("com.mysql.jdbc.Driver");
      //2 connect
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "root");
      //3 get statement for execute
        String sql="Select * from user where username = ? AND password = ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,u);
        ps.setString(2,p);
      //4 get result
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){
            user.setActive(rs.getBoolean("confirmed"));
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

    public boolean rentCar(RentENT ent) {
        boolean res = false;
    	try{
        	//1 load driver
            Class.forName("com.mysql.jdbc.Driver");
          //2 connect
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "root");
          //3 get statement for execute
            String sql="Select * from renting where productId = ? and toDate > ? and fromDate < ? ";
            PreparedStatement ps=con.prepareStatement(sql);

            ps.setInt(1, ent.getProductId());
            ps.setDate(2, ent.getsDate());
            ps.setDate(3, ent.geteDate());
            //here we check the available cars between the days which user wants to rent 
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
            	res = false;
            }else{
            	res = true;
            	sql="insert into renting (userName, productId, fromDate, toDate) values (?,?,?,?)";
                ps=con.prepareStatement(sql);
                ps.setString(1, ent.getUserName());
                ps.setInt(2, ent.getProductId());
                ps.setDate(3, ent.getsDate());
                ps.setDate(4, ent.geteDate());
                ps.execute();
            }
            rs.close();
            ps.close();
            con.close();
            
            }
            catch (Exception EX){
                EX.printStackTrace();
                
            }
            return res;
    }

    public void insertCar(CarENT ent) {
        try{
        	//1 load driver
            Class.forName("com.mysql.jdbc.Driver");
          //2 connect
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "root");
          //3 get statement for execute
            String sql="Insert into product(name, categoryId, price) values (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,ent.getName());
            ps.setInt(2,ent.getCategoryid());
            ps.setInt(3,ent.getPrice());
            ps.execute();

            ps.close();
            con.close();
            
            }
            catch (Exception EX){
                EX.printStackTrace();
                }
    }
    public void insertCategory(String categName) {
        try{
        	//1 load driver
            Class.forName("com.mysql.jdbc.Driver");
          //2 connect
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "root");
          //3 get statement for execute
            String sql="Insert into category(name) values (?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,categName);
            ps.execute();

            ps.close();
            con.close();
            
            }
            catch (Exception EX){
                EX.printStackTrace();
                }
    }

    public boolean register(UserENT UserENT) {
        try{
        	//1 load driver
            Class.forName("com.mysql.jdbc.Driver");
          //2 connect
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "root");
          //3 get statement for execute
            String sql="Insert into user (name, familyName, address, email, password, phone, username, confirmed) values (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,UserENT.getName());
            ps.setString(2,UserENT.getFName());
            ps.setString(3,UserENT.getAddress());
            ps.setString(4,UserENT.getEmail());
            ps.setString(5,UserENT.getPassword());
            ps.setString(6,UserENT.getPhoneNo());
            ps.setString(7,UserENT.getUserName());
            ps.setBoolean(8,UserENT.isActive());
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

    public ArrayList<CarENT> searchACar(CarENT carENT) { 
    	ArrayList<CarENT> carENTs = new ArrayList<CarENT>();
        try{
        	//1 load driver
        Class.forName("com.mysql.jdbc.Driver");
      //2 connect
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "root");
      //3 get statement for execute
        String sql="Select * from product where name like ? and categoryId= ?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, "%"+carENT.getName()+"%");
        ps.setInt(2, carENT.getCategoryid());
      //4 get result
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
        	CarENT ent = new CarENT();
        	ent.setCategoryid(rs.getInt("categoryId"));
        	ent.setName(rs.getString("name"));
        	ent.setPrice(rs.getInt("price"));
        	ent.setProductid(rs.getInt("id"));
        	ent.setCategory(getCategory(ent.getCategoryid()));
        	carENTs.add(ent);
        }
        rs.close();
        ps.close();
        }
        catch (Exception EX){
            EX.printStackTrace();
        }
        return carENTs;
    }
    
    public ArrayList<CategoryENT> searchACategory(String name) { 
    	ArrayList<CategoryENT> categoryENTs = new ArrayList<CategoryENT>();
        try{
        	//1 load driver
        Class.forName("com.mysql.jdbc.Driver");
      //2 connect
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "root");
      //3 get statement for execute
        String sql="Select * from category where name like ?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, "%"+name+"%");
        ResultSet rs = ps.executeQuery();
      //4 get result
        while(rs.next())
        {
        	CategoryENT ent = new CategoryENT();
        	ent.setCategoryid(rs.getInt("categoryId"));
        	ent.setName(rs.getString("name"));
        	categoryENTs.add(ent);
        }
        rs.close();
        ps.close();
        }
        catch (Exception EX){
            EX.printStackTrace();
        }
        return categoryENTs;
    }

    public void activation(boolean x, String uname) {
        try{
        	//1 load driver
        Class.forName("com.mysql.jdbc.Driver");
      //2 connect
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "root");
      //3 get statement for execute
        String sql="UPDATE user SET confirmed = ? WHERE username = ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setBoolean(1,x);
        ps.setString(2,uname);
        ps.execute();   

        ps.close();
        
        con.close();
        }
        catch (Exception EX){
           EX.printStackTrace();
        }
    }
    

}
