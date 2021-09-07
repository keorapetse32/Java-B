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
public class Triangle extends TwoDShape {
    String style; 
   
  double area() { 
    return width * height / 2; 
  } 
 
  void showStyle() { 
    System.out.println("Triangle is " + style); 
  }
}
