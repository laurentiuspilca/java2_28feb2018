/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author student
 */
public class ServiceThread extends Thread {
    
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    
    public ServiceThread(Socket socket) throws IOException {
        this.socket = socket;
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
    }
    
    @Override
    public void run() {
        try {
             String line = in.readLine();
             out.println(new StringBuilder(line).reverse().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
