package s367292.lab3.room.things;

import s367292.lab3.Essence;

import java.util.ArrayList;

public class Furniture extends Essence {

    protected String status;

    public Furniture(String name){
        super(name);
    }
    public Furniture(String name, String status){
        super(name);
        this.status = status;
    }

    public void was(RoomThings place, int count){
        String stringCount = toStringCount(count);
        actions.add("в " + place.getNameInPrepositionalCase() + " было " + stringCount);
    }

    @Override
    public void describe(){
        String ans = this.name + " " + String.join(", ", actions) + ". ";
        System.out.print(ans);
        actions = new ArrayList<String>();
    }

    private String toStringCount(int count){

        if(count < 5) return "немного";
        else if (count < 10) return "нормально";
        return "много";
    }
}
