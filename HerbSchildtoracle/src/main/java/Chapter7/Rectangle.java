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
public class Rectangle extends TwoDShape {
    boolean isSquare() { 
    return width == height; 
  } 
   
  double area() { 
    return width * height; 
  }
}
