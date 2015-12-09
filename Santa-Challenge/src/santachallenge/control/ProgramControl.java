package santachallenge.control;

import santachallenge.SantaChallenge;

import santachallenge.model.Player;

/**
 *
 *
 *
 * @author Lindsey
 *
 */
public class ProgramControl {

    public static Player createPlayer(String name) {

        if (name == null) {

            return null;

        }

        Player player = new Player();

        player.setName(name);

        SantaChallenge.setPlayer(player);

        return player;

    }

}
