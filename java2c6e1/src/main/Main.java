/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Produs;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c6e1PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Produs p1 = new Produs();
        p1.setNume("bere");
        p1.setPret(4);
        em.persist(p1);
        
        String sql = "SELECT * FROM produs WHERE id = ?";
        Query q = em.createNativeQuery(sql, Produs.class);
        q.setParameter(1, 2);
        List<Produs> produse = q.getResultList();
        produse.forEach(
            p -> System.out.println(p.getId() + " " + p.getNume() + " " +p.getPret())
        );
        
        em.getTransaction().commit();
        
    }
    
}
