package s367292.lab3.room.things;

import s367292.lab3.room.Places;

public class Table extends Furniture{
    private TableCloth tableCloth;
    public Table(String name, String status, Places location){
        super(name, status, location);
    }
    {
        tableCloth = new TableCloth("скатертью", "ветхой",
                "серой", "бахромой");
    }


   @Override
    public String toString(){
        return this.status + " " + this.name + " был у " + this.location.getNameInGenitiveCaseM()
                + " накрытый " + tableCloth.toString();
   }

   class TableCloth{
        private String name, status, color, material;
        public TableCloth(String name, String status, String color, String material){
            this.name = name;
            this.status = status;
            this.color = color;
            this.material = material;

        }

        @Override
       public String toString(){
            return this.status + " " + this.color + " " + this.name + " с " + this.material;
        }
   }
}
