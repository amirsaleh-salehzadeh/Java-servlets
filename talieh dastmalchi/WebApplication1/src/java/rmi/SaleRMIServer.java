/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Talieh
 */
public class SaleRMIServer extends UnicastRemoteObject implements SaleRMIInterface {
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
public String helloRMI(String name) throw RemoteException {
    //throw new UnsupportedOperationException("Not support yet.");
    return name+" Welcome to RMI";
}

}
