
 import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        // // array of best teams in sports
        // String[] teams = {
        //     "Dallas Cowboys",
        //     "Dallas Mavs",
        //     "Houston Astros"
        // };
        // for(int i = 0; i < teams.length; i++) {
        //     System.out.print(teams[i] + " ");           
        // }
        // System.out.println();

        // for(String team : teams) {
        //     System.out.print(team + " * ");
        // }
        // System.out.println();

//------------------------------ COOL DEMO WITH FUNCTIONS ----------------------------------------------

        // Person[] family = buildtheThibbodeauxes();

        // // Call the display method of MainApp and pass it the family so that
        // // it can print them
        // display(family);


        Person[] family = null;    // must set to null
        for(int i = 0; i < 2; i++) {
            if (i == 0) {
                family = buildTheWyatts();

                family = Arrays.stream(family).filter(p => p.getBirthplace().equals("Dallas")).toArray();
            }
            else if (i == 1) {
                family = buildtheThibbodeauxes();
            }
            // because if neither if is true, then family is at least initialized to null

            display(family);
        }



//------------------------------ OLD (FIRST) DEMO ----------------------------------------------
        // Create an array of Person objects (no people yet!)
        // Person[] family = new Person[4];        
        
        // no people yet -- only an array of variables that can REFERENCE people
        // after they are newed (instantiated)
        // for(int i = 0; i < family.length; i++) {
        //     System.out.print(family[i] + " ");           
        // }
        // System.out.println();

        // Create person objects and make array elements the reference them
        // family[0] = new Person("Dana W", "Dallas", 63);
        // family[1] = new Person("Betty", "Lingleville", 60);
        // family[2] = new Person("Ralph", "Kansas City", 53);       
        // family[3] = new Person("Mark", "Dallas", 57);

        // for(int i = 0; i < family.length; i++) {
        //     System.out.println(family[i].getName()  + " born in " + 
        //                        family[i].getBirthplace() + " is " + 
        //                        family[i].getAge());         
        // }
        // System.out.println();

        // System.out.println("Instructor: " + family[0].getName());
    }

    public static Person[] buildTheWyatts() {
        // built a local "holding" array
        Person[] family = new Person[4];

        // loaded the array
        family[0] = new Person("Dana W", "Dallas", 63);
        family[1] = new Person("Betty", "Lingleville", 60);
        family[2] = new Person("Ralph", "Kansas City", 53);       
        family[3] = new Person("Mark", "Dallas", 57);

        // return the array to the caller of this function
        return family;
    }

    public static Person[] buildtheThibbodeauxes() {
        // built a local "holding" array
        Person[] family = new Person[5];

        // loaded the array
        family[0] = new Person("Brittany", "Dallas", 35);
        family[1] = new Person("Ian", "Dallas", 16);
        family[2] = new Person("Siddalee", "Dallas", 15);       
        family[3] = new Person("Pursalane", "Dallas", 11);
        family[4] = new Person("Zephaniah", "Dallas", 9);

        // return the array to the caller of this function
        return family;
    }

    // This method accepts an array of Person objects as a parameter,
    // and then loops thru them and prints each one
    public static void display(Person[] family) {
        for(int i = 0; i < family.length; i++) {
            System.out.println(family[i].getName()  + " born in " + 
                               family[i].getBirthplace() + " is " + 
                               family[i].getAge());         
        }
        System.out.println();
    }
}