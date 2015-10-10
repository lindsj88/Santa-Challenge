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
 * @author Lindsey
 */
public class Presents implements Serializable{
    
    // class instance variables
    private String description;
    private double weight;

    public Presents() {
    }
    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
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
        final Presents other = (Presents) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Presents{" + "description=" + description + ", weight=" + weight + '}';
    }
  
}
