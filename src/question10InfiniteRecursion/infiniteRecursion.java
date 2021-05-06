/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10InfiniteRecursion;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class infiniteRecursion {
    
    private double number1;
    private double number2;

    public infiniteRecursion(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    
    public double series(int n){
        if(number1==0||number2==0){
            return 0;
        }
            else
            return Math.pow(number1, number2)+series(n);
        
    }

    @Override
    public String toString() {
        return "number1: " + number1 + "\nnumber2: " + number2 ;
    }
    
    
    }
    
        
    

