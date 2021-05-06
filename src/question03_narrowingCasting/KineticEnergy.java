/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03_narrowingCasting;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class KineticEnergy extends Energy{
    private  float velocity;

    public KineticEnergy(float velocity, double mass, int time) {
        super(mass, time);
        this.velocity = velocity;
    }

    public float getVelocity() {
        return velocity;
    }
    
    


    public double calculateEnergy() {
        
        double x= Math.pow(velocity, 2);
        double kineticEner= 0.5*super.getMass()*x;
        return kineticEner;
    }


    public double calculatePower() {
  
        double power= calculateEnergy()/super.getTime();
        return power;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "The mass of an object is: "+super.getMass()+"kgs"+
                "\nTime travelled by the object is: "+super.getTime()+"min"+
                "\n velocity at which the object is travelling is: "+velocity+"km/hr"+
                "\nKinetic energy of an object is: "+calculateEnergy()+"Joules"+
                "\nPower is: "+calculatePower()+"Watts";
    }    
    
    
    
}
