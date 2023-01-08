package s367292.lab3.oak;

import s367292.lab3.Essence;
import s367292.lab3.room.things.RoomThings;

public class Oak extends Essence {

    protected String status1 , status2;
    public Oak(String name){
        super(name);
    }

    public Oak(String name, String status1, String status2){
        super(name);
        this.status1 = status1;
        this.status2 = status2;
    }

    public void was(){
        actions.add("было, видимо, " +  this.status1 + " " + this.status2);
    }

    public void wasFrom(RoomThings from){
        actions.add("был за " + from.getNameInInstrumentalCaseM());
    }



}
