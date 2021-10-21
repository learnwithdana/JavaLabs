
import java.util.Scanner;

public class StringCompare {

   public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Where do you live? ");
        String homeState = scan.nextLine();
        homeState = homeState.trim().toLowerCase();
        String contactPhone;

        if (homeState.equals("texas")  ||  homeState.equals("kansas")) {
            contactPhone = "800-555-5555";
        }
        else {
            contactPhone = "855-555-5555";
        }

        System.out.println("Contact us at " + contactPhone);

   }

}