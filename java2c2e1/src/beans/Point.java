/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author student
 */
public class Point {
    
    private int x;
    private int y;
    
    private Point() {
        
    }
    
    private void displayCoord() {
        System.out.println(x + " " + y);
    }
}
