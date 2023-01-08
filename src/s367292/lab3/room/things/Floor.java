package s367292.lab3.room.things;

public class Floor extends Furniture{
    public Floor(String name){
        super(name);
    }
    public void scrape(){
        actions.add("был выскоблен");
    }

    public void cover(RoomThings thing){
        actions.add("покрыт " + thing.getName());
    }
}
