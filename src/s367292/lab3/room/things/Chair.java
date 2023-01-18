package s367292.lab3.room.things;

public class Chair extends Furniture{
    private Furniture furniture;
    public Chair(String name, String status, Furniture furniture){
        super(name);
        this.status = status;
        this.furniture = furniture;
    }

    @Override
    public String toString(){
        return this.status + " " + this.name + " был напротив " + this.furniture.getNameInGenitiveCase();
    }

}
