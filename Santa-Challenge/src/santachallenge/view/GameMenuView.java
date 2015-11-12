/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import java.util.Scanner;

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
               + "\nC - Choose Santa"
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
                this.displayViewMap();
                break;
            case 'M': //move santa
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
            
            case 'E': //exit
                return true;
            default:
                System.out.println("\n***Invalid Selection***");
                break;
        }
        return false;
    }
    
    private void displayViewMap() {
        System.out.println("*** displayViewMap function called***");
    }
    
    private void displayMoveSanta() {
        System.out.println("*** displayMoveSanta function called***");
    }
    
    private void displayLoadSleigh() {
         System.out.println("*** displayLoadSleigh function called***");
    }
    
    private void displayChooseSanta() {
         System.out.println("*** displayChooseSanta function called***");
    }
    
    private void displayReturnToMain() {
        System.out.println("*** displayReturnToMenu function called***");
}

    private void displaySelectInventory() {
        //System.out.println("*** displaySelectInventory function called***");
        SelectInventoryView inventoryMenu = new SelectInventoryView();
        inventoryMenu.display();
    }
}
    
