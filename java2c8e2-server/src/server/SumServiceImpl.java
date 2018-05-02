/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import service.SumService;

/**
 *
 * @author student
 */
public class SumServiceImpl extends UnicastRemoteObject implements SumService {
    
    public SumServiceImpl() throws RemoteException {
        
    }

    @Override
    public int sum(int x, int y) {
        return x + y;
    }
}
