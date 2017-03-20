/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Talieh
 */
public interface SaleRMIInterface extends Remote {
    public String helloRMI (String name) throws RemoteException;
    

}
