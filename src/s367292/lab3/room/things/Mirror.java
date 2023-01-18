package s367292.lab3.room.things;

import s367292.lab3.room.Places;

public class Mirror extends Oven{
    private RoomThings in;
    public Mirror(String name, String status1, String status2, Places location, RoomThings in){
        super(name, status1, status2, location);
        this.in = in;
    }

    @Override
    public String toString() {
        return this.status1 + " " + this.status2 + " " + this.name + " висело в "
                + this.location.getNameInDativeCase() + " в " + this.in.getName();
    }


}
