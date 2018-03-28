/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Buletin;
import entities.Persoana;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c4e1PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Persoana p = new Persoana();
        p.setNume("Gigel");
        
        Buletin b = new Buletin();
        b.setSerie("ABC");
        
        p.setBuletin(b);
        b.setPersoana(p);
        
        //em.persist(p);
        em.persist(b);
        
        em.getTransaction().commit();
    }
    
}
