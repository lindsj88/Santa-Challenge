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
        
         /*************************
         * test case 2
         *************************/
        System.out.println("\tTest case 2");
        
        speed = 49;
        
        expResult = -1;
        
        result = instance.FlyingSpeed(speed);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /*************************
         * test case 3
         *************************/
        System.out.println("\tTest case 3");
        
        speed = -25;
        
        expResult = -1;
        
        result = instance.FlyingSpeed(speed);
        assertEquals(expResult, result, 0.0);
        
        /*************************
         * test case 4
         *************************/
        System.out.println("\tTest case 4");
        
        speed = 200;
        
        expResult = -1;
        
        result = instance.FlyingSpeed(speed);
        assertEquals(expResult, result, 0.0);
        
        /*************************
         * test case 5
         *************************/
        System.out.println("\tTest case 5");
        
        speed = 50;
        
        expResult = 35;
        
        result = instance.FlyingSpeed(speed);
        assertEquals(expResult, result, 0.0);
        
        /*************************
         * test case 6
         *************************/
        System.out.println("\tTest case 6");
        
        speed = 100;
        
        expResult = 17;
        
        result = instance.FlyingSpeed(speed);
        assertEquals(expResult, result, 0.0);
    }
   
}
