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
public class Inventory implements Serializable {
    private String item;
    private double description;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getDescription() {
        return description;
    }

    public void setDescription(double description) {
        this.description = description;
    }

    public Inventory() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.item);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.description) ^ (Double.doubleToLongBits(this.description) >>> 32));
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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (Double.doubleToLongBits(this.description) != Double.doubleToLongBits(other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "item=" + item + ", description=" + description + '}';
    }
    
    
}
