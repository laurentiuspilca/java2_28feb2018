/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import dto.Pisica;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
            Socket socket = new Socket("localhost", 4321);
            
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            
            Pisica p = new Pisica();
            p.setNume("Tom");
            
            out.writeObject(p);
            
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
