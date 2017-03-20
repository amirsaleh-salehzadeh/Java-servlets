/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class auctionENT {
   private int auction_id;
   private int seller_id;
   private int category_id;
   private float basePrice;
   private String startDate;
   private String endDate;
   private int isActive;
   private String title;
   private String desc;
   private String img;
   
   private ArrayList<bidENT> arBids=new ArrayList<bidENT>();
   

    public int getAuction_id() {
        return auction_id;
    }

    public void setAuction_id(int auction_id) {
        this.auction_id = auction_id;
    }

    public int getUser_id() {
        return seller_id;
    }

    public void setUser_id(int user_id) {
        this.seller_id = seller_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int isIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public

    ArrayList<bidENT> getArBids() {
        return arBids;
    }

    public void setArBids(ArrayList<bidENT> arBids) {
        this.arBids = arBids;
    }
   
   

}
