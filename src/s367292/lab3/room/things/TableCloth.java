package s367292.lab3.room.things;

import java.util.ArrayList;

public class TableCloth extends Furniture{
    private String material, color, with;

    public TableCloth(String name, String material, String color, String with){
        super(name);
        this.material = material;
        this.color = color;
        this.with = with;
    }

    public void on(Furniture furniture){
        actions.add("накрытый " + this.material + " " + this.color + " " + this.name + " с " + this.with);
    }
    @Override
    public void describe(){
        String ans = String.join(", ", actions) + ". ";
        System.out.print(ans);
        actions = new ArrayList<String>();
    }

}
