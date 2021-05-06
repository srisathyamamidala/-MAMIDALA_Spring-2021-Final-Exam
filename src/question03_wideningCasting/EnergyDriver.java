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
    public class EnergyDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int time=30;
        
        float height=time;
        double mass=height;
        
        System.out.println("Sri Sathya Mamidala");
       
       Energy potEner=new PotentialEnergy(height, mass, time);
        System.out.println(potEner.toString());
        
        
        
    }
    
}

