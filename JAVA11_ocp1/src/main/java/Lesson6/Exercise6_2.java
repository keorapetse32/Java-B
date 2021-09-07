/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6;

/**
 *
 * @author keora
 */
public class Exercise6_2 {
    public static void main(String[] args) {
 
        Item item1, item2;
        item1 = new Item();
        item2 = new Item();        

	item1.desc = "Shirt";
        item2.desc = "Pants";

        item1 = item2;
        System.out.println("Item1: " + item1.desc);
        System.out.println("Item2: " + item2.desc);
    }
    
}
