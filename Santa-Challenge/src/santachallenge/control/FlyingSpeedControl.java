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
public class FlyingSpeedControl {
    
    public double FlyingSpeed (double speed) {
        if (speed < 50) {
       return -1;
     }
     
     if (speed >= 100) {
         return -1;

     }
     
     double duration = 1000 * 25 / speed / 14;
     double flyingDuration = Math.round(duration * 100)/100;
     
     return flyingDuration;
     
    }
}
