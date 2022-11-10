package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {
    private Key content = new Key();
    private boolean isCovered = true;

    public HoleContent(Key key){
        content = key;
    }
    public void setIsCovered(boolean isCovered){
        this.isCovered = isCovered;
    }
    public boolean isCovered(){
        return isCovered;
    }
    public Key getKey(){
        return content;
    }
}
