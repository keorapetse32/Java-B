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
public class Shirt extends Clothing{
    private char necksize = 'U';
    
    public static void main(String[] args){
        Shirt myShirt = new Shirt();
        myShirt.setColor("Blue");
        myShirt.setSize('L');
        myShirt.setType("Gold Shirt");
        myShirt.setPrice(999.99);
        
        myShirt.display();
        
    }

    
}
