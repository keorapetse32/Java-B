/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

/**
 *
 * @author keora
 */
public class Shirt {
    public String description;
    public char colorCode;
    public double price;

    public void setField(String desc, char color,double price){
        this.description = desc;
        this.colorCode = color;
        this.price = price;
    }
}
