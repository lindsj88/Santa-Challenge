/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class MapView extends View{
     public MapView() {
        super ("\n"
               + "\n----------------------------"
               + "\n         Game Play Menu          "
               + "\n----------------------------"
               + "\nA - Noth Pole"
               + "\nB - Los Angeles, USA"
               + "\nC - Seattle, USA"
               + "\nD - Ottawa, Canada"
               + "\nF - Anchorage, Alaska"
               + "\nG - Mexico City, Mexico"
               + "\nH - Sao Paulo, Brazil"
               + "\nI - Santiago, Chile"
               + "\nJ - Buenas Aires, Argentina"
               + "\nK - Bogota, Columbia"
               + "\nL - Cape Town, South Africa"
               + "\nM - Nairobi, Kenya"
               + "\nN - Lagos, Nigeria"
               + "\nO - Casablanca, Morocco"
               + "\nP - Moscow, Russia"
               + "\nQ - London, England"
               + "\nR - Madrid, Spain"
               + "\nS - Prague, Czech Republic"
               + "\nT - Mumbai, India"
               + "\nU - Hong Kong, China"
               + "\nV - Ulaanbaatar, Mongolia"
               + "\nW - Bangkok, Thailand"
               + "\nX - Perth, Austrailia"
               + "\nY - Melbourne, Australia"
               + "\nZ - Brisbane, Autralia"
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
            if (selection != 'A' && selection != 'B' && selection != 'C' 
                    && selection != 'D' && selection != 'Z' 
                    && selection != 'F' && selection != 'G' 
                    && selection != 'H' && selection != 'I'
                    && selection != 'J' && selection != 'K' 
                    && selection != 'L' && selection != 'M' 
                    && selection != 'N' && selection != 'O'
                    && selection != 'P' && selection != 'Q' 
                    && selection != 'R' && selection != 'S' 
                    && selection != 'T' && selection != 'U'
                    && selection != 'V' && selection != 'W' 
                    && selection != 'X'
                            && selection != 'Y') {
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
            case 'A': //location
                this.displayNorthPole();
                break;
            case 'B': //location
                this.displayLA();
                break;
            case 'C': //location
                this.displaySeattle();
                break;
            case 'D': //location
                this.displayOttawa();
                break;
             case 'F': //location
                this.displayAnchorage();
                break;
             case 'G': //location
                this.displayMexico();
                break;
            case 'H': //location
                this.displayBrazil();
                break;
            case 'I': //location
                this.displayChile();
                break;
            case 'J': //location
                this.displayArgentina();
                break;
             case 'K': //location
                this.displayColumbia();
                break;
             case 'L': //location
                this.displaySouthAfrica();
                break;
            case 'M': //location
                this.displayKenya();
                break;
            case 'N': //location
                this.displayNigeria();
                break;
            case 'O': //location
                this.displayMorocco();
                break;
             case 'P': //location
                this.displayRussia();
                break;
                  case 'Q': //location
                this.displayEngland();
                break;
            case 'R': //location
                this.displaySpain();
                break;
            case 'S': //location
                this.displayCzechRepublic();
                break;
            case 'T': //location
                this.displayIndia();
                break;
             case 'U': //location
                this.displayChina();
                break;
                  case 'V': //location
                this.displayMongolia();
                break;
            case 'W': //location
                this.displayThailand();
                break;
            case 'X': //location
                this.displayAustrailia();
                break;
            case 'Y': //location
                this.displayMelbourne();
                break;
             case 'Z': //location
                this.displayBrisbane();
                break;
            case 'E': //exit
                return true;
            default:
                System.out.println("\n Invalid Selection, please try again");
                break;
        }
        return false;
    }
    
 
    private void displayNorthPole() { 
            System.out.println("You are now back at the North Pole");
        
    }

    private void displayLA() {
        System.out.println("You are now in Los Angeles California USA");
    }

    private void displaySeattle() {
        System.out.println("You are now in Seattle Washington, USA");
    }

    private void displayOttawa() {
        System.out.println("You are now in Ottawa, Canada");
    }

    private void displayAnchorage() {
        System.out.println("You are now in Anchorage, Alaska");
    }

    private void displayMexico() {
        System.out.println("You are now in Mexico City, Mexico");
    }

    private void displayBrazil() {
        System.out.println("You are now in Sao Paulo, Brazil");
    }

    private void displayChile() {
        System.out.println("You are now in Santiago, Chile");
    }

    private void displayArgentina() {
        System.out.println("You are now in Buenas Aires, Argentina");
    }

    private void displayColumbia() {
        System.out.println("You are now in Bogota, Columbia");
    }

    private void displaySouthAfrica() {
        System.out.println("You are now back in Cape Town, South Africa");
    }

    private void displayKenya() {
        System.out.println("You are now in Nairobi, Kenya");
    }

    private void displayNigeria() {
        System.out.println("You are now in Lagos, Nigeria");
    }

    private void displayMorocco() {
        System.out.println("You are now in Casablanca, Morocco");
    }

    private void displayRussia() {
        System.out.println("You are now in Moscow, Russia");
    }

    private void displayEngland() {
        System.out.println("You are now in London, England");
    }

    private void displaySpain() {
        System.out.println("You are now in Madrid, Spain");
    }

    private void displayCzechRepublic() {
        System.out.println("You are now in Prague, Czech Republic");
    }

    private void displayIndia() {
       System.out.println("You are now in Mumbai, India");
    }

    private void displayChina() {
        System.out.println("You are now in Hong Kong, China");
    }

    private void displayMongolia() {
        System.out.println("You are now in Ulaanbaatar, Mongolia");
    }

    private void displayThailand() {
        System.out.println("You are now in Bangkok, Thailand");
    }

    private void displayAustrailia() {
        System.out.println("You are now in Perth, Austrailia");
    }

    private void displayMelbourne() {
        System.out.println("You are now in Melbourne, Australia");
    }

    private void displayBrisbane() {
        System.out.println("You are now in Brisbane, Autralia");
    }
}
