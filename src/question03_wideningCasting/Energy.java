/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03_wideningCasting;

/**
 *
 * @author Sri Sathya Mamidala
 */

public  class Energy {
    private final double mass;
    private final int time;

    public Energy(double mass, int time) {
        this.mass = mass;
        this.time = time;
    }

    public double getMass() {
        return mass;
    }

    
    

    public int getTime() {
        return time;
    }

   
    
    
    @Override
    public String toString() {
        return  "mass: " + mass + "\ntime: " + time ;
    }
    
    
}
