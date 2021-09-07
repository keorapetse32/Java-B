/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author keora
 */
public class Truck extends Vehicle {
    private float load;//load
	
	public void showTUuck() {
		super.showInfo();
		 System.out.println("Load:"+load);
	}
	
	public Truck(String brand, String color, float load) {
		super(brand, color);
		this.load = load;
	}
}
