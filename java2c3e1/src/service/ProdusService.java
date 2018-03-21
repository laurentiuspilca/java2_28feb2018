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
        emf = Persistence.createEntityManagerFactory("java2c3e1PU");
    }
    
    private static final class SingletonHolder {
        private static final ProdusService SINGLETON = new ProdusService();
    }
    
    public static ProdusService getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public void create(String nume, double pret) {
        Produs p = new Produs();
        p.setNume(nume);
        p.setPret(pret);
        
        EntityManager em = emf.createEntityManager();
        ProdusDao produsDao = new ProdusDao(em);
        try {
            em.getTransaction().begin();
            produsDao.create(p);
            em.getTransaction().commit();
        } finally {
            em.close(); // inchidem contextul la final
        }
    }
}
