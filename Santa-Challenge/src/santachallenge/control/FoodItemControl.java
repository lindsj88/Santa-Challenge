package santaChallenge.control;
import santachallenge.SantaChallenge;
import santachallenge.model.FoodItem;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package santachallenge.control;

import santachallenge.SantaChallenge;

/**
 *
 * @author Lindsey
 */

public class FoodItemControl {
    
 
     public static FoodItem[] getInsertionSortedFoods() {

        FoodItem[] originalFoodList = SantaChallenge.getCurrentGame().getFoodItem();

        FoodItem[] foodList = originalFoodList.clone();

        FoodItemControl tempFoodList;
        
        for (int i = 0;i < foodList.length -1; i++) {
            int index = 1;
            for (int j = i +1; j < foodList.length; j++)  {
                if (foodList[j].getDescription().compareTo(foodList[index].getDescription()) < 0)  {
                   index=j;
            }
        }
            tempFoodList = foodList[index];
             foodList[index] = foodList[i];
           foodList[i] = tempFoodList;
        }
        return foodList;
    }
}
