/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Card;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author student
 */
public class CardDao {
    
    private EntityManager em;
    
    public CardDao(EntityManager em) {
        this.em = em;
    }
    
    public List<Card> getCards() {
        String sql = "SELECT c FROM Card c";
        TypedQuery<Card> q = em.createQuery(sql, Card.class);
        return q.getResultList();
    }
    
    public void addCard(Card c) {
        em.persist(c);
    }
}
