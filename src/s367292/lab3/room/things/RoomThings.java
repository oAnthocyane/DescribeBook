package s367292.lab3.room.things;


public enum RoomThings {
    WINDOWSILL("подоконник"),
    JUNK("рухлядью"),
    WADERS("ватники"),
    POPPEDCOATS("вылезшие шубы"),
    TATTEREDCAPS("драные кепки"),
    EARFLAPS("ушанки"),
    SHABBYFRAME("облезлой раме"),
    CURTAIN("занавеска");

    private String name;

    RoomThings(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public String getNameInDativeCase(){
        return this.name.substring(0, this.name.length()-1) + "у";
    }
    public String getNameInInstrumentalCaseW(){
        return this.name.substring(0, this.name.length()-1) + "ой";
    }
    public String getNameInInstrumentalCaseM(){
        return this.name.substring(0, this.name.length()-1) + "ом";
    }
    public String getNameInPrepositionalCase(){
        return this.name + "е";
    }
    public String getNameInGenitiveCaseM(){
        return this.name.substring(0, this.name.length()-1) + "а";
    }
    public String getNameInGenitiveCaseW(){
        return this.name.substring(0, this.name.length()-1) + "ы";
    }




}



