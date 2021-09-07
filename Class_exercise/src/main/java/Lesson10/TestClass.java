/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10;

/**
 *
 * @author keora
 */
public class TestClass {
    public static void main(String[] args) {
        int x = 4, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("After if stmt, x = " + x);
        
        x = ((y / x) < 3) ? (x += y) : (x *= y);
        System.out.println("After ternary op, x = " + x);
    }
    
}
