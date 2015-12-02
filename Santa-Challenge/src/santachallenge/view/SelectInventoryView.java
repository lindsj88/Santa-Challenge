/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

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
                ErrorView.display(this.getClass().getName(),
                        "Invalid Selection");
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
