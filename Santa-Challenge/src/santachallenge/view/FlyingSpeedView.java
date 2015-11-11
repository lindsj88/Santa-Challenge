/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import static java.lang.System.in;
import java.util.Scanner;
import santachallenge.control.FlyingSpeedControl;

/**
 *
 * @author Lindsey
 */
public class FlyingSpeedView {
    String input = null;
        double speed = 0;
        double flyingDuration = 0;

    
    void display() {
        
        System.out.println("How fast do you (Santa) need to fly?");
        speed = this.getInput(); 
        
        this.doAction(speed);
    }

    private double getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        while (!valid) {
         
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length() < 2) {
                System.out.println("Not fast enough, please try again.");
                continue;
            }
            
            break;
            
        }
        
        double f = Double.parseDouble(selection);
        return f;
   }

    
    private void doAction(double speed) {
        
        FlyingSpeedControl flyingControl = new FlyingSpeedControl();
        flyingDuration = FlyingSpeedControl.FlyingSpeed(speed);
        
        if (flyingDuration == -1) {
                        
            String selection;
            System.out.println("You're going too slow, try again");     
            
        }
        
        else {
        System.out.println(flyingDuration + "sounds like a good speed to me!");
        }
        
    }
    
}
    
 
    
