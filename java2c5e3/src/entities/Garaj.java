/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.enums.Tip;
import java.util.Map;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyEnumerated;

/**
 *
 * @author student
 */
@Entity
public class Garaj {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String adresa;
    
    @ElementCollection
    @MapKeyEnumerated(EnumType.STRING)
    private Map<Tip, String> masini;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Map<Tip, String> getMasini() {
        return masini;
    }

    public void setMasini(Map<Tip, String> masini) {
        this.masini = masini;
    }
    
    
}
