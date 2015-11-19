/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.control;

import java.io.Serializable;
import santachallenge.model.Inventory;
import santachallenge.model.Map;
import santachallenge.model.Player;
import santachallenge.model.Sleigh;

/**
 *
 * @author Lindsey
 */
public class GameControl {
    public class Game implements Serializable {
        private double totalTime;
        
        private Player player;
        private Map map;
        private Sleigh sleigh;
        private Inventory inventory;
    
   
    }
    public static void createNewGame(Player player) {
        
        Game game = new Game();
        santachallenge.setCurrentGame(game);
        
        game.setPlayer(player);
        
        inventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Sleigh sleigh = new Sleigh();
        game.setSleigh(sleigh);
        
        Map map = MapContol.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
        
        public static InventoryItem[] createInventoryList() {
            System.out.println("*** called createInventoryList() in GameControl ***");
            return null;
        }
        public static Inventoryitem[] createInventoryList() {
            InventoryItem[] inventory =
                    new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
                    /* hat, cookies, gps, gloves, goggles, hot chocolate
                       */
            InvetoryItem hat = new InvetoryItem();
            hat.setDescription("Hat");
            hat.setQuantityInStock(0);
            hat.setRequiredAmount(0);
            inventory[Item.hat.ordinal()] = hat;
            
            InvetoryItem cookies = new InvetoryItem();
            cookies.setDescription("Cookies");
            cookies.setQuantityInStock(0);
            cookies.setRequiredAmount(0);
            inventory[Item.cookies.ordinal()] = cookies;
            
            InvetoryItem gps = new InvetoryItem();
            gps.setDescription("GPS");
            gps.setQuantityInStock(0);
            gps.setRequiredAmount(0);
            inventory[Item.gps.ordinal()] = gps;
            
            InvetoryItem gloves = new InvetoryItem();
            gloves.setDescription("Gloves");
            gloves.setQuantityInStock(0);
            gloves.setRequiredAmount(0);
            inventory[Item.gloves.ordinal()] = gloves;
            
            InvetoryItem goggles = new InvetoryItem();
            goggles.setDescription("Goggles");
            goggles.setQuantityInStock(0);
            goggles.setRequiredAmount(0);
            inventory[Item.goggles.ordinal()] = goggles;
            
            InvetoryItem hotChocolate = new InvetoryItem();
            hotChocolate.setDescription("Hot Chocolate");
            hotChocolate.setQuantityInStock(0);
            hotChocolate.setRequiredAmount(0);
            inventory[Item.hotChocolate.ordinal()] = hotChocolate;
            
            return inventory;
            
            public enum Item {
                hat,
                cookies,
                gps,
                gloves,
                goggles,
                hotChocolate;
            }
        }
    }
    
}
