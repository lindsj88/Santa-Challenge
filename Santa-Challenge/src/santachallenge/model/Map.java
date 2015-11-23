/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jordan
 */
public class Map implements Serializable {

    private int rows;
    private int columns;
    private Location[][] locations;

    public Map() {
        
    }
    public Map(int rows, int columns) {
    
        if (rows < 0 || columns < 0) {
            System.out.println("Not a valid location");
            return;
        }
        
        this.rows = rows;
        this.columns = columns;
        
        this.locations = new Location[rows][columns];
        for (int row = 0; row < rows; row++){
            for(int column = 0; column < columns; column++){
            Location location = new Location();
            location.setColumn(column);
            location.setRow(row);
            location.setVisited(false);
            
            locations[row][column] = location;
        }
    }
       
}
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    
     public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
    
    
}