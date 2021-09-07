/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

/**
 *
 * @author keora
 */
public class ShoppingCart {
    Item[] items = {new Item("Shirt",25.60), 
                    new Item("WristBand",1.00), 
                    new Item("Pants",35.99)};
    
    public static void main(String[] args){   
        ShoppingCart cart = new ShoppingCart();
        cart.displayTotal();
    }
    
    public void displayTotal(){
        double total = 0;
        for(int idx = 0; idx < items.length; idx++){
            if(items[idx].isBackOrdered()) 
		continue;
            total += items[idx].getPrice();
        }
        System.out.println("Shopping Cart total: "+total);
    }
    
}
