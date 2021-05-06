/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;



/**
 *
 * @author Sri Sathya Mamidala
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ComparableCircle c1=new ComparableCircle(15.8);
        
        
         ComparableCircle c2=new ComparableCircle(16.4);
         System.out.println("Sri Sathya Mamidala");
         System.out.println("Larger instance: "+findLargest(c1,c2));
    }

    private static String findLargest(ComparableCircle c1, ComparableCircle c2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String str=" ";
       if(c1.compareTo(c2)>0)
        str="The area of ​​the first circle is large.";
        else if(c1.compareTo(c2)<0)
        str="The area of ​​the second circle is large.";
        else
        str="The area of ​​the two circles is the same";
       
       return str;
    }
    
}

    
        
