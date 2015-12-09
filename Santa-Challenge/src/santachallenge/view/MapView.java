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
               + "\n      Location Menu         "
               + "\n----------------------------"
               + "\nA - North Pole"
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
                ErrorView.display(this.getClass().getName(),
                        "Invalid Selection, please try again");
                break;
        }
        return false;
    }
    
 
    private void displayNorthPole() { 
       this.console.println("You are now back at the North Pole");
        
    }

    private void displayLA() {
        this.console.println("You are now in Los Angeles California USA");
    }

    private void displaySeattle() {
        this.console.println("You are now in Seattle Washington, USA");
    }

    private void displayOttawa() {
        this.console.println("You are now in Ottawa, Canada");
    }

    private void displayAnchorage() {
        this.console.println("You are now in Anchorage, Alaska");
    }

    private void displayMexico() {
        this.console.println("You are now in Mexico City, Mexico");
    }

    private void displayBrazil() {
       this.console.println("You are now in Sao Paulo, Brazil");
    }

    private void displayChile() {
        this.console.println("You are now in Santiago, Chile");
    }

    private void displayArgentina() {
        this.console.println("You are now in Buenas Aires, Argentina");
    }

    private void displayColumbia() {
        this.console.println("You are now in Bogota, Columbia");
    }

    private void displaySouthAfrica() {
        this.console.println("You are now back in Cape Town, South Africa");
    }

    private void displayKenya() {
        this.console.println("You are now in Nairobi, Kenya");
    }

    private void displayNigeria() {
        this.console.println("You are now in Lagos, Nigeria");
    }

    private void displayMorocco() {
        this.console.println("You are now in Casablanca, Morocco");
    }

    private void displayRussia() {
        this.console.println("You are now in Moscow, Russia");
    }

    private void displayEngland() {
        this.console.println("You are now in London, England");
    }

    private void displaySpain() {
        this.console.println("You are now in Madrid, Spain");
    }

    private void displayCzechRepublic() {
        this.console.println("You are now in Prague, Czech Republic");
    }

    private void displayIndia() {
       this.console.println("You are now in Mumbai, India");
    }

    private void displayChina() {
        this.console.println("You are now in Hong Kong, China");
    }

    private void displayMongolia() {
        this.console.println("You are now in Ulaanbaatar, Mongolia");
    }

    private void displayThailand() {
        this.console.println("You are now in Bangkok, Thailand");
    }

    private void displayAustrailia() {
        this.console.println("You are now in Perth, Austrailia");
    }

    private void displayMelbourne() {
        this.console.println("You are now in Melbourne, Australia");
    }

    private void displayBrisbane() {
        this.console.println("You are now in Brisbane, Autralia");
    }
}
