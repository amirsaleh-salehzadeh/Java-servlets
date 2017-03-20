/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Common;

public class BookEntity {
    //we define the attribute of objects here, we a getter and setter method for them
    private MatchEntity matchEntity = new MatchEntity() ;
    private int quantity;
    private String userName;
    private int totalPrice;

    public MatchEntity getMatchEntity() {
        return matchEntity;
    }

    public void setMatchEntity(MatchEntity matchEntity) {
        this.matchEntity = matchEntity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
