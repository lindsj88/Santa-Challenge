/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge;

import santachallenge.model.Game;
import santachallenge.model.Inventory;
import santachallenge.model.Location;
import santachallenge.model.Map;
import santachallenge.model.Player;
import santachallenge.model.Presents;
import santachallenge.model.Reindeer;
import santachallenge.model.Santa;
import santachallenge.model.Sleigh;
import santachallenge.model.santasHouse;
import santachallenge.model.workShop;

/**
 *
 * @author Jordan
 */
public class SantaChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game gameOne = new Game ();
    
            gameOne.setPlayerName("Lindsey");
            gameOne.setTime(7.00);

            String gameInfo = gameOne.toString();
            System.out.println(gameInfo);
        
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
            
        Inventory inventoryOne = new Inventory ();
            
            inventoryOne.setDescription("hat");
            inventoryOne.setQuantity(1);
            
            String inventoryInfo = inventoryOne.toString();
            System.out.println(inventoryInfo);
    
        Player playerOne = new Player ();
            
            playerOne.setName("Lindsey");
            playerOne.setBestTime(10);
            
            String playerInfo = playerOne.toString();
            System.out.println(playerInfo);
            
        Map mapOne = new Map ();
            
            mapOne.setName("Los Angeles");
            mapOne.setDistance(2000);
            
            String mapInfo = mapOne.toString();
            System.out.println(mapInfo);
            
        Sleigh sleighOne = new Sleigh ();
            
            sleighOne.setSize(200);
            sleighOne.setSpeed(300);
            sleighOne.setWeight(400);
            
            String sleighInfo = sleighOne.toString();
            System.out.println(sleighInfo);
            
        santasHouse santasHouseOne = new santasHouse ();
            santasHouseOne.setActivity("breakfast");
            santasHouseOne.setDescription("choose food");
            
            String santasHouseInfo = santasHouseOne.toString();
            System.out.println(santasHouseInfo);
            
         workShop workShopOne = new workShop ();
            workShopOne.setActivity("reindeer");
            workShopOne.setDescription("pick reindeer");
            
            String workShopInfo = workShopOne.toString();
            System.out.println(workShopInfo);
    } 
}
