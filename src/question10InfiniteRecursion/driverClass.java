/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10InfiniteRecursion;

import java.util.Scanner;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class driverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nacs=new Scanner(System.in);
        System.out.println("Sri Sathya Mamidala");
        System.out.print("Enter the number1: ");
        double number1=nacs.nextDouble();
        System.out.print("Enter the number2: ");
        double number2=nacs.nextDouble();


        try{
        infiniteRecursion inr=new infiniteRecursion(number1,number2);
        
        System.out.println(inr.toString());
        System.out.println(inr.series(5));
    }catch(StackOverflowError s){
            System.out.println("Over flow error");
    }
    
}
}
