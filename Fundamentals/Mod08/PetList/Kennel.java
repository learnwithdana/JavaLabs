
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Kennel {
    // about the facility
    private String name;
    private String address;
    private int yelpRating;

    // about the boarders
    private ArrayList<Pet> guests;

    public Kennel(String name, String address, int yelpRating) {
        this.name  = name;
        this.address = address;
        this.yelpRating = yelpRating;
        this.guests = new ArrayList<Pet>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getYelpRating() {
        return yelpRating;
    }

    public void setYelpRating(int yelpRating) {
        this.yelpRating =yelpRating;
    }

    public ArrayList<Pet> checkoutPets(String name) {
        ArrayList<Pet> list = new ArrayList<Pet>();

        for(int i = 0; i < guests.size(); i++) {
            Pet thisGuest = guests.get(i);
            if (thisGuest.getOwner().equalsIgnoreCase(name)) {
                list.add(thisGuest);
                guests.remove(i);
                i--;
            }
        }
        return list;
    }

    public boolean checkinPet(Pet pet) {
        guests.add(pet);

        return true;
    }

    public List<Pet> getPets() {
        return  Collections.unmodifiableList(guests);
    }

}