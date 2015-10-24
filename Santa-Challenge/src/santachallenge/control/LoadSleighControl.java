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
public class LoadSleighControl {
     public double SledWeight (double weight, double reindeerNumber) {
        if (weight > 800) {
       return -1;
     }
     
     if (weight < 0) {
         return -1;

     }
     
     double reindeerStrength = 100 *  reindeerNumber;
     double liftOff = 800 + 500 - reindeerStrength;
     
     return liftOff;
     
    }
}
