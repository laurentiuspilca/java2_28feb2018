/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Transaction;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c6e3PU");
        EntityManager em = emf.createEntityManager();
        
        TypedQuery<Transaction> q = 
                em.createNamedQuery("Transaction.getAll", Transaction.class);
        
        List<Transaction> list = q.getResultList();
        list.forEach(System.out::println);
    }
    
}
