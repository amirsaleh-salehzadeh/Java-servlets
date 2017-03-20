/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Auction.rmi;

import common.auctionENT;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public interface IRMIManager extends Remote {
    
    public  ArrayList<auctionENT> search(String text ) throws RemoteException;

}
