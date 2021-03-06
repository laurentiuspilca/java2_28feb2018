/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Angajat;
import entities.Departament;
import entities.Masina;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c5e6PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Angajat a1 = new Angajat();
        a1.setNume("Gigel");
        
        Masina m1 = new Masina();
        m1.setMarca("Audi");
        
        Departament d1 = new Departament();
        d1.setNume("QA");
        d1.setAngajati(new HashMap<>());
        
        d1.getAngajati().put(a1, m1);
        m1.setDepartament(d1);
        
        em.persist(a1);
        em.persist(d1);
        
        em.getTransaction().commit();
        em.close();
    }
    
}
