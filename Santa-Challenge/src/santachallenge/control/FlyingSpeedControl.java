/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.control;
import exceptions.FlyingSpeedControlException;

/**
 *
 * @author Lindsey
 */
public class FlyingSpeedControl {
    private double total;
    public double FlyingSpeed (double speed) 
    throws FlyingSpeedControlException {
        
        if (speed < 50) {
       throw new FlyingSpeedControlException("You didn't pick a fast enough,"
                 + "speed");
     }
     
     if (speed > 100) {
         throw new FlyingSpeedControlException("Whoa, I don't think Santa can go"
                 + "that fast!");

     }
     
     double duration = 1000 * 25 / speed / 14;
     double flyingDuration = Math.round(duration * 100)/100;
     
     return flyingDuration;
     
    }
      public void display() {
        
        System.out.println("Santa flew around the world in " + total);
    }
}
