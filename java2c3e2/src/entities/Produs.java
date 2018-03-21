/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 *
 * @author student
 */
@Entity
@Table(name = "PRODUSE")
public class Produs {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "produs_table")
    @TableGenerator(name = "produs_table", table = "produs_table", allocationSize = 1)
    //@SequenceGenerator
    @Column(name = "PRODUS_ID")
    private int id;
    
    @Basic(optional = false, fetch = FetchType.LAZY)
    @Column(name = "PRODUS_NUME")
    private String nume;

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
    
    
}
