/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sales.common;

/**
 *
 * @author hesam
 */
public class ProductENT {
    private int id;
    private String name;
    private String description;
    private int price;
    private int f_categoryid;
    private String imagepath;


public ProductENT(){
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getF_categoryid() {
        return f_categoryid;
    }

    public void setF_categoryid(int f_categoryid) {
        this.f_categoryid = f_categoryid;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }
}
