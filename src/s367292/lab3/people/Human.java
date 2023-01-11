package s367292.lab3.people;

import s367292.lab3.Essence;

import java.util.ArrayList;

public class Human extends Essence {
    protected int voiceLevel;
    public Human(String name){
        super(name);
    }

    public Human(String name, int voiceLevel){
        super(name);
        this.voiceLevel = voiceLevel;
    }

    public void say(String phrase){
        System.out.println("- " + phrase + " - сказал " + this.name + ".");
    }

    @Override
    public void describe(){
        String ans = this.name + " " + String.join(", ", actions) + ". ";
        System.out.print(ans);
        actions = new ArrayList<String>();
    }

    public int getVoiceLevel(){
        return this.voiceLevel;
    }


}
