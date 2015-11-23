/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.control;

import santachallenge.SantaChallenge;
import santachallenge.model.Game;
import santachallenge.model.Location;
import santachallenge.model.Map;
import santachallenge.model.Scene;
import santachallenge.model.Scene.SceneType;

/**
 *
 * @author Lindsey
 */
public class MapControl {
    
    public static Map createMap() {
        
        Map map = new Map(5, 5); 
        Scene[] scenes = createScenes();
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
          /*locations[0][0].setScene(scenes.start);
        locations[0][1].setScene(Scene.location1);
        locations[0][2].setScene(Scene.location2);
        locations[0][3].setScene(Scene.location3);
        locations[0][4].setScene(Scene.location4);
        locations[0][5].setScene(Scene.location5);
        locations[1][0].setScene(Scene.location6);
        locations[1][1].setScene(Scene.location7);
        locations[1][2].setScene(Scene.location8);
        locations[1][3].setScene(Scene.location9);
        locations[1][4].setScene(Scene.location10);
        locations[1][5].setScene(Scene.location11);
        locations[2][0].setScene(Scene.location12);
        locations[2][1].setScene(Scene.location13);
        locations[2][2].setScene(Scene.location14);
        locations[2][3].setScene(Scene.location14);
        locations[2][4].setScene(Scene.location15);
        locations[2][5].setScene(Scene.location16);
        locations[3][0].setScene(Scene.location17);
        locations[3][1].setScene(Scene.location18);
        locations[3][2].setScene(Scene.location19);
        locations[3][3].setScene(Scene.location20);
        locations[3][4].setScene(Scene.location21);
        locations[3][5].setScene(Scene.location22);
        locations[4][0].setScene(Scene.location23);
        locations[4][0].setScene(Scene.finish);
    }*/
    }
   
    
     private static Scene[] createScenes() {
        Game game = SantaChallenge.getCurrentGame();//To change body of generated methods, choose Tools | Templates.
        Scene[] scenes = new Scene[25];
        
          Scene start = new Scene();
          start.setDescription(
                "\n Welcome to the North Pole. Here you can"
                  + "help Santa get ready on Christmas Eve");
        start.setCoordinates();
        start.setTime(240);
        start.setDistance(0);
        scenes[SceneType.start.ordinal()] = start;
        
        Scene location1 = new Scene();
        location1.setDescription(
                "\n ");
        location1.setCoordinates();
        location1.setTime();
        location1.setDistance(0);
        scenes[SceneType.finish.ordinal()] = location1;
        
        Scene location2 = new Scene();
        location2.setDescription(
                "\n ");
        location2.setCoordinates();
        location2.setTime();
        location2.setDistance(0);
        scenes[SceneType.finish.ordinal()] = location2;
        
        Scene location3 = new Scene();
        location3.setDescription(
                "\n ");
        location3.setCoordinates();
        location3.setTime();
        location3.setDistance(0);
        scenes[SceneType.finish.ordinal()] = location3;
        
        Scene location4 = new Scene();
        location4.setDescription(
                "\n ");
        location4.setCoordinates();
        location4.setTime();
        location4.setDistance(0);
        scenes[SceneType.finish.ordinal()] = location4;
        
        Scene location5 = new Scene();
        location5.setDescription(
                "\n ");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.finish.ordinal()] = location5;
        
        //if correct. add rest of locations
        
        Scene finish = new Scene();
        finish.setDescription(
                "\n Congratulations! You helped Santa deliver"
                        + "all the presents, you win!");
        finish.setCoordinates();
        finish.setTime();
        finish.setDistance(0);
        scenes[SceneType.finish.ordinal()] = finish;
        
        return scenes;
    }
     //insertion sort algorithm
     public static Scene[] getInsertionSortedScenes() {
         int temp;
         Scene[] originalScene = SantaChallenge.getCurrentGame.getScene();
         
         Scene[] originalScene = originalScene.clone();
         Scene tempScene;
         
        for(int i = 0; i < Scene.length; i++) {
            for (int j = 0; j > 0; j--){
                if(Scene[j] < Scene[j-1]{
                    tempScene = Scene[j];
                    Scene[j] = Scene[j-1];
                    Scene[j-1] = tempScene;
                }
            }
        }
      return Scene;  
     }
}