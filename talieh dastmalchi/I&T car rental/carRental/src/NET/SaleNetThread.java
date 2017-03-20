/*
 * To change thicustomer template, choocustomere Tools | Templates
 * and open the template in the editor.
 */

package NET;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import javax.jms.Session;

import Business.bsManager;
import Common.CategoryENT;
import Common.UserENT;

/**
 *
 * @author Talieh Dastmalchi
 */
public class SaleNetThread extends Thread{
    private Socket customer = null;
    Hashtable session=new Hashtable();
    

    public Socket getCustomer() {
        return customer;
    }

    public void setCustomer(Socket customer) {
        this.customer = customer;
    }
public void run(){
    try{
         //3
        customer.getOutputStream().write("Welcome to sale".getBytes());
        customer.getOutputStream().flush();
        //4-1
        PrintWriter out = new PrintWriter(customer.getOutputStream());
        
        //4-2
        InputStreamReader isr = new InputStreamReader(customer.getInputStream());
        BufferedReader in = new BufferedReader(isr);
        //7
        while(true){
        
            out.println("\r\nenter command:\r\nSEARCH \r\nPRODUCTLIST \r\nLOGIN \r\n...");
            out.flush();
            String command = in.readLine();
        //5
            if("USERLIST".equals(command.toUpperCase())){
                bsManager bs = new bsManager();
                ArrayList<UserENT> ar = new ArrayList<UserENT>();// bs.productlist(); yani az badaz ar= be jaye new... bayad bs.pr... ra bayad benevisim vali ye joor dige neveshtimo commentash kardim chon database saleBS ra nasakhtim ghablan            out.print("\r\n productname \t price \t category");
                ar=bs.usersList();
                for (int i=0;i<ar.size();i++){
                    out.print("\r\n");
                    out.print(ar.get(i).getName());
                    out.print("\t");
                    out.print(ar.get(i).getFName());
                    out.print("\t");
                    out.print(ar.get(i).getUserName());
                    out.print("\t");
                }
                       out.flush();
                       //6
            }else if("LOGIN".equals(command.toUpperCase())){
            	bsManager bs = new bsManager();
            	String[] st = command.split(" ");
                UserENT ent = bs.login(st[1], st[2]);
                if(ent==null){
                	out.print("invalid username or password");
                	session.put("user",ent);
                }else
                	out.print("welcome Mr/Mrs "+ent.getName()+ ent.getFName());
            }else if("CATEGORYLIST".equals(command.toUpperCase())){
            	bsManager bs = new bsManager();
            	ArrayList<CategoryENT> ents = bs.getCategoryList();
            	out.print("category name");
            	for (int i = 0 ; i < ents.size() ; i ++){
            		out.print("\r\n");
                    out.print(ents.get(i).getName());
            	}
            }
            else if("EXIT".equals(command.toUpperCase())){
                out.print("\r\n Good Bye .");
                break;
            }
  
            
        
     
        out.flush();
        
        }//While inja baste shod
        customer.close();
    }catch(Exception ex){
        ex.printStackTrace();
    }
}//run


}//class
    
    
    

