/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import santachallenge.control.FlyingSpeedControl;

/**
 *
 * @author Jordan
 */
public class FlyingSpeedView extends View {
    
    
    public FlyingSpeedView() {
        
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
                System.out.println("\n***Invalid Selection***");
                break;
        }
        return false;
    }


 private void displayFlyingSpeedControl() {
        int speed = 75;
        FlyingSpeedControl flyingControl = new FlyingSpeedControl();
        flyingControl.display();
 }
}
