/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.control;

/**
 *
 * @author Lindsey
 */
public class FeedSantaControl {
    private double total;
   
    public double IsSantaFull(double calories, double age) {
    
        
     if (calories < 2001) {
       return -1;
     }
     
     if (age < 0 || age > 100) {
         return -1;

     }
     
     double needed = 10 * 136 + 6.25 * 183 - 5 * age + 5;
     double total = calories - needed;
     
     return total;
     
    }

    public void display() {
        
        System.out.println("Santa ate " + total + " calories");
    }
    
    
}
