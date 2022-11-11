package main.com.adventure;

import main.com.adventure.player.Player;
import main.com.adventure.world.Monster;

public class CombatController {

    private Player player;
    private Monster monster;
    private int healthReset = 10;

    /**
     * Processes a combat situation between the player and a monster.
     * @param player - the game's player.
     * @param monster - the monster who the player is trying to defeat.
     */
    public CombatController(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    /**
     * Runs through the combat of the player and monster until either the monster's
     * or the player's health is 0. The player always goes first.
     */
    public void autosimulateCombat() {
        boolean playerTurn = true;
        while (player.getHealth() > 0 && monster.getHealth() > 0) {
            if (playerTurn) {
                monster.setHealth(monster.getHealth() - player.getPower());
            } else {
                player.setHealth(player.getHealth() - monster.getPower());
            }
            playerTurn = !playerTurn;
        }
    }

    public boolean isPlayerDefeated() {
        return player.getHealth() <= 0;
    }

    /**
     * Resets the health of the monster and player back to 10.
     */
    public void reset() {
        player.setHealth(healthReset);
        monster.setHealth(healthReset);
    }
}
