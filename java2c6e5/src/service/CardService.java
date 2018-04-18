/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.CardDao;
import entities.Card;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author student
 */
public class CardService {

    private EntityManagerFactory emf;

    private CardService() {
        emf = Persistence.createEntityManagerFactory("java2c6e5PU");
    }

    private static final class SingletonHolder {

        private static final CardService INSTANCE = new CardService();
    }

    public static CardService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public List<Card> getCards() {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            CardDao cardDao = new CardDao(em);
            return cardDao.getCards();
        } finally {
            if (em != null) em.close();
        }
    }
    
    public void addCard(Card c) {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            CardDao cardDao = new CardDao(em);
            em.getTransaction().begin();
            cardDao.addCard(c);
            em.getTransaction().commit();
        } finally {
            if (em != null) em.close();
        }
    }
}
