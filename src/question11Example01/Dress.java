/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11Example01;

import java.util.Objects;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class Dress {
    
    private String customer;
    private String location;
    private int dressesSold;

    public Dress(String customer, String location, int dressesSold) {
        this.customer = customer;
        this.location = location;
        this.dressesSold = dressesSold;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDressesSold() {
        return dressesSold;
    }

    public void setDressesSold(int dressesSold) {
        this.dressesSold = dressesSold;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.customer);
        hash = 79 * hash + Objects.hashCode(this.location);
        hash = 79 * hash + this.dressesSold;
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
        final Dress other = (Dress) obj;
        if (this.dressesSold != other.dressesSold) {
            return false;
        }
        if (!Objects.equals(this.customer, other.customer)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "customer: " + customer + "\nlocation: " + location +"\ndressesSold: " + dressesSold;
    }

    
  
    
    
}
