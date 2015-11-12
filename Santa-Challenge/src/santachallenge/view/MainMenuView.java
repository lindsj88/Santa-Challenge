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
 * @author Jordan
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super ("\n"
               + "\n----------------------------"
               + "\n         Main Menu          "
               + "\n----------------------------"
               + "\nG - Start game"
               + "\nC - Continue Saved game"
               + "\nH - Get help on how to play the game"
               + "\nS - Save game"
               + "\nE - Exit"
               + "\n----------------------------");
    }
    
  /* public void displayMenu() {
       
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
            if (selection != 'G' && selection != 'H' && selection != 'S' && selection != 'E') {
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
        
        String value = (String) obj;
        value = value.toUpperCase();
        char selection = value.charAt(0);
        
        switch (selection){
            case 'G': //start new game
                this.startNewGame();
                break;
            case 'C': //continue saved game
                this.continueGame();
                break;
            case 'H': //help menu
                this.displayHelpMenu();
                this.display();
                break;
            case 'S': //save game
                this.displaySaveGame();
                break;
            case 'E': //exit
                return true;
            default:
                System.out.println("\n***Invalid Selection***");
                break;
        }
        return false;
    }
    
    private void startNewGame() {
        GameControl.createNewGame(SantaChallenge.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        //System.out.println("*** continueGame function called***");
    }
    
    private void continueGame() {
        System.out.println("*** continueGame function called***");
    }
    
    private void displayHelpMenu() {
        //show help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
    private void displaySaveGame() {
         System.out.println("*** displaySaveGame function called***");
    }
}