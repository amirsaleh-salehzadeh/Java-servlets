/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Auction.rmi;

import java.rmi.RemoteException;

/**
 *
 * @author Home
 */
public class RMIServer {
    
    public static void main(String[] args){
        
        try{
            new RMIManagerImpl();
        }catch(RemoteException ex){
            ex.printStackTrace();
        }
    }

}
