import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(102, 2, "Double");
        guest = new Guest("Eugene Kim");
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
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.removeGuest();
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void cantRemoveGuest(){
        bedroom.removeGuest();
        assertEquals(0, bedroom.guestCount());
    }


}
