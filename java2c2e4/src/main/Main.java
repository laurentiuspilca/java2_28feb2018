/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
        try {
            EntityManagerFactory emf = 
                    Persistence.createEntityManagerFactory("java2c2e4PU");
            
            EntityManager em = emf.createEntityManager();
            
            Persoana p = new Persoana();
            p.setNume("Pop");
            p.setPrenume("Gigel");
            
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            
            em.close();
            emf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
