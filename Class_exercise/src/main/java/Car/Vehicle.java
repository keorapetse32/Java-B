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
public class Vehicle {
    private String brand;//brand
	 private String color;//color
	
	public void run() {
		System.out.println("00");
	}
	
	public Vehicle(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
	}
	
	public void showInfo() {
		 System.out.println("Brand:"+brand);
		 System.out.println("color:"+color);
	}

}
