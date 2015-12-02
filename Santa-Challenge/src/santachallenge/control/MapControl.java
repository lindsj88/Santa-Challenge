/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.control;

import exceptions.MapControlException;
import java.awt.Point;
import santachallenge.SantaChallenge;
import santachallenge.model.Game;
import santachallenge.model.Location;
import santachallenge.model.Map;
import santachallenge.model.Santa;
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
        map.setScene(scenes);
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    public static int moveSantaToStart(Map map) 
            throws MapControlException{
        Santa[] santas = Santa.values();
        
        for(Santa santa: santas) {
            Point coordinates = santa.getCoordinates();
            MapControl.moveSantaToLocation(santa, coordinates);
        }
        return 0;
    }
    
    public static void moveSantaToLocation(Santa santa, Point coordinates)
        throws MapControlException {
        
        Map map = (Map) SantaChallenge.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getRows() || newColumn < 0 || newColumn >= map.getColumns()){
            throw new MapControlException("Not a valid location "
                    + coordinates.x + ", " + coordinates.y 
                    + "location is out of bounds");
                     
        }
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.location1.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.location2.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.location3.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.location4.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.location5.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.location6.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.location7.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.location8.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.location9.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.location10.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.location11.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.location12.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.location13.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.location14.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.location15.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.location16.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.location17.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.location18.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.location19.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.location20.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.location21.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.location22.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.location23.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.location24.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.finish.ordinal()]);
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
                "\n Los Angeles, USA");
        location1.setCoordinates();
        location1.setTime();
        location1.setDistance(0);
        scenes[SceneType.location1.ordinal()] = location1;
        
        Scene location2 = new Scene();
        location2.setDescription(
                "\n Seattle, USA");
        location2.setCoordinates();
        location2.setTime();
        location2.setDistance(0);
        scenes[SceneType.location2.ordinal()] = location2;
        
        Scene location3 = new Scene();
        location3.setDescription(
                "\n Ottawa, Canada");
        location3.setCoordinates();
        location3.setTime();
        location3.setDistance(0);
        scenes[SceneType.location3.ordinal()] = location3;
        
        Scene location4 = new Scene();
        location4.setDescription(
                "\n Anchorage, Alaska");
        location4.setCoordinates();
        location4.setTime();
        location4.setDistance(0);
        scenes[SceneType.location4.ordinal()] = location4;
        
        Scene location5 = new Scene();
        location5.setDescription(
                "\n Mexico City, Mexico");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location5.ordinal()] = location5;
        
        Scene location6 = new Scene();
        location5.setDescription(
                "\n Sao Paulo, Brazil");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location6.ordinal()] = location6;
        
        Scene location7 = new Scene();
        location5.setDescription(
                "\n Santiago, Chile");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location7.ordinal()] = location7;
        
        Scene location8 = new Scene();
        location5.setDescription(
                "\n Buenas Aires, Argentina");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location8.ordinal()] = location8;
        
        Scene location9 = new Scene();
        location5.setDescription(
                "\n Bogota, Columbia");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location9.ordinal()] = location9;
        
        Scene location10 = new Scene();
        location5.setDescription(
                "\n Cape Town, South Africa");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location10.ordinal()] = location10;
        
        Scene location11 = new Scene();
        location5.setDescription(
                "\n Nairobi, Kenya");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location11.ordinal()] = location11;
        
        Scene location12 = new Scene();
        location5.setDescription(
                "\n Lagos, Nigeria");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location12.ordinal()] = location12;
        
        Scene location13 = new Scene();
        location5.setDescription(
                "\n Casablanca, Morocco");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location13.ordinal()] = location13;
        
        Scene location14 = new Scene();
        location5.setDescription(
                "\n Moscow, Russia");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location14.ordinal()] = location14;
        
        Scene location15 = new Scene();
        location5.setDescription(
                "\n London, England");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location15.ordinal()] = location15;
        
        Scene location16 = new Scene();
        location5.setDescription(
                "\n Madrid, Spain");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location16.ordinal()] = location16;
        
        Scene location17 = new Scene();
        location5.setDescription(
                "\n Prague, Czech Republic");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location17.ordinal()] = location17;
        
        Scene location18 = new Scene();
        location5.setDescription(
                "\n Mumbai, India");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location18.ordinal()] = location18;
        
        Scene location19 = new Scene();
        location5.setDescription(
                "\n Hong Kong, China");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location19.ordinal()] = location19;
        
        Scene location20 = new Scene();
        location5.setDescription(
                "\n Ulaanbaatar, Mongolia");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location20.ordinal()] = location20;
        
        Scene location21 = new Scene();
        location5.setDescription(
                "\n Bangkok, Thailand");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location21.ordinal()] = location21;
        
        Scene location22 = new Scene();
        location5.setDescription(
                "\n Perth, Austrailia");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location22.ordinal()] = location22;
        
        Scene location23 = new Scene();
        location5.setDescription(
                "\n Melbourne, Australia");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location23.ordinal()] = location23;
        
        Scene location24 = new Scene();
        location5.setDescription(
                "\n Brisbane, Autralia");
        location5.setCoordinates();
        location5.setTime();
        location5.setDistance(0);
        scenes[SceneType.location24.ordinal()] = location24;
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
         
         Scene[] originalSceneList = SantaChallenge.getCurrentGame().getScenes;
         Scene[] sceneList = originalSceneList.clone();
         
         Scene tempSceneList;
         
        for(int i = 0; i < sceneList.length-1; i++) {
            for (int j = 0; j < sceneList.length - i; j--){
                if(sceneList[j].getDescription().compareToIgnoreCase(sceneList[j+1].getDescription()) < 0) {
                    tempSceneList = sceneList[j];
                    sceneList[j] = sceneList[j+1];
                    sceneList[j+1] = tempSceneList;
                }
            }
        }
      return sceneList;  
     }

    static void moveSantaToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}