/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09_throwKeyword;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class Calc {
    
    private int number;

    public Calc(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
    
    public String modulo(){
        String str=" ";
        if(number%2!=0){
            throw new ArithmeticException("Number is not a even number");
        }
        else{
           str="Number is even";
        }
        return str;
    }

    @Override
    public String toString() {
        return "number: " + number ;
    }
    
    
    
}
