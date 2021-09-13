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
public class TwoDShape {
  double width;  
  double height;  
  private String name;  
  
    
  TwoDShape() {  
    width = height = 0.0;  
    name = "none";  
  }  
  
    
  TwoDShape(double w, double h, String n) {  
    width = w;  
    height = h;  
    name = n;  
  }  
  
    
  TwoDShape(double x, String n) {  
    width = height = x;  
    name = n;  
  }  
  
    
  TwoDShape(TwoDShape ob) {  
    width = ob.width;  
    height = ob.height;  
    name = ob.name;  
  }  
  
    
  double getWidth() { return width; }  
  double getHeight() { return height; }  
  void setWidth(double w) { width = w; }  
  void setHeight(double h) { height = h; }  
  
  String getName() { return name; }  
  
  void showDim() {  
    System.out.println("Width and height are " +  
                       width + " and " + height);  
  }  
  
  double area() {   
    System.out.println("area() must be overridden");  
    return 0.0;  
  }
}
