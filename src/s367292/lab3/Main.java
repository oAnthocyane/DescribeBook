package s367292.lab3;

import s367292.lab3.people.Author;
import s367292.lab3.people.OldWoman;
import s367292.lab3.people.Roman;

public class Main {
    public static void main(String[] args) {

        Roman roman = new Roman("Роман", 5);
        OldWoman oldWoman = new OldWoman("Старуха", 5);
        Author author = new Author("Я");


        roman.say("Не цыкают! Говорят вам - зубов нет.");
        oldWoman.say("Тогда пойдём, расписочку напишем...");
        roman.raiseEyebrows().rollEyes().grindTeeth().shookHand().wentOut("но всё-таки");
        roman.describe();

        /**
         * Я осмотрелся на различную мебель???? Реализация просто через watchOn?
         */


        roman.babble();
        oldWoman.babble();

    }
}
