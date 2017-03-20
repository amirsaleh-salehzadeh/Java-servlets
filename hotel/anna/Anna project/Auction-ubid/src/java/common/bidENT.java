/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

import java.sql.Date;

/**
 *
 * @author User
 */
public class bidENT {
    
   private int bid_id;
   private int user_id;
   private int auction_id;
   private Date register_date;
   private float price;

    public

    int getBid_id() {
        return bid_id;
    }

    public void setBid_id(int bid_id) {
        this.bid_id = bid_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAuction_id() {
        return auction_id;
    }

    public void setAuction_id(int auction_id) {
        this.auction_id = auction_id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getRegister_date() {
        return register_date;
    }

    public void setRegister_date(Date register_date) {
        this.register_date = register_date;
    }

}
