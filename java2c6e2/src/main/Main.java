/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Card;
import entities.Transaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java2c6e2PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Card c = new Card();
        c.setSerie(UUID.randomUUID().toString());
        
        Transaction t1 = new Transaction();
        t1.setCard(c);
        t1.setDate(new Date());
        t1.setAmount(7000);
        
        Transaction t2 = new Transaction();
        t2.setCard(c);
        t2.setDate(new Date());
        t2.setAmount(5000);
        
        c.setTransactions(new ArrayList<>());
        c.getTransactions().add(t1);
        c.getTransactions().add(t2);
        
        em.persist(c);
        
        //String sql = "SELECT t FROM Transaction t";
        //String sql = "SELECT t FROM Transaction t WHERE t.amount > :amount";
        //String sql = "SELECT t FROM Transaction t WHERE t.amount > :min AND t.amount < :max";
        //String sql = "SELECT t FROM Transaction t WHERE t.card.serie = :serie";
        
        /*
        String sql = "SELECT t FROM Transaction t, Card c WHERE t.card = c AND c.serie = :serie";
        TypedQuery<Transaction> query = em.createQuery(sql, Transaction.class);
        query.setParameter("serie", "8405fd56-64a6-4004-903a-7c8df5c260d1");
        List<Transaction> transactions = query.getResultList();
        transactions.forEach(System.out::println);
        */
        
        //String sql = "SELECT COUNT(t) FROM Transaction t, Card c WHERE t.card = c AND c.serie = :serie";
        String sql = "SELECT MAX(t.amount) FROM Transaction t, Card c WHERE t.card = c AND c.serie = :serie";
        TypedQuery<Double> query = em.createQuery(sql, Double.class);
        query.setParameter("serie", "8405fd56-64a6-4004-903a-7c8df5c260d1");
        Double max = query.getSingleResult();
        System.out.println(max);
        
        em.getTransaction().commit();
    }
    
}
