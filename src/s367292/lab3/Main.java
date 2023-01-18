package s367292.lab3;

import s367292.lab3.actions.Intonations;
import s367292.lab3.actions.ThinkActions;
import s367292.lab3.people.Author;
import s367292.lab3.people.Human;
import s367292.lab3.people.OldWoman;
import s367292.lab3.people.Roman;
import s367292.lab3.oak.Bark;
import s367292.lab3.room.Places;
import s367292.lab3.room.things.Book;
import s367292.lab3.oak.Oak;
import s367292.lab3.room.things.RoomThings;
import s367292.lab3.room.things.*;

public class Main {
    public static void main(String[] args) {
        Roman roman = new Roman("Роман", 5);
        OldWoman oldWoman = new OldWoman("старуха", 5);
        Author author = new Author("Я");
        Table table = new Table("стол", "массивный", Places.WINDOW);
        Chair chair = new Chair("табурет", "колченогий", table);
        Sofa sofa = new Sofa("диван", "обширный", Places.WALL);
        Hanger hanger = new Hanger("вешалка",Places.ANOTHERWALL, RoomThings.JUNK, RoomThings.WADERS, RoomThings.POPPEDCOATS,
                RoomThings.TATTEREDCAPS, RoomThings.EARFLAPS);
        Oven oven = new Oven("печь", "большая", "русская", Places.BEDROOM);
        Mirror mirror = new Mirror("зеркало", "большое", "мутное", Places.CORNER, RoomThings.SHABBYFRAME);
        Floor floor = new Floor("пол", "выскоблен");
        Book book = new Book("книга", "засаленная", "пухлая", RoomThings.WINDOWSILL);
        Furniture[] allfurniture = new Furniture[]{table, chair, sofa, hanger, oven,
                mirror, floor, book};
        Furniture furniture = new Furniture("мебели", Places.BEDROOM, allfurniture.length);
        Oak oak = new Oak("дуб", "очень древнее", "растение", Places.WINDOW);
        Bark bark = new Bark("кора", "серая", "мёртвая", oak);
        Human volodya = new Human("Володя");

        roman.say("Не цыкают! Говорят вам - зубов нет.");
        oldWoman.say("Тогда пойдём, расписочку напишем...");
        System.out.println();

        roman.raiseEyebrows();
        roman.rollEyes();
        roman.grindTeeth();
        roman.shookHand();
        roman.wentOut("но всё-таки");
        roman.describe();
        author.lookAround();
        author.describe();
        author.describe(furniture);
        for (Furniture f : allfurniture) {
            author.describe(f);
        }
        System.out.println("\n");

        roman.babble();
        oldWoman.reductionHappinies(roman.getHappinies(), roman.getVoiceLevel());
        roman.reductionHappinies(oldWoman.getHappinies(), oldWoman.getVoiceLevel());
        oldWoman.babble();
        oldWoman.reductionHappinies(roman.getHappinies(), roman.getVoiceLevel());
        roman.reductionHappinies(oldWoman.getHappinies(), oldWoman.getVoiceLevel());
        roman.describe();
        oldWoman.describe();
        roman.increaceVoice(1);
        oldWoman.reductionHappinies(roman.getHappinies(), roman.getVoiceLevel());
        roman.reductionHappinies(oldWoman.getHappinies(), oldWoman.getVoiceLevel());
        roman.describe();
        roman.reductionVoice(1);
        roman.increaseHappinies(roman.getHappinies(), roman.getVoiceLevel());
        oldWoman.increaseHappinies(roman.getHappinies(), roman.getVoiceLevel());
        roman.describe();
        roman.increaseHappinies(roman.getHappinies(), roman.getVoiceLevel());
        oldWoman.increaseHappinies(roman.getHappinies(), roman.getVoiceLevel());
        oldWoman.say("Скатерть, инвентарный номер двести сорок пять...");
        roman.say("Вы еще каждую половицу запишите!..");
        oldWoman.reductionHappinies(roman.getHappinies(), roman.getVoiceLevel());
        roman.reductionHappinies(oldWoman.getHappinies(), oldWoman.getVoiceLevel());
        oldWoman.say("Стол обеденный...");
        roman.say("Печь вы тоже запишите?");
        oldWoman.say("Порядок нужен... Диван...");
        roman.increaseHappinies(roman.getHappinies(), roman.getVoiceLevel());
        oldWoman.increaseHappinies(roman.getHappinies(), roman.getVoiceLevel());
        System.out.println();
        author.wentTo(Places.WINDOW);
        author.pullBack(RoomThings.CURTAIN);
        author.describe();
        author.describe(oak);
        author.watchOn(oak);
        author.describe();
        author.describe(bark);
        roman.say("И ещё дуб запишите!", "за", Places.WALL);
        author.describe(book);
        author.takeThing(book, allfurniture);
        author.leafe(Intonations.MINDLESSLY, book);
        author.returnThing(book);
        author.describe();
        author.stepBackFrom(Places.WINDOW);
        author.sitOn(sofa);
        author.describe();
        author.setName("Мне");
        author.want(ThinkActions.SLEEP);
        author.describe();
        author.setName("Я");
        author.thinkAbout(ThinkActions.DRIVECARTODAY, 14);
        author.notCould(ThinkActions.RUSH);
        author.hurtsBack();
        author.confuseHead();
        author.describe();
        author.setName("Мне");
        author.spitOn(oldWoman);
        author.wantTo(ThinkActions.FASTERALLEND, ThinkActions.LAY, ThinkActions.GOSLEEP);
        author.describe();
        System.out.println("\n");

        author.setName("я");
        roman.say("Ну вот,", "на", Places.TRESHOLD);
        roman.say("Формальности окончены.");
        roman.wiggleHand();
        roman.describe();
        roman.say("Наши пальчики устали: мы писали, мы писали... Ложитесь спать. Мы уходим, а вы спокойно ложитесь спать. Что вы завтра делаете?");
        author.say("Жду,", Intonations.LANGUIDLY);
        roman.say("Где?");
        author.say("Здесь. И около почтамта.");
        roman.say("Завтра вы, наверное не уедете?");
        author.say("Завтра вряд ли... Скорее всего - послезавтра.");
        roman.say("Тогда мы ещё увидимся. Наша любовь впереди.");
        roman.setName("Он");
        roman.smile();
        roman.waveHand();
        roman.wentOut("и");
        roman.describe();
        author.setName("Я");
        author.thinkAbout(Intonations.LAZY, ThinkActions.CONDUCT);
        author.sayGoodbyeWith(volodya);
        author.lay();
        author.describe();
        System.out.println("\n");
    }
}
