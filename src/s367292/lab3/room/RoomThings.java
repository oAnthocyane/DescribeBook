package s367292.lab3.room;

public enum RoomThings {

    FURNITURE("мебель"),
    WINDOW("окно"),
    //TABLE,
    //TABLECLOTH,
    //STOOL,
    //SOFA,
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
    OAK("дуб"),
    WINDOWSILL("подоконник"),
    CURTAIN("занавеска");

    private String name;
    RoomThings(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public String getNameInDativeCase(){
        return this.name.substring(0, this.name.length()-1) + "у";
    }

    public String getNameInInstrumentalCase(){
        return this.name.substring(0, this.name.length()-1) + "ой";
    }
    public String getNameInPrepositionalCase(){
        return this.name + "е";
    }


}
