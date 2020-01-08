import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private double price;

    public Bedroom(int roomNumber, int capacity, String type, double price){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
        this.price = price;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getType() {
        String type = this.type;
        return type;
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

    public double getPrice() {
        return this.price;
    }
}
