/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.model;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Jordan
 */
public class Game implements Serializable{
    private double time;
    private String playerName;
    private Sleigh sleigh;
    private Player player;
    private Map[] map;

    public Map[] getMap() {
        return map;
    }

    public void setMap(Map[] map) {
        this.map = map;
    }
    private Inventory inventory;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String[] getSanta() {
        return Santa;
    }

    public void setSanta(String[] Santa) {
        this.Santa = Santa;
    }
    private String[] Santa;

    public Sleigh getSleigh() {
        return sleigh;
    }

    public void setSleigh(Sleigh sleigh) {
        this.sleigh = sleigh;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap(Map map) {
        return map;
    }

    public Game() {
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
        
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.time) ^ (Double.doubleToLongBits(this.time) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.playerName);
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.time) != Double.doubleToLongBits(other.time)) {
            return false;
        }
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "time=" + time + ", playerName=" + playerName + '}';
    } 
}
