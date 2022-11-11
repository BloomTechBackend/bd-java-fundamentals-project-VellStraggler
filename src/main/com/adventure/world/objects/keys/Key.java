package main.com.adventure.world.objects.keys;

import main.com.adventure.world.objects.Tangible;

/**
 * A key opens a locked door. More specifically, keys work only on doors that share their level.
 * For example, if a key is level 1, it can only open doors that are also level 1.
 *
 * A key's level cannot change once the object is instantiated. You should create the following constructors that take
 * the following parameters:
 * 1. without any inputs (i.e. default parameters)
 * 2. a level (int)
 * 3. a level (int) and a name (string)
 *
 * The default values for a door are level = 1 and name = "key"
 */

public class Key implements Tangible {

    //TODO variable for level and name needed here
    private int level;
    private String name;


    /**
     * Create a new key with a default level of 1 and the name: "key".
     */
    public Key() {
        level = 1;
        name = "key";
    }

    /**
     * Creates a key with a particular level in mind.
     * @param level - any integer.
     */
    public Key(int level) {
        this.level = level;
    }

    /**
     * Creates a key with a particular level and name in mind.
     * @param level - any integer.
     * @param key - a name in String format.
     */
    public Key(int level, String key) {
        this.level = level;
        name = key;
    }

    /**
     * Get the level of a key.
     * @return level - an integer.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Get the name of a key.
     * @return name - a key name in String format.
     */
    @Override
    public String getName() {
        return name;
    }





    //******IGNORE THE CODE BELOW******//


    @Override
    public Boolean canTake() {
        return true;
    }

    @Override
    public Boolean canUse(Tangible item) {
        return false;
    }

    @Override
    public void useItem(Tangible initiator) { /* intentionally left blank */ }

    @Override
    public void use() {
        System.out.println(getName() + " doesn't much be itself. Try using it on a door");
    }

    @Override
    public String getDescription() {
        return "A key that opens a door";
    }


}
