package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        // Interact with a VirtualPet object in this method

        Scanner input = new Scanner(System.in);
        VirtualPet myPet = new VirtualPet("Chloe");
        int userInput = 0;
        while (userInput != 4) {
            myPet.tick();
            System.out.println("Hi! What would you like to do with Chloe today?");
            System.out.println("1.Feed " + myPet.getName());
            System.out.println("2.Fill " + myPet.getName() + "'s Water bowl");
            System.out.println();
            System.out.println("3.Take " + myPet.getName() + " to use the restroom");
            System.out.println();
            System.out.println("4.Quit the game");
            System.out.println();
            userInput = input.nextInt();

            System.out.println("These are the Pet's current levels");
            myPet.petLevels();
            System.out.println();

            if (userInput == 1) {
                myPet.feed();
            } else if (userInput == 2) {
                myPet.water();
            } else if (userInput == 3) {
                myPet.clean();
            } else {
                System.out.println("Sorry, you can only choose between the numbers 1 through 3.");
            }

        }

        input.close();

    }

}
