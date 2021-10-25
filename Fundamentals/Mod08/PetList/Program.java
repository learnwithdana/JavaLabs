
public class Program {

    public static void main(String[] args) {
        Kennel myKennel = new Kennel("D & B Boarding", "402 Stevens", 5);

        UserInterface cli = new UserInterface(myKennel);
        cli.display();
    }
}