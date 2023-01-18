package s367292.lab3.room.things;

import s367292.lab3.Essence;
import s367292.lab3.room.Places;


public class Furniture extends Essence {

    protected String status;
    private int countFurniture;
    protected Places location=Places.BEDROOM;

    public Furniture(String name){
        super(name);
    }
    public Furniture(String name, String status, Places location){
        super(name);
        this.status = status;
        this.location = location;
    }
    public Furniture(String name, Places location, int countFurniture){
        super(name);
        this.location = location;
        this.countFurniture = countFurniture;

    }

    @Override
    public String toString(){
        return this.name + " в " + this.location.getName() + " было " + toStringCount(this.countFurniture);
    }

    private String toStringCount(int count){

        if(count < 10) return "немного";
        else if (count < 20) return "нормально";
        return "много";
    }

    @Override
    public int hashCode(){
        return name.hashCode()*29 + location.toString().hashCode()*31;
    }
    @Override
    public boolean equals(Object obj){
        Furniture f = (Furniture) obj;
        return this.hashCode() == f.hashCode();
    }


}
