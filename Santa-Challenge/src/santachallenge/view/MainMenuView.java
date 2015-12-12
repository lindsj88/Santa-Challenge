/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import exceptions.GameControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
  
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char selection = value.charAt(0);
        
        switch (selection){
            case 'G':
                this.startNewGame();  
                break;
            case 'C': //continue saved game
                this.continueGame();
                break;
            case 'H': //help menu
                this.displayHelpMenu();
                break;
            case 'S': //save game
                this.displaySaveGame();
                break;
            case 'E': //exit
                return true;
            default:
                ErrorView.display("MainMenuView",
                        "***Invalid Selection***");
                break;
        }
        return false;
    }
    
    private void startNewGame() {
        GameControl.createNewGame(SantaChallenge.getPlayer());
    
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }
    
    private void continueGame() {
        this.console.println("\nEnter the file path where the game is saved");
        
        String filePath = this.getInput();
        
        try {
            GameControl.continueGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
    private void displayHelpMenu() {
        //show help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
    private void displaySaveGame() {
         this.console.println("Enter the file path where the game will be saved");
         String filePath = this.getInput();
         
         try {
             GameControl.displaySaveGame(SantaChallenge.getCurrentGame(), filePath);
         } catch (Exception ex) {
             ErrorView.display("MainMenuView", ex.getMessage());
         }
    }
}