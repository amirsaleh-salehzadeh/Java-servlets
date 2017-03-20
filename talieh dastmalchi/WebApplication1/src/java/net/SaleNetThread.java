/*
 * To change thicustomer template, choocustomere Tools | Templates
 * and open the template in the editor.
 */

package net;

import bs.SaleBS;
import common.BasketENT;
import common.BasketdetailENT;
import common.ProductENT;
import common.UserENT;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import javax.jms.Session;

/**
 *
 * @author Talieh
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
        if("PRODUCTLIST".equals(command.toUpperCase())){
            SaleBS bs = new SaleBS();
            ArrayList<ProductENT> ar = new ArrayList<ProductENT>();// bs.productlist(); yani az badaz ar= be jaye new... bayad bs.pr... ra bayad benevisim vali ye joor dige neveshtimo commentash kardim chon database saleBS ra nasakhtim ghablan            out.print("\r\n productname \t price \t category");
            for (int i=0;i<ar.size();i++){
                out.print("\r\n");
                out.print(ar.get(i).getName());
                out.print("\t");
                out.print(ar.get(i).getPrice());
                out.print("\t");
                out.print(ar.get(i).getCategory().getName());
                out.print("\t");
            }
                   out.flush();
                   //6
        }else if(command.toUpperCase().startsWith("SEARCH")){
            String[] st = command.split(" ");
            SaleBS bs = new  SaleBS();
            ArrayList<ProductENT> ar = new ArrayList<ProductENT>();//bs.search(st[1]); 
            out.print("\r\n productname \t price \t category");
            for (int i=0;i<ar.size();i++){
                out.print("\r\n");
                out.print(ar.get(i).getName());
                out.print("\t");
                out.print(ar.get(i).getPrice());
                out.print("\t");
                out.print(ar.get(i).getCategory().getName());
                out.print("\t");
            
        }
            out.flush();
            //7
        }else if("EXIT".equals(command.toUpperCase())){
            out.print("\r\n Good Bye .");
            break;
            
            //8   
        }else if(command.toUpperCase().startsWith("LOGIN")){
            String ar[]=command.split("");
            String username = ar[1];
            String password = ar[2];
            SaleBS bs = new SaleBS();
            UserENT user = bs.login(username,password);
            if(user !=null){
                out.print("\r\n Welcome "+user.getUsername()+"\r\n");
                out.flush();
                //8
                session.put("user",user);
            }else{
                out.print("\r\n Incorrect username/password\r\n");
                out.flush();
            }
        }else if(command.toUpperCase().startsWith("ADDBASKET")){
            UserENT user = (UserENT) session.get("user");
            if(user==null){
                out.print("\r\n please login first.\r\n");
                out.flush();
            }else{
                String ar[]=command.split("");
                int productid = Integer.parseInt(ar[1]);
                BasketENT basket = (BasketENT)session.get("basket");
                if(basket==null){
                    basket=new BasketENT();
                    session.put("basket", basket);
                    basket.setDate(new Date().toString());
                    basket.setUser(user);
                    basket.setUserid(user.getUserid());
                }SaleBS bs = new SaleBS();
               // bs.addBasket(basket,productid); comment kardim chon addbasket nadashtim error midad
            }
        }else if(command.toUpperCase().startsWith("VIEWBASKET")){
            BasketENT basket = (BasketENT)session.get("basket");
            if(basket !=null){
                out.print("\r\n customer:"+basket.getUser().getFname()+""+basket.getUser().getFname());
                out.print("\r\n date:"+basket.getDate());
                out.print("\r\n address:"+basket.getUser().getAddress());
                out.print("\r\n productname \t qty \t price");
                int totalprice=0;
                for (int i=0;i<basket.getBasketdetails().size();i++){
                    BasketdetailENT detail = basket.getBasketdetails().get(i);
                    out.print("\r\n "+detail.getProduct().getName()+" \t "+detail.getQty()+" \t "+detail.getPrice());
                   totalprice+=detail.getPrice()*detail.getQty();
                }
                out.print("\r\n totalprice:"+totalprice);
            }else{
                out.print("\r\n your basket is empty\r\n");
                out.flush();
                    
                }
  
            
        }
        
     
        out.println("\r\nyou entered :"+command);
        out.flush();
        
        }//While inja baste shod
        customer.close();
    }catch(Exception ex){
        ex.printStackTrace();
    }
}//run


}//class
    
    
    

