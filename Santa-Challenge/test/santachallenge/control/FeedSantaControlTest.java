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
public class FeedSantaControlTest {
    
    public FeedSantaControlTest() {
    }

    /**
     * Test of IsSantaFull method, of class FeedSantaControl.
     */
    @Test
    public void testIsSantaFull() {
        System.out.println("IsSantaFull");
        
        /*************************
         * test case 1
         *************************/
        System.out.println("\tTest case 1");
        
        //input values for test 1
        double calories = 2200.0;
        double age = 65.0;
        
        FeedSantaControl instance = new FeedSantaControl();
        
        double expResult = 16.25;
        
        //call function to run test
        double result = instance.IsSantaFull(calories, age);
        
        //compare expected return valuewith actual return value
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
