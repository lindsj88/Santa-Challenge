/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import santachallenge.SantaChallenge;

/**
 *
 * @author Lindsey
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    protected final BufferedReader keyboard = SantaChallenge.getInFile();
    protected final PrintWriter console = SantaChallenge.getOutFile();
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    
    @Override
   public void display() {
       String value;
       boolean done = false;
       
       do {
           this.console.println(this.promptMessage);
           value = this.getInput();
           done = this.doAction(value);
           
       } while (!done);
       
   }
   
   @Override
   public String getInput() {
        
        boolean valid = false; //if menu selection has been retrieve
        String value = null;
        
        try {
            while(!valid) { //while valid menu selection hasnt been retrieved
            
            //get menu selection from keyboard and trim off extra spaces
            value = this.keyboard.readLine();
            value = value.trim();
            
            //if selection is invalid
            if (value.length() < 1 ) {
                this.console.println("You must enter a value");
                continue;
            }
            break;
          }
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
        return value;   
    }
   
     public String getPromptMessage(){
        return promptMessage;
    }
    
    public void setPromptMessage(String message){
        this.promptMessage = message;
    }
    
    
}
