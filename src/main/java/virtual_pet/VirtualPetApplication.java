package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public VirtualPetApplication(String string) {
    }

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        Scanner input = new Scanner(System.in);

        VirtualPetApplication Chloe = new VirtualPetApplication("Chloe"); 

        String petName = input.nextLine();
        System.out.println("Chloe");

        while (true) {
            System.out.println("Hi! What would you like to do with Chloe today?");
            System.out.println("1.Feed Chloe");
            System.out.println("2.Fill Chloe's water bowl");
            System.out.println("3.Take Chloe for a walk");
        }
    }

}
