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
    
    public void adaugaProdus(Produs p) {
        em.persist(p);
    }
    
    public Produs getProdus(int id) {
        return em.find(Produs.class, id);
    }
}
