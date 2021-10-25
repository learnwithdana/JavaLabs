
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class KennelFactory {

    public Kennel getKennel() {
        Kennel kennel = null;

        try {
            FileInputStream fileInputStream =new FileInputStream("db_kennel.txt");
            Scanner scanner = new Scanner(fileInputStream);

            // 1st line in file is kennel name, address and yelp review
            String line = scanner.nextLine();
            String[] parts = line.split("\\|");
            kennel = new Kennel(parts[0], parts[1], Integer.parseInt(parts[2]));

            // remaining lines, if they exits, are pets being boarded
            while(scanner.hasNextLine()) {
                line = scanner.nextLine();
                parts = line.split("\\|"); 

                Pet thePet = new Pet(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]);
                kennel.checkinPet(thePet);
            }

            // always close
            scanner.close();
        }
        catch(IOException e) {
            System.out.println("ERROR:  Can't load pets into kennel");
        }

        return kennel;
    }

    public void saveKennel(Kennel kennel) {

        try {
            FileWriter writer = new FileWriter("db_kennel.txt");

            /// write the kennel infor to the file
            String line = String.format("%s|%s|%d", kennel.getName(), kennel.getAddress(), kennel.getYelpRating());
            writer.write(line);

            // write all the pets to the file
            List<Pet> guestView = kennel.getPets();
            for(Pet pet : guestView) {
                line = String.format("\n%s|%s|%d|%s", pet.getName(), pet.getSpecies(), pet.getAge(), pet.getOwner());
                writer.write(line);
            }

            // always
            writer.close();
        }
        catch(IOException e) {
            System.out.println("ERROR:  Can't save kennel pets to file");
        }
    }
}