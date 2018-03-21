/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Produs;
import javax.persistence.EntityManager;

/**
 *
 * @author student
 */
public class ProdusDao {
    
    private EntityManager em;
    
    public ProdusDao(EntityManager em) {
        this.em = em;
    }
    
    public void create(Produs p) {
        em.persist(p);
    }
    
    public Produs findProdus(int id) {
        return em.find(Produs.class, id);
        //em.getReference(Produs.class, id);
    }
    
    public void refreshProdus(Produs p) {
        em.refresh(p);
    }
    
    public void mergeProdus(Produs p) {
        em.merge(p);
    }
    
    public void clearContext() {
        em.clear();
    }
    
    public void detachProdus(Produs p) {
        em.detach(p);
    }
    
    public void flushContext() {
        em.flush();
    }
    
    public void removeProdus(Produs p) {
        em.remove(p);
    }
}
