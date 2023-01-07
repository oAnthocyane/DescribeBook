package s367292.lab3.people;

import s367292.lab3.actions.Intonations;
import s367292.lab3.actions.ThinkActions;
import s367292.lab3.room.RoomThings;

public class Author extends Human{
    public Author(String name){
        super(name);
    }

    public void watchOn(RoomThings thing){

    }

    public void wentTo(RoomThings thing){

    }

    public void pullBack(RoomThings thing){

    }

    public void leafe(RoomThings thing){

    }

    public void stepBackFrom(RoomThings thing){

    }

    public void sitOn(RoomThings thing){

    }

    public void want(ThinkActions action){

    }

    public void thinkAbout(ThinkActions action){

    }

    public void thinkAbout(ThinkActions action, Intonations intonation){

    }

    public void could(ThinkActions action){

    }

    public void say(String phrase, Intonations intonation){
        System.out.println("- " + phrase + " " + intonation + " сказал " + this.name);
    }

    public void lay(){

    }

    class Head{
        public void confuse(){

        }
    }




}
