import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("\nWhat do you want to do today? ");
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
                System.out.print("Wnat is your name? ");
                String name = scanner.nextLine();
                System.out.println("Goodbye " + name + "!");
            }
            else if (command == 3) {
                System.out.print("What number do you want to know the square root of? ");
                double number = scanner.nextDouble();
                double answer = Math.sqrt(number);
                System.out.println("The square root of " + number + " is " + answer);            
                System.out.printf("The square root of %f is %.4f\n", number, answer);
            }
            else if (command == 4) {
                System.out.print("Enter the base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the exponent: ");
                double exp = scanner.nextDouble();
                double answer = Math.pow(base, exp);
                System.out.printf("%f to the power of %f is %f\n", base, exp, answer);
            }
            else {
                System.out.println("ERROR:  Commands numbers must be between 1 and 4!");
            }
        }
    }
}