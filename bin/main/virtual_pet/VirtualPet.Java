public class VirtualPet {

    private String name;
    private int hunger;
    private int thirst;
    private int waste; 

    public VirtualPet(String name) {
        this.name = name; 
        this.hunger = 10;
        this.thirst = 5;
        this.waste = 12;

    }

    public void tick() {
        hunger += 5;
        thirst -= 5;
        waste  += 5;
    }

    public void feed() {
        hunger -=2;
        if(hunger <0) {
            hunger = 0;
        }

    public void water() {
        thirst += 8;
        if (thirst > 20) {
            thirst = 20;
        }

    public void clean (){
        clean +=;
        if(clean < 2) {
            clean = 2;
        }
    }

        public String getName() {
            return name;
        }

        public int getHunger() {
            return hunger;
        }

        public int getThirst() {
            return thirst;
        }

        public int getWaste(){
            return waste;
        }
    }
    }
}