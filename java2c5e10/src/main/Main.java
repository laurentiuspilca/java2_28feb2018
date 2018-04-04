/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Masina;
import entities.pk.NumarInmatriculare;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c5e10PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        NumarInmatriculare nr = new NumarInmatriculare();
        nr.setCj("B");
        nr.setNr(1);
        nr.setCod("ERU");
        
        Masina m = new Masina();
        m.setNr(nr);
        m.setCuloare("rosu");
        m.setMarca("BMW");
        
        em.persist(m);
        
        em.getTransaction().commit();
        em.close();
    }
    
}
