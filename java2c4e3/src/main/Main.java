/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Profesor;
import entities.Student;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c4e3PU");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Student s1 = new Student();
        Profesor p1 = new Profesor();
        
        p1.setNume("Prof 1");
        s1.setNume("Stud 1");
        
        s1.setProfesori(Arrays.asList(p1));
        p1.setStudenti(Arrays.asList(s1));
        
        em.persist(s1);
        em.persist(p1);
        
        em.getTransaction().commit();
    }
    
}
