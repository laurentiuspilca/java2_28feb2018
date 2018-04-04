/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.pk.NumarInmatriculare;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 *
 * @author student
 */
@Entity
@IdClass(NumarInmatriculare.class)
public class Masina {
    
    @Id
    private String cj;
    
    @Id
    private int nr;
    
    @Id
    private String cod;
    
    private String marca;
    
    private String culoare;

    public String getCj() {
        return cj;
    }

    public void setCj(String cj) {
        this.cj = cj;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    
    
}
