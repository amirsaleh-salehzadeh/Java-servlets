/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Talieh Dastmalchi
 */
public class SaleNetServer {
    public void runserver1(){
   
    try{
        //1
        ServerSocket server = new ServerSocket(1000);
        //2
        Socket s = server.accept();
        //3
        s.getOutputStream().write("Welcome to sale".getBytes());
        s.getOutputStream().flush();
        //4-1
        PrintWriter out = new PrintWriter(s.getOutputStream());
        
        //4-2
        InputStreamReader isr = new InputStreamReader(s.getInputStream());
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
        }
        
        out.println("\r\nyou entered :"+command);
        out.flush();
        
        }//While inja baste shod
        
        s.close();
        server.close();
    }catch(Exception ex){
        ex.printStackTrace();
        
        
    }
    }
    public void runserver(){
        try{
         //1
          ServerSocket server = new ServerSocket(1000);
        //8 
         boolean b = true;
         while(b){
            //2
            Socket s = server.accept();
            //8
            SaleNetThread t = new SaleNetThread();
            t.setCustomer(s);
            t.start();
                   
        }
         server.close();
    }catch(Exception ex){
        ex.printStackTrace();
    }
}
}




