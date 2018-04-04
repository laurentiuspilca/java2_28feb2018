/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Masina;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c5e11PU");
        EntityManager em = emf.createEntityManager();
        
        Masina m = new Masina();
        m.setCj("B");
        m.setNr(1);
        m.setCod("ERU");
        m.setCuloare("Rosu");
        m.setMarca("BMW");
        
        em.getTransaction().begin();
        
        em.persist(m);
        
        em.getTransaction().commit();
        
        em.close();
    }
    
}
