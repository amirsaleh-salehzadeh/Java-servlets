/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rmi;

import bs.SaleBS;
import common.BasketENT;
import common.CategoryENT;
import common.ProductENT;
import common.UserENT;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Talieh
 */
public class SaleRMIServer extends UnicastRemoteObject implements SaleRMIInterface {
    public static void main(String[] args){
        try{
            SaleRMIServer obj = new SaleRMIServer();
        }catch (RemoteException ex) {
                ex.printStackTrace();
        }
                
            }
       
   
    public SaleRMIServer() throws RemoteException{
        try{
            Naming.rebind("SaleRMIServer", this);
        }catch (MalformedURLException ex){
            //Logger.getLogger(SaleRMIServer.class.getName()).log(Level.SEVERE, null, ex);
            //server - mine
            ex.printStackTrace();
            //client -
            throw new RemoteException(ex.getMessage());
        }
        
    }
public String helloRMI(String name) throws RemoteException {
    //throw new UnsupportedOperationException("Not support yet.");
    return name+" Welcome to RMI";
}

    public CategoryENT getCategory(int categoryid) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet.");
        SaleBS bs = new SaleBS();
        return bs.getCategory(categoryid);
              
    
    }

    public ProductENT getProduct(int productid) throws RemoteException {
       // throw new UnsupportedOperationException("Not supported yet.");
        SaleBS bs = new SaleBS();
        return bs.getProduct(productid);
    }

    public UserENT getUser(int userid) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet.");
        SaleBS bs = new SaleBS();
        return bs.getUser(userid);
    }

    public BasketENT getBasket(int basketid) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet.");
        SaleBS bs = new SaleBS();
        return bs.getBasket(basketid);
        
    }

    public void regirster(UserENT ent) throws RemoteException {
       //throw new UnsupportedOperationException("Not supported yet.");
        SaleBS bs = new SaleBS();
        bs.regirster(ent);
        
    }

    public UserENT login(String username, String password) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet.");
        SaleBS bs = new SaleBS();
        return bs.login(username, password);
    }

}
