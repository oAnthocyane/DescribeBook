package s367292.lab3.room.things;

import s367292.lab3.room.Places;


public class Sofa extends Table{
    public Sofa(String name, String status, Places location){
        super(name, status, location);
    }

    @Override
    public String toString(){
        return this.status + " " + this.name + " помещался возле " + this.location.getNameInGenitiveCaseW();
    }


}
