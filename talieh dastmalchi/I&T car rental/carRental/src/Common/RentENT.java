/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Common;

import java.sql.Date;

/**
 *
 * @author Talieh Dastmalchi
 */
public class RentENT {
 private Date sDate;
 private Date eDate;
 private int productId;
 private String userName;
 CarENT carENT = new CarENT();
 public CarENT getCarENT() {
	return carENT;
}
public void setCarENT(CarENT carENT) {
	this.carENT = carENT;
}

 
 
 public Date getsDate() {
	return sDate;
}
public void setsDate(Date sDate) {
	this.sDate = sDate;
}
public Date geteDate() {
	return eDate;
}
public void seteDate(Date eDate) {
	this.eDate = eDate;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
 
}
