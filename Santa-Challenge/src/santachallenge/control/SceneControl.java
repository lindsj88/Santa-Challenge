/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.control;

import santachallenge.SantaChallenge;
import santachallenge.model.Game;
import santachallenge.model.Scene;

/**
 *
 * @author Lindsey
 */
/*public class SceneControl {
    
   private static Scene[] createScenes() {
        Game game = SantaChallenge.getCurrentGame();
        
        Scene[] scenes = new Scene[MapControl.SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "\n Welcome to the North Pole. Here you can"
                        + "help Santa get ready on Christmas"
                        + "Eve");
        startingScene.setCoordinates(0,0);
        startingScene.setTravelTime(240);
        scenes[MapControl.SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\n Congratulations! You helpes Santa deliver"
                        + "all the presents. You win!");
        finishScene.setMapSymbol("FN");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[MapControl.SceneType.finish.ordinal()] = finishScene;
    }
    
}
