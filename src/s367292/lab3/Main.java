package s367292.lab3;

import s367292.lab3.actions.Intonations;
import s367292.lab3.actions.ThinkActions;
import s367292.lab3.oak.Roots;
import s367292.lab3.people.Author;
import s367292.lab3.people.Human;
import s367292.lab3.people.OldWoman;
import s367292.lab3.people.Roman;
import s367292.lab3.oak.Bark;
import s367292.lab3.room.Book;
import s367292.lab3.oak.Oak;
import s367292.lab3.room.RoomThings;

public class Main {
    public static void main(String[] args) {

        Roman roman = new Roman("Роман", 5);
        OldWoman oldWoman = new OldWoman("старуха", 5);
        Author author = new Author("Я");
        Book book = new Book("Книга", "засаленная", "пухлая");
        Oak oak = new Oak("Дуб", "очень древнее", "растение");
        Bark bark = new Bark("Кора", "серая", "мёртвая");
        Oak lichen = new Oak("лишайник", "красным", "белым");
        Roots roots = new Roots("корни", "чудовищные", "вылезшие из земли");
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

        /**
         * Я осмотрелся на различную мебель???? Реализация просто через watchOn?
         */
        System.out.println("\n");

        roman.babble();
        oldWoman.babble();
        roman.describe();
        oldWoman.describe();
        roman.increaceVoice();
        roman.describe();
        roman.reductionVoice();
        roman.describe();
        oldWoman.say("Скатерть, инвентарный номер двести сорок пять...");
        roman.say("Вы еще каждую половицу запишите!..");
        oldWoman.say("Стол обеденный...");
        roman.say("Печь вы тоже запишите?");
        oldWoman.say("Порядок нужен... Диван...");
        System.out.println();

        author.wentTo(RoomThings.WINDOW);
        author.pullBack(RoomThings.CURTAIN);
        author.describe();
        oak.wasFrom(RoomThings.WINDOW);
        oak.describe();
        author.watchOn(oak);
        author.describe();
        oak.setName("Это");
        oak.was();
        oak.describe();
        oak.setName("дуб");
        bark.wasOn(oak);
        bark.describe();
        roots.cover(lichen);
        roots.describe();
        roman.say("И ещё дуб запишите!", "за", RoomThings.WALL);
        book.layOn(RoomThings.WINDOWSILL);
        book.describe();
        book.setName("её");
        author.leafe(Intonations.MINDLESSLY, book);
        author.stepBackFrom(RoomThings.WINDOW);
        author.sitOn(RoomThings.SOFA);
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
        roman.say("Ну вот,", "на", RoomThings.TRESHOLD);
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
    }
}
