package s367292.lab3.people;

import s367292.lab3.exceptions.ImpossibleHappinies;
import s367292.lab3.exceptions.ImpossibleVoiceValue;
import s367292.lab3.people.happinies.ControlHappinies;
import s367292.lab3.people.speech.VoiceControl;
import s367292.lab3.room.Places;

public class Roman extends Human implements VoiceControl, ControlHappinies {

    private Eyebrows eyebrows;
    private Eyes eyes;
    private Teeth teeth;
    private Head head;
    private Hand hand;
    private int happinies;
    {
        happinies = 50;
        eyebrows = new Eyebrows();
        eyes = new Eyes();
        teeth = new Teeth();
        head = new Head();
        hand = new Hand("растопыренными", "измазанными чернилами");
    }

    public Roman(String name, int voiceLevel){
        super(name, voiceLevel);
    }

    @Override
    public void babble(){
        increaceVoice(2);
        actions.add("бубнил");
    }

    @Override
    public void increaceVoice(int step){
        try{
            this.voiceLevel+=step;
            checkVoiceValue();
            actions.add("повысил голос");
        }catch (ImpossibleVoiceValue error){
            error.printStackTrace();
            this.voiceLevel = 10;
        }

    }
    @Override
    public void reductionVoice(int step){
        try{
            this.voiceLevel-=step;
            checkVoiceValue();
            actions.add("понизил голос");
        }catch (ImpossibleVoiceValue error){
            error.printStackTrace();
        }

    }
    @Override
    public void setVoiceLevel(int voiceLevel){
        this.voiceLevel = voiceLevel;
    }
    @Override
    public void increaseHappinies(int happiniesOpponent, int voiceOpponent){
        try {
            this.happinies += happiniesOpponent / 10 + voiceOpponent / 4 - this.voiceLevel / 2;
            checkHappinies();

        }catch (ImpossibleHappinies error){
            happinies = 100;
            error.printStackTrace();
        }
    }
    @Override
    public void reductionHappinies(int happiniesOpponent, int voiceOpponent){
        try{
            this.happinies -= (this.voiceLevel / 2 + voiceOpponent / 4 + happiniesOpponent / 10);
            checkHappinies();
        }catch (ImpossibleHappinies error){
            happinies = 0;
            error.printStackTrace();

        }
    }
    @Override
    public int getVoiceLevel(){
        return this.voiceLevel;
    }
    public int getHappinies(){
        return this.happinies;
    }

    public void checkHappinies() throws ImpossibleHappinies {
        if(happinies < 0) throw new ImpossibleHappinies("Значение счастья не может быть меньше 0");
        else if(happinies > 100) throw new ImpossibleHappinies("Значение счастья не может быть больше 100");
    }

    public void checkVoiceValue() throws ImpossibleVoiceValue {
        if (voiceLevel < 0) throw new ImpossibleVoiceValue("Значение громкости звука не может быть меньше 0");
        else if(voiceLevel > 10) throw new ImpossibleVoiceValue("Значение громкости звука не может быть больше 100");
    }


    public void smile(){
        actions.add("улыбнулся");

    }


    public void wentOut(String prefix){
        actions.add(prefix + " " + "вышел");
    }

    public void raiseEyebrows(){
        actions.add(eyebrows.raise());
    }
    public void rollEyes(){
        actions.add(eyes.roll());
    }

    public void grindTeeth(){
        actions.add(teeth.grind());
    }


    public void say(String phrase, String where, Places place){
        String placeCase = null;
        if(where.equals("за")) placeCase = place.getNameInInstrumentalCaseW();
        else if(where.equals("на")) placeCase = place.getNameInPrepositionalCase();
        System.out.println("- " + phrase + " - сказал " + where + " " + placeCase + " " + this.name + ".");
    }
    public void wiggleHand(){
        actions.add(hand.wiggle());
    }

    public void waveHand(){
        actions.add(hand.wave());
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

    public void shookHand(){
        actions.add(head.shook());
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
        private String fingType1, fingType2;
        public Hand(String fingType1, String fingType2){
            this.fingType1 = fingType1;
            this.fingType2 = fingType2;
        }

        public String wiggle(){
            return "помотал рукой с " + this.fingType1 + " пальцами, " + this.fingType2;
        }

        public String wave(){
            return "махнул рукой";
        }

    }


}
