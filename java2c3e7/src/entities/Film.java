/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.data.DateHour;
import entities.enums.Gen;
import javax.persistence.Basic;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

/**
 *
 * @author student
 */
@Entity
public class Film {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "film_table_generator")
    @TableGenerator(name = "film_table_generator", table = "film_table_generator")
    private int id;
    
    @Basic(optional = false)
    private String titlu;
    
    @Embedded
    private DateHour dateHour;
    
    @Enumerated(EnumType.STRING)
    private Gen gen;

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

    public DateHour getDateHour() {
        return dateHour;
    }

    public void setDateHour(DateHour dateHour) {
        this.dateHour = dateHour;
    }

    public Gen getGen() {
        return gen;
    }

    public void setGen(Gen gen) {
        this.gen = gen;
    }
    
}
