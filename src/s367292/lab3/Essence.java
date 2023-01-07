package s367292.lab3;

import java.util.ArrayList;
import java.util.List;

public abstract class Essence {

    protected String name;
    protected List<String> actions;

    {
        actions = new ArrayList<String>();
    }

    public Essence(String name){
        this.name = name;
    }
    public void describe(){
        String ans = this.name + " " + String.join(", ", actions) + ".";
        System.out.println(ans);
        actions = new ArrayList<String>();
    }
}
