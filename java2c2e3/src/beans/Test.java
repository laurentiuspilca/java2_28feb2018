/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import main.Apeleaza;

/**
 *
 * @author student
 */
public class Test {
    
    public void test1() {
        System.out.println("Test 1");
    }
    
    @Apeleaza(value = 4, name = "B")
    public void test2() {
        System.out.println("Test 2");
    }
    
    @Apeleaza(2)
    public void test3() {
        System.out.println("Test 3");
    }
    
    @Apeleaza(value = 2)
    public void test4() {
        System.out.println("Test 4");
    }
}
