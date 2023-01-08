package s367292.lab3.room.things;

import java.util.ArrayList;

public class Sofa extends Table{
    public Sofa(String name, String status){
        super(name, status);
    }
    public void loacateNear(RoomThings thing){
        actions.add("помещался возле " + thing.getNameInGenitiveCaseW());
    }

    @Override
    public void describe(){
        String ans = this.status + " " + this.name + " " + String.join(", ", actions) + ", ";
        System.out.print(ans);
        actions = new ArrayList<String>();
    }
}
