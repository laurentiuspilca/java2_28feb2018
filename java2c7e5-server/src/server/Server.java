/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author student
 */
public class Server {

    private static final ReadWriteLock lock = new ReentrantReadWriteLock();
    private static final List<ServiceThread> CLIENTS = new ArrayList<>();
    
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(4321);
            
            while (true) {
                ServiceThread st = new ServiceThread(ss.accept());
                try {
                    lock.writeLock().lock();
                    CLIENTS.add(st);
                } finally {
                    lock.writeLock().unlock();
                }
                st.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void sendMessageToAll(String msg) {
        try {
            lock.readLock().lock();
            CLIENTS.forEach(c -> c.sendMessage(msg));
        } finally {
            lock.readLock().unlock();
        }
    }
}
