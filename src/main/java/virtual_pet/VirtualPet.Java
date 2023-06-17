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
        this.hunger -= 5;
        this.thirst -= 5;
        this.waste  += 5;
    }

    if (this.hunger <=0) {
    System.out.println("Chloe is hungry!");
    }else if (this.thirst <=) {
        System.out.println("Chloe is thirsty!");
    }else if (this.waste <=0) {
        System.out.println("Chloe needs to go for a walk!");
        }
    }

    public void feed() {
        this.hunger += 5;
        System.out.println("Yum! Chloe is happy and full!");
        }

    public void water() {
       this.water +=5;
       System.out.println("Chloe is feeling hydrated!");
        }

    public void clean (){
        this.waste +=5;
        System.out.println("Whew that was close! Chloe almost had an accident inside of the house!")
        }
    

