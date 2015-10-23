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
        double calories = 2200;
        double age = 65;
        
        double expResult = 16.25;
        
        FeedSantaControl instance = new FeedSantaControl();
        
        
        //call function to run test
        double result = instance.IsSantaFull(calories, age);
        
        //compare expected return valuewith actual return value
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         /*************************
         * test case 2
         *************************/
        System.out.println("\tTest case 2");
        
        //input values for test 2
        calories = 1000;
        age = 20;
        
        expResult = -1;
        
        
        //call function to run test
        result = instance.IsSantaFull(calories, age);
        
        //compare expected return valuewith actual return value
        assertEquals(expResult, result, 0.0);
        
         /*************************
         * test case 3
         *************************/
        System.out.println("\tTest case 3");
        
        //input values for test 3
        calories = 500;
        age = 30;
        
        expResult = -1;
        
        
        //call function to run test
        result = instance.IsSantaFull(calories, age);
        
        //compare expected return valuewith actual return value
        assertEquals(expResult, result, 0.0);
        
         /*************************
         * test case 4
         *************************/
        System.out.println("\tTest case 4");
        
        //input values for test 4
        calories = -22;
        age = 40;
        
        expResult = -1;
        
        
        //call function to run test
        result = instance.IsSantaFull(calories, age);
        
        //compare expected return valuewith actual return value
        assertEquals(expResult, result, 0.0);
        
         /*************************
         * test case 5
         *************************/
        System.out.println("\tTest case 5");
        
        //input values for test 5
        calories = -1000;
        age = 7;
        
        expResult = -1;
        
        
        //call function to run test
        result = instance.IsSantaFull(calories, age);
        
        //compare expected return valuewith actual return value
        assertEquals(expResult, result, 0.0);
        
         /*************************
         * test case 6
         *************************/
        System.out.println("\tTest case 6");
        
        //input values for test 6
        calories = 0;
        age = 100;
        
        expResult = -1;
        
        
        //call function to run test
        result = instance.IsSantaFull(calories, age);
        
        //compare expected return valuewith actual return value
        assertEquals(expResult, result, 0.0);
        
         /*************************
         * test case 7
         *************************/
        System.out.println("\tTest case 7");
        
        //input values for test 7
        calories = 2000;
        age = 0;
        
        expResult = -1;
        
        
        //call function to run test
        result = instance.IsSantaFull(calories, age);
        
        //compare expected return valuewith actual return value
        assertEquals(expResult, result, 0.0);
        
         /*************************
         * test case 8
         *************************/
        System.out.println("\tTest case 8");
        
        //input values for test 8
        calories = 2000;
        age = 100;
        
        expResult = -1;
        
        
        //call function to run test
        result = instance.IsSantaFull(calories, age);
        
        //compare expected return valuewith actual return value
        assertEquals(expResult, result, 0.0);
        
         /*************************
         * test case 9
         *************************/
        System.out.println("\tTest case 9");
        
        //input values for test 9
        calories = 3500;
        age = 75;
        
        expResult = 1366.25;
        
        
        //call function to run test
        result = instance.IsSantaFull(calories, age);
        
        //compare expected return valuewith actual return value
        assertEquals(expResult, result, 0.0);
        
        
    }
    
    
}
