/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;


/**
 *
 * @author Sri Sathya Mamidala
 */
public class GeometricObjectDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObject[] go = new Square[5];
		GeometricObject first = new Square(5);
		GeometricObject second = new Square(7);
		GeometricObject third = new Square(8);
		GeometricObject fourth = new Square(4);
		GeometricObject fifth = new Square(3);
		go[0] = first;
                go[1] = second;
                go[2] = third;
                go[3] = fourth;
                go[4] = fifth;
                System.out.println("Sri Sathya Mamidala");
                 for (GeometricObject g : go) {
                     
                     System.out.println("Area of the object is: "+g.area());
            if (g instanceof Colorable) {
                Colorable co = (Colorable) g;
                co.howToColor();
            }
            
        }
    }
}
    

