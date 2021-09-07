/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;




/**
 *
 * @author keora
 */

public class Test1 {
    public static void main(String[] args) {
        try{
            doTest();
        }
        catch(MyException me){
            System.out.println(me);
        }
    }
    
    static void doTest() throws MyException{
        int[]array = new int[10];
        array[10] = 1000;
        doAnotherTest();
    }
    
    static void doAnotherTest() throws MyException{
        throw new MyException("Exception from doAnotherTest");
    }
   
}

