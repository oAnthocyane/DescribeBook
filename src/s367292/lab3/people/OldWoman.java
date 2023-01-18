package s367292.lab3.people;

import s367292.lab3.exceptions.ImpossibleHappinies;
import s367292.lab3.exceptions.ImpossibleVoiceValue;
import s367292.lab3.people.happinies.ControlHappinies;
import s367292.lab3.people.speech.VoiceControl;

public class OldWoman extends Human implements VoiceControl, ControlHappinies {
    private int happinies;
    {
        happinies = 50;
    }
    public OldWoman(String name, int voiceLevel){
        super(name, voiceLevel);
    }

    @Override
    public void babble(){
        increaceVoice(4);
        actions.add("бубнила");
    }

    @Override
    public void increaceVoice(int step){
        try {
            this.voiceLevel += step;
            checkVoiceValue();
            actions.add("повысила голос");
        }catch (ImpossibleVoiceValue error){
            error.printStackTrace();
            this.voiceLevel = 10;
        }

    }
    @Override
    public void reductionVoice(int step){
        try {
            this.voiceLevel -= step;
            checkVoiceValue();
            actions.add("понизила голос");
        }catch (ImpossibleVoiceValue error){
            error.printStackTrace();
            this.voiceLevel = 0;
        }

    }
    @Override
    public void setVoiceLevel(int voiceLevel){
        this.voiceLevel = voiceLevel;
    }
    @Override
    public void increaseHappinies(int happiniesOpponent, int voiceOpponent){
        try{
            this.happinies += Math.random() * 10 - this.voiceLevel /2 +
                    happiniesOpponent / 20 - voiceOpponent / 4;
            checkHappinies();
        }catch (ImpossibleHappinies error){
            happinies = 100;
            error.printStackTrace();
        }

    }
    @Override
    public void reductionHappinies(int happiniesOpponent, int voiceOpponent){
        try {
            this.happinies -= (Math.random() * 10 + this.voiceLevel / 2 +
                    voiceOpponent / 4 - happiniesOpponent / 20);
            checkHappinies();
        }
        catch (ImpossibleHappinies error){
            happinies = 0;
            error.printStackTrace();
        }
    }
    @Override
    public int getVoiceLevel(){
        return this.voiceLevel;
    }
    @Override
    public void say(String phrase){
        System.out.println("- " + phrase + " - сказала " + this.name + ".");
    }

    public void checkHappinies() throws ImpossibleHappinies{
        if(happinies < 0) throw new ImpossibleHappinies("Значение счастья не может быть меньше 0");
        else if(happinies > 100) throw new ImpossibleHappinies("Значение счастья не может быть больше 100");
    }
    public void checkVoiceValue() throws ImpossibleVoiceValue{
        if (voiceLevel < 0) throw new ImpossibleVoiceValue("Значение громкости звука не может быть меньше 0");
        else if(voiceLevel > 10) throw new ImpossibleVoiceValue("Значение громкости звука не может быть больше 100");
    }

    public int getHappinies(){
        return this.happinies;
    }


}
