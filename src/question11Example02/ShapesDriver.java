/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11Example02;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class ShapesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shapes a1 = new Shapes("Triangle",14.5,19.6);
        Shapes a2 = new Shapes("Triangle", 14.5,19.6);
          
        System.out.println("Sri Sathya Mamidala");
        if(a1.hashCode() == a2.hashCode())
        {
  
            if(a1.equals(a2))
                System.out.println("The two objects are equal ");
            else
                System.out.println("The two Objects are not equal. ");
      
        }
        else
        System.out.println("The two Objects are not equal. "); 
    } 
}
    
    

