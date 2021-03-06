/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.control;

import exceptions.FeedSantaControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import santachallenge.SantaChallenge;

/**
 *
 * @author Lindsey
 */
public class FeedSantaControl {
    private double total;
    protected final BufferedReader keyboard = SantaChallenge.getInFile();
    protected final PrintWriter console = SantaChallenge.getOutFile();
   
    public double IsSantaFull(double calories, double age) 
    throws FeedSantaControlException {
    
        
     if (calories < 2001) {
         throw new FeedSantaControlException("You didn't feed Santa enough,"
                 + "he's still hungry");
       //return -1;
     }
     
     if (age < 0 || age > 100) {
         throw new FeedSantaControlException("You didn't feed Santa enough,"
                 + "at his age he needs more calories!");
         //return -1;

     }
     
     
     double needed = 10 * 136 + 6.25 * 183 - 5 * age + 5;
     double total = calories - needed;
     
 
     return total;
     
    }

    public void display() {
        
        this.console.println("Santa ate " + total + " calories");
    }
    //FoodItem[] foodItem = FeedSantaControl.createFoodList();
      //  game.setFoodItem(foodItem);

        
}
