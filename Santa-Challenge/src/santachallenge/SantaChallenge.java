/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge;

import santachallenge.model.Game;
import santachallenge.model.Player;
import santachallenge.model.Inventory;
import santachallenge.model.Location;
import santachallenge.model.Map;
import santachallenge.model.Presents;
import santachallenge.model.Reindeer;
import santachallenge.model.Santa;
import santachallenge.model.Sleigh;

/**
 *
 * @author Jordan
 */
public class SantaChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game playerOne = new Game ();
    
            playerOne.setPlayerName("Lindsey");
            playerOne.setTime(7.00);

            String playerInfo=playerOne.toString();
            System.out.println(playerInfo);
        
        Presents presentsOne = new Presents ();
           
            presentsOne.setDescription("big");
            presentsOne.setWeight(25);
            
            String presentInfo = presentsOne.toString();
            System.out.println(presentInfo);
        
        Reindeer reindeerOne = new Reindeer ();
            
            reindeerOne.setSpeed(25);
            reindeerOne.setStrength(200);
            reindeerOne.setNumber(8);
            
            String reindeerInfo = reindeerOne.toString();
            System.out.println(reindeerInfo);
            
        Location locationOne = new Location ();
            
            locationOne.setName("Los Angeles");
            locationOne.setVisited("No");
            
            String locationInfo = locationOne.toString();
            System.out.println(locationInfo);
        
        Santa santaOne = new Santa ();
            
            santaOne.setCaloriesConsumed(5000);
            
            String santaInfo = santaOne.toString();
            System.out.println(santaInfo);
    }
}
    
    
    
    
