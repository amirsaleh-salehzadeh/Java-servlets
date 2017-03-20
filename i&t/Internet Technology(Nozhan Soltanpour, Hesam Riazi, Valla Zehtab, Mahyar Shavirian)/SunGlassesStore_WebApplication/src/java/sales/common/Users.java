/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sales.common;

import java.sql.ResultSet;
import java.sql.SQLException;
import sales.dal.JDBCManager;

/**
 *
 * @author hesam
 */
public class Users {
    public Users (){
      id=0;
      name="";
      fname="";
      username="";
      password="";
      address="";
      tel="";
      email="";    
    }
    
  public Users(int i){
      id=i;
      name="";
      fname="";
      username="";
      password="";
      address="";
      tel="";
      email="";
      
      try{
          JDBCManager jn = new JDBCManager();
          ResultSet rs = null;
          jn.setConnection();
         String s = "SELECT * from user WHERE id="+i;
         if ((rs = jn.submitExecuteQuery(s)).next())
         {
             name = rs.getString("name");
             fname = rs.getString("fname");
             username = rs.getString("username");
             password = rs.getString("password");
             address = rs.getString("address");
             tel = rs.getString("tel");
             email = rs.getString("email");
             
             
         }
         jn.disconnectFromDbase();
         return;
          
          
      }
      catch (SQLException _ex)
      {
          return;
      }
      
    }
  
  public static int checkUser(String s, String s1) throws SQLException
    {
        ResultSet resultset;
        JDBCManager jdbcManager;
        (jdbcManager = new JDBCManager()).setConnection();
        String s2 = null;
        s2 ="SELECT  id   from user WHERE   username='"+s+"' AND password='"+s1+"'";
        resultset = jdbcManager.submitExecuteQuery(s2);
        if(resultset.next()){
            return resultset.getInt("id");
            //jdbcManager.disconnectFromDbase();
        }
        return 0;
        
    }
  
  public void addUsers()
    {
        try
        {
            JDBCManager jdbcManager = new JDBCManager();
            jdbcManager.setConnection();
            String s = null;
            s = "Insert into user (name,fname,username,password,address,tel,email ) values (";
            s+="'"+name+"',";
            s+="'"+fname+"',";
            s+="'"+username+"',";
            s+="'"+password+"',";
            s+="'"+address+"',";
            s+="'"+tel+"',";
            s+="'"+email+"')";
            jdbcManager.submitUpdateQuery(s);                        
            
            jdbcManager.disconnectFromDbase();
            return;
        }
        catch(SQLException sqlexception)
        {
            System.out.println(sqlexception.toString());
        }
    }

  public ResultSet giveUser() throws SQLException
    {
        ResultSet resultset;
        JDBCManager jdbcManager;
        (jdbcManager = new JDBCManager()).setConnection();
        String s2 = null;
        s2 ="SELECT  *   from user WHERE   id="+id;
        resultset = jdbcManager.submitExecuteQuery(s2);        
        return resultset;                
    }

  public void updateUser()
    {
        try
        {
            JDBCManager jdbcManager = new JDBCManager();
            jdbcManager.setConnection();
            String s = null;
            s = "update user set name='"+name+"' , fname='"+fname+"' , password='"+password+"' , address='"+address+"' , tel='"+tel+"' , email='"+email+"' where id="+id;
            jdbcManager.submitUpdateQuery(s);                        
            
            jdbcManager.disconnectFromDbase();
            return;
        }
        catch(SQLException sqlexception)
        {
            System.out.println(sqlexception.toString());
        }
    }

    
    
   public int id;
   public String name;
   public String fname;
   public String username;
   public String password;
   public String address;
   public String tel;
   public String email;
    
}
