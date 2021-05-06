/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11Example02;

import java.util.Objects;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class Shapes {
    private String Name;
    private double area;
    private double perimeter;

    public Shapes(String Name, double area, double perimeter) {
        this.Name = Name;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.Name);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.area) ^ (Double.doubleToLongBits(this.area) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.perimeter) ^ (Double.doubleToLongBits(this.perimeter) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Shapes other = (Shapes) obj;
        if (Double.doubleToLongBits(this.area) != Double.doubleToLongBits(other.area)) {
            return false;
        }
        if (Double.doubleToLongBits(this.perimeter) != Double.doubleToLongBits(other.perimeter)) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Name: " + Name + "\narea: " + area + "\nperimeter: " + perimeter;
    }
    
    
    
    
}
