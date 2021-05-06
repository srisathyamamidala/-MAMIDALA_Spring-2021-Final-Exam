/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04;

/**
 *
 * @author S542298
 */
public class FruitDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();
        if (fruit instanceof Fruit) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (fruit instanceof Orange) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (fruit instanceof Apple) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (fruit instanceof GoldenDelicious) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (fruit instanceof McIntosh) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (orange instanceof Orange) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (orange instanceof Fruit) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        ((GoldenDelicious) fruit).makeAppleCider();
        Apple ap = new McIntosh();
        orange.makeOrangeJuice();
    }
}