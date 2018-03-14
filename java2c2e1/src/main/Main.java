/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import beans.Point;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class pointClass = Class.forName("beans.Point");
            
            Constructor c = pointClass.getDeclaredConstructor();
            c.setAccessible(true);
            
            Point p = (Point) c.newInstance();
            
            Field xField = pointClass.getDeclaredField("x");
            xField.setAccessible(true);
            xField.setInt(p, 10);
            
            Field yField = pointClass.getDeclaredField("y");
            yField.setAccessible(true);
            yField.setInt(p, 30);
            
            Method m = pointClass.getDeclaredMethod("displayCoord");
            m.setAccessible(true);
            m.invoke(p);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
