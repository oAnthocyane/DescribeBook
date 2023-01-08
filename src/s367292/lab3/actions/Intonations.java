package s367292.lab3.actions;

public enum Intonations {
    LAZY("лениво"),
    LANGUIDLY("вяло"),
    MINDLESSLY("бездумно");

    private String name;
    Intonations(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
