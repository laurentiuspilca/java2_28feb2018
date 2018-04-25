/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author student
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 4321);
            
            BufferedReader cons = new BufferedReader(new InputStreamReader(System.in));
            
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            
            while (true) {
                System.out.print("Client: ");
                String msg = cons.readLine();
                
                out.println(msg);
                
                msg = in.readLine();
                System.out.println("Server: " + msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
