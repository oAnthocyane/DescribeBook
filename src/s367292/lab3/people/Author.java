package s367292.lab3.people;

import s367292.lab3.Essence;
import s367292.lab3.actions.Intonations;
import s367292.lab3.actions.ThinkActions;
import s367292.lab3.room.Places;
import s367292.lab3.room.things.Furniture;
import s367292.lab3.room.things.RoomThings;

public class Author extends Human{

    private Back back;
    private Head head;

    {
        back = new Back();
        head = new Head();
    }
    public Author(String name){
        super(name);
    }

    public void lookAround(){
        actions.add("осмотрелся");
    }

    public void watchOn(Essence thing){
        actions.add("смотрел на " + thing.getName());
    }


    public void wentTo(Places place){
        actions.add("подошёл к " + place.getNameInDativeCase());
    }

    public void pullBack(RoomThings thing){
        actions.add("отдёрнул " + thing.getNameInDativeCase());
    }

    public void leafe(Intonations intonation, Furniture thing){
        actions.add(intonation.getName() + " полистал " + thing.getNameInDativeCase());

    }

    public void stepBackFrom(Places place){
        actions.add("отошёл от " + place.getNameInGenitiveCaseM());

    }

    public void describe(Essence essence){
        System.out.print(essence.toString().substring(0,1).toUpperCase() + essence.toString().substring(1) + ". ");
    }

    public void takeThing(Furniture thing, Furniture[] allFurniture){
        boolean isTaken = false;
        for(Furniture f : allFurniture){
            if(thing.equals(f)){
                take(thing);
                isTaken = true;
            }
        }
        if(!isTaken) actions.add("не взял " + thing.getNameInDativeCase() + ", потому что не нашёл в комнате");
    }

    public Furniture returnThing(Furniture thing){
        actions.add("положил " + thing.getNameInDativeCase());
        return thing;
    }

    public void take(Furniture thing){
        actions.add("взял " + thing.getNameInDativeCase());
    }

    public void sitOn(Furniture thing){
        actions.add("сел на " + thing.getName());
    }

    public void want(ThinkActions action){
        actions.add("захотелось " + action.getName());
    }

    public void thinkAbout(ThinkActions action, int hours){
        actions.add("подумал, что " + action.getName() + " " + hours + " часов");
    }

    public void thinkAbout(Intonations intonation, ThinkActions action){
        actions.add(intonation.getName() + " подумал, что надо было его " + action.getName());

    }

    public void notCould(ThinkActions action){
        actions.add("не стоило " + action.getName());
    }

    public void say(String phrase, Intonations intonation){
        System.out.println("- " + phrase + " - " + intonation.getName() + " сказал " + this.name);
    }

    public void hurtsBack(){
        actions.add(back.hurts());
    }

    public void confuseHead(){
        actions.add(head.confuse());
    }

    public void spitOn(Human human){
        actions.add("плевать на " + human.getNameInDativeCase());
    }

    public void wantTo(ThinkActions action1, ThinkActions action2, ThinkActions action3){
        actions.add("хочется, чтобы " + action1.getName() + " и можно было бы " + action2.getName() + " и " + action3.getName());
    }

    public void sayGoodbyeWith(Human human){
        actions.add("попрощаться с " + human.getNameInAccusativeCase());
    }

    public void lay(){
        actions.add("и лёг");
    }



    class Back{
        public String hurts(){
            return "спина болит";
        }
    }

    class Head{
        public String confuse() {
            return "в голове всё путается";
        }
    }




}
