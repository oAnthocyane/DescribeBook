package s367292.lab3.oak;

import java.util.ArrayList;

public class Roots extends Oak{
    public Roots(String name, String status1, String status2){
        super(name, status1, status2);
    }

    public void cover(Oak oak){
        actions.add("были покрыты " + oak.status1 + " и " + oak.status2 + " " + oak.getNameInInstrumentalCaseM());
    }
    @Override
    public void describe(){
        String ans = "a " + this.status1 + " " + this.name + " " + this.status2 + " " + String.join(", ", actions) + ". ";
        System.out.print(ans);
        actions = new ArrayList<String>();
    }
}
