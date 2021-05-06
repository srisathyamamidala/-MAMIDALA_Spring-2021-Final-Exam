/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09_throwsKeyword;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class ThrowsException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        // TODO code application logic here
        ArrayList<Object> myInt = new ArrayList<Object>();
        
        Scanner nacs=new Scanner(System.in);
        System.out.print("Enter the value: ");
        int a=nacs.nextInt();
        System.out.println("Sri Sathya Mamidala");
        myInt.add("Hello");
        
        
        try{
        myInt.add(new Cone(5.7,8.9));
        myInt.add(15);
        myInt.add(29);
        myInt.add(12);
        System.out.println(myInt.get(0));
            System.out.println(myInt.get(1));
        System.out.println(myInt.get(2));
        System.out.println(myInt.get(3));
        System.out.println(myInt.get(a));



        
    }catch(Exception e){
            System.out.println("Throws ArrayIndexOutOfBoundsException");
    }
    
}
}
