/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Lindsey
 */
public class Scene {
    
   /* start("Welcome to the North Pole, hope you like it here!"),
    location1("A rooftop in Los Angeles, USA, down the chimney we go!"),
    location2("A rooftop in Seattle, USA, down the chimney we go!"),
    location3("A rooftop in Ottawa, Canada, down the chimney we go!"),
    location4("A rooftop in Anchorage, Alaska, down the chimney we go!"),
    location5("A rooftop in Mexico City, Mexico, down the chimney we go!"),
    location6("A rooftop in Sao Paulo, Brazil, down the chimney we go!"),
    location7("A rooftop in Santiago, Chile, down the chimney we go!"),
    location8("A rooftop in Buenos Aires, Argentina, down the chimney we go!"),
    location9("A rooftop in Bogota, Columbia, down the chimney we go!"),
    location10("A rooftop in Cape Town, South Africa, down the chimney we go!"),
    location11("A rooftop in Nairobi, Kenya, down the chimney we go!"),
    location12("A rooftop in Lagos, Nigeria, down the chimney we go!"),
    location13("A rooftop in Casablanca, Morocco, down the chimney we go!"),
    location14("A rooftop in Moscow, Russia, down the chimney we go!"),
    location15("A rooftop in London, England, down the chimney we go!"),
    location16("A rooftop in Madrid, Spain, down the chimney we go!"),
    location17("A rooftop in Prague, Czech Republic, down the chimney we go!"),
    location18("A rooftop in Mumbai, India, down the chimney we go!"),
    location19("A rooftop in Hong Kong, China, down the chimney we go!"),
    location20("A rooftop in Ulaanbaatar, Mongolia, down the chimney we go!"),
    location21("A rooftop in Bangkok, Thailand, down the chimney we go!"),
    location22("A rooftop in Perth, Austrailia, down the chimney we go!"),
    location23("A rooftop in Melbourne, Australia, down the chimney we go!"),
    location24("A rooftop in Brisbane, Autralia, down the chimney we go!"),
    finish("You made it! Congratulations");
   */ 
private String description;
private Point coordinates;
private int travelTime;
private int distance;

public Scene() {
throw new UnsupportedOperationException("Not supported yet.");
}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setCoordinates() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTime(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean getScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum SceneType {
    start,
    location1,
    location2,
    location3,
    location4,
    location5,
    location6,
    location7,
    location8,
    location9,
    location10,
    location11,
    location12,
    location13,
    location14,
    location15,
    location16,
    location17,
    location18,
    location19,
    location20,
    location21,
    location22,
    location23,
    location24,
    finish;
    }
}