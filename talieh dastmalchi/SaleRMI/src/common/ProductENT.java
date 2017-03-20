/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

import java.io.Serializable;

/**
 *
 * @author Talieh
 */
public class ProductENT implements Serializable {
    private int productid;
    private String name;
    private int price;
    private int categoryid;
    private CategoryENT category=new CategoryENT();

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public CategoryENT getCategory() {
        return category;
    }

    public void setCategory(CategoryENT category) {
        this.category = category;
    }
    

}
