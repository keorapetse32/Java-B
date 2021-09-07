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
public class VehicleTest {
    public static void main(String[] args) {
		 Car c = new Car("Eastern Black", "White", 4);
		c.showCar();
		System.out.println();
		 Truck t = new Truck("Wuling God Car", "Black",3500);
		t.showTUuck();
                Motorcycle m = new Motorcycle("suzuki", "Red", 2);
		m.showMotorcycle();
	}
}
