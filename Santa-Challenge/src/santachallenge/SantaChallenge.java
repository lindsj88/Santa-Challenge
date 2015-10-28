/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge;

import santachallenge.model.Game;
import santachallenge.model.Inventory;
import santachallenge.model.Location;
import santachallenge.model.Map;
import santachallenge.model.Player;
import santachallenge.model.Presents;
import santachallenge.model.Reindeer;
import santachallenge.model.Santa;
import santachallenge.model.Sleigh;
import santachallenge.model.santasHouse;
import santachallenge.model.workShop;
import santachallenge.view.StartProgramView;

/**
 *
 * @author Jordan
 */
public class SantaChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView ();
        startProgramView.startProgram();
    } 
}
