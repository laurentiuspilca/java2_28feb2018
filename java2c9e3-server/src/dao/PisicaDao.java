/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Pisica;
import javax.persistence.EntityManager;

/**
 *
 * @author student
 */
public class PisicaDao {
    
    private EntityManager em;
    
    public PisicaDao(EntityManager em) {
        this.em = em;
    }
    
    public void addPisica(Pisica p) {
        em.persist(p);
    }
}
