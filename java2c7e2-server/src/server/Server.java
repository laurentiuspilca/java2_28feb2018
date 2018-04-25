/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author student
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(4321);
            Socket socket = ss.accept();
            
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            
            int n1 = Integer.parseInt(in.readLine());
            int n2 = Integer.parseInt(in.readLine());
            
            out.println(n1 + n2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
