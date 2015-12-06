/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import exceptions.FeedSantaControlException;
import exceptions.FlyingSpeedControlException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import santachallenge.SantaChallenge;
import santachallenge.control.GameControl;
import santachallenge.model.Game;
import santachallenge.model.InventoryItem;
import santachallenge.model.Location;
import santachallenge.model.Map;
/**
 *
 * @author Lindsey
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
        
        super ("\n"
               + "\n----------------------------"
               + "\n         Game Play Menu          "
               + "\n----------------------------"
               + "\nV - View Map"
               + "\nM - Move Santa"
               + "\nL - Load Sleigh"
               + "\nS - Select Inventory"
               + "\nC - Choose Santa's Partner"
               + "\nF - Feed Santa"
               + "\nZ - Flying speed"
               + "\nA - View Inventory Report"
               + "\nE - Exit"
               + "\n----------------------------");
    }
   
    @Override
    public boolean doAction(Object obj) {
        String value = (String)obj;
        value = value.toUpperCase();
        char selection = value.charAt(0);
        
        switch (selection){
            case 'V': //view map
                this.displayViewMap();
                break;
            case 'M':
                this.displayMoveSanta();
                break;
            case 'S': //select resource
                this.displaySelectInventory();
                break;
            case 'L': //load sleigh
                this.displayLoadSleigh();
                break;
             case 'C': //choose santa
                this.displayChooseSanta();
                break;
            case 'A':
                 this.viewReport();
                 case 'Z': {
            try {
                //choose santa
                this.displayFlyingSpeedControl();
            } catch (FlyingSpeedControlException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
             case 'F':
        {
            try {
                this.displayFeedSanta();
            } catch (FeedSantaControlException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            case 'E': //exit
                return true;
            default:
                this.console.println("\n***Invalid Selection***");
                break;
        }
        return false;
    }
    
    private void displayViewMap() {
        
        Game game = SantaChallenge.getCurrentGame();
        Map map = (Map) SantaChallenge.getCurrentGame().getMap();
        int rows = map.getRows();
        int columns = map.getColumns();
        Location[][] locations = map.getLocations();
        
        // Display title
        this.console.println("\n Locations");
        
        // Display map
        this.console.println(" 1  2  3  4  5");
        
        for (int i=0; i < rows; i++) {
            this.console.println("--------------");
            
            for (int j=0; j < columns; j++) {
                this.console.print("  |  |  |  |  ");
                
                this.console.print(locations[i][j].getScene());
                
                if (locations[i][j].getVisited()) {
                   this.console.print(" X ");
                } else {
                    this.console.print("  ");
                }
                
            }
            this.console.println("\n-------------");
        }
}
    
    private void displayMoveSanta() {
        Map map = (Map) SantaChallenge.getCurrentGame().getMap();
        SantaControl santa = new SantaControl();
        santa.displayMoveSanta();
    }

    
    private void displayLoadSleigh() {
        LoadSleighView loadSleighView = new LoadSleighView();
        loadSleighView.display();
    }
    
    private void displayChooseSanta() {
         System.out.println("*** displayChooseSanta function called***");
    }

    private void displaySelectInventory() {
        
       InventoryItem[] inventory = GameControl.getInventoryList();
        
        this.console.println("\nInventory Items");
        this.console.println("Description" + "\t" + 
                            "Required" + "\t" +
                            "In stock");
        
        for (InventoryItem inventoryItem : inventory) {
            this.console.println(inventoryItem.getDescription() + "\t " +
                    inventoryItem.getRequired() + "\t " +
                    inventoryItem.getQuantity());
        }
    }
        //System.out.println("*** displaySelectInventory function called***");
       /* SelectInventoryView inventoryMenu = new SelectInventoryView();
        inventoryMenu.display();
    }*/

    private void displayFeedSanta() throws FeedSantaControlException{
        FeedSantaView feedSantaView = new FeedSantaView();
        feedSantaView.display();
    }
    
     private void displayFlyingSpeedControl() throws FlyingSpeedControlException  {
        FlyingSpeedView flyingSpeedView = new FlyingSpeedView();
        flyingSpeedView.display();
    }

    private void viewReport() {
        String locationOfFile = null;
        this.console.println("Enter the file path where "
                + "you'd like the report to be printed. ");
        
        String filePath = this.getInput();
        
        locationOfFile = this.getInput();
        
        PrintWriter.writeInventory(locationOfFile);
    }

    private static class map {

        private static Location[][] getLocations() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public map() {
            
        }
    }

   
}*/
    
