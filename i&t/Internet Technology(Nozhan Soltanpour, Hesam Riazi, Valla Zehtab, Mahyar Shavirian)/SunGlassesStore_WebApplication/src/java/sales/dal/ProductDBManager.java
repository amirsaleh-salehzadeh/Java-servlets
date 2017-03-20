/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sales.dal;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import sales.common.ProductENT;

/**
 *
 * @author hesam
 */
public class ProductDBManager {

    public static ArrayList search(String txt) {
    ArrayList arResult = null;

try{
        Class.forName("com.mysql.jdbc.Driver");

        java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/orders", "root", "");
        System.out.println("search.connected");
        PreparedStatement ps = cn.prepareStatement("select * from product where name like ? or description like ? or price = ?");
        ps.setString(1, "%" + txt + "%");
        ps.setString(2, "%" + txt + "%");
        ps.setString(3, txt);
      
        ResultSet rs = ps.executeQuery();
        System.out.println("search.executed");
        arResult = new ArrayList();
        while (rs.next()) {
            ProductENT ent = new ProductENT();
            ent.setId(rs.getInt("id"));
            ent.setName(rs.getString("name"));
            ent.setDescription(rs.getString("description"));
            ent.setPrice(rs.getInt("price"));
            ent.setF_categoryid(rs.getInt("f_categoryid"));
            ent.setImagepath(rs.getString("imagepath"));
            arResult.add(ent);
        }
        rs.close();
        ps.close();
        cn.close();
               
}catch (Exception ex) {
        ex.printStackTrace();
}        
    return arResult;

    }
public static ArrayList CategoryProduct(int categoryid){
     ArrayList arResult = null;

try{
        Class.forName("com.mysql.jdbc.Driver");

        java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/orders", "root", "");
        System.out.println("search.connected");
        PreparedStatement ps = cn.prepareStatement("select * from product where f_categoryid = ?");
        ps.setInt(1,categoryid);
      
        ResultSet rs = ps.executeQuery();
        System.out.println("search.executed");
        arResult = new ArrayList();
        while (rs.next()) {
            ProductENT ent = new ProductENT();
            ent.setId(rs.getInt("id"));
            ent.setName(rs.getString("name"));
            ent.setDescription(rs.getString("description"));
            ent.setPrice(rs.getInt("price"));
            ent.setF_categoryid(rs.getInt("f_categoryid"));
            ent.setImagepath(rs.getString("imagepath"));
            arResult.add(ent);
        }
        rs.close();
        ps.close();
        cn.close();
               
}catch (Exception ex) {
        ex.printStackTrace();
}        
    return arResult;


}
    public ProductDBManager() {
    }
}
