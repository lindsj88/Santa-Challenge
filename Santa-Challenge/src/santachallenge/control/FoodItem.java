/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package santachallenge.control;

import santachallenge.SantaChallenge;

/**
 *
 * @author Lindsey
 
public class FoodItem {
 
     public static FoodItem[] getInsertionSortedFoods() {

        FoodItem[] originalFood = SantaChallenge.getCurrentGame().getFoodItem();

        FoodItem[] foodList = originalFoodList.clone();

        FoodItem tempFoodList;
        
        for (int i = 0;i < foodList.length -1; i++) {
            for (int j = i +1; j < foodList.length; j++)  
                if (foodList[j].getDescription().compareTo(foodList[index].getDescription()) < 0)  
            
            tempFoodList = foodList[j];
             foodList[j] = foodList[j+1];
           foodList[j+1] = tempFoodList;
        }
        return foodList;
    }

    void setDescription(String bacon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setQuantity(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRequired(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCalories(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
*/
