/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;
import java.util.Map;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyTemporal;
import javax.persistence.TemporalType;

/**
 *
 * @author student
 */
@Entity
public class ProgramareFilm {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String sala;
    
    @ElementCollection
    @MapKeyTemporal(TemporalType.DATE)
    private Map<Date, String> filme;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Map<Date, String> getFilme() {
        return filme;
    }

    public void setFilme(Map<Date, String> filme) {
        this.filme = filme;
    }
    
    
}
