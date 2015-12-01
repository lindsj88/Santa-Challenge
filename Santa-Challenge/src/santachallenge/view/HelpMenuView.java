/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import java.util.Scanner;
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
               + "\nF - Feed Santa"
               + "\nL - Load sleigh" 
               + "\nE - Exit"
               + "\n   Please make a selection"
               + "\n----------------------------");
     }
    
/* public void displayMenu(){
    char selection = ' ';
       do {
           System.out.println(MENU);
           
           String input = this.getInput();
           selection = input.charAt(0);
           
           this.doAction(selection);
           
       }   while (selection != 'E');
   }

    private String getInput() {
        
        boolean valid = false; //if menu selection has been retrieved
        char  selection = ' ';
        String input= null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) { //while valid menu selection hasnt been retrieved
            
            System.out.println("Please enter a menu selection:");
            
            //get menu selection from keyboard and trim off extra spaces
            input = keyboard.nextLine();
            input = input.trim();
            selection = input.charAt(0);
            
            //if selection is invalid
            if (selection != 'W' && selection != 'M' && selection != 'F' && selection != 'L'
                    && selection != 'C' && selection != 'R' && selection != 'E') {
                System.out.println("Invalid menu entry");
                continue;
            }
            break;
            }
        return input;   
    }
     */
    
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
            case 'F':
                this.displayFeed();
                break;
            case 'L':
                this.displayLoad();
                break;
            case 'E': //exit
                return true;
            default:
                System.out.println("\n Invalid Selection, please try again");
                break;
        }
        return false;
    }
    
    private void displayHowToWin() {
        System.out.println("*** Help Santa deliver all the presents!***");
    }
    
    private void displayMap() {
        MapView mapMenu = new MapView();
        mapMenu.display();
        //System.out.println("*** displayMap function called***");
    }
    
    private void displayFeed() {
         FeedSantaView FeedView = new FeedSantaView();
         FeedView.display();
                 //System.out.println("*** displayfeed function called***");
    }
    
    private void displayLoad() {
         System.out.println("*** displayLoad function called***");
    }
}


