/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProdusDao;
import dto.ProdusDto;
import entities.Produs;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author student
 */
public class ProdusServiceImpl extends UnicastRemoteObject implements ProdusService {
    
    private EntityManagerFactory emf;
    
    public ProdusServiceImpl() throws RemoteException {
        emf = Persistence.createEntityManagerFactory("java2c8e3-serverPU");
    }

    @Override
    public void adaugaProdus(ProdusDto p) {
        EntityManager em = emf.createEntityManager();
        ProdusDao dao = new ProdusDao(em);
        
        em.getTransaction().begin();
        
        Produs produs = new Produs();
        produs.setNume(p.getNume());
        produs.setPret(p.getPret());
        dao.adaugaProdus(produs);
        
        em.getTransaction().commit();
    }

    @Override
    public List<ProdusDto> getProduse() throws RemoteException {
        EntityManager em = emf.createEntityManager();
        ProdusDao dao = new ProdusDao(em);
        
        return dao.getProduse().stream()
                .map(Produs::fromProdus)
                .collect(Collectors.toList());
    }

    @Override
    public void stergeProdus(ProdusDto p) throws RemoteException {
        EntityManager em = emf.createEntityManager();
        ProdusDao dao = new ProdusDao(em);
        
        em.getTransaction().begin();
        
        Produs produs = dao.findProdus(p.getId());
        dao.delete(produs);
        
        em.getTransaction().commit();
    }
    
    
}
