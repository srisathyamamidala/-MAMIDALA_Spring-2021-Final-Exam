/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09_throwsKeyword;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class Cone {
    
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    
    public double volume(){
        return Math.PI*Math.pow(radius, 2)*height;
    }
    @Override
    public String toString() {
        return "radius: " + radius + "\nheight: " + height+"\nvolume: "+volume();
    }
    
    
    
}
