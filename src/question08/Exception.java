/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08;

import java.util.Scanner;

/**
 *
 * @author sri sathya mamidala
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NumberFormatException{
        // TODO code application logic here
        try{
        Scanner nacs=new Scanner(System.in);
            System.out.println("Sri Sathya Mamidala");
        System.out.print("Enter the input: ");
        
        String str=nacs.next();
       
        int a = Integer.parseInt(str);
            System.out.println(a);
        }catch(NumberFormatException ne){
            System.out.println("Throws the number format exception");
        }
    }
}

    
    

