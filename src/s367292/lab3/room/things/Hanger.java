package s367292.lab3.room.things;

import s367292.lab3.room.Places;

public class Hanger extends Furniture{
    private RoomThings[] withThings;
    public Hanger(String name, Places location, RoomThings... withThings){
        super(name);
        this.location = location;
        this.withThings = withThings;
    }

    @Override
    public String toString(){
        return this.name + " была на " + this.location.getNameInPrepositionalCase() + " " + with(withThings);
    }


    private String with(RoomThings... things){
        String ans = "";
        ans += "с " + things[0].getName() + " (" + things[1].getName();
        for(int i =2; i < things.length; i++){
            ans += ", " + things[i].getName();
        }
        ans += ")";
        return ans;
    }
}
