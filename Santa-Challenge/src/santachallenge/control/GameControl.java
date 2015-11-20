/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.control;

import santachallenge.SantaChallenge;
import santachallenge.model.Game;
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
        
        InventoryControl[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Sleigh sleigh = new Sleigh();
        game.setSleigh(sleigh);
        
        Map map = MapContol.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
        
    }
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
            
        }
        
        public static InventoryItems[] getSortedInventoryList() {
            
            InventoryItems[] originalInventoryList = 
                    SantaChallenge.getCurrentGame().getInventory();
            
            InventoryItem[] inventoryList = originalInventoryList.clone();
            
            InventoryItem tempInventoryItem;
            for (int i=0; i < inventoryList.length-1; i++) {
                for (int j=0; j<inventoryList.length-1-i; j++) {
                    if(inventoryList[j].getDescription().
                            compareToIgnoreCase(inventoryList[j + 1].
                                    getDescription() > 0) {
                        tempInventoryItem = inventoryList[j];
                        inventoryList[j] = inventoryList[j + 1];
                        inventoryList[j + 1] = tempInventoryItem;
                    }
                }
            }
            return inventoryList;
        }
    }
