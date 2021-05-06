/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r=new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
	}
       
        Scanner scan=new Scanner(System.in);
        System.out.println("Sri Sathya Mamidala");
        System.out.print("Enter the index: ");
        int index=scan.nextInt();
       try{
            System.out.println("Corresponding element value is present at the "+index+" is: "+arr[index]);
        }catch(ArrayIndexOutOfBoundsException ex){
       
            System.out.println("Index is out of bounds");
        
    }
    
}
}

