/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cinema.net;

import Cinema.bs.BSManager;
import Cinema.common.CustomerENT;
import Cinema.common.MovieENT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Jeiran
 */
public class ServerReserveNetThreat {
    public void reserve() {
        ServerReserveNetThreat server = new ServerReserveNetThreat();
        try {
            ServerSocket ss = new ServerSocket(555);
            CustomerENT ent = null;
            
            while(true) {
                Socket s = ss.accept();
                
                InputStreamReader r = new InputStreamReader(s.getInputStream());
                BufferedReader br = new BufferedReader(r);
                
                s.getOutputStream().write("Welcome to Reservation site\r\n".getBytes());
                s.getOutputStream().write("enter command:".getBytes());
                
                while("EXIT".equals(br.readLine())) {
                    String usercommand = br.readLine();

                    if("search".startsWith(usercommand)) {

                    } else if("login".startsWith(usercommand)) {
                        s.getOutputStream().write("Username: ".getBytes());
                        String username = br.readLine();

                        s.getOutputStream().write("Password: ".getBytes());
                        String password = br.readLine();

                        if("admin".equals(username) && "admin".equals(password)) {
                            ent = new CustomerENT();
                            ent.setUsername("admin");
                            s.getOutputStream().write("Welcome admin".getBytes());
                        } else {
                            ent = server.login(username, password);

                            if(ent == null) {
                                s.getOutputStream().write("Wrong username or password".getBytes());
                            } else {
                                s.getOutputStream().write("Welcome dear normal user".getBytes());
                            }
                        }
                    } else if("addMovie".startsWith(usercommand)) {
                        if("admin".equals(ent.getUsername())) {
                            MovieENT ment = new MovieENT();
                            
                            s.getOutputStream().write("Movie Name: ".getBytes());
                            ment.setMovie_name(br.readLine());
                            
                            s.getOutputStream().write("Director Name: ".getBytes());
                            ment.setDirector(br.readLine());
                            
                            BSManager bs =  new BSManager();
                            bs.insertMovie(ment);
                        } else {
                            s.getOutputStream().write("You should login first".getBytes());
                        }
                    }
                }
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public CustomerENT login(String username, String password) {
        CustomerENT ent = new CustomerENT();
        BSManager bs = new BSManager();
        ent = bs.login(username, password);
        return ent;
    }
}
