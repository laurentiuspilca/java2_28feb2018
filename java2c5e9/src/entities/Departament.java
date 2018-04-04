/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author student
 */
@Entity
public class Departament {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nume;
    
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "departament")
    private Map<Angajat, Masina> angajati;

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

    public Map<Angajat, Masina> getAngajati() {
        return angajati;
    }

    public void setAngajati(Map<Angajat, Masina> angajati) {
        this.angajati = angajati;
    }

}
