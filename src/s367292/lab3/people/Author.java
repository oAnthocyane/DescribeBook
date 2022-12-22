package s367292.lab3.people;

import s367292.lab3.actions.intonations;
import s367292.lab3.actions.thinkActions;
import s367292.lab3.room.roomThings;

public class Author extends Human{
    public Author(String name){
        super(name);
    }

    public void watchOn(roomThings thing){

    }

    public void wentTo(roomThings thing){

    }

    public void pullBack(roomThings thing){

    }

    public void leafe(roomThings thing){

    }

    public void stepBackFrom(roomThings thing){

    }

    public void sitOn(roomThings thing){

    }

    public void want(thinkActions action){

    }

    public void thinkAbout(thinkActions action){

    }

    public void thinkAbout(thinkActions action, intonations intonation){

    }

    public void could(thinkActions action){

    }

    public void say(String phrase, intonations intonation){
        System.out.println("- " + phrase + " " + intonation + " сказал " + this.name);
    }

    public void lay(){

    }

    class Head{
        public void confuse(){

        }
    }




}
