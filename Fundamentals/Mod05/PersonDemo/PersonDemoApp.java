
public class PersonDemoApp {

    static Person p3, p4;

    public static void main(String[] args) {

        Person p1;
        Person p2;

        // how many persons do I have?
        // NONE!

        // create ME
        p1 = new Person("Dana W.", "Dallas", 63);

        p2 = p1;

        // How many person objects do I have?
        // ONE!  p1 and p2 refer to the SAME person

        // Proof?
        System.out.printf("%s -- %s -- %d\n", p1.getName(), p1.getBirthplace(), p1.getAge());
        System.out.printf("%s -- %s -- %d\n", p2.getName(), p2.getBirthplace(), p2.getAge());

        p1.haveABirthday();

        System.out.printf("%s -- %s -- %d\n", p1.getName(), p1.getBirthplace(), p1.getAge());
        System.out.printf("%s -- %s -- %d\n", p2.getName(), p2.getBirthplace(), p2.getAge());

        //////////////////////////////

        // Declaring the variable AND instantiating the object at the same time
        Person p5 = new Person("Zachary", "Dallas", 31);

        // How many person objects?
        // TWO

        // What is in each person variable??
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}