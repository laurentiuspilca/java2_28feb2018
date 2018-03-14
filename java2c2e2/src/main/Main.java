/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.lang.reflect.Field;
import java.util.Random;
import beans.Number;

/**
 *
 * @author student
 */
public class Main {
    
    private static Random r = new Random();

    public static void main(String[] args) {
        
        try {
            Class numberClass = Class.forName("beans.Number");
            
            Number n = (Number) numberClass.getDeclaredConstructor().newInstance();
            
            Field [] fields = numberClass.getDeclaredFields();
            
            for (Field f : fields) {
                f.setAccessible(true);
                if (f.isAnnotationPresent(Aleator.class)) {
                    f.setInt(n, r.nextInt(1000));
                }
            }
            n.afisare();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
