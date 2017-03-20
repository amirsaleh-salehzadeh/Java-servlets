/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Business.bsManager;
import Common.CarENT;
import Common.CategoryENT;
import Common.RentENT;
import Common.UserENT;

/**
 * 
 * @author Talieh Dastmalchi
 */
public class SaleRMIServer extends UnicastRemoteObject implements
		SaleRMIInterface {
	public static void main(String[] args) {
		try {
			SaleRMIServer obj = new SaleRMIServer();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}

	}

	public SaleRMIServer() throws RemoteException {
		try {
			Naming.rebind("SaleRMIServer", this);
		} catch (MalformedURLException ex) {
			// Logger.getLogger(SaleRMIServer.class.getName()).log(Level.SEVERE,
			// null, ex);
			// server - mine
			ex.printStackTrace();
			// client -
			throw new RemoteException(ex.getMessage());
		}

	}

	public String helloRMI(String name) throws RemoteException {
		// throw new UnsupportedOperationException("Not support yet.");
		return name + " Welcome to RMI";
	}

	public void activation(boolean p, String uname) throws RemoteException {
		bsManager bsManager = new bsManager();
		bsManager.activation(p, uname);
	}

	public UserENT login(String u, String p) throws RemoteException {
		bsManager bsManager = new bsManager();

		return bsManager.login(u, p);
	}

	public boolean register(UserENT UserENT) throws RemoteException {
		bsManager bsManager = new bsManager();

		return bsManager.register(UserENT);
	}

	public ArrayList<UserENT> usersList() throws RemoteException {
		bsManager bsManager = new bsManager();

		return bsManager.usersList();
	}

	public CategoryENT getCategory(int categoryid) throws RemoteException {
		bsManager bsManager = new bsManager();

		return bsManager.getCategory(categoryid);
	}

	public ArrayList<CategoryENT> getCategoryList() throws RemoteException {
		bsManager bsManager = new bsManager();
		return bsManager.getCategoryList();
	}

	public void insertCar(CarENT ent) throws RemoteException {
		bsManager bsManager = new bsManager();
		bsManager.insertCar(ent);

	}

	public void insertCategory(String categName) throws RemoteException {
		bsManager bsManager = new bsManager();
		bsManager.insertCategory(categName);

	}

	public boolean rentCar(RentENT ent) throws RemoteException {
		bsManager bsManager = new bsManager();
		return bsManager.rentCar(ent);
	}

	public ArrayList<CarENT> searchACar(CarENT carENT) throws RemoteException {
		bsManager bsManager = new bsManager();
		return bsManager.searchACar(carENT);
	}

	public ArrayList<CategoryENT> searchACategory(String name)
			throws RemoteException {
		bsManager bsManager = new bsManager();
		return bsManager.searchACategory(name);
	}

}
