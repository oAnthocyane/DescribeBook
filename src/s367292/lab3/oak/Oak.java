package s367292.lab3.oak;

import s367292.lab3.Essence;
import s367292.lab3.room.Places;
public class Oak extends Essence {

    protected String status1 , status2;
    protected Places location;
    public Oak(String name){
        super(name);
    }
    public Oak(String name, String status1, String status2){
        super(name);
        this.status1 = status1;
        this.status2 = status2;
    }

    public Oak(String name, String status1, String status2, Places location){
        super(name);
        this.status1 = status1;
        this.status2 = status2;
        this.location = location;
    }

    @Override
    public String toString() {
        return "за " + this.location.getNameInInstrumentalCaseM() + " был " + this.name + ". Это было " + this.status1 + " " + this.status2;
    }
}
