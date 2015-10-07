/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santachallenge;

import santachallenge.model.Game;

/**
 *
 * @author Jordan
 */
public class SantaChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game playerOne = new Game ();
    
    

    

playerOne.setPlayerName("Lindsey");
playerOne.setTime(7.00);

String playerInfo=playerOne.toString();
System.out.println(playerInfo);

}
}