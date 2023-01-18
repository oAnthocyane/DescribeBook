package s367292.lab3.room.things;

public class Book extends Furniture {

    private String status1, status2;
    private RoomThings location;

    public Book(String name, String status1, String status2, RoomThings location){
        super(name);
        this.status1 = status1;
        this.status2 = status2;
        this.location = location;
    }

    @Override
    public String toString() {
        return "на " + location.getNameInPrepositionalCase() + " лежала " +
                this.status1 + " " + this.status2 + " " + this.name;
    }
}