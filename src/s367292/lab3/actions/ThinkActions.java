package s367292.lab3.actions;

import s367292.lab3.people.Human;

public enum ThinkActions {
    SLEEP,
    DRIVECAR(){
        public void driveCar(int time){

        }
    },

    NOTRUSH,
    HURTSBACK,
    NOTCARE(){
        public void dontCareOn(Human human){

        }
    },
    ALLEND,
    LAY,
    CONDUCT,
    GOODBYE(){
        public void sayGoodbyeWith(Human human){

        }
    }
}
