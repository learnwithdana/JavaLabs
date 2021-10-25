
import java.io.*;

public class Program {

   public static void main(String[] args) {

       // Make sure there are command line argumenst for first name, last name and file name
       if (args.length < 2) {
           System.out.println("ERROR: Usage is java Program file-name skill-1 skill-2 ...");
           return;
       }

       // Pull args off command
       String argsFileName = args[0];

       // check to see if file exists to know about adding a first crlf
       boolean fileExists = new File(argsFileName).exists();

       try {
            // open the file in append mode
            FileWriter writer = new FileWriter(argsFileName, true); 

            // write all the skills
            for(int i = 1; i < args.length; i++) {

                // if it is a new file, don't put crlf in front of first item
                if (i == 1 && !fileExists) {
                    writer.write(args[i]);      
                }
                else {
                    writer.write("\n" + args[i]); 
                    // NOTE:  we are putting crlf in front of items so we don't have a
                    //        crlf at the end of the last item giving us a blank line
                    //        at the end of the file                  
                }
            }
            // ALWAYS close your file
            writer.close();
            System.out.println(argsFileName + " updated by ");
       }
       catch(Exception e) {
           // display an error if something went wrong
           System.out.println("ERROR: Something went wrong!");
       }
    }
}

