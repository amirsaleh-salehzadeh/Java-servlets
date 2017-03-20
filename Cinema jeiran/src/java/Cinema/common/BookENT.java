/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cinema.common;

import java.sql.Date;

/**
 *
 * @author Jeiran
 */
public class BookENT {
    private int book_id;
    private int customer_id;
    private int movie_id;
    private int seat_id;
    private String time;
    private Date date;
    private int qty;
    private int total_price;
    private int isActive;
    private CustomerENT cusent = new CustomerENT();
    private MovieENT movient = new MovieENT();

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public int getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

   
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public CustomerENT getCusent() {
        return cusent;
    }

    public void setCusent(CustomerENT cusent) {
        this.cusent = cusent;
    }

    public MovieENT getMovient() {
        return movient;
    }

    public void setMovient(MovieENT movient) {
        this.movient = movient;
    }

    
   
}
