package s367292.lab3.room.things;

public class Hanger extends Furniture{
    public Hanger(String name){
        super(name);
    }

    public void wasAt(RoomThings thing){
        actions.add("была у " + thing.getNameInGenitiveCaseW());
    }

    public void with(RoomThings thing1, RoomThings thing2, RoomThings thing3,
                     RoomThings thing4, RoomThings thing5){
        actions.add("с " + thing1.getName() + " (" + thing2.getName() + ", " +
                thing3.getName() + ", " + thing4.getName() + " и " +
                thing5.getName() + ")");
    }
}
