/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package purchase.common;

/**
 *
 * @author 844498
 */
public class Product {
 private String pname;
 private int price;
 private String description;
 private String img;
 private String select;
 
 
    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }
 
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


}
