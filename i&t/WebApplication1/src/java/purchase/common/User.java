/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package purchase.common;


//import java.sql.SQLException;
//import purchase.dal.JDBCManager;


public class User {
 private String name;
 private String fname;
 private String usern;
 private String pass;
 private String tel;
 private String email;
 private String access;

 public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }    
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getUsern() {
        return usern;
    }

    public void setUsern(String usern) {
        this.usern = usern;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
