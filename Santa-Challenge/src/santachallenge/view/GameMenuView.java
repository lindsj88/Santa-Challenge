/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import java.util.ArrayList;
import java.util.Scanner;
import santachallenge.SantaChallenge;
import santachallenge.control.GameControl;
import santachallenge.control.MapControl;
import santachallenge.model.Game;
import santachallenge.model.Inventory;
import santachallenge.model.InventoryItem;
import santachallenge.model.Location;
import santachallenge.model.Map;
import santachallenge.model.Scene;
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
               + "\nV - View Map/Pick a location"
               + "\nL - Load Sleigh"
               + "\nS - Select Inventory"
               + "\nC - Choose Santa's Partner"
               + "\nF - Feed Santa"
               + "\nZ - Flying speed"
               + "\nE - Exit"
               + "\n----------------------------");
    }
    
    /* public void displayMenu() {
        char selection = ' ';
       do {
           System.out.println(MENU);
           
           String input = this.getInput();
           selection = input.charAt(0);
           
           this.doAction(selection);
           
       }   while (selection != 'E');
   }

    private String getInput() {
        
        boolean valid = false; //if menu selection has been retrieved
        char  selection = ' ';
        String input= null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) { //while valid menu selection hasnt been retrieved
            
            System.out.println("Please enter a menu selection:");
            
            //get menu selection from keyboard and trim off extra spaces
            input = keyboard.nextLine();
            input = input.trim();
            selection = input.charAt(0);
            
            //if selection is invalid
            if (selection != 'V' && selection != 'M' && selection != 'L'
                    && selection != 'C' && selection != 'S' && selection != 'E') {
                System.out.println("Invalid menu entry");
                continue;
            }
            break;
            }
        return input;   
    } */
    
    @Override
    public boolean doAction(Object obj) {
        String value = (String)obj;
        value = value.toUpperCase();
        char selection = value.charAt(0);
        
        switch (selection){
            case 'V': //view map
                Game game = SantaChallenge.getCurrentGame();
                this.displayViewMap();
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
                 case 'Z': //choose santa
                this.displayFlyingSpeedControl();
                break;
             case 'F':
               this.displayFeedSanta();
            case 'E': //exit
                return true;
            default:
                System.out.println("\n***Invalid Selection***");
                break;
        }
        return false;
    }
    
    private void displayViewMap() {
        
        Game game = SantaChallenge.getCurrentGame();
        Map map = SantaChallenge.getCurrentGame().getMap();
        int rows = map.getRows();
        int columns = map.getColumns();
        Location[][] locations = map.getLocations();
        
        // Display title
        System.out.println("\n Locations");
        
        // Display map
        System.out.println(" 1  2  3  4  5");
        
        for (int i=0; i < rows; i++) {
            System.out.println("--------------");
            
            for (int j=0; j < columns; j++) {
                System.out.print("  |  |  |  |  ");
                
                System.out.print(locations[i][j].getScene());
                
                if (locations[i][j].getVisited()) {
                    System.out.print(" X ");
                } else {
                    System.out.print("  ");
                }
                
            }
            System.out.println("\n-------------");
        }
}

    
    private void displayLoadSleigh() {
         System.out.println("*** displayLoadSleigh function called***");
    }
    
    private void displayChooseSanta() {
         System.out.println("*** displayChooseSanta function called***");
    }

    private void displaySelectInventory() {
        
       InventoryItem[] inventory = GameControl.getInventoryList();
        
        System.out.println("\nInventory Items");
        System.out.println("Description" + "\t" + 
                            "Required" + "\t" +
                            "In stock");
        
        for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getDescription() + "\t " +
                    inventoryItem.getRequired() + "\t " +
                    inventoryItem.getQuantity());
        }
    }
        //System.out.println("*** displaySelectInventory function called***");
       /* SelectInventoryView inventoryMenu = new SelectInventoryView();
        inventoryMenu.display();
    }*/

    private void displayFeedSanta() {
        FeedSantaView feedSantaView = new FeedSantaView();
        feedSantaView.display();
    }
     private void displayFlyingSpeedControl() {
        FlyingSpeedView flyingSpeedView = new FlyingSpeedView();
        flyingSpeedView.display();
    }

    private static class map {

        private static Location[][] getLocations() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public map() {
        }
    }

   
}
    
