package s367292.lab3.actions;

public enum ThinkActions {
    SLEEP("спать"),
    RUSH("так торопиться"),
    DRIVECARTODAY("вёл сегодня машину"),
    FASTERALLEND("скорей бы всё кончилось"),
    LAY("лечь"),
    GOSLEEP("заснуть"),
    CONDUCT("проводить");

    private String name;
    ThinkActions(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
