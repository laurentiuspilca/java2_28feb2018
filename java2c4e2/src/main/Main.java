/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Angajat;
import entities.Departament;
import java.util.Arrays;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c4e2PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Angajat a = new Angajat();
        a.setNume("Gigel");
        
        Departament d = new Departament();
        d.setNume("Dezvoltare");
        
        d.setAngajati(Arrays.asList(a));
        a.setDepartament(d);
        
        em.persist(a);
        em.persist(d);
               
        em.getTransaction().commit();
    }
    
}
