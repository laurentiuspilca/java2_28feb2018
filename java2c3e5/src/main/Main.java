/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Companie;
import entities.Persoana;
import entities.data.Adresa;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c3r5PU");
        
        EntityManager em = emf.createEntityManager();
        
        Adresa a = new Adresa();
        a.setNumar(10);
        a.setOras("Bucuresti");
        a.setStrada("Iuliu Maniu");
        
        em.getTransaction().begin();
        
        Persoana p = new Persoana();
        p.setAdresa(a);
        p.setNume("Gigel");
        
        Companie c = new Companie();
        c.setDenumire("Telacad");
        c.setAdresa(a);
        
        em.persist(p);
        em.persist(c);
        
        em.getTransaction().commit();
    }
    
}
