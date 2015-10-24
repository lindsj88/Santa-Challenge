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
 * @author Jordan
 */
public class LoadSleighControlTest {
    
    public LoadSleighControlTest() {
    }

    /**
     * Test of SledWeight method, of class LoadSleighControl.
     */
    @Test
    public void testSledWeight() {
        System.out.println("SledWeight");
        /*************************
         * test case 1
         *************************/
        System.out.println("\tTest case 1");

        double weight = 800;
        double reindeerNumber = 8;
        LoadSleighControl instance = new LoadSleighControl();
        double expResult = 500;
        double result = instance.SledWeight(weight, reindeerNumber);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        /*************************
         * test case 2
         *************************/
        System.out.println("\tTest case 2");
        weight = 800;
        reindeerNumber = 7;
        expResult = 600;
        result = instance.SledWeight(weight, reindeerNumber);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        /*************************
         * test case 3
         *************************/
        System.out.println("\tTest case 3");
         weight = 800;
        reindeerNumber = 5;
        expResult = 800;
        result = instance.SledWeight(weight, reindeerNumber);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        /*************************
         * test case 4
         *************************/
        System.out.println("\tTest case 4");
         weight = 800;
        reindeerNumber = 4;
        expResult = 900;
        result = instance.SledWeight(weight, reindeerNumber);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        /*************************
         * test case 5
         *************************/
        System.out.println("\tTest case 5");
         weight = 800;
        reindeerNumber = 3;
        expResult = 1000;
        result = instance.SledWeight(weight, reindeerNumber);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        /*************************
         * test case 6
         *************************/
        System.out.println("\tTest case 6");
         weight = 800;
        reindeerNumber = 2;
        expResult = 1100;
        result = instance.SledWeight(weight, reindeerNumber);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        /*************************
         * test case 7
         *************************/
        System.out.println("\tTest case 7");
         weight = 800;
        reindeerNumber = 1;
        expResult = 1200;
        result = instance.SledWeight(weight, reindeerNumber);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
       
    }
    
}
