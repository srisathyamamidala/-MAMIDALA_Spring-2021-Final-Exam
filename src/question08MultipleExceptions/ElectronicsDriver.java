/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08MultipleExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class ElectronicsDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException,StringIndexOutOfBoundsException{
        // TODO code application logic here
        System.out.println("Sri Sathya Mamidala");
        try{
        Scanner nacs=new Scanner(new File("fie.txt"));
        double inches=nacs.nextDouble();
        int price=nacs.nextInt();
        double tax=nacs.nextDouble();
          
        Electronics elec=new Electronics(inches,price,tax);
        
        System.out.println(elec.toString());
        }catch(FileNotFoundException f){
            System.out.println("file not found exception is thrown");
        }
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String a=sc.next();
        
        try{
        
            char c = a.charAt(8); 
            System.out.println(c);
        
    }catch(StringIndexOutOfBoundsException s){
            System.out.println("Throws string index out of bound exception");
    }
    
}
}
