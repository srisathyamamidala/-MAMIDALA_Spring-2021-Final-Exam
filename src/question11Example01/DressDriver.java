/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11Example01;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class DressDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dress d1=new Dress("sathya","1213W village o",23);
        Dress d2=new Dress("sathya","1213W village o",23);
        Dress d3=new Dress("sathya","1213W village o",23);
        System.out.println("Sri Sathya Mamidala");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println("***********************************");
        System.out.println("Equals: ");
        System.out.println(d1.equals(d3));
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        
        System.out.println("*************************************");
                System.out.println(d1==(d3));
                System.out.println(d1==(d2));
                System.out.println(d2==(d3));
        System.out.println("Hash code: ");
                System.out.println("***********************************");
                System.out.println(d1.hashCode());
                System.out.println(d2.hashCode());
                System.out.println(d3.hashCode());
                
              

    }
    
}
