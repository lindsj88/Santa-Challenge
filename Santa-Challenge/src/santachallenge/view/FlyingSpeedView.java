/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import exceptions.FlyingSpeedControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import santachallenge.SantaChallenge;
import santachallenge.control.FlyingSpeedControl;

/**
 *
 * @author Jordan
 */
public class FlyingSpeedView extends View {
    
    
    public FlyingSpeedView() throws FlyingSpeedControlException{
        
        super ("\n"
               + "\n----------------------------"
               + "\n   How long will it take"
               + "\n   for Santa to fly "
               + "\n   around the world?        "
               + "\n----------------------------"
               + "\nP - 100 Mph"
               + "\nB - 300 Mph"
               + "\nS - 500 Mpn"
               + "\nO - 700 Mph"
               + "\nE - Exit"
               + "\n----------------------------");
    }
   private final BufferedReader keyboard = SantaChallenge.getInFile();
    private final PrintWriter console = SantaChallenge.getOutFile();
    
    @Override
    public boolean doAction(Object obj) {
        String value = (String)obj;
        value = value.toUpperCase();
        char selection = value.charAt(0);
        
        switch (selection){
            case 'P': 
          this.displayFlyingSpeedControl();
                break;
            case 'B': //select resource
                this.displayFlyingSpeedControl();
                break;
            case 'S': //load sleigh
                this.displayFlyingSpeedControl();
                break;
             case 'O': //choose santa
                this.displayFlyingSpeedControl();
                break;
             case 'E': //exit
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid Selection");
                break;
        }
        return false;
    }

    

 private int displayFlyingSpeedControl() {
        int speed = 75;
        
        FlyingSpeedControl flyingControl = new FlyingSpeedControl();
        flyingControl.display();
    try {
        // speed = Double.parseDouble();
     } catch (NumberFormatException nf) {
         ErrorView.display(this.getClass().getName(), "You must enter a valid selection");
     }
        return speed;
 }
}
