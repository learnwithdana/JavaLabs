
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.regex.Pattern;

public class FileProcessor {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("input.txt");
            Scanner scanner = new Scanner(fis);

            String line;

            // make sure the file has text to read
            while(scanner.hasNextLine()) {
                // read the next line in the file
                line = scanner.nextLine();

                // split the string into an array using the pipe | as a delimiter
                String[] parts = line.split(Pattern.quote("|"));
                    // if the line was  add|4.4|33.76  then
                    // parts[0] was "add", parts[1] was "4.4" and parts[2] was "33.76"

                double num1 = Double.parseDouble(parts[1]);
                double num2 = Double.parseDouble(parts[2]);

                double result;
                String operator;

                if (parts[0].equals("add")) {
                    result = num1 + num2;
                    operator = "+";
                }
                else if (parts[0].equals("subtract")) {
                    result = num1 - num2;
                    operator = "-";
                }
                else if (parts[0].equals("multiply")) {
                    result = num1 * num2;
                    operator = "x";
                }
                else {
                    result = num1 / num2;
                    operator = "/";
                }

                //System.out.printf("%f %s %f is equal to %f\n", num1, operator, num2, result);
                System.out.println(num1 + " " + operator + " " + num2 + " is equal to " + result);
            }

            // always close the file
            scanner.close();
        }
        catch(Exception e) {
            System.out.println("ERROR!!!!! SOMETHING IS WRONG!!!");
            e.printStackTrace();
        }

    }
}

