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
public class Car extends Vehicle {
    private int seats;//seats
	
	public void showCar() {
		super.showInfo();
		 System.out.println("seats:"+seats);
	}
 
	public Car(String brand, String color, int seats) {
		super(brand, color);
		this.seats = seats;
	}
}
