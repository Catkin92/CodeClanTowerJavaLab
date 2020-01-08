import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> guests;
    private String name;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.name = name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getName() {
        String name = this.name;
        return name;
    }

    public int guestCount() {
        return this.guests.size();
    }


    public void addGuest(Guest guest) {
        if(this.capacity > guestCount()){
            this.guests.add(guest);
        }
    }

    public void removeGuest() {
        this.guests.clear();
    }
}
