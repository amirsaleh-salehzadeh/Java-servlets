/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Auction.rmi;

import business.BSManager;
import common.auctionENT;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class RMIManagerImpl extends UnicastRemoteObject implements IRMIManager {
    
    public RMIManagerImpl()throws RemoteException{
        
        super();
       try{ 
        Naming.rebind("RMIManagerImpl", this);
    }catch(MalformedURLException ex){
        ex.printStackTrace();
        throw new RemoteException("error in constructor",ex);
    }
    }
    
    @Override
    public  ArrayList<auctionENT> search(String text) throws RemoteException{
        
        try{
            BSManager bs = new BSManager();
            ArrayList <auctionENT> lst =bs.search(text);
            return lst;
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RemoteException("error in search",ex);
        }
    }

}
