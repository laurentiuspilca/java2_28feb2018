/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import beans.Test;
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
            Class testClass = Class.forName("beans.Test");
            Test t = (Test) testClass.getDeclaredConstructor().newInstance();
            
            Method[] methods = testClass.getDeclaredMethods();
            
            for (Method m : methods) {
                m.setAccessible(true);
                if (m.isAnnotationPresent(Apeleaza.class)) {
                    Apeleaza a = m.getDeclaredAnnotation(Apeleaza.class);
                    for (int i=0; i<a.value(); i++) {
                        m.invoke(t);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
