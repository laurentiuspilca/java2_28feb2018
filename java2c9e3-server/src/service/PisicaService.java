/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.PisicaDao;
import dto.PisicaDto;
import entities.Pisica;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author student
 */
public class PisicaService {
    
    private EntityManagerFactory emf;
    
    private PisicaService() {
        emf = Persistence.createEntityManagerFactory("java2c9e3-serverPU");
    }
    
    private static final class SingletonHolder {
        private static final PisicaService SINGLETON = new PisicaService();
    }
    
    public static PisicaService getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public void adaugaPisica(PisicaDto pisica) {
        Pisica p = new Pisica();
        p.setNume(pisica.getNume());
        p.setVarsta(pisica.getVarsta());
        
        EntityManager em = emf.createEntityManager();
        PisicaDao pisicaDao = new PisicaDao(em);
        
        em.getTransaction().begin();
        pisicaDao.addPisica(p);
        em.getTransaction().commit();
    }
}
