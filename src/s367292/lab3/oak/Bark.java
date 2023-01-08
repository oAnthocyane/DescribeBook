package s367292.lab3.oak;

public class Bark extends Oak{

    public Bark(String name, String status1, String status2){
        super(name, status1, status2);
    }

    public void wasOn(Oak from){
        actions.add("была на " + from.getNameInPrepositionalCase() + " " + this.status1 + " и " + this.status2);
    }
}
