/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dto.ProdusDto;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.ProdusService;

/**
 *
 * @author student
 */
public class ProdusController {
    
    private Registry registry;
    private ProdusService service;
    
    private ProdusController() {
        try {
            registry =  LocateRegistry.getRegistry("localhost", 4321);
            service = (ProdusService) registry.lookup("service");
        } catch (Exception ex) {
            Logger.getLogger(ProdusController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static final class SingletonHolder {
        private static final ProdusController INSTANCE = new ProdusController();
    }
    
    public static ProdusController getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    public void adaugaProdus(String nume, double pret) throws RemoteException {
        ProdusDto p = new ProdusDto();
        p.setNume(nume);
        p.setPret(pret);
        service.adaugaProdus(p);
    }
    
    public List<ProdusDto> getProduse() throws RemoteException {
        return service.getProduse();
    }
    
    public void stergeProdus(ProdusDto p) throws RemoteException {
        service.stergeProdus(p);
    }
}
