/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

/**
 *
 * @author keora
 */
public class Exercise5_2 {
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";
                    
        String[] items = {"Shirt","Socks","Scarf","Belt"};
        
        message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);
          
       
        System.out.println(items[2]);
    }
    
}
