/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.view;

import santachallenge.control.FeedSantaControl;

/**
 *
 * @author Lindsey
 */
public class FeedSantaView extends View {
    
    public FeedSantaView() {
        
        super ("\n"
               + "\n----------------------------"
               + "\n   What should Santa eat"
               + "\n   to help him make it "
               + "\n   around the world?        "
               + "\n----------------------------"
               + "\nP - 2 pieces of pizza"
               + "\nB - 12 slices of bacon"
               + "\nS - 1 steak"
               + "\nO - 1 big bowl of oatmeal"
               + "\nY - Yogurt and a banana"
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
            case 'P': 
          this.displayFeedSantaControl();
                break;
            case 'B': //select resource
                this.displayFeedSantaControl();
                break;
            case 'S': //load sleigh
                this.displayFeedSantaControl();
                break;
             case 'O': //choose santa
                this.displayFeedSantaControl();
                break;
            case 'Y': //choose santa
                this.displayFeedSantaControl();
                break;
            case 'E': //exit
                return true;
            default:
                System.out.println("\n***Invalid Selection***");
                break;
        }
        return false;
    }
 public static Food[] getInsertionSortedFoods() {
         
         Food[] Food = originalFood.clone();
         Food tempFood;
         
        for(int i = 0; i < foods.length-1; i++) {
            for (int j = 0; j < food.length; j--){
                if(foods[j] < foods[j-1]) {
                    tempfood = foods[j];
                    foods[j] = foods[j-1];
                    foods[j-1] = tempfood;
                }
            }
        }
      return foods;  

 private void displayFeedSantaControl() {
        int calories = 2500;
        FeedSantaControl feedControl = new FeedSantaControl();
        feedControl.display();
 }
 
}
    
