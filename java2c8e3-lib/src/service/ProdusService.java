/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dto.ProdusDto;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author student
 */
public interface ProdusService extends Remote {
    public void adaugaProdus(ProdusDto p) throws RemoteException;
    public List<ProdusDto> getProduse() throws RemoteException;
    public void stergeProdus(ProdusDto p) throws RemoteException;
}
