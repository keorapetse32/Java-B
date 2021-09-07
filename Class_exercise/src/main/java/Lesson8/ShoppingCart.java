/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8;

/**
 *
 * @author keora
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        item1.setItemFields("Belt", 1, 29.50);
        item1.displayItem();

        int retcode = item1.setItemFields("Shirt", 1, 34.99, ' ');
        if (retcode < 0) {
            System.out.println("Invalid color code.  Item not added.");
        } else {
            item1.displayItem();
        }
    }
    
}
