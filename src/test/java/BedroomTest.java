import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before(){
        bedroom = new Bedroom(102, 2, "Double", 30.00);
        guest1 = new Guest("Eugene Kim");
        guest2 = new Guest("Daniel Toth");
        guest3 = new Guest("Nelson the BananaBread");
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(102, bedroom.getRoomNumber());
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetRoomType(){
        assertEquals("Double", bedroom.getType());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void cantAddGuestRoomIsFull(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        assertEquals(2, bedroom.guestCount());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest1);
        bedroom.removeGuest();
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void cantRemoveGuest(){
        bedroom.removeGuest();
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void hasPrice(){
        assertEquals(30.00, bedroom.getPrice(),0.01);
    }


}
