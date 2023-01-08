package s367292.lab3.room.things;

import java.util.ArrayList;

public class Table extends Furniture{

    public Table(String name, String status){
        super(name, status);
    }

    public void stayAt(RoomThings place){
        actions.add("стоял у " + place.getNameInGenitiveCaseM());
    }

    @Override
    public void describe(){
        String ans = this.status.substring(0,1).toUpperCase() + this.status.substring(1)  + " " + this.name + " " + String.join(", ", actions) + ", ";
        System.out.print(ans);
        actions = new ArrayList<String>();
    }

}
