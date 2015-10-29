/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import java.util.Scanner;
import santachallenge.control.ProgramControl;
import santachallenge.model.Player;

/**
 *
 * @author Jordan
 */
public class StartProgramView {
    public StartProgramView() {
    }
    public void startProgram(){
        
        //Display the banner screen
        this.displayBanner();
            this.displayWelcomeMessage(player);
MainMenuView mainMenu = new MainMenuView ();
    mainMenu.displayMenu();
    }

    private void displayBanner() {
        System.out.println("* This game is a Christmas themed text based role playing game. In this game you will be taking on the very important role of Santa Claus. It is a very big day in the North Pole, it’s the morning of Christmas Eve and the workshop is bustling.*");
                
        System.out.println("* Your first task is to help Santa prepare himself, and his belongings, for the day. What type of food should he eat for the journey? Once Santa is ready, you can move along to things like choosing how many reindeer pull the sleigh and how many presents you can take.  \n" +
"The final and most important job that you will have is making sure the presents get delivered to the right children, at the right houses.  Throughout your journey there are many friends and treasures to be found. Choose your own delivery route, but be careful not to let Santa or his reindeer get too tired, or you may be stuck somewhere you*");
                        
        System.out.println("*At the end of your journey fly your sleigh back to the North Pole and check in with Mrs. Claus.*");
    }
        //prompt player to enter name
        String playersName = this.getPlayersName ();

    

    private String getPlayersName() {
        boolean valid = false; 
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            System.out.println("Enter the player's name below:");
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue;
            }
            break;
            }
        return playersName;
        }
    
    Player player = ProgramControl.createPlayer(playersName);
    


    public void displayWelcomeMessage(Player player){

        System.out.println("*==========================*");
        System.out.println("*Welcome to the game " + player.getName());
        System.out.println("*We hope you have a lot of fun!");
        System.out.println("*==========================*");


    
    
}
}
