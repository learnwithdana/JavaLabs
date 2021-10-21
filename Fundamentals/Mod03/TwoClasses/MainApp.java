
public class MainApp {

   public static void main(String[] args) {
      // create a Person object
      Person person = new Person("Dana", 63);

      // display the person's information
      System.out.printf("%s is %d years old\n", 
          person.getName(), person.getAge());
   }
}

