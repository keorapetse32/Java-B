/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

/**
 *
 * @author keora
 */
public class Clerk {
    private String name;
    private int id;
    private double salary;
    private String position;
    
    public void display(){
        System.out.println("Name " + name); 
        System.out.println("ID" + id);
        System.out.println("Salary" + salary);
        System.out.println("Position"+ position);
    }

    public String getName() {
        return name;
    }
    
    public void setName(String color) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    public void setId(String color) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }
    
    public void setSalary(String color) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }
    
    public void setPosition(String color) {
        this.position = position;
    }
    
    
}
