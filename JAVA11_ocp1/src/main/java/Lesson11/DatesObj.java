/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;

/**
 *
 * @author keora
 */
public class DatesObj {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        JapaneseDate jDate = JapaneseDate.from(myDate);
        
        System.out.println(myDate+ "Today's Date: ");
        System.out.println("Japanese date: "+ jDate);
    }
    
}
