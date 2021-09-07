/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author keora
 */
public class Exercise11_1 {
    public static void main(String[] args) {
        LocalDateTime orderDate;

        orderDate = LocalDateTime.now();
        System.out.println("Order date: "+ orderDate);

        String fDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Formatted order date: "+ fDate);
    }
    
}
