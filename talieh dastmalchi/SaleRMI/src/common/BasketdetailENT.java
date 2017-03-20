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
public class BasketdetailENT implements Serializable {
    private int basketdetailid;
    private int basketid;
    private int productid;
    private int qty;
    private int price;
    private BasketENT basket=new BasketENT();
    private ProductENT product=new ProductENT();

    public int getBasketdetailid() {
        return basketdetailid;
    }

    public void setBasketdetailid(int basketdetailid) {
        this.basketdetailid = basketdetailid;
    }

    public int getBasketid() {
        return basketid;
    }

    public void setBasketid(int basketid) {
        this.basketid = basketid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BasketENT getBasket() {
        return basket;
    }

    public void setBasket(BasketENT basket) {
        this.basket = basket;
    }

    public ProductENT getProduct() {
        return product;
    }

    public void setProduct(ProductENT product) {
        this.product = product;
    }
    
    

}
