/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cinema.rmi;

import Cinema.bs.BSManager;
import Cinema.common.CustomerENT;
import Cinema.common.GenreENT;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Jeiran
 */
public class RMIManagerImpl extends UnicastRemoteObject implements RMIManager{
    
    public RMIManagerImpl()throws RemoteException{
        super();
        try{
            Naming.rebind("RMIManagerImpl", this);
        }catch (MalformedURLException ex){
            ex.printStackTrace();
            throw  new RemoteException("error in constructor",ex);
        }
    }
            

    public ArrayList<GenreENT> genrelist() throws RemoteException {
       // throw new UnsupportedOperationException("Not supported yet.");
        try{
            BSManager bs= new BSManager();
            ArrayList<GenreENT> lst = bs.genrelist();
            return lst;
            
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RemoteException("error in genrelist",ex);
        }
       
    }
    
    public void register(CustomerENT c) throws RemoteException{
        try{
            BSManager bs=new  BSManager();
            
        }
        catch(Exception ex){
            ex.printStackTrace();
            throw new RemoteException("error in register",ex);
        }
    }
    

}
