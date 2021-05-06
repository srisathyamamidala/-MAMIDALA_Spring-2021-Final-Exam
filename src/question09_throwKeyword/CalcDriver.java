/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09_throwKeyword;

import java.util.Scanner;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class CalcDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sri Sathya Mamidala");
        try{
           
        Scanner nacs=new Scanner(System.in);
            System.out.print("Enter the number: ");
        int number=nacs.nextInt();
        Calc c=new Calc(number);
        System.out.println(c.toString());
        System.out.println(c.modulo());
       
    }catch(Exception a){
            System.out.println("throws arithmetic exception ");
    }
    
}
}
