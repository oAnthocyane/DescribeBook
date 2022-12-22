package s367292.lab3.people;

import s367292.lab3.people.speech.IVoiceControl;

public class OldWoman extends Human implements IVoiceControl {

    public OldWoman(String name, int voiceLevel){
        super(name, voiceLevel);
    }

    @Override
    public void babble(){
        System.out.println("бубнила");
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
}
