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
public class EnergyDriver {

   /**
 *
 * @author Sri Sathya Mamidala
     * @param args
 */
    public static void main(String[] args) {
        // TODO code application logic here
       double mass=7.98;
       long velocity=(long) mass;
       int time=(int) velocity;
        System.out.println("Sri Sathya Mamidala");
        Energy ener=new KineticEnergy( velocity,  mass,  time);
        System.out.println(ener.toString());
        
        
        
    }
    
}
