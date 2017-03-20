/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cinema.bs;

import Cinema.common.BookENT;
import Cinema.common.CustomerENT;
import Cinema.common.GenreENT;
import Cinema.common.MovieENT;
import Cinema.common.SeatENT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



/**
 *
 * @author Jeiran
 */
public class BSManager 
{
    public void insertMovie(MovieENT movie)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    
        try
        {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
            PreparedStatement ps = cn.prepareStatement("insert into movie (name,director,producer,price,start_date,genre_id,image)values(?,?,?,?,?,?,?) ");
            ps.setString(1,movie.getMovie_name());
            ps.setString(2,movie.getDirector());
            ps.setString(3,movie.getProducer());
            ps.setInt(4,movie.getPrice());
            ps.setString(5, movie.getStart_date());
           
            ps.setInt(6,movie.getGenre_id());
            ps.setString(7,movie.getImage());
            
                    
            
            ps.execute();
            ps.close();
        }
        catch(SQLException ex)
        {
                ex.printStackTrace();
        }
    }
    
    
    public void deleteMovie(MovieENT movie)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    
        try
        {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
            PreparedStatement ps = cn.prepareStatement("delete from movie where movie_id like ?");
           
            ps.setInt(1,movie.getMovie_id());
          
            ps.execute();
            ps.close();
        }
        catch(SQLException ex)
        {
                ex.printStackTrace();
        }
    }
    
    public void insertSeat(SeatENT seat)
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        try
        {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
            PreparedStatement ps = cn.prepareStatement("insert into seat (row,number)values(?,?)");
             ps.setInt(1, seat.getRow());
              ps.setInt(2, seat.getSeat_number());
        }
        catch(SQLException ex)
        {
                ex.printStackTrace();
        }
        
    }

    public MovieENT previewMovie(int parseInt) {
        
         MovieENT ent=new MovieENT();;
         try{
             Class.forName("com.mysql.jdbc.Driver");
         }
         catch(Exception ex){
             ex.printStackTrace();     
         }
         
         try{
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
             PreparedStatement ps = cn.prepareStatement("select * from movie where movie_id=?");
             ps.setInt(1, parseInt);
             ResultSet rs =ps.executeQuery();
              while(rs.next()){
                  ent =new MovieENT();
                  ent.setMovie_id(rs.getInt("movie_id"));
                  ent.setGenre_id(rs.getInt("genre_id"));
                  ent.setMovie_name(rs.getString("name"));
                  ent.setDirector(rs.getString("Director"));
                  ent.setProducer(rs.getString("producer"));
                  ent.setPrice(rs.getInt("price"));
                  ent.setStart_date(rs.getString("start_date"));
                  ent.setImage(rs.getString("image"));
                 
              }
         }
             catch(SQLException ex) {
                
              ex.printStackTrace();
             }
    
           return ent;
    }
    
     void deleteSeat(SeatENT seat)
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        try
        {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
            PreparedStatement ps = cn.prepareStatement("delete from seat where seat_id like ?");
             ps.setInt(1, seat.getSeat_id());
             
             ps.execute();
            ps.close();
              
        }
        catch(SQLException ex)
        {
                ex.printStackTrace();
        }
        
    }
    
    public void insertGenre(GenreENT genre)
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        try
        {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
            PreparedStatement ps = cn.prepareStatement("insert into category (genre)values(?)");
             ps.setString(1, genre.getGenre());
              
        }
        catch(SQLException ex)
        {
                ex.printStackTrace();
        }
        
    }
    
     void deleteGenre(GenreENT genre)
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        try
        {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
            PreparedStatement ps = cn.prepareStatement("delete from category where gere_id like ?");
             ps.setInt(1, genre.getGenre_id());
             
             ps.execute();
            ps.close();
              
        }
        catch(SQLException ex)
        {
                ex.printStackTrace();
        }
        
    }
    
    
     public  void register (CustomerENT c)
     {
        try
        {

            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();

        }
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
            PreparedStatement ps=cn.prepareStatement("insert into customer (name,last_name,tell,email,username,password ) values(?,?,?,?,?,?)");
           
            ps.setString(1, c.getName());
            ps.setString(2, c.getLast_name());
            ps.setString(3, c.getTell());
            ps.setString(4, c.getEmail());
            ps.setString(5, c.getUsername());
            ps.setString(6, c.getPassword());
           

            ps.execute();
            ps.close();

            Statement stmt= cn.createStatement();
            ResultSet rs=stmt.executeQuery("select max(customer_id) from customer");
            if(rs.next()){
                c.setCustomer_id(rs.getInt(1));
            }
            rs.close();
            stmt.close();
            cn.close();

        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
     }
     
     
    
          public  void deleteUser (CustomerENT c)
     {
        try
        {

            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();

        }
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
            PreparedStatement ps=cn.prepareStatement("delete from customer where customer_id like ?");
           
            ps.setInt(1, c.getCustomer_id());
            
            ps.execute();
            ps.close();

            Statement stmt= cn.createStatement();
            ResultSet rs=stmt.executeQuery("select max(customer_id) from customer");
            if(rs.next()){
                c.setCustomer_id(rs.getInt(1));
            }
            rs.close();
            stmt.close();
            cn.close();

        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
     }
          
          
          
     public void insertBooking(BookENT b)
     {
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
             
         }
         catch(Exception ex)
         {
             ex.printStackTrace();   
         }
         try
         {
             Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
            String sql = "insert into booking(customer_id,movie_id,time,date,qty,total_price) values(?,?,?,?,?,?)";
             PreparedStatement ps=cn.prepareStatement(sql);
             
            ps.setInt(1, b.getCustomer_id()); 
            ps.setInt(2, b.getMovie_id() );
            ps.setString(3, b.getTime());
            ps.setDate(4,b.getDate());
            ps.setInt(5,b.getQty());
            ps.setInt(6,b.getTotal_price());
            ps.execute();
            ps.close();
            cn.close();
         }
         catch(SQLException ex)
         {
            ex.printStackTrace();  
         }
     }
      
     
     
      void deleteBooking(BookENT b)
     {
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
             
         }
         catch(Exception ex)
         {
             ex.printStackTrace();   
         }
         try
         {
             Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
            PreparedStatement ps=cn.prepareStatement("delete from booking where book_id like ?");
             
            ps.setInt(1, b.getBook_id()); 
           
         }
         catch(SQLException ex)
         {
            ex.printStackTrace();  
         }
     }
      
     
         public CustomerENT login(String username, String password) 
    {
        CustomerENT ent = new CustomerENT();
        Connection conn = null;
        Statement  stmt = null;
        ResultSet  rs = null;
        
        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
        } 
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
            stmt = conn.createStatement();
            String sql = "SELECT * FROM customer WHERE username = '"+username+"' AND password = '"+password+"'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                ent.setCustomer_id(rs.getInt("customer_id"));
                ent.setUsername(rs.getString("username"));
                ent.setPassword(rs.getString("password"));
                ent.setName(rs.getString("name"));
                ent.setIsActive(rs.getInt("isActive"));
            } else {
                ent = null;
            }
            
            rs.close();
            stmt.close();
            conn.close();
            } 
            catch(SQLException ex)
            {
                ex.printStackTrace();
            }
        
        
        return ent;
    }
         
         
         
         
     public ArrayList<MovieENT> searchGenre(Integer i){
         ArrayList<MovieENT> movielist = new ArrayList<MovieENT>();
         
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
             
         }
         catch(Exception ex)
         {
             ex.printStackTrace();   
         }
     
         try
         {
             Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
            PreparedStatement ps=cn.prepareStatement("select * from movie where `genre_id` like ?");
            ps.setInt(1, i);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                MovieENT ent = new MovieENT();
                ent.setMovie_name(rs.getString("name"));
                ent.setDirector(rs.getString("Director"));
                ent.setProducer(rs.getString("producer"));
                ent.setPrice(rs.getInt("price"));
                ent.setStart_date(rs.getString("start_date"));
                ent.setImage(rs.getString("image"));
       
                ent.setMovie_id(rs.getInt("movie_id"));
                movielist.add(ent);
                
            }
         } catch(SQLException ex) {
              ex.printStackTrace();
                
        }
         
         return movielist;
     }
     
     
     
     public ArrayList<BookENT>booklist(){
         ArrayList<BookENT> booklist= new ArrayList<BookENT>();
         
         try{
             Class.forName("com.mysql.jdbc.Driver");
             
         }
         catch(Exception ex)
         {
             ex.printStackTrace();   
         }
         
         try{
             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
             PreparedStatement ps = cn.prepareStatement("select * from booking ");
             
             ResultSet rs =ps.executeQuery();
              while(rs.next()){
                  BookENT ent = new BookENT();
                  ent.setBook_id(rs.getInt("book_id"));
                  ent.setCustomer_id(rs.getInt("customer_id"));
                  ent.setMovie_id(rs.getInt("movie_id"));
                  
                  ent.setTime(rs.getString("time"));
                  ent.setDate(rs.getDate("date"));
                  ent.setQty(rs.getInt("qty"));
                  ent.setTotal_price(rs.getInt("total_price"));
                                    
                  booklist.add(ent);
              
              }
        
         }
         
         catch(SQLException ex) {
              ex.printStackTrace();
                
        }
         
           return booklist;     
         
     }
     
     public ArrayList<MovieENT> movielist(){
         ArrayList<MovieENT> movies = new ArrayList<MovieENT>();
         MovieENT ent;
         try{
             Class.forName("com.mysql.jdbc.Driver");
         }
         catch(Exception ex){
             ex.printStackTrace();     
         }
         
         try{
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
             PreparedStatement ps = cn.prepareStatement("select * from movie ");
             
             ResultSet rs =ps.executeQuery();
              while(rs.next()){
                  ent =new MovieENT();
                  ent.setMovie_id(rs.getInt("movie_id"));
                  ent.setGenre_id(rs.getInt("genre_id"));
                  ent.setMovie_name(rs.getString("name"));
                  ent.setDirector(rs.getString("Director"));
                  ent.setProducer(rs.getString("producer"));
                  ent.setPrice(rs.getInt("price"));
                  ent.setStart_date(rs.getString("start_date"));
                  ent.setImage(rs.getString("image"));
                 
              
                  
                  movies.add(ent);
                 
              }
         }
             catch(SQLException ex) {
                
              ex.printStackTrace();
             }
    
           return movies;
         }
    public ArrayList<MovieENT> movielist(String search){
         ArrayList<MovieENT> movies = new ArrayList<MovieENT>();
         MovieENT ent;
         try{
             Class.forName("com.mysql.jdbc.Driver");
         }
         catch(Exception ex){
             ex.printStackTrace();     
         }
         
         try{
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
             PreparedStatement ps = cn.prepareStatement("select * from movie where name like ?");
             ps.setString(1, "%" + search + "%");
             
             ResultSet rs =ps.executeQuery();
              while(rs.next()){
                  ent =new MovieENT();
                  ent.setMovie_id(rs.getInt("movie_id"));
                  ent.setGenre_id(rs.getInt("genre_id"));
                  ent.setMovie_name(rs.getString("name"));
                  ent.setDirector(rs.getString("Director"));
                  ent.setProducer(rs.getString("producer"));
                  ent.setPrice(rs.getInt("price"));
                  ent.setStart_date(rs.getString("start_date"));
                  ent.setImage(rs.getString("image"));
                 
              
                  
                  movies.add(ent);
                 
              }
         }
             catch(SQLException ex) {
                
              ex.printStackTrace();
             }
    
           return movies;
         }    
     
     
     public ArrayList<GenreENT>genrelist(){
         ArrayList<GenreENT> genres= new ArrayList<GenreENT>();
    
         try{
             Class.forName("com.mysql.jdbc.Driver");
         }
         catch(Exception ex){
             ex.printStackTrace();     
         }
         
         try{
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
             PreparedStatement ps = cn.prepareStatement("select * from category ");
             
             ResultSet rs =ps.executeQuery();
              while(rs.next()){
                  GenreENT ent=new GenreENT();
                  ent.setGenre_id(rs.getInt("genre_id"));
                  ent.setGenre(rs.getString("genre"));
                  genres.add(ent);
              }
             
                  
              }
         catch(SQLException ex){
             ex.printStackTrace();
         }
         return genres;
         
     }
     
     public ArrayList<SeatENT>seatlist(){
         ArrayList<SeatENT> seats= new ArrayList<SeatENT>();
    
         try{
             Class.forName("com.mysql.jdbc.Driver");
         }
         catch(Exception ex){
             ex.printStackTrace();     
         }
         
         try{
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
             PreparedStatement ps = cn.prepareStatement("select * from seat ");
             
             ResultSet rs =ps.executeQuery();
              while(rs.next()){
                  SeatENT ent=new SeatENT();
                  ent.setSeat_id(rs.getInt("seat_id"));
                  ent.setSeat_number(rs.getInt("number"));
                  ent.setRow(rs.getInt("row"));
                  seats.add(ent);
              }
             
                  
              }
         catch(SQLException ex){
             ex.printStackTrace();
         }
         return seats;
         
     }
     
     
     public ArrayList<CustomerENT> customerlist(){
         ArrayList<CustomerENT> customers=new ArrayList<CustomerENT>();
         try{
             Class.forName("com.mysql.jdbc.Driver");
         }
         catch(Exception ex){
             ex.printStackTrace();     
         }
         
         try{
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
             PreparedStatement ps = cn.prepareStatement("select * from customer");
             
              ResultSet rs =ps.executeQuery();
              while(rs.next()){
                  CustomerENT ent=new CustomerENT();
                  ent.setCustomer_id(rs.getInt("customer_id"));
                  ent.setName(rs.getString("name"));
                  ent.setLast_name(rs.getString("last_name"));
                  ent.setTell(rs.getString("tell"));
                  ent.setEmail(rs.getString("email"));
                  ent.setUsername(rs.getString("username"));
                  ent.setPassword(rs.getString("password"));
                  ent.setIsActive(rs.getInt("isActive"));
                  customers.add(ent);
              }
         }
         catch(SQLException ex){
             ex.printStackTrace();
             
         }
         
     
     return customers;
     
     
     }
     
     
      public void ConfirmRegister (CustomerENT c){
           
            try{
             Class.forName("com.mysql.jdbc.Driver");
         }
         catch(Exception ex){
             ex.printStackTrace();     
         }
         
         try{
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
             PreparedStatement ps = cn.prepareStatement("update customer set isActive=1 where customer_id like ? ");
             ps.setInt(1, c.getCustomer_id());
            
       }
       catch(SQLException ex){
             ex.printStackTrace();
         }  
   
      }  
      
      
      
            public void ConfirmBooking (BookENT b){
           
            try{
             Class.forName("com.mysql.jdbc.Driver");
         }
         catch(Exception ex){
             ex.printStackTrace();     
         }
         
         try{
              Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
             PreparedStatement ps = cn.prepareStatement("update booking set isActive=1 where book_id like ? ");
             ps.setInt(1, b.getBook_id());
            
       }
       catch(SQLException ex){
             ex.printStackTrace();
         }  
   
      }  
     public void activateUser(int CID,String val){
     try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "");
        String sql="update customer set isActive =? where customer_id like ? ";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,val);
        ps.setInt(2, CID);
        ps.execute();   
        ps.close();
        
        con.close();
        }
        catch (Exception EX){
           EX.printStackTrace();
        }
     }
     
     private CustomerENT getCustomerENTFromID(int id) {
         CustomerENT ent = new CustomerENT();
     
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
        } 
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM customer WHERE customer_id = " + id;
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                ent.setName(rs.getString("name"));
                ent.setLast_name(rs.getString("last_name"));
            }
            
            rs.close();
            stmt.close();
            con.close();
            } 
            catch(SQLException ex)
            {
                ex.printStackTrace();
            }
         
         return ent;
     }
     
     
     
       private MovieENT getMovieENTFromID(int id) {
         MovieENT ent = new MovieENT();
     
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
        } 
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","");
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM movie WHERE movie_id = " + id;
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                ent.setMovie_name(rs.getString("name"));
               
            }
            
            rs.close();
            stmt.close();
            con.close();
            } 
            catch(SQLException ex)
            {
                ex.printStackTrace();
            }
         
         return ent;
     }
       
       
       
      
     
     }

     