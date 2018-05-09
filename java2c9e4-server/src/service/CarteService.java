/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.CarteDao;
import dto.CarteDto;
import entities.Carte;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author student
 */
public class CarteService {
    
    private EntityManagerFactory emf;
    
    private CarteService() {
        emf = Persistence.createEntityManagerFactory("java2c9e4-serverPU");
    }
    
    private static final class SingletonHolder {
        private static final CarteService SINGLETON = new CarteService();
    }
    
    public static CarteService getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public void adaugaCarte(CarteDto carte) {
        Carte c = new Carte();
        c.setTitlu(carte.getTitlu());
        
        EntityManager em = emf.createEntityManager();
        CarteDao carteDao = new CarteDao(em);
        
        em.getTransaction().begin();
        carteDao.adaugaCarte(c);
        em.getTransaction().commit();
    }
    
    public List<CarteDto> getCarti() {
        EntityManager em = emf.createEntityManager();
        CarteDao carteDao = new CarteDao(em);
        return carteDao.getCarti()
                .stream()
                .map(c -> new CarteDto(c.getId(), c.getTitlu()))
                .collect(Collectors.toList());
    }
    
}
