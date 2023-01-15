package s367292.lab3.room.things;


public enum RoomThings {

    ROOM("комнат"),
    WINDOW("окно"),
    SOFA("диван"),
    WALL("стена"),
    WINDOWSILL("подоконник"),
    TRESHOLD("порог"),
    ANOTHERWALL("другой стена"),
    JUNK("рухлядью"),
    WADERS("ватники"),
    CORNER("углы"),
    POPPEDCOATS("вылезшие шубы"),
    TATTEREDCAPS("драные кепки"),
    EARFLAPS("ушанки"),
    FRESHWASH("свежей побелкой"),
    SHABBYFRAME("облезлой раме"),
    STRIPEDMATS("полосатыми половиками"),
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



