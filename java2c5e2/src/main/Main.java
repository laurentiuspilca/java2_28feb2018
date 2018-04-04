/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.ProgramareFilm;
import java.util.Date;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c5e2PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        ProgramareFilm film = new ProgramareFilm();
        film.setSala("Sala 1");
        film.setFilme(new HashMap<>());
        film.getFilme().put(new Date(), "Silence of the Lambdas");
        
        em.persist(film);
        
        em.getTransaction().commit();
        em.close();
    }
    
}
