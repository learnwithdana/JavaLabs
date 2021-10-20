import java.util.*;

public class MainApp {
  public static void main(String[] args) {
  
    // // create a scanner
    // Scanner scanner = new Scanner(System.in);

    // // read name
    // System.out.print("What is your name? ");
    // String name = scanner.nextLine();

    // // read age
    // System.out.print("How old are you? ");
    // int age = scanner.nextInt();

    // // display a greeting
    // String greeting;
    // if (age <= 21) {
    //   greeting = "Hi ";
    // }
    // else {
    //   greeting = "Hello ";
    // }
    // System.out.println(greeting + " " + name + "!");
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number 1: ");
    int num1 = scanner.nextInt(); 

    System.out.print("Enter number 2: ");
    int num2 = scanner.nextInt(); 

    System.out.println("What do you want to do? ");
    System.out.print("   Enter 'add' or 'subtract': ");
    String action = scanner.nextLine();

    System.out.println("Preparing to do math... ");

  }
}