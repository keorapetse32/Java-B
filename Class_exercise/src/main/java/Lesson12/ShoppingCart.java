/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12;

/**
 *
 * @author keora
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Item item = new Shirt(25.99, 'M', 'G');

        item.display();
        if (item instanceof Shirt) {
            String color = ((Shirt) item).getColor();
            System.out.println("Color: " + color);
        }else System.out.println("Item is not a Shirt.");
    }
}
