/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

import java.util.ArrayList;

/**
 *
 * @author Talieh
 */
public class BasketENT {
    private int basketid;
    private int userid;
    private String date;
    private UserENT user=new UserENT();
    private ArrayList<BasketdetailENT> basketdetails=new ArrayList<BasketdetailENT>();

    public int getBasketid() {
        return basketid;
    }

    public void setBasketid(int basketid) {
        this.basketid = basketid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public UserENT getUser() {
        return user;
    }

    public void setUser(UserENT user) {
        this.user = user;
    }

    public ArrayList<BasketdetailENT> getBasketdetails() {
        return basketdetails;
    }

    public void setBasketdetails(ArrayList<BasketdetailENT> basketdetails) {
        this.basketdetails = basketdetails;
    }
    
   

}
