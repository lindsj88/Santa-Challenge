/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.control;

import santachallenge.SantaChallenge;
import santachallenge.model.Game;
import santachallenge.model.Inventory;
import santachallenge.model.InventoryItem;
import santachallenge.model.Item;
import santachallenge.model.Map;
import santachallenge.model.Player;
import santachallenge.model.Sleigh;

/**
 *
 * @author Lindsey
 */
public class GameControl {
   
    public static void createNewGame(Player player) {
        
        Game game = new Game();
        SantaChallenge.setCurrentGame(game);
        
        game.setPlayer(player);
        
        InventoryItem[] inventoryItem = GameControl.createInventoryList();
        game.setInventoryItem(inventoryItem);
        
        Sleigh sleigh = new Sleigh();
        game.setSleigh(sleigh);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        //MapControl.moveActorsToStartingLocation(map);
        
    }
        public static InventoryItem[] createInventoryList() {
            InventoryItem[] inventory = new InventoryItem[6];
            
  /* hat, cookies, gps, gloves, goggles, hot chocolate
                       */
            InventoryItem hat = new InventoryItem();
            hat.setDescription("Hat");
            hat.setQuantity(1);
            hat.setRequired(0);
            inventory[Item.hat.ordinal()] = hat;
            
            InventoryItem cookies = new InventoryItem();
            cookies.setDescription("Cookies");
            cookies.setQuantity(1);
            cookies.setRequired(0);
            inventory[Item.cookies.ordinal()] = cookies;
            
            InventoryItem gps = new InventoryItem();
            gps.setDescription("GPS");
            gps.setQuantity(1);
            gps.setRequired(0);
            inventory[Item.gps.ordinal()] = gps;
            
            InventoryItem gloves = new InventoryItem();
            gloves.setDescription("Gloves");
            gloves.setQuantity(1);
            gloves.setRequired(0);
            inventory[Item.gloves.ordinal()] = gloves;
            
            InventoryItem goggles = new InventoryItem();
            goggles.setDescription("Goggles");
            goggles.setQuantity(1);
            goggles.setRequired(0);
            inventory[Item.goggles.ordinal()] = goggles;
            
            InventoryItem hotChocolate = new InventoryItem();
            hotChocolate.setDescription("Hot Chocolate");
            hotChocolate.setQuantity(1);
            hotChocolate.setRequired(0);
            inventory[Item.hotChocolate.ordinal()] = hotChocolate;
            
            return inventory;
            
        }
        
        public static InventoryItem[] getSortedInventoryList() {
            
            InventoryItem[] originalInventoryList = SantaChallenge.getCurrentGame().getInventoryItem();
            
            InventoryItem[] inventoryList = originalInventoryList.clone();
            
            InventoryItem tempInventoryList;
            for (int i=0; i < inventoryList.length-1; i++) {
                for (int j=0; j < inventoryList.length-1-i; j++) {
                    if(inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                        tempInventoryList = inventoryList[j];
                        inventoryList[j] = inventoryList[j + 1];
                        inventoryList[j + 1] = tempInventoryList;
                    }
                }
            }
            return inventoryList;
        }

    public static InventoryItem[] getInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
