/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.pk;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author student
 */
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.cj);
        hash = 23 * hash + this.nr;
        hash = 23 * hash + Objects.hashCode(this.cod);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NumarInmatriculare other = (NumarInmatriculare) obj;
        if (this.nr != other.nr) {
            return false;
        }
        if (!Objects.equals(this.cj, other.cj)) {
            return false;
        }
        if (!Objects.equals(this.cod, other.cod)) {
            return false;
        }
        return true;
    }
    
    
}
