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
public class CategoryENT implements Serializable{
private int categoryid;
private String name;

    public int getCategoryid() {
        return categoryid;
    }

    public String getName() {
        return name;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public void setName(String name) {
        this.name = name;
    }

}
