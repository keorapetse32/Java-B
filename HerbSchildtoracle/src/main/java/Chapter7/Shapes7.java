/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

/**
 *
 * @author keora
 */
public class Shapes7 {
    public static void main(String[] args) {
        Triangle t1 =
                new Triangle("outlined", 8.0, 12.0);
        
        Triangle t2 = new Triangle(t1);
        
        System.out.println(" info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("area is" + t2.area());
    }
}
