/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge.control;

import exceptions.ProgramControlException;
import santachallenge.SantaChallenge;
import santachallenge.model.Player;

/**
 *
 * @author Lindsey
 */
public class ProgramControl {

    public static Player createPlayer(String name) throws ProgramControlException{
        if (name == null) {
        throw new ProgramControlException("Please enter your name");
        
    } else {
        Player player = new Player ();
        player.setName(name);
        SantaChallenge.setPlayer (player);
        return player;
    }
    }
}