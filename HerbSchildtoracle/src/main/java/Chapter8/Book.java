/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

/**
 *
 * @author keora
 */
public class Book {
    private String title;
    private String author;
    private int pubDate;
    
    Book(String t, String a, int d){
        title = t;
        author = a;
        pubDate = d;
    }
    
    void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }

}
