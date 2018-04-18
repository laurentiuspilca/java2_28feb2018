/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Transaction;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author student
 */
public class TransactionDao {
    
    private EntityManager em;
    
    public TransactionDao(EntityManager em) {
        this.em = em;
    }
    
    public List<Transaction> getTransactionsForCard(int id) {
        String sql = "SELECT t FROM Transaction t WHERE t.card.id = :id";
        TypedQuery<Transaction> q = em.createQuery(sql, Transaction.class);
        q.setParameter("id", id);
        return q.getResultList();
    }  
}
