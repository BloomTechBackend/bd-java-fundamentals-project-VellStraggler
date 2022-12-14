package main.com.adventure.player;

import com.amazonaws.services.dynamodbv2.xspec.M;
import main.com.adventure.world.objects.Tangible;

/**
 * Stores any Tangible item up to the MAX_CAPACITY.
 */
public class Backpack {

    private static final int MAX_CAPACITY = 5;

    private final Tangible[] items = new Tangible[MAX_CAPACITY];

    /**
     * Adds an item to the backpack array only if there's an empty space in the array.
     * @param item - item to add to the backpack array.
     * @return - true if the item is added. Otherwise, false.
     */
    public boolean addItem(Tangible item) {
        //We don't know whether the items in the array are Tangibles or null,
        //so no special for loops can be used.

        for (int i = 0; i < MAX_CAPACITY; i++) {
            if (items[i] == null){
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    /**
     * Checks each backpack item's name to see if it matches the given name.
     * @param name - the name of the item to search for.
     * @return - the item if it exists. Otherwise, null.
     */
    public Tangible getItem(String name) {
        for (int i = 0; i < MAX_CAPACITY; i++) {
            if (items[i] == null){
                break;
            }
            if (items[i].getName().equals(name)) {
                return items[i];
            }
        }
        return null;
    }

    /**
     * Checks if the given item exists in the backpack based on the item's name, and removes the item if it's found.
     * Moves items down so that all empty spots are at the end.
     * @param item - item to remove
     * @return - true if the item was removed. Otherwise, false.
     */
    public boolean removeItem(Tangible item) {
        for (int i = 0; i < MAX_CAPACITY; i++){
            if (items[i].getName().equals(item.getName())) {
                for (int m = i + 1; m < MAX_CAPACITY; m++) {
                    items[m-1] = items[m];
                    items[m] = null;
                }
                return true;
            }
        }
        return false;
    }

    /**
     * Prints the contents of the backpack. Before printing the contents, the following line should
     * be printed:
     *
     *          "Here are the items in your backpack:"
     *
     * Then each item should be printed with " - " before it.
     */
    public void printItems() {
        String itemsString = "Here are the items in your backpack:\n";
        for (int i = 0; i < MAX_CAPACITY; i++) {
            if (items[i] == null){
                break;
            }
            itemsString = itemsString + " - " + items[i].getName() + "\n";
        }
        System.out.println(itemsString);
    }
}
