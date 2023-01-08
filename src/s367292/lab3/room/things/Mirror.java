package s367292.lab3.room.things;

public class Mirror extends Oven{
    public Mirror(String name, String status1, String status2){
        super(name, status1, status2);
    }

    public void hangInFrontOf(RoomThings place1, RoomThings place2){
        actions.add("висело напротив, в " + place1.getNameInDativeCase() + ", в " + place2.getName());
    }
}
