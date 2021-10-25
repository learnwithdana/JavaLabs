import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    KennelFactory factory = new KennelFactory();

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
            try {
                command = scanner.nextInt();
                scanner.nextLine();

                switch(command) {
                    case 1:
                        checkinPet();
                        break;
                    case 2:
                        checkoutPets();
                        break;
                    case 3:
                        listAllPets();
                        break;
                }                
            }
            catch(Exception e) {
                System.out.println("Error:  Your input must be a number!");
                scanner.nextLine(); // dump buffer
            }
        }
    }

    public void displayMenu() {
        System.out.println("*** " + kennel.getName() + " ***");
        System.out.println("\t1 - Check in pet");
        System.out.println("\t2 - Check out your pet(s)");
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

        // save the updated kennel data
        factory.saveKennel(kennel);
    }

    public void checkoutPets() {
        System.out.print("What is your name? ");
        String ownerName = scanner.nextLine();

        ArrayList<Pet> myPets = kennel.checkoutPets(ownerName);

        if (myPets.size() != 0) {
            System.out.println("Here are your pets: ");
            for(Pet pet : myPets) {
                System.out.println(pet.getName() + " (" + pet.getSpecies() + ")");
            }
        }
        else {
            System.out.println("You have no pets at our kennel.");
        }

        // save the updated kennel data
        factory.saveKennel(kennel);

    }

    public void listAllPets() {
        // get a list of pets from the kennel
        List<Pet> guestView = kennel.getPets();

        System.out.println("We are currently boarding " + guestView.size() + " pets.");
        // user the for-each to loop thru and display them
        for(Pet pet : guestView) {
            System.out.println(pet.getName() + " (" + pet.getSpecies() + ") owned by " + pet.getOwner());
        }
    }
}