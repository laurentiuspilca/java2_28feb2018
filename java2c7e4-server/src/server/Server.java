/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.ServerSocket;

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
            
            while (true) {
                new ServiceThread(ss.accept()).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
