/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.pk;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author student
 */
@Embeddable
public class NumarInmatriculare implements Serializable {
    
    private String cj;
    private int nr;
    private String cod;

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
    
    
    
}
