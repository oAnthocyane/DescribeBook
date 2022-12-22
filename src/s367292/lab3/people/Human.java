package s367292.lab3.people;

public abstract class Human {
    protected String name;
    protected int voiceLevel;

    public Human(String name){
        this.name = name;
    }

    public Human(String name, int voiceLevel){
        this(name);
        this.voiceLevel = voiceLevel;
    }

    public void say(String phrase){
        System.out.println("- " + phrase + "сказал " + this.name);
    }

    public String getName(){
        return this.name;
    }

    public int getVoiceLevel(){
        return this.voiceLevel;
    }


}
