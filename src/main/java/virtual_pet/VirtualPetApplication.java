package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        Scanner input = new Scanner(System.in);

        System.out.println("Chloe");
        String petName = input.nextLine();
        VirtualPet pet = new VirtualPet(petName);

        boolean gameOver = false;
        while (!gameOver) {

            System.out.println("Chloe" + pet.getName() + "");
            System.out.println("Hunger: " + pet.getHunger());
            System.out.println("Thirst: " + pet.getThirst());
            System.out.println("Waste: " + pet.getWaste());

            System.out.println("Chloe, What would you like for your pet to");
            System.out.println("1. Feed" + pet.getName());
            System.out.println("2. Give Water" + pet.getThirst());
            System.out.println("3. Clean up waste" + pet.getName());
        }
    }

}
