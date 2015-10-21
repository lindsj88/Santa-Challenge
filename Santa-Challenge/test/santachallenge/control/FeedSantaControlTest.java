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
        
        /***************************
         * Test case #1
         ***************************/
        
        //input value for test caase #1
        double calories = 2200;
        
        FeedSantaControl instance = new FeedSantaControl();
        
        double expResult = 0;
        
        double result = instance.IsSantaFull(calories);
        
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
