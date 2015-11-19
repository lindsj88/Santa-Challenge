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
public enum Santa implements Serializable {
    
    Santa("Ho ho ho"),
    MrsClaus("Santa's wife"),
    BuddyTheElf("Santa's chief elf"),
    JeanaTheElf("Buddy's wife");
    
    private final String description;
    private final Point coordinates;
    

Santa(String description) {
    this.description = description;
    coordinates = new Point(1,1);
}

public String getDescription() {
    return description;
}

public Point getCoordinates() {
    return coordinates;
}
}