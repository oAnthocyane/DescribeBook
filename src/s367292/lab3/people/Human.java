package s367292.lab3.people;

import s367292.lab3.Essence;

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






    public int getVoiceLevel(){
        return this.voiceLevel;
    }


}
