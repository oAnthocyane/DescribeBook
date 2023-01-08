package s367292.lab3.room;


import s367292.lab3.people.speech.VoiceControl;

public enum RoomThings {

    FURNITURE("мебель"),
    WINDOW("окно"),
    //TABLE,
    //TABLECLOTH,
    //STOOL,
    SOFA("диван"),
    //WALLPAPER,
    //HANGER,
    //COTTONJACKETS,
    //COATS,
    //CAPS,
    //EARFLAPS,
    //STOVE,
    //MIRROR,
    //FLOOR,
    //BOOK,
    WALL("стена"),
    WINDOWSILL("подоконник"),
    TRESHOLD("порог"),
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
    public String getNameInGenitiveCase(){
        return this.name.substring(0, this.name.length()-1) + "а";
    }

}



