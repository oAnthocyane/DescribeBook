package s367292.lab3.people;

import s367292.lab3.people.speech.VoiceControl;

public class OldWoman extends Human implements VoiceControl {

    public OldWoman(String name, int voiceLevel){
        super(name, voiceLevel);
    }

    @Override
    public void babble(){
        actions.add("бубнила");
    }

    @Override
    public void increaceVoice(){
        this.voiceLevel++;
    }
    @Override
    public void reductionVoice(){
        this.voiceLevel--;
    }
    @Override
    public void setVoiceLevel(int voiceLevel){
        this.voiceLevel = voiceLevel;
    }

    @Override
    public void say(String phrase){
        System.out.println("- " + phrase + " - сказала " + this.name + ".");
    }
}
