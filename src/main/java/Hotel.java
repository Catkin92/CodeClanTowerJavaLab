import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<ConferenceRoom> confRooms;
    private ArrayList<Bedroom> bedrooms;

    public Hotel(ArrayList<ConferenceRoom> confRooms, ArrayList<Bedroom> bedrooms){
        this.confRooms = confRooms;
        this.bedrooms = bedrooms;
    }


    public int countConfRooms() {
        return this.confRooms.size();
    }

    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public void checkInToBedroom(Bedroom bedroom, ArrayList<Guest> guests) {
        if(this.bedrooms.contains(bedroom) && bedroom.guestCount() == 0){
            bedroom.addGuest(guests);
        }
    }

    public void checkInToConfRoom(ConferenceRoom confRoom, Guest guest) {
        if(this.confRooms.contains(confRoom)){
            confRoom.addGuest(guest);
        }
    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
        Booking booking = new Booking(bedroom, nights);
        return booking;
    }

    public ArrayList<Bedroom> roomsAvailable() {
        ArrayList<Bedroom> emptyBedrooms = new ArrayList<Bedroom>();
        for(Bedroom bedroom : bedrooms){
            if(bedroom.guestCount() == 0){
                emptyBedrooms.add(bedroom);
            }
        }
        return emptyBedrooms;
    }


}
