package s367292.lab3.room.things;

public class Floor extends Furniture{
    private String status;
    private Mats mats;
    {
        mats = new Mats("половиками", "полосатыми");
    }
    public Floor(String name, String status){
        super(name);
        this.status = status;
    }

    @Override
    public String toString() {
        return this.name + " был " + this.status + " и покрыт " + mats.toString();
    }

    class Mats{
        private String name, status;
        public Mats(String name, String status){
            this.name = name;
            this.status = status;
        }

        @Override
        public String toString() {
            return this.status + " " + this.name;
        }
    }
}
