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
public class Santa implements Serializable {
    
    //class instance variables
    private double caloriesConsumed;

    public Santa() {
    }

    public double getCaloriesConsumed() {
        return caloriesConsumed;
    }

    public void setCaloriesConsumed(double caloriesConsumed) {
        this.caloriesConsumed = caloriesConsumed;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.caloriesConsumed) ^ (Double.doubleToLongBits(this.caloriesConsumed) >>> 32));
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
        final Santa other = (Santa) obj;
        if (Double.doubleToLongBits(this.caloriesConsumed) != Double.doubleToLongBits(other.caloriesConsumed)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Santa{" + "caloriesConsumed=" + caloriesConsumed + '}';
    }

    public void setcaloriesConsumed(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
