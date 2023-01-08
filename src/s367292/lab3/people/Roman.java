package s367292.lab3.people;

import s367292.lab3.people.speech.VoiceControl;
import s367292.lab3.room.RoomThings;


public class Roman extends Human implements VoiceControl {

    private Eyebrows eyebrows;
    private Eyes eyes;
    private Teeth teeth;
    private Head head;
    private Hand hand;



    {
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
        actions.add("бубнил");
    }

    @Override
    public void increaceVoice(){
        this.voiceLevel++;
        actions.add("повысил голос");
    }
    @Override
    public void reductionVoice(){
        this.voiceLevel--;
        actions.add("понизил голос");
    }
    @Override
    public void setVoiceLevel(int voiceLevel){
        this.voiceLevel = voiceLevel;
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


    public void say(String phrase, String where, RoomThings place){
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
