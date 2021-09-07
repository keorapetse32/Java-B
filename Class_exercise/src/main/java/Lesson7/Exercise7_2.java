/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7;

/**
 *
 * @author keora
 */
public class Exercise7_2 {
    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        StringBuilder sb;
       
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
          
        sb = new StringBuilder(firstName);

        sb.append(" Smith");
	
        System.out.println(sb);
    }
    
    
}
