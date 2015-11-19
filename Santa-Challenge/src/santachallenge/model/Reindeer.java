/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.model;

import java.io.Serializable;


/**
 *
 * @author Lindsey
 */
public class Reindeer implements Serializable {
    
    //class instance variables
    private double speed;
    private double strength;
    private double number;
    private Sleigh sleigh;

    public Sleigh getSleigh() {
        return sleigh;
    }

    public void setSleigh(Sleigh sleigh) {
        this.sleigh = sleigh;
    }

    public Reindeer() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.speed) ^ (Double.doubleToLongBits(this.speed) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.strength) ^ (Double.doubleToLongBits(this.strength) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.number) ^ (Double.doubleToLongBits(this.number) >>> 32));
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
        final Reindeer other = (Reindeer) obj;
        if (Double.doubleToLongBits(this.speed) != Double.doubleToLongBits(other.speed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.strength) != Double.doubleToLongBits(other.strength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.number) != Double.doubleToLongBits(other.number)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reindeer{" + "speed=" + speed + ", strength=" + strength + ", number=" + number + '}';
    }
    
    
    
    
}
