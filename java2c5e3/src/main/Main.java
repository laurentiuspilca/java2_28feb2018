/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Garaj;
import entities.enums.Tip;
import java.util.HashMap;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c5e3PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Garaj g = new Garaj();
        g.setAdresa("Iuliu Maniu 7");
        g.setMasini(new HashMap<>());
        g.getMasini().put(Tip.BMW, "B01ERU");
        em.persist(g);
        
        em.getTransaction().commit();
        em.close();
    }
    
}
