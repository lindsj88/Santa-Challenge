/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import santachallenge.SantaChallenge;

/**
 *
 * @author Lindsey
 */
public class LoadSleighView {
    
    protected final BufferedReader keyboard = SantaChallenge.getInFile();
    protected final PrintWriter console = SantaChallenge.getOutFile();

     public void getFlyingSpeed() {

        this.console.println("Help Santa load his sleigh by       "
                + "choosing how many reindeer he needs to help him"
                + "pull the sleigh"
                + "-----------------------------------------------"
                + "Please choose a number of reindeer: "
                + "\nA - 5"
                + "\nB - 10"
                + "\nC - 8"
                + "\nD - 12");

     }
     
     @Override
    public boolean doAction(Object obj) {
        
        String selection = (String) obj;
        selection = selection.toUpperCase();
        char choice = selection.charAt(0);
        
        switch (choice){
            case 'A':
                this.getReindeer();
                break;
            case 'B':
                this.getReindeer();
                break;
            case 'C':
                this.getReindeer();
                break;
            case 'D':
                this.getReindeer();
                break;
        }
        return false;
    } 

        
    private double getReindeer() {
        SantaChallenge.getCurrentGame().getSleigh().setReindeer();
        double reindeer = 0;
        return reindeer;

    }

   
}
