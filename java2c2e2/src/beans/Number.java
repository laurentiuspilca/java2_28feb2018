/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import main.Aleator;

/**
 *
 * @author student
 */
public class Number {
    
    @Aleator 
    private int x;
    
    private int y;
    
    @Aleator 
    private int z;
    
    public void afisare() {
        System.out.println(x + " " + y + " " + z);
    }
}
