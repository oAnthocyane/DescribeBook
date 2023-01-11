package s367292.lab3.room.things;

import s367292.lab3.Essence;

import java.util.ArrayList;

public class Book extends Essence {

    private String status1, status2;

    public Book(String name, String status1, String status2){
        super(name);
        this.status1 = status1;
        this.status2 = status2;
    }

    public void layOn(RoomThings place){
        actions.add(status1 + " и " + status2 + " лежала на " + place.getNameInPrepositionalCase());
    }

    @Override
    public void describe(){
        String ans = this.name + " " + String.join(", ", actions) + ". ";
        System.out.print(ans);
        actions = new ArrayList<String>();
    }
}
