
public class Program {

    public static void main(String[] args) {
        KennelFactory factory = new KennelFactory();
        Kennel myKennel = factory.getKennel();

        UserInterface cli = new UserInterface(myKennel);
        cli.display();
    }
}