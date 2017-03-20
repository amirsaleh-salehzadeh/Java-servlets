/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RMI;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

/**
 *
 * @author Talieh Dastmalchi
 */
public class SaleRMIClinet {
    public static void main (String[] args){
        try{
            System.setSecurityManager( new RMISecurityManager());
            SaleRMIInterface bs = (SaleRMIInterface) Naming.lookup("rmi://localhost:1000/SaleRMIServer");
            String st = bs.helloRMI("ali");
            System.out.println(st);
        }catch (Exception ex) {
            ex.printStackTrace();
            
        }
        
    }

}
