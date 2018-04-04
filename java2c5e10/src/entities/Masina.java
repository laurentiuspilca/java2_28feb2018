/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.pk.NumarInmatriculare;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author student
 */
@Entity
public class Masina {
    
    @EmbeddedId
    private NumarInmatriculare nr;
    
    private String marca;
    
    private String culoare;

    public NumarInmatriculare getNr() {
        return nr;
    }

    public void setNr(NumarInmatriculare nr) {
        this.nr = nr;
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
