/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Card;
import entities.Transaction;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c6e6PU");
        EntityManager em = emf.createEntityManager();
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Transaction> cq =  cb.createQuery(Transaction.class);
        
        Root<Transaction> t = cq.from(Transaction.class);
        cq.select(t).where(cb.ge(t.get("amount"), 3000));
        
        
        TypedQuery<Transaction> q = em.createQuery(cq);
        List<Transaction> transactions = q.getResultList();
        transactions.forEach(System.out::println);
    }
    
}
