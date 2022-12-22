package s367292.lab3.people;

import s367292.lab3.people.speech.IVoiceControl;

public class Roman extends Human implements IVoiceControl {

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


    public void wentOut(){
        System.out.println("вышел");
    }

    class Eyebrows{
        public void raise(){
            System.out.println("поднял брови");
        }
    }

    class Eye{
        public void roll(){
            System.out.println("закатил глаза");
        }
    }

    class Teeth{
        public void grind(){
            System.out.println("оскалил зубы");
        }
    }
    class Head{
        public void shook(){
            System.out.println("потряс головой");
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
