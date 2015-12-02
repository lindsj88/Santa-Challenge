/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import santachallenge.SantaChallenge;
import santachallenge.control.GameControl;

/**
 *
 * @author Lindsey
 */
public class HelpMenuView extends View{
     public HelpMenuView() {
        super ("\n"
               + "\n----------------------------"
               + "\n         Help Menu          "
               + "\n----------------------------"
               + "\nW - How to win" 
               + "\nM - Map and locations"
               + "\nE - Exit"
               + "\n   Please make a selection"
               + "\n----------------------------");
     }
    
    @Override
    public boolean doAction(Object obj) {
        String value = (String)obj;
        value = value.toUpperCase();
        char selection = value.charAt(0);
        
        switch (selection){
            case 'W': //start new game
                this.displayHowToWin();
                break;
            case 'M': //continue saved game
                this.displayMap();
                break;
            case 'E': //exit
                return true;
            default:
                ErrorView.display(this.getClass().getName(), 
                        "Invalid Selection, please try again");
                break;
        }
        return false;
    }
    
    private void displayHowToWin() {
        this.console.println("Help Santa deliver all the presents!");
    }
    
    private void displayMap() {
        MapView mapMenu = new MapView();
        mapMenu.display();
    }
}
   

