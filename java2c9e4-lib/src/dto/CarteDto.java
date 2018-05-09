/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author student
 */
public class CarteDto {
    
    private int id;
    private String titlu;

    public CarteDto() {
    }

    public CarteDto(int id, String titlu) {
        this.id = id;
        this.titlu = titlu;
    }
    
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
    
    @Override
    public String toString() {
        return titlu;
    }
    
}
