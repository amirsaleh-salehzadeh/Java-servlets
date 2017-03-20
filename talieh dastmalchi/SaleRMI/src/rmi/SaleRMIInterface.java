/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rmi;

import common.BasketENT;
import common.CategoryENT;
import common.ProductENT;
import common.UserENT;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Talieh
 */
public interface SaleRMIInterface extends Remote {
    public String helloRMI (String name) throws RemoteException;
    public CategoryENT getCategory(int categoryid) throws RemoteException;
    public ProductENT getProduct(int productid) throws RemoteException;
    public UserENT getUser(int userid) throws RemoteException;
    public BasketENT getBasket(int basketid) throws RemoteException;
    public void regirster(UserENT ent) throws RemoteException;
    public UserENT login(String username,String password) throws RemoteException;
            
    

}
