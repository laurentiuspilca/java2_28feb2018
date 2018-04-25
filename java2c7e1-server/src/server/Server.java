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

    public static void main(String[] args) {
        try {
            System.out.println("Se incearca deschiderea portului 4321");
            ServerSocket ss = new ServerSocket(4321);
            System.out.println("S-a deschis portul 4321");
            
            System.out.println("Se asteapta conexiunea cu clientul");
            Socket socket = ss.accept();
            System.out.println("Un client s-a conectat");
            
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            
            System.out.println("Se asteapta date de la client");
            String line = in.readLine();
            System.out.println("Am primit de la client " + line);
            
            StringBuilder sb = new StringBuilder(line);
            out.println(sb.reverse().toString());
            
            System.out.println("A fost trimis catre client sirul inversat");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
