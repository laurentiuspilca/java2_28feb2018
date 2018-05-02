/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmi.Service;

/**
 *
 * @author student
 */
public class MainService extends UnicastRemoteObject implements Service {
    
    public MainService() throws RemoteException {
        
    }

    @Override
    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
