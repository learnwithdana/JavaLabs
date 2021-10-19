import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        System.out.println("What do you want to do today? ");
        System.out.println("\n1 - Greet someone ");
        System.out.println("2 - Say goodbye to someone");
        System.out.println("3 - Find the square root of a number");
        System.out.println("4 - Find out what a number raised to a power is ");
        System.out.print("Enter command: ");

        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();
        scanner.nextLine();  // "eat" the CR/LF in the buffer from the user entering 1 ENTER-KEY

        if (command == 1) {
            System.out.print("Wnat is your name? ");
            String name = scanner.nextLine();
            System.out.println("Howdy " + name + "!");
        }
        else if (command == 2) {

        }
        else if (command == 3) {

        }
        else if (command == 4) {

        }
        else {

        }
    }
}