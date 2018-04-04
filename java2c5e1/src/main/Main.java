/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Agenda;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c5e1PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Agenda a1 = new Agenda();
        a1.setId(10);
        a1.setTels(new HashMap<>());
        a1.getTels().put("Gigel", "0721111111");
        a1.getTels().put("Mirel", "0723333333");
        em.persist(a1);
        
        em.getTransaction().commit();
        em.close();
    }
    
}
