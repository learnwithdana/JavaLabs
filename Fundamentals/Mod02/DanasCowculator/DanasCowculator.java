
import java.util.Scanner;

public class DanasCowculator {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   

        float num1 = getFloat(scanner, "Please enter a number: " );
        float num2 = getFloat(scanner, "Please enter another number: " );
        
        int command = getInt(scanner, 
            "What do you want to do?\n  1-add, 2-subtract\nEnter command: ");

        if (command == 1) {
            display(num1, num2, num1 + num2, "+");
        }
        else if (command == 2) {
            display(num1, num2, num1 - num2, "+");
        }

        System.out.printf("The numbers are: %f and %f\n", num1, num2);
    }

    public static float getFloat(Scanner scan, String label) {
        System.out.print(label);
        float input = scan.nextFloat();
        return input;
    }

    public static int getInt(Scanner scan, String label) {
        System.out.print(label);
        int input = scan.nextInt();
        return input;
    }

    public static void display(float num1, float num2, float result, String operator) {
        System.out.printf("%f  %s  %f  =  %f\n", num1, operator, num2, result);
    }
}