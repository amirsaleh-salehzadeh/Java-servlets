/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import common.auctionENT;
import common.bidENT;
import common.categoryENT;
import common.productENT;
import common.usersENT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Users
 */
public class BSManager {
    
     public void insertProduct(productENT product){
        //1.2
        try{
                Class.forName("com.mysql.jdbc.Driver");
    }catch(Exception ex){
        ex.printStackTrace();

    }
        try{
            //1.3


        Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
        //2.2
        PreparedStatement ps = cn.prepareStatement("insert into product (name , category) values(?,?)");
        ps.setString(1, product.getName());
        ps.setString(2, product.getCategory());

        ps.execute();
        ps.close();

        //get id of product :select max(id) from product
        Statement stmt = cn.createStatement();
        ResultSet rs = stmt.executeQuery("select max(id) from product");
        if(rs.next()){
            product.setProduct_id(rs.getInt(1));
        }

        rs.close();
        stmt.close();
        cn.close();
    }catch(SQLException ex){
        ex.printStackTrace();
    }

    }
  
   public  usersENT login(String username, String password){
               usersENT user = new usersENT();
               try{
                   Class.forName("com.mysql.jdbc.Driver");
               }catch(Exception ex){
                   ex.printStackTrace();
               }
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            PreparedStatement ps = cn.prepareStatement("select * from users where username = ? and password = ? and isActive = 1");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setActive(rs.getInt("isActive"));
            } else {
                user = null;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return user;
    } 

