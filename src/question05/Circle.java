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
public class Circle {
    private double radius;
    

    public Circle(double radius) {
        this.radius = radius;
    
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
    @Override
    public String toString() {
        return "radius: " + radius ;
    }
    
    
    
    
    
}
