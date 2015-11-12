/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import java.util.Scanner;
import santachallenge.SantaChallenge;
import santachallenge.control.GameControl;

/**
 *
 * @author Lindsey
 */
public class SelectInventoryView extends View{
    
    public SelectInventoryView() {
        super ("\n"
               + "\n----------------------------"
               + "\n         Select a Resource Menu          "
               + "\n----------------------------"
               + "\nH - Hat"
               + "\nC - Cookies"
               + "\nS - GPS"
               + "\nG - Goggles"
               + "\nT - Hot Chocolate"
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
            if (selection != 'C' && selection != 'H' && selection != 'S'
                    && selection != 'G' && selection != 'E' && selection != 'T') {
                System.out.println("Invalid menu entry");
                continue;
            }
            break;
            }
        return input;   
    }
    */
        
   @Override
    public boolean doAction(Object obj) {
        String value = (String)obj;
        value = value.toUpperCase();
        char selection = value.charAt(0);
        
        switch (selection){
            case 'C': //view map
                this.displayGetCookie();
                break;
            case 'H': //move santa
                this.displayGetHat();
                break;
            case 'S': //select resource
                this.displayGetGPS();
                break;
            case 'G': //load sleigh
                this.displayGetGoggles();
                break;
             case 'T': //choose santa
                this.displayGetHotChocolate();
                break;
            case 'E': //exit
                return true;
            default:
                System.out.println("\n***Invalid Selection***");
                break;
        }
        return false;
    }

    private void displayGetCookie() {
        System.out.println("*** displayGetCookie function called***");
    }

    private void displayGetHat() {
         System.out.println("*** displayGetHat function called***");
    }

    private void displayGetGPS() {
         System.out.println("*** displayGetGPS function called***");
    }

    private void displayGetGoggles() {
         System.out.println("*** displayGetGoggles function called***");
    }

    private void displayGetHotChocolate() {
         System.out.println("*** displayGetHotChocolate function called***");
    }
}
