/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1.Lesson9;

/**
 *
 * @author keora
 */
public class Item {
    private int ID;
    private String description;
    private double price = 15.50;
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(){
        this.price = price;
    }

    public int getID() {
        return ID;
    }
    
    public void setID(){
        if ((ID >= 100)&&(ID <= 300)){
            this.ID = ID;
        }else{
            System.out.println("Incorrect ID. The ID should be between 100 and 300");
        }
    }

    public String getDescription() {
        return description;
    }

    void setDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
