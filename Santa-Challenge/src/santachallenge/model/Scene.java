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
public enum Scene implements Serializable {
    
    north_pole("Welcome to the North Pole, hope you like it here!"),
    delivery("Another rooftop, down the chimney we go!");
    
private final String description;
private final Point coordinates;

Scene(String description) {

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