package s367292.lab3.people;

import s367292.lab3.people.speech.VoiceControl;

import java.util.ArrayList;
import java.util.List;

public class Roman extends Human implements VoiceControl {

    private Eyebrows eyebrows;
    private Eyes eyes;
    private Teeth teeth;

    private Head head;



    {
        eyebrows = new Eyebrows();
        eyes = new Eyes();
        teeth = new Teeth();
        head = new Head();
        actions = new ArrayList<String>();

    }

    public Roman(String name, int voiceLevel){
        super(name, voiceLevel);
    }

    @Override
    public void babble(){
        System.out.println("бубнил");
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


    public void smile(){

    }


    public void wentOut(String prefix){
        actions.add(prefix + " " + "вышел");
    }

    public Roman raiseEyebrows(){
        actions.add(eyebrows.raise());
        return this;
    }
    public Roman rollEyes(){
        actions.add(eyes.roll());
        return this;
    }

    public Roman grindTeeth(){
        actions.add(teeth.grind());
        return this;
    }

    class Eyebrows{

        enum Status{
            NORMAL,
            RAISED
        }

        private Status status = Status.NORMAL;
        public String raise(){
            status = Status.RAISED;
            return "поднял брови";
        }
    }

    public Roman shookHand(){
        actions.add(head.shook());
        return this;
    }


    class Eyes{
        enum Status{
            NORMAL,
            ROLLED
        }
        Status status = Status.NORMAL;

        public String roll(){
            status = Status.ROLLED;
            return "закатил глаза";
        }
    }

    class Teeth{
        enum Status{
            NORMAl,
            GRITTED
        }

        private Status status = Status.NORMAl;
        public String grind(){
            status = Status.GRITTED;
            return "оскалил зубы";
        }
    }
    class Head{
        public String shook(){
            return "потряс головой";
        }
    }

    class Hand{
        private String fingType;
        public Hand(String fingType){
            this.fingType = fingType;
        }

        public void wiggle(){
            System.out.println("помотал рукой с " + this.fingType);
        }
        public void wave(){

        }
    }


}
