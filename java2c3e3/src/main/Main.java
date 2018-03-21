/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Event;
import java.util.Date;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c3e3PU");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Event e = new Event();
        e.setNume("Curs Java");
        e.setAdresa("Iuliu Maniu 7");
        e.setData(new Date());
        em.persist(e);
        em.getTransaction().commit();
    }
    
}
