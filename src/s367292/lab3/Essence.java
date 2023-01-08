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
        String ans = this.name + " " + String.join(", ", actions) + ". ";
        System.out.print(ans);
        actions = new ArrayList<String>();
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public String getNameInDativeCase(){
        return this.name.substring(0, this.name.length()-1) + "у";
    }

    public String getNameInInstrumentalCaseW(){
        return this.name.substring(0, this.name.length()-1) + "ой";
    }
    public String getNameInInstrumentalCaseM(){
        return this.name.substring(0, this.name.length()-1) + "ом";
    }
    public String getNameInPrepositionalCase(){
        return this.name + "е";
    }
    public String getNameInGenitiveCase(){
        return this.name.substring(0, this.name.length()-1) + "а";
    }
    public String getNameInAccusativeCase(){
        return this.name.substring(0, this.name.length()-1) + "ей";
    }


}
