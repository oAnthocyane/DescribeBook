package s367292.lab3.oak;

public class Bark extends Oak{
    private Oak location;
    private Roots roots;
    {
        roots = new Roots("корни", "чудовищные", "вылезшие из земли");
    }
    public Bark(String name, String status1, String status2, Oak location){
        super(name, status1, status2);
        this.location = location;
    }

    @Override
    public String toString(){
        return this.name + " была на " + location.getNameInPrepositionalCase() +
                " " + this.status1 + " и " + this.status2 + ", а " + roots.toString();
    }

    class Roots{
        private String name, status1, status2;
        private Oak lichen;
        {
            lichen = new Oak("лишайником", "красным", "белым"){
                @Override
                public String toString() {
                    return this.status1 + " и " + this.status2 + " " + this.name;
                }
            };
        }

        public Roots(String name, String status1, String status2){
            this.name = name;
            this.status1 = status1;
            this.status2 = status2;
        }

        @Override
        public String toString() {
            return this.status1 + " " + this.name + ", " + this.status2 + " были покрыты " + lichen.toString();
        }
    }
}
