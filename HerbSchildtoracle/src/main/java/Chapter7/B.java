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
public class B extends A{
   @Override
   void meth() { // ERROR! Can't override.
    System.out.println("Illegal!"); 
  }
}
