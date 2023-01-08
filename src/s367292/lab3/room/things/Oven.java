package s367292.lab3.room.things;

import java.util.ArrayList;

public class Oven extends Furniture{
    protected String status1, status2;
    public Oven(String name, String status1, String status2){
        super(name);
        this.status1 = status1;
        this.status2 = status2;
    }

    public void wentInto(RoomThings place){
        actions.add("вдавалась в " + place.getNameInDativeCase());
    }

    public void shine(RoomThings thing){
        actions.add("сияющая " + thing.getName());
    }

    @Override
    public void describe(){
        String ans = this.status1.substring(0,1).toUpperCase() + this.status1.substring(1)  + " " + this.status2 + " " + this.name + " " + String.join(", ", actions) + ". ";
        System.out.print(ans);
        actions = new ArrayList<String>();
    }

}
