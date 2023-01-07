package s367292.lab3.people;

import java.util.ArrayList;
import java.util.List;

public abstract class Human {
    protected String name;
    protected int voiceLevel;

    protected List<String> actions;

    public Human(String name){
        this.name = name;
    }

    public Human(String name, int voiceLevel){
        this(name);
        this.voiceLevel = voiceLevel;
    }

    public void say(String phrase){
        System.out.println("- " + phrase + " - сказал " + this.name);
    }

    public void describe(){
        String ans = this.name + " " + String.join(", ", actions) + ".";
        System.out.println(ans);
        actions = new ArrayList<String>();
    }

    public String getName(){
        return this.name;
    }

    public int getVoiceLevel(){
        return this.voiceLevel;
    }


}
