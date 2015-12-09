/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import santachallenge.SantaChallenge;
import santachallenge.control.ProgramControl;
import santachallenge.model.Player;

/**
 *
 * @author Jordan
 */
public class StartProgramView {
   private final BufferedReader keyboard = SantaChallenge.getInFile();
   private final PrintWriter console = SantaChallenge.getOutFile();
    
   public StartProgramView() {
   } 
   
    public void startProgram(){
        
        
        String playersName;
         playersName = this.getPlayersName();
        
        Player player = ProgramControl.createPlayer(playersName);
        
        //Display the banner screen
        this.displayBanner();
        
        //display welcome message
        this.displayWelcomeMessage(player);
        
        
        //display main menu
        MainMenuView mainMenu = new MainMenuView ();
        mainMenu.display();
        
        
    }

    private void displayBanner() {
        this.console.println("* This game is a Christmas themed text based role playing game. "
                + "\n In this game you will be taking on the very important role of Santa     "
                + "\n Claus. It is a very big day in the North Pole, it’s the morning of       "
                + "\n Christmas Eve and the workshop is bustling.                             ");
                
        this.console.println("* Your first task is to help Santa prepare himself, and his belongings, for the day. What type of food should he eat for the journey? Once Santa is ready, you can move along to things like choosing how many reindeer pull the sleigh and how many presents you can take.  \n" +
"The final and most important job that you will have is making sure the presents get delivered to the right children, at the right houses.  Throughout your journey there are many friends and treasures to be found. Choose your own delivery route, but be careful not to let Santa or his reindeer get too tired, or you may be stuck somewhere you*");
                        
        this.console.println("*At the end of your journey fly your sleigh back to the North Pole and check in with Mrs. Claus.*");
    }
        //prompt player to enter name
        //String playersName = this.getPlayersName ();

    

    private String getPlayersName() {
        boolean valid = false; //if name has been retrieved
        String playersName = null;
        
        while(!valid) { //while valid name hasnt been retrieved
            
            this.console.println("Enter the player's name:");
            
            try {
            //get name from keyboard and trim off extra spaces
            playersName = this.keyboard.readLine();
            playersName = playersName.trim();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), 
                        "Please enter a valid name");
            }
            //if names invalid
            if (playersName.length() < 2) {
                System.out.println("Please enter a valid name");
                continue; //repeat
            }
            break;
            }
        return playersName;
        }
    
 
    


    public void displayWelcomeMessage(Player player){

        System.out.println("*==========================*");
        System.out.println("*Welcome to the game " + player.getName());
        System.out.println("*We hope you have a lot of fun!");
        System.out.println("*==========================*");


    
    
}
}

