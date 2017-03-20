/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cinema.rmi;

import Cinema.common.CustomerENT;
import Cinema.common.GenreENT;
import java.rmi.RemoteException;
import java.util.ArrayList;


/**
 *
 * @author Jeiran
 */
public interface RMIManager {
     public ArrayList<GenreENT>genrelist()throws RemoteException;
     public  void register (CustomerENT c)throws RemoteException;

}
