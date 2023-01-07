package s367292.lab3;

import s367292.lab3.people.Author;
import s367292.lab3.people.OldWoman;
import s367292.lab3.people.Roman;
import s367292.lab3.room.Book;
import s367292.lab3.room.RoomThings;

public class Main {
    public static void main(String[] args) {

        Roman roman = new Roman("Роман", 5);
        OldWoman oldWoman = new OldWoman("Старуха", 5);
        Author author = new Author("Я");
        Book book = new Book("Книга", "засаленная", "пухлая");


        roman.say("Не цыкают! Говорят вам - зубов нет.");
        oldWoman.say("Тогда пойдём, расписочку напишем...");
        System.out.println();

        roman.raiseEyebrows().rollEyes().grindTeeth().shookHand().wentOut("но всё-таки");
        roman.describe();

        /**
         * Я осмотрелся на различную мебель???? Реализация просто через watchOn?
         */
        System.out.println();

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

        author.wentTo(RoomThings.WINDOW).pullBack(RoomThings.CURTAIN);
        author.describe();
        author.watchOn(RoomThings.OAK);
        author.describe();
        roman.sayBehind("И ещё дуб запишите!", RoomThings.WALL);
        book.layOn(RoomThings.WINDOWSILL);
        book.describe();

    }
}
