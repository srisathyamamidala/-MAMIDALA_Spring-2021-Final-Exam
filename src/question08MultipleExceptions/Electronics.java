/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08MultipleExceptions;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class Electronics {
    private final double inches;
    private final int price;
    private final double tax;

    public Electronics(double inches, int price, double tax) {
        this.inches = inches;
        this.price = price;
        this.tax = tax;
    }

    public double getInches() {
        return inches;
    }

    public int getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }
    
    public double totalPrice(){
        return price+tax;
    }
    
   

    @Override
    public String toString() {
        return "inches: " + inches + "\nprice: " + price + "tax: " + tax
                +"\nTotal price with tax is: "+totalPrice();
    }

    
    
}
