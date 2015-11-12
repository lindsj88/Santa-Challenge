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
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    
    @Override
   public void display() {
       String value = "";
       boolean done = false;
       
       do {
           System.out.println(this.promptMessage);
           value = this.getInput();
           done = this.doAction(value);
           
       } while (!done);
       
   }
   
   @Override
   public String getInput() {
        
        boolean valid = false; //if menu selection has been retrieve
        String value = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) { //while valid menu selection hasnt been retrieved
            
            //get menu selection from keyboard and trim off extra spaces
            value = keyboard.nextLine();
            value = value.trim();
            
            //if selection is invalid
            if (value.length() < 1 ) {
                System.out.println("You must enter a value");
                continue;
            }
            break;
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
