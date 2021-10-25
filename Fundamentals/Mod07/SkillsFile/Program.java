
import java.io.*;

public class Program {

   public static void main(String[] args) {
       String[] skills = new String[13];
       skills[0] = "Angular";
       skills[1] = "JavaScript";
       skills[2] = "Bootstrap";
       skills[3] = "html";
       skills[4] = "Git";
       skills[5] = "Google";
       skills[6] = "CSS";
       skills[7] = "jQuery";
       skills[8] = "Node.js";
       skills[9] = "Teamwork";
       skills[10] = "Markdown";
       skills[11] = "Debugging";
       skills[12] = "TypeScript";

    //    File f = new File("skills.txt");
    //    boolean fileExists = f.exists();

       boolean fileExists = new File("skills.txt").exists();

       try {
            FileWriter writer = new FileWriter("skills.txt", true); 
            for(int i = 0; i < skills.length; i++) {
                if (i == 0 && !fileExists) {
                    writer.write(skills[i]);      
                }
                else {
                    writer.write("\n" + skills[i]);                   
                }
            }
            writer.close();
       }
       catch(Exception e) {
           System.out.println("ERROR: Something went wrong!");
       }
    }
}