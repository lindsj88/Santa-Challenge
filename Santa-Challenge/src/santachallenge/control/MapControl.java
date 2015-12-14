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
        
        Map map = new Map(6, 6); 
        Scene[] scenes = createScenes();
        map.setScene(scenes);
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    public static void moveSantaToStart(Map map) 
            throws MapControlException{
        Santa[] santas = Santa.values();
        
        for(Santa santa: santas) {
            Point coordinates = santa.getCoordinates();
            MapControl.moveSantaToLocation(santa, coordinates);
        }
    }
    
    public static void moveSantaToLocation(Santa santa, Point coordinates)
        throws MapControlException {
        
        Map map = (Map) SantaChallenge.getCurrentGame().getMap();
        
        int xCoordinate = coordinates.x;
        int yCoordinate = coordinates.y;
        
        //int newRow = coordinates.x-1;
        //int newColumn = coordinates.y-1;
        
        if (xCoordinate < 0 || xCoordinate >= map.getRows() || yCoordinate < 0 || yCoordinate >= map.getColumns()){
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
        Scene[] scenes = new Scene[26];
        
          Scene start = new Scene();
          start.setDescription(
                "\n Welcome to the North Pole. Here you can"
                  + "help Santa get ready on Christmas Eve");
        //start.setCoordinates();
        start.setTravelTime(0);
        start.setDistance(0);
        scenes[SceneType.start.ordinal()] = start;
        
        Scene location1 = new Scene();
        location1.setDescription(
                "\n Los Angeles, USA");
        //location1.setCoordinates();
        location1.setTravelTime(57);
        location1.setDistance(0);
        scenes[SceneType.location1.ordinal()] = location1;
        
        Scene location2 = new Scene();
        location2.setDescription(
                "\n Seattle, USA");
        //location2.setCoordinates();
        location2.setTravelTime(39);
        location2.setDistance(0);
        scenes[SceneType.location2.ordinal()] = location2;
        
        Scene location3 = new Scene();
        location3.setDescription(
                "\n Ottawa, Canada");
       // location3.setCoordinates();
        location3.setTravelTime(67);
        location3.setDistance(0);
        scenes[SceneType.location3.ordinal()] = location3;
        
        Scene location4 = new Scene();
        location4.setDescription(
                "\n Anchorage, Alaska");
       // location4.setCoordinates();
        location4.setTravelTime(6);
        location4.setDistance(372);
        scenes[SceneType.location4.ordinal()] = location4;
        
        Scene location5 = new Scene();
        location5.setDescription(
                "\n Mexico City, Mexico");
       // location5.setCoordinates();
        location5.setTravelTime(74);
        location5.setDistance(476);
        scenes[SceneType.location5.ordinal()] = location5;
        
        Scene location6 = new Scene();
        location6.setDescription(
                "\n Sao Paulo, Brazil");
        //location5.setCoordinates();
        location6.setTravelTime(63);
        location6.setDistance(600);
        scenes[SceneType.location6.ordinal()] = location6;
        
        Scene location7 = new Scene();
        location7.setDescription(
                "\n Santiago, Chile");
        //location5.setCoordinates();
        location7.setTravelTime(27);
        location7.setDistance(625);
        scenes[SceneType.location7.ordinal()] = location7;
        
        Scene location8 = new Scene();
        location8.setDescription(
                "\n Buenas Aires, Argentina");
        //location5.setCoordinates();
        location8.setTravelTime(48);
        location8.setDistance(650);
        scenes[SceneType.location8.ordinal()] = location8;
        
        Scene location9 = new Scene();
        location9.setDescription(
                "\n Bogota, Columbia");
        //location5.setCoordinates();
        location9.setTravelTime(52);
        location9.setDistance(675);
        scenes[SceneType.location9.ordinal()] = location9;
        
        Scene location10 = new Scene();
        location10.setDescription(
                "\n Cape Town, South Africa");
       // location5.setCoordinates();
        location10.setTravelTime(68);
        location10.setDistance(700);
        scenes[SceneType.location10.ordinal()] = location10;
        
        Scene location11 = new Scene();
        location11.setDescription(
                "\n Nairobi, Kenya");
        //location5.setCoordinates();
        location11.setTravelTime(45);
        location11.setDistance(725);
        scenes[SceneType.location11.ordinal()] = location11;
        
        Scene location12 = new Scene();
        location12.setDescription(
                "\n Lagos, Nigeria");
        //location5.setCoordinates();
        location12.setTravelTime(61);
        location12.setDistance(750);
        scenes[SceneType.location12.ordinal()] = location12;
        
        Scene location13 = new Scene();
        location13.setDescription(
                "\n Casablanca, Morocco");
        //location5.setCoordinates();
        location13.setTravelTime(50);
        location13.setDistance(775);
        scenes[SceneType.location13.ordinal()] = location13;
        
        Scene location14 = new Scene();
        location14.setDescription(
                "\n Moscow, Russia");
        //location5.setCoordinates();
        location14.setTravelTime(47);
        location14.setDistance(800);
        scenes[SceneType.location14.ordinal()] = location14;
        
        Scene location15 = new Scene();
        location15.setDescription(
                "\n London, England");
        //location15.setCoordinates();
        location15.setTravelTime(30);
        location15.setDistance(825);
        scenes[SceneType.location15.ordinal()] = location15;
        
        Scene location16 = new Scene();
        location16.setDescription(
                "\n Madrid, Spain");
        //location16.setCoordinates();
        location16.setTravelTime(36);
        location16.setDistance(850);
        scenes[SceneType.location16.ordinal()] = location16;
        
        Scene location17 = new Scene();
        location17.setDescription(
                "\n Prague, Czech Republic");
        //location17.setCoordinates();
        location17.setTravelTime(91);
        location17.setDistance(875);
        scenes[SceneType.location17.ordinal()] = location17;
        
        Scene location18 = new Scene();
        location18.setDescription(
                "\n Mumbai, India");
        //location18.setCoordinates();
        location18.setTravelTime(63);
        location18.setDistance(900);
        scenes[SceneType.location18.ordinal()] = location18;
        
        Scene location19 = new Scene();
        location19.setDescription(
                "\n Hong Kong, China");
        //location19.setCoordinates();
        location5.setTravelTime(47);
        location5.setDistance(925);
        scenes[SceneType.location19.ordinal()] = location19;
        
        Scene location20 = new Scene();
        location20.setDescription(
                "\n Ulaanbaatar, Mongolia");
        //location5.setCoordinates();
        location20.setTravelTime(63);
        location20.setDistance(950);
        scenes[SceneType.location20.ordinal()] = location20;
        
        Scene location21 = new Scene();
        location21.setDescription(
                "\n Bangkok, Thailand");
        //location.setCoordinates();
        location21.setTravelTime(68);
        location21.setDistance(975);
        scenes[SceneType.location21.ordinal()] = location21;
        
        Scene location22 = new Scene();
        location22.setDescription(
                "\n Perth, Austrailia");
        //location5.setCoordinates();
        location22.setTravelTime(72);
        location22.setDistance(1000);
        scenes[SceneType.location22.ordinal()] = location22;
        
        Scene location23 = new Scene();
        location23.setDescription(
                "\n Melbourne, Australia");
        //location5.setCoordinates();
        location23.setTravelTime(88);
        location23.setDistance(1025);
        scenes[SceneType.location23.ordinal()] = location23;
        
        Scene location24 = new Scene();
        location24.setDescription(
                "\n Brisbane, Autralia");
        //location5.setCoordinates();
        location24.setTravelTime(93);
        location24.setDistance(1050);
        scenes[SceneType.location24.ordinal()] = location24;
       
        
        Scene finish = new Scene();
        finish.setDescription(
                "\n Congratulations! You helped Santa deliver"
                        + "all the presents, you win!");
        //finish.setCoordinates();
        finish.setTravelTime(0);
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

    
    public static void setLocation(Santa santa, Point coordinates) throws MapControlException {
        Map map = (Map) SantaChallenge.getCurrentGame().getMap();
        
        int newRow = coordinates.x;
        int newColumn = coordinates.y;
        
        if (newRow < 0 || newRow >= map.getRows() || newColumn < 0 || newColumn >= map.getColumns()) {
            throw new MapControlException("Invalid location "
                                            + coordinates.y + ", " + coordinates.x
                                            + " the selected location is outside"
                                            + " he map.");
    }
}
}