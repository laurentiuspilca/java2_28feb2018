/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProdusDao;
import entities.Produs;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author student
 */
public class ProdusService {
    private EntityManagerFactory emf;
    
    private ProdusService() {
        emf = Persistence.createEntityManagerFactory("java2c2e5PU");
    }
    
    private static final class SingletonHolder {
        private static final ProdusService SINGLETON = new ProdusService();
    }
    
    public static ProdusService getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public void adaugaZeceProduse() {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            ProdusDao produsDao = new ProdusDao(em);
            em.getTransaction().begin();
            for (int i=0;i<10;i++) {
                Produs p = new Produs();
                p.setNume("Produs " + i);
                p.setPret(10);
                produsDao.adaugaProdus(p);
                //em.flush();
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
