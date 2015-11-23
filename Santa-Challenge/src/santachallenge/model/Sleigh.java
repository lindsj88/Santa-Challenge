/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.model;

import java.io.Serializable;

/**
 *
 * @author Jordan
 */
public class Sleigh implements Serializable{
    private String description;
    private double speed;
    private double weight;
    private double numberOfPresents;

    public Sleigh() {
        this.speed = 0;
        this.weight = 0;
        this.numberOfPresents = 0;
        
        this.description = "\nThis is Santa's sleigh, it's magic will "
                + "\n help you make it around the world tonight!";
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getNumberOfPresents() {
        return numberOfPresents;
    }

    public void setNumberOfPresents(double numberOfPresents) {
        this.numberOfPresents = numberOfPresents;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.speed) ^ (Double.doubleToLongBits(this.speed) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.numberOfPresents) ^ (Double.doubleToLongBits(this.numberOfPresents) >>> 32));
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
        final Sleigh other = (Sleigh) obj;
        if (Double.doubleToLongBits(this.speed) != Double.doubleToLongBits(other.speed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        return Double.doubleToLongBits(this.numberOfPresents) == Double.doubleToLongBits(other.numberOfPresents);
    }

    @Override
    public String toString() {
        return "Sleigh{" + "speed=" + speed + ", weight=" + weight + ", number of presents=" + numberOfPresents + '}';
    }

}