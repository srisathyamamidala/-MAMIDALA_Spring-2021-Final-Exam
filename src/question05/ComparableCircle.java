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
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "radius: "+super.getRadius();
    }
    
    

    @Override
    public int compareTo(ComparableCircle cir) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return Double.compare(super.area(),cir.area());
        
    }

    
    
    
}
