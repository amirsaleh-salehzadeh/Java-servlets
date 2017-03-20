/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Common.CarENT;
import Common.CategoryENT;
import Common.RentENT;
import Common.UserENT;

/**
 *
 * @author Talieh Dastmalchi
 */
public interface SaleRMIInterface extends Remote {
    public String helloRMI (String name) throws RemoteException;
    public ArrayList<UserENT> usersList() throws RemoteException;
    public UserENT login(String u, String p) throws RemoteException;
    public boolean register(UserENT UserENT) throws RemoteException;
    public void activation(boolean p, String uname) throws RemoteException;
    public ArrayList<CategoryENT> searchACategory(String name) throws RemoteException;
    public ArrayList<CarENT> searchACar(CarENT carENT) throws RemoteException;
    public void insertCategory(String categName) throws RemoteException;
    public void insertCar(CarENT ent) throws RemoteException;
    public boolean rentCar(RentENT ent) throws RemoteException;
    public ArrayList<CategoryENT> getCategoryList() throws RemoteException;
    public CategoryENT getCategory(int categoryid) throws RemoteException;
}
