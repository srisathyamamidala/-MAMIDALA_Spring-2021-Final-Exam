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
public class PotentialEnergy extends Energy {
    private static final double gravity=9.8;
    private final float height;

    public PotentialEnergy(float height, double mass, int time) {
        super(mass, time);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }
    
    
 
    public double calculateEnergy() {
        double potentialEner=super.getMass()*gravity*height;
        return potentialEner;
        
    }

    
    public double calculatePower() {
        double power=calculateEnergy()/super.getTime();
        return power;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return  super.toString()+"\nheight travelled by the object is: " + height +"metres"+
                "\nPotential energy of the object is: "+calculateEnergy()+"Joules"+
                "\nPower is: "+calculatePower()+"Watts";
                
    }

    
    
    
    
}
