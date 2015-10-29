/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class MainMenuView {

    private final String MENU = "\n"
               + "\n----------------------------"
               + "\n| Main Menu                 "
               + "\nG - Start game"
               + "\nH - Get help on how to play the game"
               + "\nS - Save game"
               + "\nE - Exit"
               + "\n----------------------------";

    
   public void displayMenu() {
       char selection = ' ';
       do {
           System.out.println(MENU);
           
           String input = this.getInput();
           selection = input.charAt(0);
           
           this.doAction(selection);
           
       }   while (selection != 'E');
       }    

    private String getInput() {

            boolean valid = false; 
            char selection =' ';
        String getInput = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            System.out.println("Enter Menu selection:");
            getInput = keyboard.nextLine();
            getInput = getInput.trim();
            selection = getInput.charAt(0);
            
            
            if (selection != 'G' || selection != 'H' || selection != 'S' || selection != 'E') {
                System.out.println("Invalid menu entry");
                continue;
            }
            break;
            }
        return getInput;    }
    
    public void doAction(char choice){
        switch(choice){
            case 'G':
                this.startNewGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.displaySaveGame();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n***Invalid Selection***");
                break;
                
        }
        
        private void startNewGame();{
        System.out.println("***Start game function called***");
}
        private void displayHelpMenu();{
        System.out.println("***Help Menu function called***");
}
        private void displaySaveGame();{
        System.out.println("***Save game function called***");
}
       
}
    

    
   
    
        

