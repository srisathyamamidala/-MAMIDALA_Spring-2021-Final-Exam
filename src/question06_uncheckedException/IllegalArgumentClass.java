/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06_uncheckedException;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class IllegalArgumentClass {
    
   private String grade;

    public IllegalArgumentClass(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "grade of the student is : " + grade;
    }
   
   
    
    
   
   
    
    
}
