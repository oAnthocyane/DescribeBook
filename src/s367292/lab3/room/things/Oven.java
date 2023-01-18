package s367292.lab3.room.things;


import s367292.lab3.room.Places;

public class Oven extends Furniture {
    protected String status1, status2;
    private Wash wash;

    {
        this.wash = new Wash("побелкой", "свежей");
    }

    public Oven(String name, String status1, String status2, Places location) {
        super(name);
        this.status1 = status1;
        this.status2 = status2;
        this.location = location;
    }

    @Override
    public String toString() {
        return this.status1 + " " + this.status2 + " " + this.name + " вдавалась в " + this.location.getNameInDativeCase() +
                ", сияющая " + wash.toString();
    }


    class Wash {
        private String name, status;

        public Wash(String name, String status) {
            this.name = name;
            this.status = status;
        }

        @Override
        public String toString() {
            return this.status + " " + this.name;
        }
    }

}
