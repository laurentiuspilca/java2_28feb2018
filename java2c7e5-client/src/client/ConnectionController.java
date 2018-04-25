/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author student
 */
public class ConnectionController {
    
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    
    private ConnectionController() {
        try {
            this.socket = new Socket("127.0.0.1", 4321);
            this.out = new PrintWriter(this.socket.getOutputStream(), true);
            this.in = new BufferedReader(
                    new InputStreamReader(this.socket.getInputStream()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final ConnectionController INSTANCE = new ConnectionController();
    }
    
    public static ConnectionController getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    public void sendMessage(String msg) {
        out.println(msg);
    }
    
    public String readMessage() throws IOException {
        return in.readLine();
    }
}
