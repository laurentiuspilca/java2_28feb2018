/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Carte;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author student
 */
public class CarteDao {
    
    private EntityManager em;
    
    public CarteDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaCarte(Carte c) {
        em.persist(c);
    }
    
    public List<Carte> getCarti() {
        String sql = "SELECT c FROM Carte c";
        TypedQuery<Carte> q = em.createQuery(sql, Carte.class);
        return q.getResultList();
    }
}
