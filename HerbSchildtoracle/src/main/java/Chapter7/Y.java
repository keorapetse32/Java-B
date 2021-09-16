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
public class Y extends X {
    int b;
    
    Y(int i, int j) {
    super(j);
    b = i;
 }

    Y(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
