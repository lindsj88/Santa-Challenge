/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import exceptions.FeedSantaControlException;
import santachallenge.control.FeedSantaControl;

/**
 *
 * @author Lindsey
 */
public class FeedSantaView extends View {
    
    public FeedSantaView() throws FeedSantaControlException{
        
        super ("\n"
               + "\n----------------------------"
               + "\n   What should Santa eat"
               + "\n   to help him make it "
               + "\n   around the world?        "
               + "\n----------------------------"
               + "\nP - 2 pieces of pizza"
               + "\nB - 12 slices of bacon"
               + "\nS - 1 steak"
               + "\nO - 1 big bowl of oatmeal"
               + "\nY - Yogurt and a banana"
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
          this.displayFeedSantaControl();
                break;
            case 'B': //select resource
                this.displayFeedSantaControl();
                break;
            case 'S': //load sleigh
                this.displayFeedSantaControl();
                break;
             case 'O': //choose santa
                this.displayFeedSantaControl();
                break;
            case 'Y': //choose santa
                this.displayFeedSantaControl();
                break;
            case 'E': //exit
                return true;
            default:
                System.out.println("\n***Invalid Selection***");
                break;
        }
        return false;
    }

 private int displayFeedSantaControl() {
        int calories = 2500;
        FeedSantaControl feedControl = new FeedSantaControl();
        feedControl.display();
  try {
         //calories = int.parseInt();
     } catch (NumberFormatException nf) {
         System.out.println("\n You must enter a valid number");
     }
        return calories;
 }
 
}
    
