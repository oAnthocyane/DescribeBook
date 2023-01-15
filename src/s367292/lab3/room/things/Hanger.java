package s367292.lab3.room.things;

public class Hanger extends Furniture{
    public Hanger(String name){
        super(name);
    }

    public void wasAt(RoomThings thing){
        actions.add("была у " + thing.getNameInGenitiveCaseW());
    }


    public void with(RoomThings... things){
        actions.add("с " + things[0].getName() + " (" + things[1].getName());
        for(int i =2; i < things.length-1; i++){
            actions.add(things[i].getName());
        }
        actions.add(things[things.length-1].getName() + ")");
    }
}
