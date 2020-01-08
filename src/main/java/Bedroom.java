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

    public void addGuest(ArrayList<Guest> guests) {
        if(this.capacity > guests.size()){
            this.guests = guests;
        }
    }

    public void removeGuest() {
        this.guests.clear();
    }

    public double getPrice() {
        return this.price;
    }
}
