/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.enums.Gen;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author student
 */
@Entity
public class Film {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String titlu;
    
    @Enumerated(EnumType.STRING)
    private Gen gen;
    
    @ElementCollection
    private List<String> registori;
    
    @ElementCollection
    private List<String> actori;
    
    @OneToMany(mappedBy = "film")
    private List<Programare> programari;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Gen getGen() {
        return gen;
    }

    public void setGen(Gen gen) {
        this.gen = gen;
    }

    public List<String> getRegistori() {
        return registori;
    }

    public void setRegistori(List<String> registori) {
        this.registori = registori;
    }

    public List<String> getActori() {
        return actori;
    }

    public void setActori(List<String> actori) {
        this.actori = actori;
    }

    public List<Programare> getProgramari() {
        return programari;
    }

    public void setProgramari(List<Programare> programari) {
        this.programari = programari;
    }
    
    
}
