/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06_checkedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class ChocolateDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("Sri Sathya Mamidala");
       try{
       Scanner nacs = new Scanner(new File("inpt.txt"));
    
        int quantity=nacs.nextInt();
        double costOfEachChoc=nacs.nextDouble();
        String customerName=nacs.next();
        String chocName=nacs.next();
        Chocolate choco=new DarkChocolate( quantity,costOfEachChoc,customerName,chocName);   
        System.out.println(choco.toString());
            
        
    }catch(FileNotFoundException fe){
           System.out.println("File not found exception is thrown");
    }
    } 
}

