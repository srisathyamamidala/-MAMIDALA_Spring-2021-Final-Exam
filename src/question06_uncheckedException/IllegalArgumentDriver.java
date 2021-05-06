/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06_uncheckedException;

import java.util.Scanner;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class IllegalArgumentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalArgumentException{
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        
        
        System.out.print("Enter grade: ");
        String grade=scan.next();
        IllegalArgumentClass il=new IllegalArgumentClass(grade) ;
        try{
            if(!(grade.equals("A")||grade.equals("B")||grade.equals("C")||grade.equals("D")||grade.equals("F"))){
                  throw new IllegalArgumentException("grade must be A or B or C or D or F");
            }
                  else
                System.out.println(il.toString());
                  
              
    }catch(IllegalArgumentException iae){
            System.out.println("Exception is thrown as the grade is not A or B or C or D or F");
        
    }
        
    }
    
}
