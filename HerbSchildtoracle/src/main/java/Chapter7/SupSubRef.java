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
public class SupSubRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new y(5, 6);
        
        x2 = x;
        System.out.println("x2.a" + x2.a);
        
        x2.a = 19;
    }

    private static class y extends Y {

        public y(int i, int i0) {
        }
    }
}
