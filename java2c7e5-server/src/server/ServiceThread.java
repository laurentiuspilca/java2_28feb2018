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
        this.out = new PrintWriter(socket.getOutputStream(), true);
        this.in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
    }
    
    public void sendMessage(String msg) {
        out.println(msg);
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                String msg = in.readLine();
                Server.sendMessageToAll(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
