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

    public void checkInToBedroom(Bedroom bedroom, Guest guest) {
        if(this.bedrooms.contains(bedroom)){
            bedroom.addGuest(guest);
        }
    }

    public void checkInToConfRoom(ConferenceRoom confRoom, Guest guest) {
        if(this.confRooms.contains(confRoom)){
            confRoom.addGuest(guest);
        }
    }
}
