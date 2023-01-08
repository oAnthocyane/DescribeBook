package s367292.lab3.room.things;

public class Chair extends Table{
    public Chair(String name, String status){
        super(name, status);
    }

    public void stayInFrontOf(Furniture furniture){
        actions.add("стоял перед " + furniture.getNameInInstrumentalCaseM());
    }
}