     public  void register (usersENT u){
        try{

            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex){
            ex.printStackTrace();

        }
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            PreparedStatement ps=cn.prepareStatement("insert into users (username, password, fname, lname, address, tell_no ) values(?,?,?,?,?,?)");
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            ps.setString(3, u.getFname());
            ps.setString(4, u.getLname());
            ps.setString(5, u.getAddress());
            ps.setInt(6, u.getTell_no());

            ps.execute();
            ps.close();

            Statement stmt= cn.createStatement();
            ResultSet rs=stmt.executeQuery("select max(user_id) from users");
            if(rs.next()){
                u.setUser_id(rs.getInt(1));
            }
            rs.close();
            stmt.close();
            cn.close();

        }catch(SQLException ex){
            ex.printStackTrace();
        }
     }
      
     public  ArrayList<auctionENT> search(String text){
       ArrayList <auctionENT> list= new ArrayList<auctionENT>();
        try{

            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex){
            ex.printStackTrace();

        }
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            PreparedStatement ps=cn.prepareStatement("select * from auction where auction.title like ? or auction.descp like ? and isactive = 1" );


            ps.setString(1, "%" + text + "%");
            ps.setString(2, "%" + text + "%");



            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                auctionENT a = new auctionENT();
                a.setAuction_id(rs.getInt("auction_id"));
                a.setCategory_id(rs.getInt("category_id"));
                a.setUser_id(rs.getInt("user_id"));
                a.setBasePrice(rs.getFloat("baseprice"));
                a.setDesc(rs.getString("description"));
                a.setStartDate(rs.getString("startdate"));
                a.setEndDate(rs.getString("enddate"));
                a.setTitle(rs.getString("title"));




                list.add(a);

            }




            ps.close();

            
            cn.close();

        }catch(SQLException ex){
            ex.printStackTrace();
        }

       return list;
    }

    public  ArrayList <usersENT> searchUser(String text){
       ArrayList <usersENT> list= new ArrayList<usersENT>();
        try{

            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex){
            ex.printStackTrace();

        }
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            PreparedStatement ps=cn.prepareStatement("select * from users  where (fname like ? or lname like ?)" );


            ps.setString(1, text);
            ps.setString(2, text);



            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                usersENT u = new usersENT();
                u.setFname(rs.getString("fname"));
                u.setLname(rs.getString("lname"));
                u.setAddress(rs.getString("address"));
                u.setTell_no(rs.getInt("tell_no"));





                list.add(u);

            }




            ps.close();


            cn.close();

        }catch(SQLException ex){
            ex.printStackTrace();
        }

       return list;
    }
    
    public  ArrayList <usersENT>userlist(){
       ArrayList <usersENT> list= new ArrayList<usersENT>();
        try{

            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex){
            ex.printStackTrace();

        }
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            PreparedStatement ps=cn.prepareStatement("select * from users" );
            
            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                usersENT u = new usersENT();
                u.setFname(rs.getString("fname"));
                u.setLname(rs.getString("lname"));
                u.setAddress(rs.getString("address"));
                u.setTell_no(rs.getInt("tell_no"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setUser_id(rs.getInt("user_id"));
                u.setActive(rs.getInt("isActive"));





                list.add(u);

            }




            ps.close();


            cn.close();

        }catch(SQLException ex){
            ex.printStackTrace();
        }

       return list;
    }

    public auctionENT getAuction(int auction_ID){
        auctionENT auction = new auctionENT();
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            PreparedStatement ps = cn.prepareStatement("select * from auction where auction_id = ?");
            ps.setInt(1, auction_ID);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                auction.setAuction_id(rs.getInt("auction_id"));
                auction.setBasePrice(rs.getFloat("basePrice"));
                auction.setCategory_id(rs.getInt("category_id"));
                auction.setDesc(rs.getString("descp"));
                auction.setStartDate(rs.getString("startDate"));
                auction.setIsActive(rs.getInt("isActive"));
                auction.setEndDate(rs.getString("endDate"));
                auction.setUser_id(rs.getInt("seller_id"));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            PreparedStatement ps = cn.prepareStatement("select * from bid where auction_id = ?");
        ps.setInt(1, auction_ID);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                bidENT b = new bidENT();
                b.setBid_id( rs.getInt("bid_id") );
                b.setUser_id(rs.getInt("user_id"));
                b.setPrice(rs.getInt("price"));
                b.setRegister_id(rs.getInt("register_id"));
                b.setRegister_date(rs.getInt("Register_date"));
                
                auction.getArBids().add(b);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        
        }
        return auction;
    } //end of public AuctionENT getAuction(int auction_id)

    public void insertBid(bidENT bid){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            
            PreparedStatement ps = cn.prepareStatement("insert into bid (auction_id,user_id,Price,register_date) values (?,?,?,?)");
            ps.setInt(1, bid.getAuction_id());
            ps.setInt(2, bid.getUser_id());
            ps.setFloat(3, bid.getPrice());
            ps.setInt(4,bid.getRegister_date());
            
            ps.execute();
            ps.close();
            
            // get bidID : select max(bidID) from bid
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery("select max(bid.bid_id) from bid");
            if(rs.next()){
                bid.setBid_id(rs.getInt(1));
            }
            
            rs.close();
            stmt.close();
            
            cn.close();
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }     
    } 

        public void insertCategory(categoryENT c){
            System.out.println("name: " + c.getName());
            System.out.println("descp: " + c.getDesc());
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            PreparedStatement ps=cn.prepareStatement("insert into category (name, descp) values (?, ?)");
            ps.setString(1, c.getName());
            ps.setString(2, c.getDesc());
            ps.execute();
            
            ps.close();
            cn.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
  
    }

        public  ArrayList <categoryENT>categorylist(String text){
       ArrayList <categoryENT> list= new ArrayList<categoryENT>();
        try{

            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex){
            ex.printStackTrace();

        }
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            PreparedStatement ps=cn.prepareStatement("select * from category where category.name like ? or category.descp like ?" );


            ps.setString(1, text);
            ps.setString(2, text);



            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                categoryENT c = new categoryENT();
                c.setName(rs.getString("name"));
                c.setDesc(rs.getString("desc"));
             





                list.add(c);

            }




            ps.close();


            cn.close();

        }catch(SQLException ex){
            ex.printStackTrace();
        }

       return list;
    }

  public  ArrayList <auctionENT>auctionlistbycat(int category_id){
       ArrayList <auctionENT> list= new ArrayList<auctionENT>();
        try{

            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex){
            ex.printStackTrace();

        }
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            PreparedStatement ps=cn.prepareStatement("select * from auction  where (category_id = ?)" );


            ps.setInt(1, category_id);
            



            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                auctionENT a = new auctionENT();
                a.setUser_id(rs.getInt("seller_id"));
                a.setBasePrice(rs.getFloat("baseprice"));
                a.setStartDate(rs.getString("startdate"));
                a.setEndDate(rs.getString("enddate"));
                a.setIsActive(rs.getInt("isactive"));
                a.setTitle(rs.getString("title"));
                a.setDesc(rs.getString("descp"));
                a.setCategory_id(rs.getInt("category_id"));
                a.setImg(rs.getString("img"));
                a.setAuction_id(rs.getInt("auction_id"));
                list.add(a);
                
            }
                  ps.close();


            cn.close();

        }catch(SQLException ex){
            ex.printStackTrace();
        }

       return list;
}

      public void insertauction(auctionENT a){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            PreparedStatement ps=cn.prepareStatement("insert into auction (seller_id, baseprice, startdate, enddate, isActive, title, descp, category_id, img) values(?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,a.getUser_id());
            ps.setFloat(2,a.getBasePrice());
            ps.setString(3, a.getStartDate());
            ps.setString(4, a.getEndDate());
            ps.setInt(5,a.isIsActive());
            ps.setString(6, a.getTitle());
            ps.setString(7, a.getDesc());
            ps.setInt(8, a.getCategory_id());
            ps.setString(9, a.getImg());
            ps.execute();
            Statement stmt=cn.createStatement();
            ResultSet rs=stmt.executeQuery("select max(auction_id) from auction");
            if(rs.next()){
               a.setAuction_id(rs.getInt(1));
            }
            rs.close();
            stmt.close();
            cn.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }    
            }
      
      public void useractivate (int user_id, int isActive){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            PreparedStatement ps = cn.prepareStatement("update users set isActive= ? where user_id= ? ");
            ps.setInt(1, isActive);
            ps.setInt(2, user_id);
            ps.execute();
        } catch(SQLException ex) {
            
        }
      }
      

       public  ArrayList <auctionENT>auctionlist(){
       ArrayList <auctionENT> list= new ArrayList<auctionENT>();
        try{

            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex){
            ex.printStackTrace();

        }
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            PreparedStatement ps=cn.prepareStatement("select * from auction where IsActive=1 " );

            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                auctionENT a = new auctionENT();
                a.setUser_id(rs.getInt("seller_id"));
                a.setBasePrice(rs.getFloat("baseprice"));
                a.setStartDate(rs.getString("startdate"));
                a.setEndDate(rs.getString("enddate"));
                a.setIsActive(rs.getInt("isactive"));
                a.setTitle(rs.getString("title"));
                a.setDesc(rs.getString("descp"));
                a.setCategory_id(rs.getInt("category_id"));
                a.setImg(rs.getString("img"));
                a.setAuction_id(rs.getInt("auction_id"));
                list.add(a);
                
            }
                  ps.close();


            cn.close();

        }catch(SQLException ex){
            ex.printStackTrace();
        }

       return list;
}

              public  ArrayList <auctionENT> Adminauctionlist(){
       ArrayList <auctionENT> auctionlist= new ArrayList<auctionENT>();
        try{

            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex){
            ex.printStackTrace();

        }
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            PreparedStatement ps=cn.prepareStatement("select * from auction " );

            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                auctionENT a = new auctionENT();
                a.setUser_id(rs.getInt("seller_id"));
                a.setBasePrice(rs.getFloat("baseprice"));
                a.setStartDate(rs.getString("startdate"));
                a.setEndDate(rs.getString("enddate"));
                a.setIsActive(rs.getInt("isactive"));
                a.setTitle(rs.getString("title"));
                a.setDesc(rs.getString("descp"));
                a.setCategory_id(rs.getInt("category_id"));
                a.setImg(rs.getString("img"));
                auctionlist.add(a);
                
            }
                  ps.close();


            cn.close();

        }catch(SQLException ex){
            ex.printStackTrace();
        }

       return auctionlist;
}
       
        public void auctionactivate (int auction_id, int isActive){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
            PreparedStatement ps = cn.prepareStatement("update auction set isActive= ? where auction_id= ? ");
            ps.setInt(1, isActive);
            ps.setInt(2, auction_id);
            ps.execute();
        } catch(SQLException ex) {
            
        }
      }
              
              
       
        public  ArrayList <categoryENT>categorylist(){
            ArrayList <categoryENT> categorylist= new ArrayList<categoryENT>();
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch(Exception ex){
                ex.printStackTrace();
            }

            try {
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/auctiondb","root","");
                PreparedStatement ps=cn.prepareStatement("select * from category " );

                ResultSet rs= ps.executeQuery();
                while (rs.next()){
                    categoryENT ent = new categoryENT();
                    ent.setCategory_id(rs.getInt("category_id"));
                    ent.setDesc(rs.getString("descp"));
                    ent.setName(rs.getString("name"));
                    categorylist.add(ent);

                }
                      ps.close();


                cn.close();

            }catch(SQLException ex){
                ex.printStackTrace();
            }

           return categorylist;
    }
}  

