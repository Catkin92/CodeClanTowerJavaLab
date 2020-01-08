import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(102, 2, "Double", 30.00);
        booking = new Booking(bedroom, 2);
    }

    @Test
    public void hasBedroom(){
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasNumberOfNights(){
        assertEquals(2, booking.numberOfNights());
    }

    @Test
    public void totalBill(){
        double totalBill = booking.totalBill();
        assertEquals(60.00, totalBill, 0.01);
    }

}
