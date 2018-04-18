/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.TransactionDao;
import entities.Transaction;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author student
 */
public class TransactionService {
    
    private EntityManagerFactory emf;
    
    private TransactionService() {
        emf = Persistence.createEntityManagerFactory("java2c6e5PU");
    }
    
    private static final class SingletonHolder {
        private static final TransactionService INSTANCE = new TransactionService();
    }
    
    public static TransactionService getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    public List<Transaction> getTransactionsForCard(int cardId) {
        EntityManager em = null;
        
        try {
            em = emf.createEntityManager();
            TransactionDao transactionDao = new TransactionDao(em);
            return transactionDao.getTransactionsForCard(cardId);
        } finally {
            if(em != null) em.close();
        }
    }
}
