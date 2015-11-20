/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jordan
 */
public class Map implements Serializable {

    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;

    public Map() {

    }
    public Map(int noOfRows, int noOfColumns)

    
        ) {
    
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows nd columns must be > zero")
            return;
        }
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        this.locations = new Location [noOfRows][noOfColumns];
        for (int row = 0; row < noOfRows; row++){
            for(int column = 0; column < noOfColumns; column++){
            Location location = new Location();
            location.setColumn(column);
            location.setRow(row);
            location.setVisited(false);
            
            locations [row][column] = location;
        }
    }
}

   /* Location1("Noth Pole"),
    Location2("Los Angeles, USA"),
    Location3("Seattle, USA"),
    Location4("Ottawa, Canada"),
    Location5("Anchorage, Alaska"),
    Location6("Mexico City, Mexico"),
    Location7("Sao Paulo, Brazil"),
    Location8("Santiago, Chile"),
    Location9("Buenas Aires, Argentina"),
    Location10("Bogota, Columbia"),
    Location11("Cape Town, South Africa"),
    Location12("Nairobi, Kenya"),
    Location13("Lagos, Nigeria"),
    Location14("Casablanca, Morocco"),
    Location15("Moscow, Russia"),
    Location16("London, England"),
    Location17("Madrid, Spain"),
    Location18("Prague, Czech Republic"),
    Location19("Mumbai, India"),
    Location20("Hong Kong, China"),
    Location21("Ulaanbaatar, Mongolia"),
    Location22("Bangkok, Thailand"),
    Location23("Perth, Austrailia"),
    Location24("Melbourne, Australia"),
    Location25("Brisbane, Autralia");

    private final String description;
    private final Point coordinates;

    Map(String description) {
        this.description = description;
        coordinates = new Point(1, 1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
}
