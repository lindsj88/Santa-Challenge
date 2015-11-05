/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

/**
 *
 * @author Jordan
 */
public class MapView {
     private final String MENU = "\n"
               + "\n----------------------------"
               + "\n         Game Play Menu          "
               + "\n----------------------------"
               + "\nA - Noth Pole"
               + "\nB - Los Angeles, USA"
               + "\nC - Seattle, USA"
               + "\nD - Ottawa, Canada"
               + "\nE - nchorage, Alaska"
               + "\nF - Mexico City, Mexico"
               + "\nG - Sao Paulo, Brazil"
               + "\nH - Santiago, Chile"
               + "\nI - Buenas Aires, Argentina"
               + "\nJ - Bogota, Columbia"
               + "\nK - Cape Town, South Africa"
               + "\nL - Nairobi, Kenya"
               + "\nM - Lagos, Nigeria"
               + "\nN - Casablanca, Morocco"
               + "\nO - Moscow, Russia"
               + "\nP - London, England"
               + "\nQ - Madrid, Spain"
               + "\nR - Prague, Czech Republic"
               + "\nS - Mumbai, India"
               + "\nT - Hong Kong, China"
               + "\nU - Ulaanbaatar, Mongolia"
               + "\nV - Bangkok, Thailand"
               + "\nW - Perth, Austrailia"
               + "\nX - Melbourne, Australia"
               + "\nY - Brisbane, Autralia"
               + "\n----------------------------";
    
    public void displayMenu() {
        char selection = ' ';
       do {
           System.out.println(MENU);
           
           String input = this.getInput();
           selection = input.charAt(0);
           
           this.doAction(selection);
           
       }   while (selection != 'Z');
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
            if (
                    selection != 'A' && selection != 'B' && selection != 'C'
                    && selection != 'D' && selection != 'E' && selection != 'F'
                    selection != 'G' && selection != 'H' && selection != 'I'
                    && selection != 'J' && selection != 'K' && selection != 'L'
                    selection != 'M' && selection != 'N' && selection != 'O'
                    && selection != 'P' && selection != 'Q' && selection != 'R'
                    selection != 'S' && selection != 'T' && selection != 'U'
                    && selection != 'V' && selection != 'W' && selection != 'X'
                            && selection != 'Y'
                    
                    ) {
                System.out.println("Invalid menu entry");
                continue;
            }
            break;
            }
        return input;   
    }
    
    public void doAction(char selection){
        switch (selection){
            case 'A': //location
                this.displayNorthPole();
                break;
            case 'B': //location
                this.displayMoveSanta();
                break;
            case 'C': //location
                this.displaySelectInventory();
                break;
            case 'D': //location
                this.displayLoadSleigh();
                break;
             case 'E': //location
                this.displayChooseSanta();
                break;
             case 'F': //location
                this.displayViewMap();
                break;
            case 'G': //location
                this.displayMoveSanta();
                break;
            case 'H': //location
                this.displaySelectInventory();
                break;
            case 'I': //location
                this.displayLoadSleigh();
                break;
             case 'J': //location
                this.displayChooseSanta();
                break;
                 
                  case 'K': //location
                this.displayViewMap();
                break;
            case 'L': //location
                this.displayMoveSanta();
                break;
            case 'M': //location
                this.displaySelectInventory();
                break;
            case 'N': //location
                this.displayLoadSleigh();
                break;
             case 'O': //location
                this.displayChooseSanta();
                break;
                  case 'P': //location
                this.displayViewMap();
                break;
            case 'Q': //location
                this.displayMoveSanta();
                break;
            case 'R': //location
                this.displaySelectInventory();
                break;
            case 'S': //location
                this.displayLoadSleigh();
                break;
             case 'T': //location
                this.displayChooseSanta();
                break;
                  case 'U': //location
                this.displayViewMap();
                break;
            case 'V': //location
                this.displayMoveSanta();
                break;
            case 'W': //location
                this.displaySelectInventory();
                break;
            case 'X': //location
                this.displayLoadSleigh();
                break;
             case 'Y': //location
                this.displayChooseSanta();
                break;
            default:
                System.out.println("\n***Invalid Selection***");
                break;
        }
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
        System.out.println("*** displaySelectInventory function called***");
    }
}
