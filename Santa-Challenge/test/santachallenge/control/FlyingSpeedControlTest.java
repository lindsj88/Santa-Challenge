/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lindsey
 */
public class FlyingSpeedControlTest {
    
    public FlyingSpeedControlTest() {
    }

    /**
     * Test of FlyingSpeed method, of class FlyingSpeedControl.
     */
    @Test
    public void testFlyingSpeed() {
        System.out.println("FlyingSpeed");
        
        /*************************
         * test case 1
         *************************/
        System.out.println("\tTest case 1");
        
        double speed = 75;
        
        FlyingSpeedControl instance = new FlyingSpeedControl();
        
        double expResult = 23.0;
        
        double result = instance.FlyingSpeed(speed);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
