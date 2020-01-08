import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom room;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before(){
        room = new ConferenceRoom(2, "Eugene's room");
        guest1 = new Guest("Eugene Kim");
        guest2 = new Guest("Daniel Toth");
        guest3 = new Guest("Nelson the BananaBread");
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, room.getCapacity());
    }

    @Test
    public void canGetName(){
        assertEquals("Eugene's room", room.getName());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, room.guestCount());
    }

    @Test
    public void canAddGuest(){
        room.addGuest(guest1);
        assertEquals(1, room.guestCount());
    }

    @Test
    public void cantAddGuestRoomIsFull(){
        room.addGuest(guest1);
        room.addGuest(guest2);
        room.addGuest(guest3);
        assertEquals(2, room.guestCount());
    }

    @Test
    public void canRemoveGuest(){
        room.addGuest(guest1);
        room.addGuest(guest2);
        room.removeGuest();
        assertEquals(0, room.guestCount());
    }
}
