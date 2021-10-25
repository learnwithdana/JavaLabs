
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    // Hook up scanner to keyboard (aka System.in)
    Scanner scanner = new Scanner(System.in);

    // this user interface provides a "web like" screen to interact with
    // this kennel
    Kennel kennel;

    public UserInterface(Kennel kennel) {
        this.kennel = kennel;
    }

    public void display() {
        int command = -1;

        // display a menu and accept a command
        // then process the command
        while (command != 99) {
            displayMenu();
            command = scanner.nextInt();
            scanner.nextLine();

            switch(command) {
                case 1:
                    checkinPet();
                    break;
                case 2:

                case 3:
                    listAllPets();
                    break;
            }
        }

    }

    public void displayMenu() {
        System.out.println("*** " + kennel.getName() + " ***");
        System.out.println("\t1 - Check in pet");
        System.out.println("\t2 - Check out you pet(s)");
        System.out.println("\t3 - View all pets");
        System.out.println("\t99 - Quit");
        System.out.print("What do you want to do? ");
    }

    public void checkinPet() {
        // gather the data for a pet
        System.out.print("What is your pet's name? ");
        String petName = scanner.nextLine();

        System.out.print("What is your pet's species? ");
        String petSpecies = scanner.nextLine();

        System.out.print("How old is your pet? ");
        int petAge = scanner.nextInt();
        scanner.nextLine();   // git rid of the crlf after the age

        System.out.print("What is your name? ");
        String ownerName = scanner.nextLine();

        // create the pet
        Pet thePet = new Pet(petName, petSpecies, petAge, ownerName);

        // send the pet to the kennel
        kennel.checkinPet(thePet);

        // display a confirmation
        System.out.print("Thanks! " + thePet.getName() + " is safe in our kennel!");
    }

    public void listAllPets() {

        // get a list of pets from the kennel
        ArrayList<Pet> guests = kennel.getPets();

        // user the for-each to loop thru and display them
        for(Pet pet : guests) {
            System.out.println(pet.getName() + " (" + pet.getSpecies() + ") owned by " + pet.getOwner());
        }

    }

}