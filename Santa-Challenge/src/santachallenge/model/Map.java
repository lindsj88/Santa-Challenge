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
    private String Location;
    private double descripion;

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public double getDescripion() {
        return descripion;
    }

    public void setDescripion(double descripion) {
        this.descripion = descripion;
    }

    public Map() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.Location);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.descripion) ^ (Double.doubleToLongBits(this.descripion) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (!Objects.equals(this.Location, other.Location)) {
            return false;
        }
        if (Double.doubleToLongBits(this.descripion) != Double.doubleToLongBits(other.descripion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "Location=" + Location + ", descripion=" + descripion + '}';
    }
    
    
}
