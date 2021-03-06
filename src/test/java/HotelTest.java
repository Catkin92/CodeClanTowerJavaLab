import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTest {

    private Hotel hotel;

    private ConferenceRoom confRoom1;
    private ConferenceRoom confRoom2;
    private ArrayList<ConferenceRoom> confRooms;

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ArrayList<Bedroom> bedrooms;

    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private ArrayList<Guest> guests1;
    private ArrayList<Guest> guests2;

    private Booking booking;


    @Before
    public void before(){
        confRoom1 = new ConferenceRoom(2, "Eugene's room");
        confRoom2 = new ConferenceRoom(3, "Nelson's room");
        confRooms = new ArrayList<ConferenceRoom>();
        confRooms.add(confRoom1);
        confRooms.add(confRoom2);

        guest1 = new Guest("Eugene Kim");
        guest2 = new Guest("Daniel Toth");
        guest3 = new Guest("Nelson the BananaBread");
        guests1 = new ArrayList<Guest>();
        guests1.add(guest1);
        guests2 = new ArrayList<Guest>();
        guests2.add(guest2);
        guests2.add(guest3);

        bedroom1 = new Bedroom(102, 2, "Double", 30.00);
        bedroom2 = new Bedroom(103, 1, "Single", 25.00);
        bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);

        hotel = new Hotel(confRooms, bedrooms);

        booking = new Booking(bedroom1, 2);
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(2, hotel.countConfRooms());
    }

    @Test
    public void hasBedrooms(){
        assertEquals(2, hotel.countBedrooms());
    }

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.checkInToBedroom(bedroom1, guests1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void cantCheckInGuestToBedroomBecauseItsFull(){
        hotel.checkInToBedroom(bedroom2, guests2);
        assertEquals(0, bedroom2.guestCount());
    }

    @Test
    public void cantCheckInGuestToBedroomBecauseRoomInUse(){
        hotel.checkInToBedroom(bedroom1, guests1);
        hotel.checkInToBedroom(bedroom1, guests1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canCheckInGuestToConfRoom(){
        hotel.checkInToConfRoom(confRoom1, guest1);
        assertEquals(1, confRoom1.guestCount());
    }

    @Test
    public void cantCheckInGuestToConfRoom(){
        hotel.checkInToConfRoom(confRoom1, guest1);
        hotel.checkInToConfRoom(confRoom1, guest2);
        hotel.checkInToConfRoom(confRoom1, guest3);
        assertEquals(2, confRoom1.guestCount());
    }

    @Test
    public void createBooking(){
        Booking result = hotel.bookRoom(bedroom1, 2);
        assertEquals(bedroom1, result.getBedroom());
        assertEquals(2, result.numberOfNights());
    }

    @Test
    public void findEmptyBedrooms(){
        bedroom1.addGuest(guests1);
        ArrayList<Bedroom> emptyRooms = hotel.roomsAvailable();
        assertEquals(1, emptyRooms.size());
        assertTrue(emptyRooms.contains(bedroom2));
    }

}
