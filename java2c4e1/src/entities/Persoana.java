/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author student
 */
@Entity
public class Persoana {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nume;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Buletin buletin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Buletin getBuletin() {
        return buletin;
    }

    public void setBuletin(Buletin buletin) {
        this.buletin = buletin;
    }

    @Override
    public String toString() {
        return "Persoana{" + "id=" + id + ", nume=" + nume + '}';
    }
    
    
}
