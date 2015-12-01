/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.control;

import exceptions.FlyingSpeedControlException;
import exceptions.LoadSleighControlException;

/**
 *
 * @author Lindsey
 */
public class LoadSleighControl {
    
     public double SledWeight (double weight, double reindeerNumber) 
     throws LoadSleighControlException {
         
        if (weight > 800) {
       throw new LoadSleighControlException("I don't think the reindeer can pull that much weight");
     }
     
     
     if (weight < 0) {
         throw new LoadSleighControlException("That's not a real number");
     }

     double reindeerStrength = 100 *  reindeerNumber;
     double liftOff = 800 + 500 - reindeerStrength;
     
     return liftOff;
     
    }
}
