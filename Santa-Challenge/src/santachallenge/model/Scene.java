/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.model;

import java.io.Serializable;

/**
 *
 * @author Lindsey
 */
public enum Scene implements Serializable {
    
    public enum SceneType {
    NorthPole("Santa's home"),
    Delivery("Santa's wife");
    }
    
    private static Scene[] createScenes() {
        Game game = SantaChallenge.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "\n Welcome to the North Pole. Here you can"
                        + "help Santa get ready on Christmas"
                        + "Eve");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\n Congratulations! You helpes Santa deliver"
                        + "all the presents. You win!");
        finishScene.setMapSymbol("FN");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
    }

private static void assignScenesToLocations(Map map, Scene[] scenes)
    Location[][] locations = map.getLocations();

    locations[0][0].setScene(scenes[SceneType.NorthPole.ordinal()]);
    locations[0][1].setScene(scenes[SceneType.Delivery.ordinal()]);
}    
    

